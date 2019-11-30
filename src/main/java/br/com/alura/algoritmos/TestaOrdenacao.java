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

//        selectionSort(produtos, produtos.length);
        insertionSort(produtos, produtos.length);

        imprime(produtos);
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

    private static void selectionSort(Produto[] produtos, int quatidadeDeElementos) {
        for (int atual = 0; atual < quatidadeDeElementos - 1; atual++) {
            System.out.println("\nEstou na casinha " + atual);

            int menor = buscaMenor(produtos, atual, produtos.length - 1);
            troca(produtos, atual, menor);
        }
    }

    private static void insertionSort(Produto[] produtos, int quatidadeDeElementos) {
        for (int atual = 1; atual < quatidadeDeElementos; atual++) {
            System.out.println("\nEstou na casinha " + atual);

            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                troca(produtos, analise, analise - 1);
                --analise;
            }
        }
    }

    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        System.out.println("Trocando " + primeiro + " com o " + segundo);
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        System.out.println("Trocando " + primeiroProduto.getNome() + " com o " + segundoProduto.getNome());
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static void imprime(Produto[] produtos) {
        System.out.println("\n\n==================");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }
}
