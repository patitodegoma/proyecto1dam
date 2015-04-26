/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.modelo.Administrador;
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
public class CrudAdministrador {
    
    public boolean create (Administrador ad) {
        String sql =
                "INSERT INTO ADMINISTRADOR VALUES "
                + "(?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, ad.getIdentificador());
            pstm.setString(2, ad.getUsuario());
            pstm.setString(3, ad.getContrasena());
            pstm.setString(4, ad.getDni());
            pstm.setString(5, ad.getSegSocial());
            pstm.setString(6, ad.getCcc());
            
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
    
    public boolean update (Administrador ad) {
        String sql = 
                "UPDATE ADMINISTRADOR SET "
                + "USUARIO = ?, CONTRASENA = ?, DNI = ?, SEGSOCIAL = ?, "
                + "CCC = ? "
                + "WHERE IDENTIFICADOR = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, ad.getUsuario());
            pstm.setString(2, ad.getContrasena());
            pstm.setString(3, ad.getDni());
            pstm.setString(4, ad.getSegSocial());
            pstm.setString(5, ad.getCcc());
            pstm.setInt(6, ad.getIdentificador());
        
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
    
    public boolean delete(Administrador ad) {
	return delete(ad.getIdentificador());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM ADMINISTRADOR WHERE IDENTIFICADOR = ?";
	
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
    
    public List <Administrador> findAll () {
        
        List <Administrador> listado = new ArrayList <Administrador> ();
        
        String sql = 
            "SELECT * FROM ADMINISTRADOR";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Administrador(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getString("DNI"), 
                    rs.getString("SEGSOCIAL"), rs.getString("CCC"), 
                    rs.getInt("IDENTIFICADOR"), 
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
    
    public Administrador findByPk (Administrador ad) {
	return findByPk(ad.getIdentificador());
    }
    
    public Administrador findByPk (int pk) {
        String sql =
            "SELECT * FROM ADMINISTRADOR WHERE IDENTIFICADOR = ?";
        
        Administrador ad = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                ad = new Administrador(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getString("DNI"), 
                    rs.getString("SEGSOCIAL"), rs.getString("CCC"), 
                    rs.getInt("IDENTIFICADOR"), 
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
        
        return ad;
    }
    
}
