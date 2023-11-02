
/**
 * Classe que representa uma viagem feita no aplicativo (ex.: Uber).
 * 
 * Uma viagem tem o motorista, o nome do passageiro e a distância a ser percorrida.
 * Além disso, tem também o valor fixo pago ao motorista por km/rodado.
 * 
 * @author Julio César Alves
 * @version 2023.11.02
 */
public class Viagem
{
    // o motorista da viagem
    private Motorista motorista;
    // nome do passageiro que fará a viagem
    private String nomeDoPassageiro;
    // distância a ser percorrida na viagem (em km)
    private int distancia;
    // valor pago ao motorista por km/rodado
    private static final int valorPorKm = 2;

    /**
     * Construtor para objetos da classe Viagem
     */
    public Viagem(Motorista motorista, String passageiro, int distancia)
    {
        this.motorista = motorista;
        this.nomeDoPassageiro = passageiro;
        this.distancia = distancia;
    }

    /**
     * @return o motorista da viagem
     */
    public Motorista obterMotorista()
    {
        return motorista;
    }

    /**
     * @return o nome do passagem que fará a viagem
     */
    public String obterNomeDoPassageiro()
    {
        return nomeDoPassageiro;
    }

    /**
     * @return distância a ser percorrida na viagem
     */
    public int obterDistancia()
    {
        return distancia;
    }
}
