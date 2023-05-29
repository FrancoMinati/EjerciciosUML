package org.francoo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pais {

    private String nombrePais;

    private List<Provincia> provincias;

    private List<Pais> paisesLimitrofes;

    public Pais(String nombrePais, List<Provincia> provincias, List<Pais> paisesLimitrofes) throws Exception {
        if(provincias.isEmpty()) {
            throw new Exception("Cada pais debe tenenr por lo menos una provincia.");
        }

        this.nombrePais = nombrePais;
        this.provincias = provincias;
        this.paisesLimitrofes = paisesLimitrofes;
    }
    public void agregarPaisLimitrofe(Pais pais) {
        if(paisesLimitrofes!=null){
            this.paisesLimitrofes.add(pais);
        }else{
            paisesLimitrofes=new ArrayList<Pais>();
            paisesLimitrofes.add(pais);
        }

    }

    public void agregarProvincia(Provincia provincia) {

        if(provincias!=null){
            this.provincias.add(provincia);
        }else{
            provincias=new ArrayList<Provincia>();
            provincias.add(provincia);
        }
    }
}
