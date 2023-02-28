package org.example;

public class Teatro {
    private int fila;
    private int asiento;
    private int precio;

    public Teatro(){

    }

    public Teatro(int fila, int asiento, int precio) {
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "fila=" + fila +
                ", asiento=" + asiento +
                ", precio=" + precio +
                '}';
    }
}
