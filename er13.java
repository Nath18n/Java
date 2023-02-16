import java.util.Scanner;
public class er13 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int id=1, contf=0, contm=0;
      char sexo='x', resposta='x';
      
    while(id>0){
    
    System.out.println("Qual a sua idade?");
    id = input.nextInt();
    if(id<=0){
        break;
    }
    System.out.println("Qual o seu sexo?[f/m]");
    sexo = input.next().charAt(0);
    if(sexo=='f'){
        contf++;
    }else if(sexo=='m'){
        contm++;
    }else{
    System.out.println("Inválido!");
    }
    System.out.println("Você já possui experiência na área? [s/n]");
    resposta = input.next().charAt(0);
    }

      System.out.println("A quantidade de pessoas do sexo feminino foram: " + contf);
      System.out.println("A quantidade de pessoas do sexo masculino foram: " + contm);
    }
}