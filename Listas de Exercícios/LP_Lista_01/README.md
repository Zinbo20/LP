![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input  -->  verification{ Nota >= 50? }
        verification --> |Sim| input2[\ Digite sua frequência \]
        input2 --> verification2{ frequência >= 75%? }
        verification --> |Não| B[/ Reprovado /]
        verification2 --> |Sim| A[/ Aprovado /]
        verification2 --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite N1 \]
      input --> input2[\ Digite N2 \]
      input2 --> R[Resultado = N1 + N2]
      R --> Out[\Resultado\]
      Out --> finish([Fim])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite um número \]
      input --> verification{ Nùmero >= 0 ?}
      verification --> |Sim| P[/ Positivo/]
      verification --> |Não| N[/ Negativo/]
      P --> finish([ Fim ])
      N --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua idade \]
      input --> verification{ Idade >= 16 \nE\n Titulo de Eleitor?}
      verification --> |Sim| P[/ Permitido/]
      verification --> |Não| N[/ Proibido/]
      P --> finish([ Fim ])
      N --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite dois números \]
      input --> verification{ N_1 - N_2 == 0 ?}
      verification -->  |Sim| I[/N_1 e N_2 são iguais/]
      verification -->  |Não| verification2{ N_1 - N_2 > 0 ?}
      verification2 --> |Sim| N1[/N_1 é maior/]
      verification2 --> |Não| N2[/N_2 é maior/]
      N1 --> finish([ Fim ])
      N2 --> finish
      I --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite três números \]
      input --> verification{ N_1 - N_2 == 0 \nE\n N_2 - N_3 == 0 \nE\n N_3 - N_1 == 0}
      verification -->  |Sim| I[/N_1, N_2 e N_3 são iguais/]
      verification -->  |Não| verification2{ N_1 - N_2 > 0 ?}
      verification2 --> |Sim| N1[/N_1 é maior/]
      verification2 --> |Não| N2[/N_2 é maior/]
      N1 --> verification3{ N_1 - N_3 > 0 ?}
      N2 --> verification4{ N_2 - N_3 > 0 ?}
      verification3 --> |Sim| P1[/N_1 é maior/]
      verification3 --> |Não| P2[/N_3 é maior/]
      verification4 --> |Sim| L1[/N_2 é maior/]
      verification4 --> |Não| verification3
      P1 --> finish([ Fim ])
      P2 --> finish
      L1 --> finish
      I --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite um número N \]
      input --> verification{N = 0 ?}
      process --> process2["N = N-1"]
      process2 --> verification
      verification --> |Não| process["R = R * N"]
      verification --> |Sim| R[/Resultado = R/]
      R --> finish([Fim])
      
   
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.

   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2]()

    ```mermaid
      flowchart TD
         start(( Início )) --> input[\ Digite um número N \]
         input --> verification{"N % 2 = 0 ?"}
         verification --> |Sim| S[/Par/]
         verification --> |Não| N[/Impar/]
         S --> finish([Fim])
         N --> finish
      ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.

    ```mermaid
      flowchart TD
         start(( Início )) --> input[\ Digite um número Primo \]
         input --> val[ N = 2]
         val --> verification{ Primo % N = 0 ?}
         verification --> |Não| process[N = N + 1]
         process --> verification3{N > Primo/2?}
         verification3 --> |Não| verification2{N = Primo ?}
         verification3 --> |Sim| false
         verification2 -->|Não| verification
         verification --> |Sim| false[/Não é Primo/] 
         verification2 --> |Sim| true[/É Primo/]
         false --> finish([Fim])
         true --> finish
      ```