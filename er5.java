import java.util.Scanner;
public class er5 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int x=0 ,a=0, b=999999, c=0; 
      
    while(c<7){
    System.out.println("Digite um número inteiro: ");
    x = input.nextInt();
    c++;
    
    if (x>a){
    a = x;
    } else if (x<b){
    b = x;
    }
    }
    System.out.println("O maior número digitado foi " + a + " e o menor número foi " + b);
    }
}