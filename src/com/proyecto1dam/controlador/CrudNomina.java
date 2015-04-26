/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.Nomina;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudNomina {
    
    public boolean create (Nomina n) {
        String sql =
                "INSERT INTO NOMINA VALUES "
                + "(SEQ_NOMINA.NEXTVAL, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, n.getMes());
            pstm.setInt(2, n.getAnyo());
            pstm.setDouble(3, n.getImporte());
            
            
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
    
    public boolean update (Nomina n) {
        String sql = 
                "UPDATE NOMINA SET "
                + "MES = ?, ANO = ?, IMPORTE = ? "
                + "WHERE ID_NOMINA = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, n.getMes());
            pstm.setInt(2, n.getAnyo());
            pstm.setDouble(3, n.getImporte());
            pstm.setInt(4, n.getIdNomina());
        
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
    
    public boolean delete(Nomina n) {
	return delete(n.getIdNomina());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM NOMINA WHERE ID_NOMINA = ?";
	
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
    
    public List <Nomina> findAll () {
        
        List <Nomina> listado = new ArrayList <Nomina> ();
        
        String sql = 
            "SELECT * FROM NOMINA";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Nomina(rs.getInt("ID_NOMINA"), 
                    rs.getInt("MES"), rs.getInt("ANO"), 
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
    
    public Nomina findByPk (Nomina n) {
	return findByPk(n.getIdNomina());
    }
    
    public Nomina findByPk (int pk) {
        String sql =
            "SELECT * FROM NOMINA WHERE ID_NOMINA = ?";
        
        Nomina n = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                n = new Nomina(rs.getInt("ID_NOMINA"), 
                    rs.getInt("MES"), rs.getInt("ANO"), 
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
        
        return n;
    }
    
}
