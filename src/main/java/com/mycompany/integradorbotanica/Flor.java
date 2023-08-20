/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorbotanica;

/**
 *
 * @author EQUIPO
 */
public class Flor extends Planta{

    public String colorDePetalos;
    public int cantidadDePetalos;
    public String colorPistillo;
    public String variedadDeFlor;
    public String estacionFloracion;

    public Flor() {
    }

    public Flor(String colorDePetalos, int cantidadDePetalos, String colorPistillo, String variedadDeFlor, String estacionFloracion) {
        this.colorDePetalos = colorDePetalos;
        this.cantidadDePetalos = cantidadDePetalos;
        this.colorPistillo = colorPistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionFloracion = estacionFloracion;
    }

    public Flor(String colorDePetalos, int cantidadDePetalos, String colorPistillo, String variedadDeFlor, String estacionFloracion, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadDePetalos = cantidadDePetalos;
        this.colorPistillo = colorPistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionFloracion = estacionFloracion;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadDePetalos() {
        return cantidadDePetalos;
    }

    public void setCantidadDePetalos(int cantidadDePetalos) {
        this.cantidadDePetalos = cantidadDePetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionFloracion() {
        return estacionFloracion;
    }

    public void setEstacionFloracion(String estacionFloracion) {
        this.estacionFloracion = estacionFloracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    
    @Override
    public void decirHola() {
        System.out.println("Hola, soy una FLOR");
    }
    
}
