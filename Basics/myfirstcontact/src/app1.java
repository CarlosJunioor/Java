import java.util.Scanner;
public class app1 {
    public static void main(String[] args) throws Exception {
       System.out.println("Qual sera o exercicio?");

       Scanner scanner = new Scanner (System.in);
       int var = 0;
       String input = scanner.next();
       int answer = Integer.parseInt(input);

       do{
        input = scanner.next();
        answer = Integer.parseInt(input);
        var = answer;

    switch (var) {
        case 1:
        System.out.println("Exercicio 1");
        break;

        case 2:
        System.out.print("Exercicio 2");
        break;
    }
    } while (var==1 || var == 2);}}

