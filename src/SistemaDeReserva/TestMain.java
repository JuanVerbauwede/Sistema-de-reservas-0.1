/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import SistemaDeReserva.Conexion;
import SistemaDeReserva.CiudadData;
import java.text.ParseException;
/**
 *
 * @author arguss
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/*throws ParseException {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/vuelo", "root", "");
            CiudadData ciudadData = new CiudadData(conexion);
            
            
            Ciudad ciudad1 = new Ciudad("Ramon", "Chile");
            ciudadData.guardarCiudad(ciudad1);
            System.out.println("El id de la ciudad es: " + ciudad1.getId_ciudad());
            
            //ArrayList<Alumno> lista = (ArrayList)alumnoData.obtenerAlumnos();
            //for(Alumno a:lista){ System.out.prinln(a.getNombre));

            //alumnoData.obtenerAlumnos().forEach(alumno -> {
                //System.out.println("Nombre: " + alumno.getNombre() );
            //});
            
            
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }*/
        // TODO code application logic here
        
        //Prueba de otro metodo para insertar una ciudad.
        
        
         String url = "jdbc:mysql://localhost/vuelo";
         String usuario = "root";
         String password = "";
         Connection conexion;
         PreparedStatement ps;
         
          try {
              Class.forName("org.mariadb.jdbc.Driver");
              conexion = DriverManager.getConnection(url, usuario, password);
              //cargar datos, dar de alta, hacer create
              /*ps = conexion.prepareStatement("INSERT INTO ciudad (nombreCiudad, nombrePais) VALUES( ? , ?);");
              ps.setString(1, "Cordoba");
              ps.setString(2, "Argentina");
              ps.executeUpdate();
              ps.close();*/
              
              //UPDATE
              /*ps = conexion.prepareStatement("UPDATE ciudad SET nombreCiudad='Santiago de Chile' WHERE nombreCiudad LIKE '%ramon%';");
              ps.executeUpdate();
              ps.close();*/
              
              
              //DELETE
              /*ps = conexion.prepareStatement("DELETE FROM ciudad WHERE nombreCiudad=?");
              ps.setString(1,"Cordoba");
              ps.executeUpdate();
              ps.close();*/
              
              
              //CONSULTAS
              ps = conexion.prepareStatement("SELECT * FROM ciudad");
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  System.out.println("Nombre Ciudad: "+rs.getString(2)+" Nombre País: "+rs.getString(3));
                  
                  
              }
              ps.close();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
          }
    
    }
    
}
