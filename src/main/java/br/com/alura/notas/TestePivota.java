package br.com.alura.notas;

public class TestePivota {

    public static void main(String[] args) {
        Nota guilherme = new Nota("guilherme", 7);

        Nota [] notas = {
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("ana", 10),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("lucia", 9.3),
                guilherme
        };

        quebraNoPivo(notas, 0, notas.length);
    }

    private static void quebraNoPivo(Nota[] notas, int inicio, int termino) {
        int menoresEncontrados = 0;
        Nota pivo = notas[termino - 1];

        for (int i = 0; i < termino - 1; i++) {
            Nota atual = notas[i];

            if (atual.getValor() <= pivo.getValor()) {
                menoresEncontrados++;
            }
        }

        troca(notas, termino - 1, menoresEncontrados);

        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];

        notas[para] = nota1;
        notas[de] = nota2;
    }
}
