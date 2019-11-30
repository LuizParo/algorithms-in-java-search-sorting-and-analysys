package br.com.alura.notas;

public class TestaOrdenacaoRapida {

    public static void main(String[] args) {
        Nota guilherme = new Nota("guilherme", 7);

        Nota [] notas = {
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("ana", 10),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("lucia", 9.3),
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                guilherme
        };

        ordena(notas, 0, notas.length);

        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static void ordena(Nota[] notas, int de, int ate) {
        int quantidadeDeElementos = ate - de;

        if (quantidadeDeElementos > 1) {
            int posicaoDoPivo = particiona(notas, ate);
            ordena(notas, de, posicaoDoPivo);
            ordena(notas, posicaoDoPivo + 1, ate);
        }
    }

    private static int particiona(Nota[] notas, int termino) {
        int menoresEncontrados = 0;
        Nota pivo = notas[termino - 1];

        for (int i = 0; i < termino - 1; i++) {
            Nota atual = notas[i];

            if (atual.getValor() <= pivo.getValor()) {
                troca(notas, i, menoresEncontrados);
                menoresEncontrados++;
            }
        }

        troca(notas, termino - 1, menoresEncontrados);
        return menoresEncontrados;
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];

        notas[para] = nota1;
        notas[de] = nota2;
    }
}
