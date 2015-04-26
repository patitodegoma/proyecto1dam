/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.inicio.ConnectDB;
import com.proyecto1dam.modelo.Grupo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class CrudGrupo {
    
    public boolean create (Grupo g) {
        String sql =
                "INSERT INTO GRUPO VALUES "
                + "(SEQ_GRUPO.NEXTVAL, ?, ?, ?)";
        int nFilas = 0;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, g.getIdCentro());
            pstm.setString(2, g.getHorario());
            pstm.setInt(3, g.getIdProfesor());
            
            
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
    
    public boolean update (Grupo g) {
        String sql = 
                "UPDATE GRUPO SET "
                + "ID_CENTRO = ?, HORARIO = ?, PROFESOR = ? "
                + "WHERE ID_GRUPO = ?";
        
        int nFilas = 0;
        
        PreparedStatement pstm;
        try {
            
            pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, g.getIdCentro());
            pstm.setString(2, g.getHorario());
            pstm.setInt(3, g.getIdProfesor());
            pstm.setInt(4, g.getIdGrupo());
        
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
    
    public boolean delete(Grupo g) {
	return delete(g.getIdGrupo());
    }
    
    public boolean delete(int pk) {
	String sql = 
            "DELETE FROM GRUPO WHERE ID_GRUPO = ?";
	
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
    
    public List <Grupo> findAll () {
        
        List <Grupo> listado = new ArrayList <Grupo> ();
        
        String sql = 
            "SELECT * FROM GRUPO";
        
        try {
            
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                listado.add(new Grupo(rs.getInt("ID_GRUPO"), 
                    rs.getInt("ID_CENTRO"), rs.getString("HORARIO"), 
                    rs.getInt("PROFESOR")));
                
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
    
    public Grupo findByPk (Grupo g) {
	return findByPk(g.getIdGrupo());
    }
    
    public Grupo findByPk (int pk) {
        String sql =
            "SELECT * FROM GRUPO WHERE ID_GRUPO = ?";
        
        Grupo g = null;
        
        try {
            PreparedStatement pstm = ConnectDB.conectar().prepareStatement(sql);
            
            pstm.setInt(1, pk);
			
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                g = new Grupo(rs.getInt("ID_GRUPO"), 
                    rs.getInt("ID_CENTRO"), rs.getString("HORARIO"), 
                    rs.getInt("PROFESOR"));
                
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
        
        return g;
    }
    
}
