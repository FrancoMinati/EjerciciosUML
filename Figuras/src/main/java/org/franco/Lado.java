package org.franco;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Lado {
    private Punto puntoInicio;
    private Punto puntoFin;
    private double longitud;

    public Lado(double xInicio, double yInicio, double xFin, double yFin) {
        this.puntoInicio = new Punto(xInicio, yInicio);
        this.puntoFin = new Punto(xFin, yFin);
        this.longitud = calcularLongitud();
    }

    private double calcularLongitud() {
        this.longitud =Math.sqrt(puntoInicio.getX()*puntoFin.getX() + puntoInicio.getY()*puntoFin.getY());
        return longitud;
    }


}

