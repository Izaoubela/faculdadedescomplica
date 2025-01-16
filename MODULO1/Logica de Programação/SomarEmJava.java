class SomarEmJava 
{
    public static void main (String entrada[])
    {
        int n1, n2, soma;
        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);
        soma = n1 + n2;
        System.out.println("A soma de " + n1 + " com " + n2 + " é igual a " + soma);
        System.exit(0);
    }
}