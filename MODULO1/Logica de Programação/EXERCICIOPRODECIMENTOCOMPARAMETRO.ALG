Algoritmo "ExercicioProdecimentoComParametro"

Procedimento mostreOProduto (x,y:real)

var
   aux: real

inicio
      aux <- x * y
      Escreval("O produto dos n�meros �: ", aux)
      
fimprocedimento

var
m, n: real

inicio
      ESCREVA("Digite um n�mero:")
      LEIA (m)
      ESCREVA("Digite um n�mero:")
      LEIA (n)
      mostreOProduto(m,n)

fimalgoritmo
