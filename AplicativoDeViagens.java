import java.util.ArrayList;

/**
 * Classe para representar uma locadora de veículos. Uma locadora
 * tem uma frota de carros que podem ser locados. O cliente pode
 * fazer uma locação de um carro por um período determinado de 
 * diárias.
 * 
 * Obs.: este código não tem a implementação completa da classe.
 * 
 * @author Julio César Alves
 * @version 2023.11.01
 */
public class AplicativoDeViagens
{
    // motoristas disponíveis para as viagens
    private ArrayList<Motorista> motoristas;
    // viagens realizadas no aplicativo
    private ArrayList<Viagem> viagens;

    /**
     * Construtor para objetos da classe AplicativoViagens
     */
    public AplicativoDeViagens()
    {
        motoristas = new ArrayList<>();
        viagens = new ArrayList<>();
    }

    /**
     * Retorna uma String com as informações das viagens já realizadas
     */
    public String listarViagens() {        
        if (viagens.size() > 0) {
            String dados = "";
            for (Viagem viagem : viagens) {
                dados += "Passageiro " + viagem.obterNomeDoPassageiro() + 
                         " viajou no carro de placa " + viagem.obterMotorista().obterPlacaDoCarro() +
                         " por " + viagem.obterDistancia() + " km";
            }
            return dados;
        }
        else {
            return "Nenhuma viagem realizada ainda!";
        }
    }
}
