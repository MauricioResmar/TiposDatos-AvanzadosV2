package BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        //Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        //Imprime la Suma con demasiada precisión, ideal para algoritmos en el sector financiero o blockchain
        System.out.println(resultado.toString());
    }
}
