/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaz_v1.MySQL;

import java.sql.*;

/**
 *
 * @author Neto
 */
public class Conectar {
    protected Connection con;
    protected PreparedStatement consulta;
    protected ResultSet datos;
    private String server, user, bd, pass;
    
    public Conectar(String server,String user,String bd,String pass){
        this.server = server;
        this.user = user;
        this.bd = bd;
        this.pass = pass;
    }
    
    public void conexion() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        this.con=DriverManager.getConnection("jdbc:mysql//"+this.server+"/"+this.bd,this.user,this.pass);
    }
    
    public void desconectar() throws SQLException{
        this.con.close();
        this.consulta.close();
    }
    
    public ResultSet getDatos() throws SQLException{
        this.consulta= this.con.prepareStatement("");//consulta
        this.datos = this.consulta.executeQuery();
        return this.datos;
    }
    
}
