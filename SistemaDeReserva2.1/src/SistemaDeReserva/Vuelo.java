/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.time.LocalDate;

/**
 *
 * @author arguss
 *
 */
public class Vuelo {
    
    private int id_vueloNro = -1;
    private int id_ciudadOrigen;
    private int id_ciudadDestino;
    private LocalDate salida;
    private LocalDate llegada;
    private String aerolinea;
    private String aeronave;
    private String estado="a tiempo";

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Vuelo(int id_ciudadOrigen, int id_ciudadDestino, LocalDate salida, LocalDate llegada, String aerolinea,
            String aeronave) {
        this.id_ciudadOrigen = id_ciudadOrigen;
        this.id_ciudadDestino = id_ciudadDestino;
        this.salida = salida;
        this.llegada = llegada;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
    }
    public Vuelo(int id_vueloNro, int id_ciudadOrigen, int id_ciudadDestino, LocalDate salida, LocalDate llegada, 
            String aerolinea, String aeronave, String estado) {
        this.id_vueloNro = id_vueloNro;
        this.id_ciudadOrigen = id_ciudadOrigen;
        this.id_ciudadDestino = id_ciudadDestino;
        this.salida = salida;
        this.llegada = llegada;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.estado = estado;
    }

    Vuelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_vueloNro() {
        return id_vueloNro;
    }

    public void setId_vueloNro(int id_vueloNro) {
        this.id_vueloNro = id_vueloNro;
    }

    public int getId_ciudadOrigen() {
        return id_ciudadOrigen;
    }

    public void setId_ciudadOrigen(int id_ciudadOrigen) {
        this.id_ciudadOrigen = id_ciudadOrigen;
    }

    public int getId_ciudadDestino() {
        return id_ciudadDestino;
    }

    public void setId_ciudadDestino(int id_ciudadDestino) {
        this.id_ciudadDestino = id_ciudadDestino;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public LocalDate getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }
}