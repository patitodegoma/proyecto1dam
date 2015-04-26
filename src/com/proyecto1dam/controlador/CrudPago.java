/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.Pago;
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
public class CrudPago {
    
    public boolean create (Pago pag) {
        String sql =
                "INSERT INTO PAGO VALUES "
                + "(SEQ_PAGO.NEXTVAL, ?, ?, ?, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pag.getIdAlumno());
            pstm.setInt(2, pag.getMes());
            pstm.setInt(3, pag.getAnyo());
            pstm.setDate(4, (Date) pag.getFechaPago());
            pstm.setDouble(5, pag.getCantidad());
            pstm.setInt(6, pag.getTipoPago());
             
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
    
    public boolean update (Pago pag) {
        String sql = 
                "UPDATE PAGO SET "
                + "ALUMNO = ?, MES = ?, ANO = ?, "
                + "FECHA_PAGO = ?, CANTIDAD = ?, TIPO_PAGO = ? "
                + "WHERE ID_PAGO = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pag.getIdAlumno());
            pstm.setInt(2, pag.getMes());
            pstm.setInt(3, pag.getAnyo());
            pstm.setDate(4, (Date) pag.getFechaPago());
            pstm.setDouble(5, pag.getCantidad());
            pstm.setInt(6, pag.getTipoPago());
            pstm.setInt(7, pag.getIdPago());
        
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
    
    public boolean delete(Pago pag) {
	return delete(pag.getIdPago());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM PAGO WHERE ID_PAGO = ?";
	
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
    
    public List <Pago> findAll () {
        
        List <Pago> listado = new ArrayList <Pago> ();
        
        String sql = 
            "SELECT * FROM PAGO";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Pago(rs.getInt("ID_PAGO"), 
                    rs.getInt("ALUMNO"), rs.getInt("MES"), 
                    rs.getInt("ANO"), rs.getDate("FECHA_PAGO"), 
                    rs.getDouble("CANTIDAD"), rs.getInt("TIPO_PAGO")));
                
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
    
    public Pago findByPk (Pago pag) {
	return findByPk(pag.getIdPago());
    }
    
    public Pago findByPk (int pk) {
        String sql =
            "SELECT * FROM PAGO WHERE ID_PAGO = ?";
        
        Pago pag = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                pag = new Pago(rs.getInt("ID_PAGO"), 
                    rs.getInt("ALUMNO"), rs.getInt("MES"), 
                    rs.getInt("ANO"), rs.getDate("FECHA_PAGO"), 
                    rs.getDouble("CANTIDAD"), rs.getInt("TIPO_PAGO"));
                
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
        
        return pag;
    }
    
}
