package UTN.clases;

import UTN.interfaces.iOrinar;

public class espartanoOrinar implements iOrinar {

    @Override
    public int orinar() {
        int i = (int) Math.floor(Math.random()*10);
        return i;
    }
}
