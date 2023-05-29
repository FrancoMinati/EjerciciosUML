package org.franco.Elipses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circulo extends Elipse {

    private double radio;



    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
