package com.nidia.weather.adaptadores;

/**
 * Created by Nidia on 05/07/2015.
 */
public class Categoria {

    private String dia;
    private String tiempo;
    private int imagen;

    public Categoria(String dia, String tiempo, int imagen) {
        this.dia = dia;
        this.tiempo = tiempo;
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }



}
