import javax.swing.*;

class Programa04 

{ public static void main(String entrada[]) 
    {

        int Num1, Num2, Quociente;
        Double Potencia;
        String mensagens[] = {"", "", ""};
    

        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        Quociente = (int)Num1 / (int)Num2;
        Potencia = Math.pow(Num1, Num2);

        mensagens[0]= "Os números digitados são: " + Num1 + " e " + Num2 + "\n";
        mensagens[1]= "O resultado da divisão entre os dois números é" + Quociente + "\n";
        mensagens[2]= "O número " + Num1 + " elevado a " + Num2 + " é igual a " + Potencia + "\n";

        
        For (mensagens, mensagens > 3, mensagens++)
            {
            System.out.println(mensagens[0],mensagens[1],mensagens[2]);
            } 
        }
    }   
}
