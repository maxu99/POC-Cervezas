package UTN.clases;

import UTN.interfaces.iBeber;
import UTN.interfaces.iOrinar;

public class Espartano extends Humano {
    private int toleranciaExtra;

    public Espartano(String nombre, int peso, int edad, iBeber beber, iOrinar orinar,int toleranciaExtra) {
        super(nombre, peso, edad, beber, orinar);
        this.toleranciaExtra=toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }
}
