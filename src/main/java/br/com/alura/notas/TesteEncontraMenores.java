package br.com.alura.notas;

public class TesteEncontraMenores {

    public static void main(String[] args) {
        Nota guilherme = new Nota("guilherme", 7);

        Nota [] notas = {
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("ana", 10),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                guilherme,
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("lucia", 9.3)
        };

        int menores = encontraMenores(guilherme, notas);

        System.out.println("Número de menores: " + menores);
    }

    private static int encontraMenores(Nota busca, Nota[] notas) {
        int menores = 0;

        for (int i = 0; i < notas.length; i++) {
            Nota nota = notas[i];

            if (nota.getValor() < busca.getValor()) {
                menores++;
            }
        }

        return menores;
    }
}
