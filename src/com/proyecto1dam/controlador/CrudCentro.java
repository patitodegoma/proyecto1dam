/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.Centro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudCentro {
    
    public boolean create (Centro c) {
        String sql =
                "INSERT INTO CENTRO VALUES "
                + "(SEQ_CENTRO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getDireccion());
            pstm.setString(3, c.getLocalidad());
            pstm.setInt(4, c.getFijo());
            pstm.setString(5, c.getEmail());
            pstm.setInt(6, c.getTipoCentro());
            pstm.setDouble(7, c.getCuota());
            pstm.setInt(8, c.getIdResponsable());
             
            nFilas = pstm.executeUpdate();
            
            pstm.close();   
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
		ConnectDB.desconectar();
            } catch (SQLException e) {
		e.printStackTrace();	
            }
        }
        
        return (nFilas > 0) ? true : false;
    
    }
    
    public boolean update (Centro c) {
        String sql = 
                "UPDATE CENTRO SET "
                + "NOMBRE = ?, DIRECCION = ?, LOCALIDAD = ?, "
                + "FIJO = ?, EMAIL = ?, TIPO_CENTRO = ?, "
                + "CUOTA = ?, RESPONSABLE = ? "
                + "WHERE ID_GRUPO = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getDireccion());
            pstm.setString(3, c.getLocalidad());
            pstm.setInt(4, c.getFijo());
            pstm.setString(5, c.getEmail());
            pstm.setInt(6, c.getTipoCentro());
            pstm.setDouble(7, c.getCuota());
            pstm.setInt(8, c.getIdResponsable());
            pstm.setInt(9, c.getIdCentro());
        
            nFilas = pstm.executeUpdate();
        
            pstm.close();
                 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ConnectDB.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return (nFilas > 0) ? true : false;	   
        
    }
    
    public boolean delete(Centro c) {
	return delete(c.getIdCentro());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM CENTRO WHERE ID_CENTRO = ?";
	
        int nFilas = 0;
		
	try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
			
            pstm.setInt(1, pk);
			
            nFilas = pstm.executeUpdate();
				
            pstm.close();
			
	} catch (ClassNotFoundException e) {
            e.printStackTrace();
	} catch (SQLException e) {
            e.printStackTrace();
	} finally {
            try {
		ConnectDB.desconectar();
            } catch (SQLException e) {
				
		e.printStackTrace();
            }
	}
			
	return (nFilas > 0) ? true : false;	
        
    }
    
    public List <Centro> findAll () {
        
        List <Centro> listado = new ArrayList <Centro> ();
        
        String sql = 
            "SELECT * FROM CENTRO";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Centro(rs.getInt("ID_CENTRO"), 
                    rs.getString("NOMBRE"), rs.getString("DIRECCION"), 
                    rs.getString("LOCALIDAD"), rs.getInt("FIJO"), 
                    rs.getString("EMAIL"), rs.getInt("TIPO_CENTRO"), 
                    rs.getDouble("CUOTA"), rs.getInt("RESPONSABLE")));
                
            }
            
            rs.close();
            pstm.close();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
		ConnectDB.desconectar();
            } catch (SQLException e) {
		e.printStackTrace();
            }
	}
		
	return listado;
        
    }
    
    public Centro findByPk (Centro c) {
	return findByPk(c.getIdCentro());
    }
    
    public Centro findByPk (int pk) {
        String sql =
            "SELECT * FROM CENTRO WHERE ID_CENTRO = ?";
        
        Centro c = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                c = new Centro(rs.getInt("ID_CENTRO"), 
                    rs.getString("NOMBRE"), rs.getString("DIRECCION"), 
                    rs.getString("LOCALIDAD"), rs.getInt("FIJO"), 
                    rs.getString("EMAIL"), rs.getInt("TIPO_CENTRO"), 
                    rs.getDouble("CUOTA"), rs.getInt("RESPONSABLE"));
                
            }
            
            rs.close();
            pstm.close();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
		ConnectDB.desconectar();
            } catch (SQLException e) {
		e.printStackTrace();
            }
	}
        
        return c;
    }
    
}
