package UTN;

import UTN.clases.*;
import UTN.controladoras.Ejecucion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Vikingo> vikingos = new ArrayList<>();
        List<Espartano> espartanos = new ArrayList<>();

        vikingos= Arrays.asList(new Vikingo("Macri",85,60,new vikingoBeber(),new vikingoOrinar(),5),
                                new Vikingo("Michetti",92,64,new vikingoBeber(),new vikingoOrinar(),5));

        espartanos= Arrays.asList(new Espartano("Samid",160,70,new espartanoBeber(),new espartanoOrinar(),5),
                new Espartano("CFK",75,64,new espartanoBeber(),new espartanoOrinar(),5));

        System.out.println("LA PELEA COMENZARA EN POCOS SEGUNDOS\n");
        Ejecucion.peleaBoss( Ejecucion.jugar(espartanos,vikingos));
}
}
