package org.francoo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Continente {

    private String nombreContinente;

    private List<Pais> paises;

    public Continente(String nombreContinente,
                      List<Pais> paises) throws Exception {

        if (paises.isEmpty()) {
            throw new Exception("Un contienente debe tener por lo menos un pais.");
        }
        this.nombreContinente = nombreContinente;
        this.paises = paises;
    }
    public void agregarPais(Pais pais) {

        if(paises!=null){
            this.paises.add(pais);
        }else{
            paises=new ArrayList<Pais>();
            paises.add(pais);
        }
    }

    public void mostrarPaises() {
        System.out.println("Países en el continente " + nombreContinente + ":");

        for (Pais pais : paises) {
            System.out.println("País: " + pais.getNombrePais());

            List<Provincia> provincias = pais.getProvincias();
            if (provincias.isEmpty()) {
                System.out.println("No hay provincias registradas para este país.");
            } else {
                for (Provincia provincia : provincias) {
                    System.out.println("Provincia: " + provincia.getNombreProvincia());

                    List<Ciudad> ciudades = provincia.getCiudades();
                    if (ciudades.isEmpty()) {
                        System.out.println("No hay ciudades registradas para esta provincia.");
                    } else {
                        System.out.println("Ciudades:");
                        for (Ciudad ciudad : ciudades) {
                            System.out.println("- " + ciudad.getNombreCiudad());
                        }
                    }
                }
            }
            System.out.println("--------------------------------------");
        }
    }


}