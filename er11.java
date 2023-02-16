import java.text.DecimalFormat;
import java.util.Scanner;
public class er11 {
public static void main (String args[]){
    Scanner ler = new Scanner(System.in);
    DecimalFormat forma = new DecimalFormat("0.00");
    double id=1, h, a=0, m, c=0;
    while (id!=0){
System.out.print("Digite a tua idade: ");
id = ler.nextDouble();

System.out.print("Digite a tua altura: ");
h = ler.nextDouble();

if (id>=50){
a = a + h;
c+=1;
}

}
m = a/c;

System.out.print("A média da altura das pessoas com mais de 50 anos é " + forma.format(m));

    }
}