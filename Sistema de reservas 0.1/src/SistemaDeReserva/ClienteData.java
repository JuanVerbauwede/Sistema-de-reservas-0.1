/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import SistemaDeReserva.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanv
 */
public class ClienteData {
   private Connection connection = null;

    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    //Alta de un Cliente = guarda un cliente.
    public void guardarCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO cliente ( pasaporte, apellido, nombre, numeroTarjeta, email) VALUES ( ?, ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cliente.getPasaporte());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getNumeroTarjeta());
            statement.setString(5, cliente.getEmail());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cliente.setId_cliente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setId_cliente(resultSet.getInt("id_cliente"));
                cliente.setPasaporte(resultSet.getInt("pasaporte"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setNumeroTarjeta(resultSet.getString("numeroTarjeta"));
                cliente.setEmail(resultSet.getString("email"));
                
                

                clientes.add(cliente);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    }
    
    public void borrarCliente(int id){
    try {
            
            String sql = "DELETE FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un cliente: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE cliente SET pasaporte = ?, apellido = ?, nombre = ? , numeroTarjeta =?,"
                    + "email=? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cliente.getPasaporte());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getNumeroTarjeta());
            statement.setString(5, cliente.getEmail());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    
    }
    
    public Cliente buscarCliente(int id){
    Cliente cliente=null;
    try {
            
            String sql = "SELECT * FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setId_cliente(resultSet.getInt("id_cliente"));
                cliente.setPasaporte(resultSet.getInt("pasaporte"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setNumeroTarjeta(resultSet.getString("numeroTarjeta"));
                cliente.setEmail(resultSet.getString("email"));
                

                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
}
