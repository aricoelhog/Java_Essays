## Object Oriented Programming - Java ESSAY 4

![image](https://github.com/aricoelhog/Java_Essays/assets/139346671/1a9a9f61-01e8-484c-af9e-90b66b58f9b0)

![image](https://github.com/aricoelhog/Java_Essays/assets/139346671/2e6335c2-917c-4f65-a00c-8f08ed4aefe6)

1.	Crie uma classe Equipamento com o atributo ligado (tipo boolean) e com os métodos liga e desliga. O método liga() torna o atributo ligado true e o método desliga() torna o atributo ligado false.

Crie também uma classe EquipamentoSonoro que herda as características de Equipamento e que possui os atributos volume (tipo short) que varia de 0 a 10 e stereo (tipo boolean). A classe ainda deve possuir métodos getters e setters, além dos métodos mono() e stereo(). O método mono() torna o atributo stereo falso e o método stereo() torna o atributo stereo verdadeiro. Ao ligar o EquipamentoSonoro através do método liga, seu volume é automaticamente ajustado para 5.

2.	Crie uma classe Transporte com atributos ligado (tipo boolean) e velocidade (tipo int) e métodos liga() e desliga(). O método liga torna o atributo ligado true e o método desliga torna o atributo ligado false, além de tornar a velocidade zero. Crie também métodos getters e setters para modificar o atributo velocidade, sendo que a velocidade não pode ser negativa.

Crie uma subclasse de Transporte chamada Carro. Carro deve ter o atributo quilometragem (tipo int) e os métodos getters e setters. A quilometragem não pode ser negativa, nem ultrapassar o valor 999999. A velocidade do carro não pode ser negativa, nem ultrapassar 200.

3.	Crie uma classe Conta com atributo saldo e métodos depositar() e sacar() para diminuir e aumentar o atributo saldo, respectivamente, a partir de um valor especificado. O atributo saldo pode ser negativo.

Crie uma subclasse de Conta chamada Poupanca. Esta subclasse deve ter o atributo diaRendimento do tipo int que armazena o dia do mês em que ocorre o aniversário da poupança. Além disso, ainda deve possuir os métodos getter e setter. O atributo saldo da Poupanca não pode ser negativo.
4.	Crie classes Humano, Inseto e SuperHeroi. A classe Humano possui atributos Nome, Sexo,
 
Idade, Lingua e Etnia, todos especificados como protected. A classe Inseto possui atributos Nome, Venenoso, Alado, Ferrao (os três últimos são boolean), todos também especificados como protected. A classe SuperHeroi herda das duas classes anteriores, e adiciona os atributos Codinome, Trauma e Poderes. Os atributos não possuem getters e setters. Crie a hierarquia de herança um construtor e um método print (utilize o toString) na subclasse.

5.	Implemente a hierarquia Formato como descrito pelo diagrama abaixo e por este texto:
a.	Cada FormaBidimensional deve conter um método getArea() que calcula sua área;
b.	Cada FormaTridimensional deve conter os métodos getArea() e getVolume(), para calcular área e volume, respectivamente;
c.	Crie um driver com um vetor de referência a objetos da classe Forma, cada uma relativa a um dos objetos de cada classe concreta da hierarquia;
d.	O driver deve imprimir a classe de origem de cada objeto, o que deve ser determinado em tempo de execução;
e.	O driver deve imprimir, para cada objeto apontado, se trata-se de uma FormaBidimensional ou FormaTridimensional, o que deve ser determinado em tempo de execução
i.	Se a forma for bidimensional, imprima sua área;
ii.	Se a forma for tridimensional, imprima sua área e volume.
![image](https://github.com/aricoelhog/Java_Essays/assets/139346671/6ec3456c-c9ff-4106-bbad-8608de2f464c)

6.	Crie um programa que demonstra um construtor passando informação sobre a ocorrência de exceções para um manipulador de exceções. Crie a classe SomeException, que lança uma exceção do tipo Exception no construtor. Seu programa deve tentar criar um objeto desta classe e capturar a exceção que é lançada no construtor. Imprima o stack trace desta exceção.

7.	Crie um programa com um método que demonstra que um método com seu próprio bloco try não precisa capturar todas os possíveis erros gerados dentro deste bloco. Algumas exceções podem ser deixadas de lado, e serem capturadas em outros escopos. Imprima o stack trace desta exceção.

8.	Crie uma versão genérica simplificada do método isEqualTo, que compara seus dois argumentos com o método equals e retorna true se forem iguais e false caso contrário. Teste o método genérico com diversos tipos, incluindo Object.

9.	Crie uma classe genérica Vetor, que recebe como parâmetros o número e o tipo de elementos do vetor. Nesta classe devem ser criados um construtor para alocar o vetor, um método para retornar a quantidade de elementos no vetor (chamado getSize()) e outro para adicionar um elemento (chamado add()). Não utilize a classe Vector.
