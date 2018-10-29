/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

/**
 *
 * @author juanv
 */
public class Cliente {
    private int id_cliente = -1;
    private String pasaporte;
    private String apellido;
    private String nombre;
    private String numeroTarjeta;
    private String email;

    public Cliente() {
    }

    
    
    
    public Cliente(String pasaporte, String apellido, String nombre, String numeroTarjeta, String email) {
        this.pasaporte = pasaporte;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.email = email;
    }

    
    public Cliente(int id_cliente, String pasaporte, String apellido, String nombre, String numeroTarjeta, String email) {
        this.id_cliente = id_cliente;
        this.pasaporte = pasaporte;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.email = email;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
    
    
}
