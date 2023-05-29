package org.francoo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Provincia {

    private String nombreProvincia;

    private boolean isCapitalDelPais;

    private List<Ciudad> ciudades;

    private List<Provincia> provinciasLimitrofes;

    private List<Pais> paisesLimitrofes;

    public Provincia(String nombreProvincia,
                     boolean isCapitalDelPais,
                     List<Ciudad> ciudades,
                     List<Provincia> provinciasLimitrofes,
                     List<Pais> paisesLimitrofes) throws Exception {

        if (ciudades.isEmpty()) {
            throw new Exception("Cada provincia debe tener al menos una ciudad.");
        }

        this.nombreProvincia = nombreProvincia;
        this.isCapitalDelPais = isCapitalDelPais;
        this.ciudades = ciudades;
        this.provinciasLimitrofes = provinciasLimitrofes;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if(ciudades!=null){
            this.ciudades.add(ciudad);
        }else{
            ciudades=new ArrayList<Ciudad>();
            ciudades.add(ciudad);
        }
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        if(provinciasLimitrofes!=null){
            this.provinciasLimitrofes.add(provincia);
        }else{
            provinciasLimitrofes=new ArrayList<Provincia>();
            provinciasLimitrofes.add(provincia);
        }
    }

    public void agregarPaisLimitrofe(Pais pais) {

        if(paisesLimitrofes!=null){
            this.paisesLimitrofes.add(pais);
        }else{
            paisesLimitrofes=new ArrayList<Pais>();
            paisesLimitrofes.add(pais);
        }
    }
}
