package org.francoo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        generarContinenteEjemplo();
    }

    public static void generarContinenteEjemplo() {
        try {
            Ciudad romaCiudad = new Ciudad("Roma");
            Ciudad latinaCiudad = new Ciudad("Latina");

            Ciudad parisCiudad = new Ciudad("París");
            Ciudad lyonCiudad = new Ciudad("Lyon");

            Provincia ileDeFrance = new Provincia("Ile-de-France", false, List.of(parisCiudad), null, null);
            Provincia auvergneRhoneAlpes = new Provincia("Auvergne-Rhône-Alpes", false, List.of(lyonCiudad), null, null);

            Provincia lazio = new Provincia("Lazio", false, Arrays.asList(romaCiudad, latinaCiudad), null, null);

            Pais italia = new Pais("Italia", List.of(lazio), null);
            Pais francia = new Pais("Francia", Arrays.asList(ileDeFrance, auvergneRhoneAlpes), null);

            List<Pais> paisesEuropa = new ArrayList<>();
            paisesEuropa.add(italia);

            Continente Europa = new Continente("Europa", paisesEuropa);

            Europa.agregarPais(francia);
            francia.agregarPaisLimitrofe(italia);
            italia.agregarPaisLimitrofe(francia);
            Europa.mostrarPaises();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}