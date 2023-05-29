package org.franco.Elipses;

import lombok.*;
import org.franco.FiguraBase;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Elipse extends FiguraBase {

    private double radioMayor;
    private double radioMenor;


    @Override
    public double calcularPerimetro() {
        return Math.PI * (3 * (radioMayor + radioMenor) - Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor)));
    }
}
