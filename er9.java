import java.text.DecimalFormat;
import java.util.Scanner;
public class er9 {
public static void main (String args[]){

Scanner ler = new Scanner(System.in); 
DecimalFormat forma = new DecimalFormat("0.00");
DecimalFormat formato = new DecimalFormat("00");

double pu, id=1, pr, m, pb, prr, a=0, c=-1, otimo=0, bom=0, regular=0, ruim=0, resposta;
while (id>0){

System.out.print("Qual sua idade? ");
id = ler.nextDouble();

if (id>0){
a = id+a;
}

if (id>0){
System.out.println("Qual sua opinião sobre o filme? Opções:");
System.out.println("[1]Ótimo \n[2]Bom \n[3]Regular \n[4]Ruim");
resposta = ler.nextDouble();

if (resposta==1){otimo+=1;}
if (resposta==2){bom+=1;}
if (resposta==3){regular+=1;}
if (resposta==4){ruim+=1;}
}
c+=1;
}

m = (a/c);
pr = (otimo/c)*100;
pb = (bom/c)*100;
prr = (regular/c)*100;
pu = (ruim/c)*100;
    
System.out.println("Nessa pesquisa, " + c + " pessoas responderam a pergunta.\n A média de idade dos entrevistados é de " + forma.format(m) + " anos.");
System.out.println("A porcentagem das respostas é: ");
System.out.println(formato.format(pr) + "% responderam ótimo.\n" + formato.format(pb) + "% responderam bom.");
System.out.println(formato.format(prr) + "% responderam regular.\n" + formato.format(pu) + "% responderam ruim.");
       
}
}