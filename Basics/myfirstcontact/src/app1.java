import java.util.Scanner;
public class app1 {

    public static void third(){
        System.out.println("terceiro ex");
    }

    public static void second(){
    
       String resposta = null;
       Scanner sc = new Scanner (System.in);

    do { 
        System.out.println("Quantas polegadas tem a sua TV?");
        double num = sc.nextDouble();
        
        num = num * 24.5;
        System.out.println("A sua TV tem "+num+" milimetros.");

        System.out.println("Deseja voltar a fazer?");
        resposta = sc.nextLine();
        System.out.println(resposta);

       }while (resposta !="s");

    }

    

    
    public static void main(String[] args) {
        System.out.println("menu/exe1/exe2: Ola, qual seria o exercicio?");
        second();
    }
}
