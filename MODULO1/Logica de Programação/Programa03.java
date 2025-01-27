import javax.swing.*;

class Programa03 

{ public static void main(String entrada[]) 
    {
        int Num1, Num2, Resto;
        double Raiz1, Raiz2;
        String msg = "";

        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro: "));

        Resto = (int)Num1 % (int)Num2;
        Raiz1 = Math.sqrt(Num1);
        Raiz2 = Math.sqrt(Num2);

        msg = "O primeiro número digitado é " + Num1 + " , e o segundo é " + Num2 + "." + "\n";
        msg = msg + "O resto da divisão entre " + Num1 + " e " + Num2 + " é " + Resto + "." + "\n";
        msg = msg + "A raiz quadrada de " + Num1 + " é igual a " + Raiz1 + "." + "\n";
        msg = msg + "A raiz quadrada de " + Num2 + " é igual a " + Raiz2 + "." + "\n";
 
        JOptionPane.showMessageDialog(null,msg);

        System.exit(0);
    }

    
}