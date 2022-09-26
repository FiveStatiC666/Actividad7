import java.util.*;

class NumPrimos
{

    public void numerosPrimos()
    {
        System.out.print("Escribir la cantidad de numeros primos a verificar: ");

        Scanner datos= new Scanner(System.in);
        int cantidadArreglo = datos.nextInt();
        int indice=1;

        System.out.println("");

        int arreglo [] = new int[cantidadArreglo];

        for(int i=1; i<=cantidadArreglo; i++)
        {
            int contador=0;

            for(int j=1; j <= cantidadArreglo; j++)
            {
                if (i % j == 0)
                {
                    contador++;
                }
            }

            if(contador==2)
            {
                arreglo[indice++] = i;
            }

        }

        System.out.println("Numeros primos: ");
        for(int i=1; i<=indice-1;i++)
        {
            System.out.print(arreglo[i] + ", ");
        }

    }

}

class NumFibonacci
{
    public void numerosFibonacci()
    {
        System.out.print("Escribir la cantidad de numeros fibonacci a verificar: ");

        Scanner datosF= new Scanner(System.in);
        int cantidadArregloF = datosF.nextInt();

        System.out.println("");

        int arregloF [] = new int[cantidadArregloF];

        int fibonacci=0;
        int num1=1;
        int num2;

        for(int i=0; i<cantidadArregloF; i++)
        {
            num2 = fibonacci;
            fibonacci = num1 + fibonacci;
            num1 = num2;
            arregloF[i]= num1;
        }

        System.out.println("Numeros Fibonacci: ");
        for(int i=1; i<cantidadArregloF;i++)
        {
            System.out.print(arregloF[i] + ", ");

        }
    }
}


public class Actividad7
{
    public static void main(String[] args)
    {
        NumPrimos resultadosP= new NumPrimos();

        resultadosP.numerosPrimos();

        System.out.println("");
        System.out.println("");

        NumFibonacci resultadosF= new NumFibonacci();

        resultadosF.numerosFibonacci();

        System.out.println("");
    }
}
