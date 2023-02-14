import java.util.Scanner;
public class er6 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      double x=0 ,a=0, b=0, c=0;
      char r = 'n';
      
    while(r!='s'){
    System.out.println("Insira a quantidade do produto: ");
    x = input.nextDouble();
    
    System.out.println("Insira o preço do produto: ");
    a = input.nextDouble();
    
    b = x*a;
    c += b;
    System.out.println("Encerrar programa? [s/n]");
    r = input.next().charAt(0);
    }
    System.out.println("O preço total é de: " + c);
    }
}