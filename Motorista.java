
/**
 * Classe que representa um motorista de aplicativo.
 * 
 * Um motorista possui um nome, a placa do seu carro e o total 
 * recebido pelas viagens.
 * 
 * @author Julio César Alves
 * @version 2023.11.02
 */
public class Motorista
{
    // nome do motorista
    private String nome;
    // placa do carro usado pelo motorista
    private String placaDoCarro;
    // valor total recebido pelas viagens
    private int totalRecebido;
    
    
    /**
     * Construtor para objetos da classe Motorista
     */
    public Motorista(String nome, String placaDoCarro)
    {
        this.nome = nome;
        this.placaDoCarro = placaDoCarro;
        totalRecebido = 0;
    }

    /**
     * @return o nome do motorista
     */
    public String obterNome()
    {
        return nome;
    }

    /**
     * @return a placa do carro do motorista
     */
    public String obterPlacaDoCarro()
    {
        return placaDoCarro;
    }
    
    /**
     * @return o valor total recebido pelo motorista pelas viagens
     */
    public int obterValorTotal()
    {
        return totalRecebido;
    }
    
    /**
     * Recebe o valor referente a uma viagem
     */
    public void receberValor(int valor) {
        totalRecebido += valor;
    }
}
