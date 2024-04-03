/**
 * @author bruno
 */
public class Produto {

// Variaveis da classe Produto

    private int codigo;
    private String nome;
    private int preco;
    private int quantidadeEstoque;

// Metodos da classe Produto

    /**
     * Metodo que retorna o valor para codigo do produto
     *
     * @return retorna o codigo do produto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo que recebe os valores para codigo do produto
     *
     * @param codigo valores para codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que retorna o nome do produto
     *
     * @return retorna o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que recebe os valores para nome do produto
     *
     * @param nome valores para nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo que retorna o preco do produto
     *
     * @return retorna o preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Metodo que recebe os valores do preco do produto
     *
     * @param valor valores do preco do produto
     */
    public void setPreco(int valor) {
        this.preco = preco;
    }

    /**
     * Metodo que faz o calculo da quantidade no estoque
     *
     * @return retorna a quantidade no estoque
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Metodo que recebe os valores da quantidade do estoque
     *
     * @param quantidadeEstoque valores da quantidade do estoque
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
