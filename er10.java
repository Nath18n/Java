import java.util.Scanner;
public class er10 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double ht=0, vh=0, sal=0, s=0, salf=0;
    int i=0;
    
    while(i<10){
    System.out.println("Qual a quantidade de horas trabalhadas?");
    ht = input.nextDouble();
    System.out.println("Qual valor das horas trabalhadas?");
    vh = input.nextDouble();
    
    s=ht*vh;
    sal=s-(s*0.11);
    if(sal<=900){
        salf=sal;
    }else if(sal>900&&sal<=1800){
        salf=sal-(sal*0.15);
    }else{
        salf=sal-(sal*0.275);
    }
    System.out.println("O salário bruto é: " + s + "\nO o salário final menos o INSS é: " + sal +
    "\nE o salário menos o Imposto de Renda é: " + salf + "\n-----------------\n");
    i++;
    }
      System.out.println("Você calculou o salário de 10 funcionários.");
    }
}