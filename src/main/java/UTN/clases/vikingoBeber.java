package UTN.clases;

import UTN.interfaces.iBeber;

public class vikingoBeber implements iBeber {
    @Override
    public int beber() {
        int i = (int) Math.floor(Math.random()*10);
        return i;
    }
}
