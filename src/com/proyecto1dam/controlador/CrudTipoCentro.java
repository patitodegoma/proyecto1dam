/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.TipoCentro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudTipoCentro {
    
    public boolean create (TipoCentro tc) {
        String sql =
                "INSERT INTO TIPOCENTRO VALUES "
                + "(SEQ_TIPOCENTRO.NEXTVAL, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, tc.getDescripcion());
            pstm.setDouble(2, tc.getImporteProfesor());
            
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
    
    public boolean update (TipoCentro tc) {
        String sql = 
                "UPDATE TIPOCENTRO SET "
                + "DESCRIPCION = ?, IMPORTE_PROFESOR = ? "
                + "WHERE ID_TIPOCENTRO = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, tc.getDescripcion());
            pstm.setDouble(2, tc.getImporteProfesor());
            pstm.setInt(3, tc.getTipoCentro());
            
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
    
    public boolean delete(TipoCentro tc) {
	return delete(tc.getTipoCentro());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM TIPOCENTRO WHERE ID_TIPOCENTRO = ?";
	
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
    
    public List <TipoCentro> findAll () {
        
        List <TipoCentro> listado = new ArrayList <TipoCentro> ();
        
        String sql = 
            "SELECT * FROM TIPOCENTRO";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new TipoCentro(rs.getInt("ID_TIPOCENTRO"), 
                    rs.getString("DESCRIPCION"), rs.getDouble("IMPORTE_PROFESOR")));
                
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
    
    public TipoCentro findByPk (TipoCentro tc) {
	return findByPk(tc.getTipoCentro());
    }
    
    public TipoCentro findByPk (int pk) {
        String sql =
            "SELECT * FROM TIPOCENTRO WHERE ID_TIPOCentro = ?";
        
        TipoCentro tc = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                tc = new TipoCentro(rs.getInt("ID_TIPOCENTRO"), 
                    rs.getString("DESCRIPCION"), rs.getDouble("IMPORTE_PROFESOR"));
                
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
        
        return tc;
    }
    
}
