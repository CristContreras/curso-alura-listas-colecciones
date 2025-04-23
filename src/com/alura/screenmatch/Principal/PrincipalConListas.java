package com.alura.screenmatch.Principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(6);
        var peliculaBruno = new Pelicula("Señor de los anillos",2001);
        peliculaBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        /*
        Cuando hacemos "Pelicula unaPelicula..." ese tramo es una referencia a una posición de memoria
        que seria luego el "new Pelicula();"
         */

        //p1 hace referencia a la peliculaBruno, es como una flecha que indica a esa posicion de memoria
        //del objeto.
        //NO ES UNA COPIA DEL OBJETO A P1, ES UNA REFERENCIA A ESE OBJETO EN MEMORIA.
        Pelicula p1 = peliculaBruno;



        ArrayList<Titulo> lista= new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaBruno);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            //estamos preguntando "este item es de la instancia pelicula?"
            if(item instanceof Pelicula pelicula){ //java 14 aparece el "pelicula" que crea automaticamente el objeto
//                Pelicula pelicula = (Pelicula)item; //convierte cada item de la lista en pelicula para acceder a getclasificacion()
                System.out.println(pelicula.getClasificacion());
            }

        }
        //otro cambio
//        for (Titulo item: lista){
//            System.out.println(item.getNombre());
//            //estamos preguntando "este item es de la instancia pelicula?"
//            if(item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
//                Pelicula pelicula = (Pelicula)item; //convierte cada item de la lista en pelicula para acceder a getclasificacion()
//                System.out.println(pelicula.getClasificacion());
//            }
//
//        }

    }
}
