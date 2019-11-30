package br.com.alura.notas;

public class TesteMerge {

    public static void main(String[] args) {
        Nota[] notasDoAniche = {
                new Nota("andre", 4),
                new Nota("mariana", 5),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9)
        };

        Nota[] notasDoAlberto = {
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("guilherme", 7),
                new Nota("lucia", 9.3),
                new Nota("ana", 10)
        };

        Nota[] rank = intercala(notasDoAniche, notasDoAlberto);

        for (Nota nota : rank) {
            System.out.println("Aluno " + nota.getAluno() + " teve a nota " + nota.getValor());
        }
    }

    private static Nota[] intercala(Nota[] notas1, Nota[] notas2) {
        int total = notas1.length + notas2.length;
        Nota[] resultado = new Nota[total];

        int atual = 0;
        int atualNotas1 = 0;
        int atualNotas2 = 0;

        while(atualNotas1 < notas1.length && atualNotas2 < notas2.length) {
            Nota notaAtua1 = notas1[atualNotas1];
            Nota notaAtual2 = notas2[atualNotas2];

            if (notaAtua1.getValor() < notaAtual2.getValor()) {
                resultado[atual] = notaAtua1;
                atualNotas1++;
            } else {
                resultado[atual] = notaAtual2;
                atualNotas2++;
            }

            atual++;
        }

        while(atualNotas1 < notas1.length) {
            resultado[atual] = notas2[atualNotas1];
            atualNotas1++;
            atual++;
        }

        while(atualNotas2 < notas2.length) {
            resultado[atual] = notas2[atualNotas2];
            atualNotas2++;
            atual++;
        }

        return resultado;
    }
}
