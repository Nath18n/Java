import java.text.DecimalFormat;
public class er8 {
public static void main (String args[]){
DecimalFormat forma = new DecimalFormat("0.00");
    double aA=1.50, aF=1.10;
    int c=0;
while (aA>aF){
aA=aA+0.02;
aF=aF+0.03;
c+=1;
}
System.out.print("Levaria cerca de " + c + " anos para Felisberto ser mais alto. ");
System.out.print("Desse modo ele teria " + forma.format(aF) + " metros e Anacleto " + forma.format(aA) + " metros");
}
}