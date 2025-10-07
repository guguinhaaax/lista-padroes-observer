# lista-padroes-observer

Resposta da segunda questão da Lista Avaliativa I da disciplina Padrões de Objeto, relativo ao padrão *Observer*.

-------------------------------------------------------------------------------------------------

O pacote telephone no código inicial contém código parcial para fazer algumas partes de um telefone. Altere o código para que ele use o padrão Observer da seguinte maneira:

    ● Defina uma interface para os observadores.
    ● Faça com que os observadores sejam notificados sempre que um novo dígito for
    inserido para o número de telefone.
    ● Faça com que a UI (a classe Screen) crie dois observadores:
        1. O primeiro observador imprime o dígito mais recente na tela
        2. O segundo observador imprime "Agora discando 081999887766..." na tela
        (onde o número é o número que o modelo possui).

Restrições

    ● Somente a UI pode imprimir na tela
    ● O telefone deve ser desacoplado da UI (isto é, não deve saber sobre a UI).

Exemplo de saída do programa:

        Pressionando: 0
        0
        Pressionando: 8
        8
        Pressionando: 1
        1
        Pressionando: 9
        9
        Pressionando: 9
        9
        Pressionando: 9
        9
        Pressionando: 8
        8
        Pressionando: 8
        8
        Pressionando: 7
        7
        Pressionando: 7
        7
        Pressionando: 6
        6
        Pressionando: 6
        6
        Agora discando 081999887766...
