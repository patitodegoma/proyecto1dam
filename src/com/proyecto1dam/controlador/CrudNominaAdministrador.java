/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.NominaAdministrador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudNominaAdministrador {
    
    public boolean create (NominaAdministrador na) {
        String sql =
                "INSERT INTO NOMINAADMINISTRADOR VALUES "
                + "(?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, na.getIdNomina());
            pstm.setInt(2, na.getIdAdministrador());
            
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
    
    public boolean update (NominaAdministrador na) {
        String sql = 
                "UPDATE NOMINAADMINISTRADOR SET "
                + "ADMINISTRADOR = ? "
                + "WHERE ID_NOMINA = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, na.getIdAdministrador());
            pstm.setInt(2, na.getIdNomina());
        
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
    
    public boolean delete(NominaAdministrador na) {
	return delete(na.getIdNomina());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM NOMINAADMINISTRADOR WHERE ID_NOMINA = ?";
	
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
    
    public List <NominaAdministrador> findAll () {
        
        List <NominaAdministrador> listado = new ArrayList <NominaAdministrador> ();
        
        String sql = 
            "SELECT * FROM NOMINAADMINISTRADOR";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new NominaAdministrador(rs.getInt("ID_NOMINA"),
                    rs.getInt("ADMINISTRADOR"), rs.getInt("MES"), rs.getInt("ANO"), 
                    rs.getDouble("IMPORTE")));
                
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
    
    public NominaAdministrador findByPk (NominaAdministrador na) {
	return findByPk(na.getIdAdministrador());
    }
    
    public NominaAdministrador findByPk (int pk) {
        String sql =
            "SELECT * FROM NOMINAADMINISTRADOR WHERE ID_NOMINA = ?";
        
        NominaAdministrador na = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                na = new NominaAdministrador(rs.getInt("ID_NOMINA"),
                    rs.getInt("ADMINISTRADOR"), rs.getInt("MES"), rs.getInt("ANO"), 
                    rs.getDouble("IMPORTE"));
                
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
        
        return na;
    }
    
}
