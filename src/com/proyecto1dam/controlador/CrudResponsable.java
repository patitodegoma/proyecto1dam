/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.modelo.Responsable;
import com.proyecto1dam.inicio.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author andres
 */
public class CrudResponsable {
    
    public boolean create (Responsable res) {
        String sql =
                "INSERT INTO RESPONSABLE VALUES "
                + "(?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, res.getIdentificador());
            pstm.setString(2, res.getDni());
            pstm.setString(3, res.getVinculacion());
            
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
    
    public boolean update (Responsable res) {
        String sql = 
                "UPDATE ALUMNO SET "
                + "DNI = ?, VINCULACION = ? "
                + "WHERE IDENTIFICADOR = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, res.getDni());
            pstm.setString(2, res.getVinculacion());
            pstm.setInt(3, res.getIdentificador());
        
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
    
    public boolean delete(Responsable res) {
	return delete(res.getIdentificador());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM RESPONSABLE WHERE IDENTIFICADOR = ?";
	
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
    
    public List <Responsable> findAll () {
        
        List <Responsable> listado = new ArrayList <Responsable> ();
        
        String sql = 
            "SELECT * FROM RESPONSABLE";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Responsable(rs.getString("DNI"),
                    rs.getString("VINCULACION"), rs.getInt("IDENTIFICADOR"), 
                    rs.getString("NOMBRE"), rs.getString("APELLIDO1"), 
                    rs.getString("APELLIDO2"), rs.getString("SEXO"), 
                    rs.getString("DIRECCION"), rs.getString("LOCALIDAD"), 
                    rs.getString("FIJO"), rs.getString("MOVIL"), rs.getString("EMAIL")));
                
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
    
    public Responsable findByPk (Responsable res) {
	return findByPk(res.getIdentificador());
    }
    
    public Responsable findByPk (int pk) {
        String sql =
            "SELECT * FROM RESPONSABLE WHERE IDENTIFICADOR = ?";
        
        Responsable res = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                res = new Responsable (rs.getString("DNI"),
                    rs.getString("VINCULACION"), rs.getInt("IDENTIFICADOR"), 
                    rs.getString("NOMBRE"), rs.getString("APELLIDO1"), 
                    rs.getString("APELLIDO2"), rs.getString("SEXO"), 
                    rs.getString("DIRECCION"), rs.getString("LOCALIDAD"), 
                    rs.getString("FIJO"), rs.getString("MOVIL"), rs.getString("EMAIL"));
                
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
        
        return res;
    }
    
}
