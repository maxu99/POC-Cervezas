package UTN.clases;

import UTN.interfaces.iBeber;
import UTN.interfaces.iOrinar;

public class Vikingo extends Humano {
    private int bebedorProfesional;

    public Vikingo(String nombre, int peso, int edad, iBeber beber, iOrinar orinar,int bebedorProfesional) {
        super(nombre, peso, edad, beber, orinar);
        this.bebedorProfesional = bebedorProfesional;
    }

    public int getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(int bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }
}
