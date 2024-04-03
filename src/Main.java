/**
 * @author bruno
 */

public class Main {
    /**
     *
     * @param args valores do sistema
     */
    public static void main(String args[]){
        System.out.println("Olá professor, aqui está minha tarefa do modulo 7");

        Produto produto = new Produto();
        produto.setCodigo(1);
        produto.setNome("Monitor");
        produto.setPreco(1000);
        produto.setQuantidadeEstoque(20);

        System.out.println(produto.getCodigo());
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidadeEstoque());
    }
}
