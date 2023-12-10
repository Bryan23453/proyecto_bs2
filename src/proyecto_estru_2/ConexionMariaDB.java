/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estru_2;
import java.sql.*;
/**
 *
 * @author diego
 */
public class ConexionMariaDB {
    Connection conexion;
    //Datos MariaDb
    
    private String host;
    private String port;
    private String dbName;
    private String userName;
    private String userPass;
    private boolean conectado = false;
    public ConexionMariaDB(){
    }
    public void conectarMariaDB(){
        try{
            //Conexion para MariaDB
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://" + this.host +":" + this.port + "/" + this.dbName;
            conexion = DriverManager.getConnection(url, this.userName, this.userPass);
            System.out.println("Host:" + host);
            System.out.println("Conexion Exitosa");
            conectado = true;
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            conectado = false;
        }
    }
    public void desconectar(){
        try{
            conectado = false;
            conexion.close();
            
        }catch (SQLException e){
        }
    }
    public String getHost(){
        return this.host;
    }
    public String getPort(){
        return this.port;
    }
    public String getdbName(){
        return this.dbName;
    }
    public String getUser(){
        return this.userName;
    }
    public String getPass(){
        return this.userPass;
    }
    public void setHost(String tempHost){
        this.host = tempHost;
    }
    public void setPort(String tempPort){
        this.port = tempPort;
    }
    public void setdbName(String tempDBName){
        this.dbName = tempDBName;
    }
    public void setUser(String tempUser){
        this.userName = tempUser;
    }
    public void setPass(String tempPass){
        this.userPass = tempPass;
    }
    public boolean getConectado(){
        return this.conectado;
    }
    public void setConectado(boolean tempEstado){
        this.conectado = tempEstado;
    }
}
