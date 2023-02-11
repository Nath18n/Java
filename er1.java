import java.util.Scanner;
public class er1 {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
      int c = 1;
      double pc = 0, pf = 0; 
  
    while (c<=7){
    System.out.println("Insira o peso da "+c+" caixa:");
    pc = input.nextDouble();
    pf += pc;
    c++;
    }
    System.out.println("O peso total é de: " + pf + "kg");
}
}