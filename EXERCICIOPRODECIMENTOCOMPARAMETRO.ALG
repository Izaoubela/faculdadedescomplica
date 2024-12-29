Algoritmo "ExercicioProdecimentoComParametro"

Procedimento mostreOProduto (x,y:real)

var
   aux: real

inicio
      aux <- x * y
      Escreval("O produto dos números é: ", aux)
      
fimprocedimento

var
m, n: real

inicio
      ESCREVA("Digite um número:")
      LEIA (m)
      ESCREVA("Digite um número:")
      LEIA (n)
      mostreOProduto(m,n)

fimalgoritmo
