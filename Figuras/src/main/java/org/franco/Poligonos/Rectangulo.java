package org.franco.Poligonos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.franco.Lado;

import java.util.Collections;
import java.util.Comparator;

@Getter
@Setter
public class Rectangulo extends Cuadrilatero{

    private double longitudBase;
    private double longitudAltura;

    public Rectangulo(){
        super();
        this.longitudBase=calcularLongitudBase();
        this.longitudAltura=calcularLongitudAltura();
    }

    public double calcularLongitudBase() {
        Lado ladoBase = Collections.max(getLados(), Comparator.comparingDouble(Lado::getLongitud));
        return ladoBase.getLongitud();
    }
    public double calcularLongitudAltura() {
        Lado ladoBase = Collections.min(getLados(), Comparator.comparingDouble(Lado::getLongitud));
        return ladoBase.getLongitud();
    }

}
