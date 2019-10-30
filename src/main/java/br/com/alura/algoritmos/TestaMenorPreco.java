package br.com.alura.algoritmos;

public class TestaMenorPreco {

    public static void main(String[] args) {
        final double[] precos = new double[5];
        precos[0] = 1_000_000D;
        precos[1] = 46_000D;
        precos[2] = 16_000D;
        precos[3] = 46_000D;
        precos[4] = 17_000D;

        int maisBarato = 0;

        for (int atual = 0; atual < precos.length; atual++) {
            if (precos[atual] < precos[maisBarato]) {
                maisBarato = atual;
            }
        }

        System.out.println(maisBarato);
        System.out.println("O carro mais barato custa: " + precos[maisBarato]);
    }
}
