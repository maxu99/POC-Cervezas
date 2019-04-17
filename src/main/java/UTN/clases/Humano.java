package UTN.clases;

import UTN.interfaces.iBeber;
import UTN.interfaces.iOrinar;

public class Humano {
    private String nombre;
    private int peso;
    private int edad;
    private iBeber beber;
    private iOrinar orinar;

    public Humano(String nombre, int peso, int edad, iBeber beber, iOrinar orinar) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.beber = beber;
        this.orinar = orinar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public iBeber getBeber() {
        return beber;
    }

    public void setBeber(iBeber beber) {
        this.beber = beber;
    }

    public iOrinar getOrinar() {
        return orinar;
    }

    public void setOrinar(iOrinar orinar) {
        this.orinar = orinar;
    }

    @Override
    public String toString() {
        return
                "\nMi nombre es " + nombre +
                " peso " + peso +
                " y tengo " + edad  +" años" + "\n";
    }


}
