/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingetec.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    public static Conexion instance;//singleton
    private Connection cnn;

    private Conexion() { //necesario para el patron singleton

        try {
           
            Class.forName("com.mysql.jdbc.Driver");//driver
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ingetecdb?zeroDateTimeBehavior=convertToNull", "root", "cristian");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    public synchronized static Conexion saberEstado(){//liberar carga de conexiones
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

    public void cerrarConexion() {
        instance = null;
    }

}

