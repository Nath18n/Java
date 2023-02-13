import java.util.Scanner;
public class er3 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    double ht=0, vh=0, s=0;
    int i=0;
    
    while(i<7){
    System.out.println("Qual a quantidade de horas trabalhadas?");
    ht = input.nextDouble();
    System.out.println("Qual valor das horas trabalhadas?");
    vh = input.nextDouble();
    
    s=ht*vh;
    i++;

      System.out.println("O salário bruto é: " + s);
    }
}
}