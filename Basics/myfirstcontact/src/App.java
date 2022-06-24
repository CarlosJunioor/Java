import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner teclado=new Scanner(System.in);
        
        int x=0, y=0;

        System.out.println("Digite o 1 Numero: ");
        x=teclado.nextInt();

        System.out.println("Digite o 2 numero: ");
        y=teclado.nextInt();

        System.out.println("A soma dos números é "+(x+y));
        
    }
}
