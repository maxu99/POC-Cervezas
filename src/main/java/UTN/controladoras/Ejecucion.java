package UTN.controladoras;

import UTN.clases.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Ejecucion {
    private static Humano boss = new Humano("Borrachin PRO",100,50,new espartanoBeber(),new vikingoOrinar());
    public Ejecucion(){

    }

    public static Humano jugar(List<Espartano> espartanos, List<Vikingo> vikingos){
        boolean verificador = true;
        int puntosj1=1;
        int puntosj2=1;

        espartanos = espartanos.stream()
                .sorted(Comparator.comparing(Espartano::getPeso))
                .collect(Collectors.toList());

        vikingos=vikingos.stream()
                .sorted(Comparator.comparing(Vikingo::getEdad))
                .collect(Collectors.toList());

        Humano j1 = espartanos.get(0);
        Humano j2 = vikingos.get(0);

        presentarse(j1);
        presentarse(j2);
        System.out.println("\nBATALLANDO!\n");
       while(verificador){
           if ((j1.getBeber().beber()+ ((Espartano) j1).getToleranciaExtra()) >= j1.getOrinar().orinar()){
               puntosj1++;
           }else{
               verificador=false;
           }

           if ((j2.getBeber().beber()+ ((Vikingo) j2).getBebedorProfesional()) >= j2.getOrinar().orinar()){
               puntosj2++;
           }else{
               verificador=false;
           }

       }
        return verGanador(puntosj1,puntosj2,j1,j2);

    }
    public static void presentarse(Humano h){
        System.out.println(h.toString());
    }

    private static Humano cargabd(int bebidas, Humano h) {
        connect.insert("INSERT INTO ganadores (nombre, cantidad) VALUES ('" + h.getNombre() + "', " + bebidas + ")");
        return h;
    }

    public static void peleaBoss (Humano h){
       int puntoshumano=0;
       int puntosboss=0;
        System.out.println("\n PELEA FINAL!\n");
        if(h instanceof Vikingo) {
            puntoshumano=((Vikingo) h).getBebedorProfesional()*5;
        }else if(h instanceof Espartano) {
         puntoshumano=((Espartano) h).getToleranciaExtra()*5;
        }
        puntosboss=boss.getBeber().beber()*12;
        if(puntosboss>puntoshumano){
            System.out.println("GANO EL BOSS, bebió " + puntosboss+ "cervezas");
        }else {
            System.out.println("VICTORIA MAGISTRAL DE "+ h.getNombre() + " bebio "+ puntoshumano +" cervezas. El BOSS pierde el invicto");
        }


    }

    private static Humano verGanador(int puntosj1,int puntosj2,Humano j1,Humano j2){

        if(puntosj1>puntosj2){
            System.out.println("Gano "+ j1.getNombre()+" tomo "+ puntosj1+ " cervezas");
            cargabd(puntosj1,j1);
            return j1;
        }else{
            System.out.println("Gano "+ j2.getNombre()+" tomo "+ puntosj2+ " cervezas");
            cargabd(puntosj2,j2);
            return j2;
        }
    }
}



