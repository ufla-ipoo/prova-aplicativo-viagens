Faça as alterações pedidas abaixo no código do projeto prova-aplicativo-viagens 
disponibilizado junto com a prova. 

Atenção: você deve escrever na prova as respostas pedidas. 
Você pode usar o BlueJ para implementar e testar mas precisa passar as respostas 
para a folha de respostas da prova, pois somente a folha de respostas será corrigida.

Estude atentamente o código e os comentários das classes fornecidas antes de fazer 
suas implementações. Sugestão: estude o código nessa ordem: Motorista, Viagem, 
AplicativoDeViagens e TesteAplicativo. Lembre-se que você deve fazer suas 
implementações utilizando um bom design de classes.

(10 pontos) Crie um novo método na classe AplicativoDeViagens que permita inscrever 
um motorista. O método deve receber o nome do motorista e a placa do seu carro e 
adicionar o motorista na coleção de motoristas do aplicativo.

(10 pontos) Altere o construtor da classe TesteAplicativo para inscrever o motorista 
Tião com a placa de carro GAC0125.

(5 pontos) Crie um novo método na classe Viagem que calcule e retorne o preço de uma 
viagem considerando a distância em quilômetros e o valor por quilômetro rodado.

(25 pontos) Crie um novo método na classe AplicativoDeViagens para registrar uma nova 
viagem. O método deve receber o nome do passageiro, a placa do carro e a distância 
a ser percorrida. Se existir um motorista que tenha essa placa do carro, a viagem 
deve ser criada e registrada na coleção de viagens, e o método deve retornar o 
valor da viagem. Se não for encontrado um motorista, o método deve retornar o valor 
zero. Você deve também acrescentar código na classe TesteLocadora para testar o novo método.