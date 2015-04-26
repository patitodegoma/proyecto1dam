/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.modelo.Persona;
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
public class CrudPersona {
    
    public boolean create (Persona p) {
        String sql =
                "INSERT INTO PERSONA VALUES "
                + "(SEQ_PERSONA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, p.getNombre());
            pstm.setString(2, p.getApellido1());
            pstm.setString(3, p.getApellido2());
            pstm.setString(4, p.getSexo());
            pstm.setString(5, p.getDireccion());
            pstm.setString(6, p.getLocalidad());
            pstm.setString(7, p.getFijo());
            pstm.setString(8, p.getMovil());
            pstm.setString(9, p.getEmail());
            
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
    
    public boolean update (Persona p) {
        String sql = 
                "UPDATE PERSONA SET "
                + "NOMBRE = ?, APELLIDO1 = ?, APELLIDO2 = ?, SEXO = ?, "
                + "DIRECCION = ?, LOCALIDAD = ?, FIJO = ?, MOVIL = ?, "
                + "EMAIL = ? "
                + "WHERE IDENTIFICADOR = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, p.getNombre());
            pstm.setString(2, p.getApellido1());
            pstm.setString(3, p.getApellido2());
            pstm.setString(4, p.getSexo());
            pstm.setString(5, p.getDireccion());
            pstm.setString(6, p.getLocalidad());
            pstm.setString(7, p.getFijo());
            pstm.setString(8, p.getMovil());
            pstm.setString(9, p.getEmail());
            pstm.setInt(10, p.getIdentificador());
        
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
    
    public boolean delete(Persona p) {
	return delete(p.getIdentificador());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM PERSONA WHERE IDENTIFICADOR = ?";
	
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
    
    public List <Persona> findAll () {
        
        List <Persona> listado = new ArrayList <Persona> ();
        
        String sql = 
            "SELECT * FROM PERSONA";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Persona(rs.getInt("IDENTIFICADOR"), 
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
    
    public Persona findByPk (Persona p) {
	return findByPk(p.getIdentificador());
    }
    
    public Persona findByPk (int pk) {
        String sql =
            "SELECT * FROM PERSONA WHERE IDENTIFICADOR = ?";
        
        Persona p = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                p = new Persona(rs.getInt("IDENTIFICADOR"), 
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
        
        return p;
    }
    
}
