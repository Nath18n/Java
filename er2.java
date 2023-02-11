import java.util.Scanner;
public class er2 {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
      int c = 1;
      double pc = 0, pf = 0, cc = 0, cf = 0; 
  
    while (c<=7){
    System.out.println("Insira o preço do "+c+" produto:");
    pc = input.nextDouble();
    pf += pc;
 
    System.out.println("Insira a quantidade do "+c+" produto:");
    cc = input.nextDouble();
    cf += cc;
    
       c++;
    }
    System.out.println("O preço total é de: " + pf );
    System.out.println("A quantidade total dos produtos é de: " + cf);
}
}