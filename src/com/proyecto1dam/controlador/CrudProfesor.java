/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.modelo.Profesor;
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
public class CrudProfesor {
    
    public boolean create (Profesor pf) {
        String sql =
                "INSERT INTO PROFESOR VALUES "
                + "(?, ?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pf.getIdentificador());
            pstm.setString(2, pf.getUsuario());
            pstm.setString(3, pf.getContrasena());
            pstm.setString(4, pf.getDni());
            pstm.setString(5, pf.getSegSocial());
            pstm.setString(6, pf.getCcc());
            pstm.setString(7, pf.getMaterial());
            
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
    
    public boolean update (Profesor pf) {
        String sql = 
                "UPDATE PROFESOR SET "
                + "USUARIO = ?, CONTRASENA = ?, DNI = ?, SEGSOCIAL = ?, "
                + "CCC = ?, MATERIAL = ? "
                + "WHERE IDENTIFICADOR = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, pf.getUsuario());
            pstm.setString(2, pf.getContrasena());
            pstm.setString(3, pf.getDni());
            pstm.setString(4, pf.getSegSocial());
            pstm.setString(5, pf.getCcc());
            pstm.setString(6, pf.getMaterial());
            pstm.setInt(7, pf.getIdentificador());
        
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
    
    public boolean delete(Profesor pf) {
	return delete(pf.getIdentificador());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM PROFESOR WHERE IDENTIFICADOR = ?";
	
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
    
    
    public List<Profesor> find (String nombre, String ap1, String ap2, String dni, 
            String localidad, String fijo, String movil, String email) {
        
        List <Profesor> listado = new ArrayList <Profesor> ();
          
        String sql =
                 "SELECT * FROM PROFESOR JOIN PERSONA USING (IDENTIFICADOR) ";
        
        int variables = 0;
        
            if (!nombre.equals("")) {
                String hayNombre = "NOMBRE = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + hayNombre;
            }
            
            if (!ap1.equals("")) {
                String hayAp1 = "APELLIDO1 = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayAp1;
            }
            
            if (!ap2.equals("")) {
                String hayAp2 = "APELLIDO2 = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayAp2;
            }
            
            if (!dni.equals("")) {
                String hayDni = "DNI = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayDni;
            }
            
            if (!localidad.equals("")) {
                String hayloc = "LOCALIDAD = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayloc;
            }
            
            if (!fijo.equals("")) {
                String hayFijo = "FIJO = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayFijo;
            }
            
            if (!movil.equals("")) {
                String hayMvl = "MOVIL = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayMvl;
            }
            
            if (!email.equals("")) {
                String hayEmail = "EMAIL = ? ";
                variables++;
                sql = sql + ((variables == 1) ? "WHERE " : "") + ((variables > 1) ? "AND " : "") + hayEmail;
            }
           
             System.out.println(sql);
         
         try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            variables = 0;
        
            if (!nombre.equals("")) {
                variables++;
                pstm.setString(variables, nombre.toUpperCase());
            }
            
            if (!ap1.equals("")) {
                variables++;
                pstm.setString(variables, ap1.toUpperCase());
            }
            
            if (!ap2.equals("")) {
                variables++;
                pstm.setString(variables, ap2.toUpperCase());
            }
            
            if (!dni.equals("")) {
                variables++;
                pstm.setString(variables, dni.toUpperCase());
            }
            
            if (!localidad.equals("")) {
                variables++;
                pstm.setString(variables, localidad.toUpperCase());
            }
            
            if (!fijo.equals("")) {
                variables++;
                pstm.setString(variables, fijo);
            }
            
            if (!movil.equals("")) {
                variables++;
                pstm.setString(variables, movil);
            }
            
            if (!email.equals("")) {              
                variables++;
                pstm.setString(variables, email.toUpperCase());
            }
           
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Profesor(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getString("DNI"), 
                    rs.getString("SEGSOCIAL"), rs.getString("CCC"), 
                    rs.getString("MATERIAL"), rs.getInt("IDENTIFICADOR"), 
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
    
    public List <Profesor> findAll () {
        
        List <Profesor> listado = new ArrayList <Profesor> ();
        
        String sql = 
            "SELECT * FROM PROFESOR JOIN PERSONA USING (IDENTIFICADOR)";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Profesor(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getString("DNI"), 
                    rs.getString("SEGSOCIAL"), rs.getString("CCC"), 
                    rs.getString("MATERIAL"), rs.getInt("IDENTIFICADOR"), 
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
    
    /**
     * @deprecated
     * @param pf
     * @return 
     */
    public Profesor findByPk (Profesor pf) {
	return findByPk(pf.getIdentificador());
    }
    
    /**
     * @deprecated
     * @param pf
     * @return 
     */
    public Profesor findByPk (int pk) {
        String sql =
            "SELECT * FROM PROFESOR WHERE IDENTIFICADOR = ?";
        
        Profesor pf = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                pf = new Profesor(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getString("DNI"), 
                    rs.getString("SEGSOCIAL"), rs.getString("CCC"), 
                    rs.getString("MATERIAL"), rs.getInt("IDENTIFICADOR"), 
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
        
        return pf;
    }
    
}
