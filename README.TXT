Faça as alterações pedidas abaixo no código do projeto prova-locadora-veiculos disponibilizado junto com a prova. 

Atenção: você deve escrever na prova as respostas pedidas. 
Você pode usar o BlueJ para implementar e testar mas precisa passar as 
respostas para a folha de respostas da prova, pois somente a folha de respostas será corrigida.

Estude atentamente o código e os comentários das classes fornecidas antes de fazer suas implementações.
Sugestão: estude o código nessa ordem: Carro, Locacao, Locadora e TesteLocadora.
Faça seu código seguindo um bom design de classes.

(15 pontos) Crie um novo método na classe Locacao que retorna o valor total da locação 
(considerando o valor da diária do carro e o número de diárias da locação). 
Em seguida, altere o método locarVeiculo da classe Locadora para que ele retorne 
o valor da locação em vez de um booleano. Obs.: se o veículo não for encontrado, 
retorne o valor zero.

(10 pontos) Altere o construtor da classe TesteLocadora de forma que: 
(a) seja feita uma locação do carro Gol, pelo cliente Tião por 5 diárias e 
(b) o valor da locação seja exibido no terminal.

(25 pontos) Faças as alterações necessárias na classe Locadora para fazer a devolução de um veículo. 
Deve existir um método que receba o nome do cliente por parâmetro e, se ele tiver uma locação, 
remova a sua locação da coleção de locações, deixe o carro locado novamente disponível e retorne true. 
Caso o cliente não tenha nenhuma locação, o método deve retornar false. 
Obs.: assuma que um cliente loque apenas um carro por vez. Você deve também acrescentar código na 
classe TesteLocadora para testar o novo método.
