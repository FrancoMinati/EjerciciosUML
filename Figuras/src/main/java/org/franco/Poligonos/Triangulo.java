package org.franco.Poligonos;

import lombok.Getter;
import lombok.Setter;
import org.franco.Lado;
import org.franco.Punto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
public class Triangulo extends Poligono {

    private double altura;
    private double longitudBase;

    public Triangulo() {
        super(3);
        this.longitudBase=calcularLongitudBase();

    }

    public double calcularLongitudBase() {
        Lado ladoBase = Collections.max(getLados(), Comparator.comparingDouble(Lado::getLongitud));
        return ladoBase.getLongitud();
    }

}




