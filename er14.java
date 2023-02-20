import java.text.DecimalFormat;
import java.util.Scanner;
public class er14 {
public static void main (String args[]){
    Scanner ler = new Scanner(System.in);
    DecimalFormat forma = new DecimalFormat("0.00");
    double  ma=1, s, a, sp;
    
while (ma!=0){
System.out.print("Digite o teu número de matrícula: ");
ma = ler.nextDouble();

if (ma!=0){
System.out.print("Digite o teu sálario base: ");
s = ler.nextDouble();

System.out.print("Digite o teu nível de abono: [1]Excelente, [2]Bom, [3]Regular ");
a = ler.nextDouble();

if (a==1){
sp=s*1.80;
System.out.println("Teu salário com abono será de R$" + forma.format(sp));}
if (a==2){
sp=s*1.50;
System.out.println("Teu salário com abono será de R$" + forma.format(sp));}
if (a==3){
sp=s*1.30;
System.out.println("Teu salário com abono será de R$" + forma.format(sp));}
}
}
}
}