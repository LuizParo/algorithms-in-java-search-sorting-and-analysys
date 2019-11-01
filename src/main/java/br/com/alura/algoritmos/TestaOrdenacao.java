package br.com.alura.algoritmos;

public class TestaOrdenacao {

    public static void main(String[] args) {
        final Produto[] produtos = {
                new Produto("Lamborghini", 1_000_000D),
                new Produto("Jipe", 46_000D),
                new Produto("Brasília", 16_000D),
                new Produto("Smart", 46_000D),
                new Produto("Fusca", 17_000D)
        };

        ordena(produtos, produtos.length);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        return maisBarato;
    }

    private static void ordena(Produto[] produtos, int quatidadeDeElementos) {
        for (int atual = 0; atual < quatidadeDeElementos - 1; atual++) {
            System.out.println("Estou na casimha " + atual);

            int menor = buscaMenor(produtos, atual, produtos.length - 1);

            System.out.println("Trocando " + atual + " com o " + menor);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];

            System.out.println("Trocando " + produtoAtual.getNome() + " " + produtoMenor.getNome());
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }
}
