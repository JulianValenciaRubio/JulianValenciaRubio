import java.io*;
import java.util.Scanner;
class Suma
  {
   public static void main(String[] args)
     {
      Scanner entrada = new Scanner(System.in);
      float nota1,nota2,suma;//variables.
      nota1 = entrada.nextFloat();
      nota2 = entrada.nextFloat();
      suma = nota1 + nota2;
      System.out.print("La SUMA es:"+suma);
     }  
  }