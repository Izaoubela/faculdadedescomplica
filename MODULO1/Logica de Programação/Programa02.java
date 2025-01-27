class Programa02 
{
    public static void main (String entrada[])
    {
        
        int Num1, Num2, Soma;
        double Raiz, Potencia, Resto, Coeficiente;
        String msg = "";

        Num1= Integer.parseInt(entrada[0]);
        Num2= Integer.parseInt(entrada[1]);
        Soma = Num1 + Num2;
        Resto = Num1 % Num2;
        Coeficiente = (int)Num1 / (int)Num2;
        Potencia = Math.pow(Num1,Num2);
        Raiz = Math.sqrt(Num1);

        msg = "A soma de " + Num1 + " + " + Num2 + " é igual a " + Soma + ".";
        msg = msg + " O coeficiente da divisão entre " + Num1 + " e " + Num2 + " é igual a " + Coeficiente + "." ;
        msg = msg + " O resto da divisão entre " + Num1 + " e " + Num2 + " é igual a " + Resto + ".";
        msg = msg + " A potência de "  + Num1 + " elevado a " + Num2 + " é igual a " + Potencia + ".";
        msg = msg + " A raiz quadrada de " + Num1 + " é igual a " + Raiz + ".";

        System.out.println(msg);

        System.exit(0);    
        
    }
}
