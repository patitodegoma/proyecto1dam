/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.Alumno;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author andres
 */
public class CrudAlumno {
    
    public boolean create (Alumno alu) {
        String sql =
                "INSERT INTO ALUMNO VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, alu.getIdentificador());
            pstm.setString(2, alu.getUsuario());
            pstm.setString(3, alu.getPass());
            pstm.setDate(4, (Date) alu.getFechaAlta());
            pstm.setDate(5, (Date) alu.getFechaBaja());
            pstm.setDouble(6, alu.getBonificacion());
            pstm.setDouble(7, alu.getCuota());
            pstm.setString(8, alu.getCcc());
            pstm.setInt(9, alu.getTipoPago());
            pstm.setInt(10, alu.getIdGrupo());
            pstm.setInt(11, alu.getIdResponsable());
            
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
    
    public boolean update (Alumno alu) {
        String sql = 
                "UPDATE ALUMNO SET "
                + "USUARIO = ?, CONTRASENA = ?, FECHA_ALTA = ?, FECHA_BAJA = ?, "
                + "BONIFICACION = ?, CUOTA = ?, CCC = ?, TIPO_PAGO = ?, "
                + "ID_GRUPO = ?, RESPONSABLE = ? "
                + "WHERE IDENTIFICADOR = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setString(1, alu.getUsuario());
            pstm.setString(2, alu.getPass());
            pstm.setDate(3, (Date) alu.getFechaAlta());
            pstm.setDate(4, (Date) alu.getFechaBaja());
            pstm.setDouble(5, alu.getBonificacion());
            pstm.setDouble(6, alu.getCuota());
            pstm.setString(7, alu.getCcc());
            pstm.setInt(8, alu.getTipoPago());
            pstm.setInt(9, alu.getIdGrupo());
            pstm.setInt(10, alu.getIdResponsable());
            pstm.setInt(11, alu.getIdentificador());
        
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
    
    public boolean delete(Alumno alu) {
	return delete(alu.getIdentificador());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM ALUMNO WHERE IDENTIFICADOR = ?";
	
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
    
    public List <Alumno> findAll () {
        
        List <Alumno> listado = new ArrayList <Alumno> ();
        
        String sql = 
            "SELECT * FROM ALUMNO";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Alumno(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getDate("FECHA_ALTA"), 
                    rs.getDate("FECHA_BAJA"), rs.getDouble("BONIFICACION"), 
                    rs.getDouble("CUOTA"), rs.getString("CCC"), 
                    rs.getInt("TIPO_PAGO"), rs.getInt("ID_GRUPO"), 
                    rs.getInt("RESPONSABLE"), rs.getInt("IDENTIFICADOR"), 
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
    
    public Alumno findByPk (Alumno alu) {
	return findByPk(alu.getIdentificador());
    }
    
    public Alumno findByPk (int pk) {
        String sql =
            "SELECT * FROM ALUMNO WHERE IDENTIFICADOR = ?";
        
        Alumno alu = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                alu = new Alumno(rs.getString("USUARIO"),
                    rs.getString("CONTRASENA"), rs.getDate("FECHA_ALTA"), 
                    rs.getDate("FECHA_BAJA"), rs.getDouble("BONIFICACION"), 
                    rs.getDouble("CUOTA"), rs.getString("CCC"), 
                    rs.getInt("TIPO_PAGO"), rs.getInt("ID_GRUPO"), 
                    rs.getInt("RESPONSABLE"), rs.getInt("IDENTIFICADOR"), 
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
        
        return alu;
    }
    
}
