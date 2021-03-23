import java.util.Scanner;
public class NumeroFactorial {
    public static int factorial (int numUno ){
        int numero=1;
        while (numUno != 0){
            numero=numero*numUno;
            numUno--;
        }
        return numero;
    }
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int numUno;
        do{
        System.out.println("ingrese un numero ");
        numUno = in.nextInt();
    } while (numUno <=0);
        System.out.println("el factorial es : "+ factorial(numUno));
        System.out.println("funciona?");
    }

}
