package org.franco.Poligonos;

import lombok.Getter;
import lombok.Setter;
import org.franco.Lado;

import java.util.Collections;
import java.util.Comparator;

@Getter
@Setter
public class Cuadrado extends Cuadrilatero{

    private double longitudLado;

    public Cuadrado(){
        super();
        this.longitudLado=calcularLongitudLados();
    }

    public double calcularLongitudLados() {
        return getLados().get(0).getLongitud();
    }

}
