/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.NominaProfesor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudNominaProfesor {
    
    public boolean create (NominaProfesor np) {
        String sql =
                "INSERT INTO NOMINAPROFESOR VALUES "
                + "(?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, np.getIdNomina());
            pstm.setInt(2, np.getIdProfesor());
            
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
    
    public boolean update (NominaProfesor np) {
        String sql = 
                "UPDATE NOMINAPROFESOR SET "
                + "PROFESOR = ? "
                + "WHERE ID_NOMINA = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, np.getIdProfesor());
            pstm.setInt(2, np.getIdNomina());
        
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
    
    public boolean delete(NominaProfesor np) {
	return delete(np.getIdNomina());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM NOMINAPROFESOR WHERE ID_NOMINA = ?";
	
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
    
    public List <NominaProfesor> findAll () {
        
        List <NominaProfesor> listado = new ArrayList <NominaProfesor> ();
        
        String sql = 
            "SELECT * FROM NOMINAPROFESOR";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new NominaProfesor(rs.getInt("ID_NOMINA"),
                    rs.getInt("PROFESOR"), rs.getInt("MES"), rs.getInt("ANO"), 
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
    
    public NominaProfesor findByPk (NominaProfesor np) {
	return findByPk(np.getIdNomina());
    }
    
    public NominaProfesor findByPk (int pk) {
        String sql =
            "SELECT * FROM NOMINAPROFESOR WHERE ID_NOMINA = ?";
        
        NominaProfesor np = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                np = new NominaProfesor(rs.getInt("ID_NOMINA"),
                    rs.getInt("PROFESOR"), rs.getInt("MES"), rs.getInt("ANO"), 
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
        
        return np;
    }
    
}
