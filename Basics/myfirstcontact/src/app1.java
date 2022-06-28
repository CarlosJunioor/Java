import java.util.Scanner;
public class app1 {

    public static void third(){
        System.out.println("terceiro ex");

    }

    public static void second(){
       
        String res;
        do{
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantas polegadas tem a sua TV?");
        double num = sc.nextInt();
        num = num * 24.5;
        System.out.println("A sua TV tem "+num+" milimetros.");

        System.out.println("Deseja voltar ao menu?[s/n]");
        res = sc.next();
        System.out.println(res);
        
        } while (res == "n" );
        main(null);
}

    public static void main(String[] args) {
        String resultadoMain ;
        

        Scanner scan = new Scanner(System.in);
        System.out.println("menu/exe1/exe2: Ola, qual seria o exercicio?");
        resultadoMain = scan.next();
    
        second();

        

    }
}
