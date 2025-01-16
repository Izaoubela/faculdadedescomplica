class Tabuada
{
    public static void main(String entrada[])
    {
        int numero;

        numero = Integer.parseInt(entrada[0]);


        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        System.exit(0);
    }
}