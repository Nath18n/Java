import java.text.DecimalFormat;
import java.util.Scanner;
public class er7 {
public static void main (String args[]){
    Scanner ler = new Scanner(System.in); 
    DecimalFormat forma = new DecimalFormat("0.00");
    float n=0, m, a=0, c=-1;

while (n>=0){
System.out.print("Digite um número inteiro e positivo: ");
n = ler.nextFloat();

if (n>=0){
a = n+a;
}
c+=1;
}
m = (a/c);
System.out.print("A soma dos números é " + a + " e a média é " + forma.format(m));
}
}