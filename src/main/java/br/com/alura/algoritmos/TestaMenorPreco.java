package br.com.alura.algoritmos;

public class TestaMenorPreco {

    public static void main(String[] args) {
        final Produto[] produtos = {
            new Produto("Lamborghini", 1_000_000D),
            new Produto("Jipe", 46_000D),
            new Produto("Brasília", 16_000D),
            new Produto("Smart", 46_000D),
            new Produto("Fusca", 17_000D)
        };

        int maisBarato = buscaMenor(produtos, 0, 4);
        System.out.println("O carro " + produtos[maisBarato].getNome() + " é o mais barato, e custa: " + produtos[maisBarato].getPreco());
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = 0;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        return maisBarato;
    }
}
