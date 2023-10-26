package Java.Calcolatrice;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Calcolatrice in java");
          System.out.print("Inserire primo valore: ");
          double var1 = scanner.nextDouble();

          System.out.print("Operazione da svolgere + , /, *, - : ");
          char operazione = scanner.next().charAt(0);

          System.out.print("Inserire secondo valore: ");
          double var2 = scanner.nextDouble();

          double risultato = 0;

          switch (operazione) {
               case '+':
                    risultato = var1 + var2;
                    break;
               case '-':
                    risultato = var1 - var2;
                    break;
               case '*':
                    risultato = var1 * var2;
                    break;
               case '/':
                    if (var2 != 0) {
                         risultato = var1 / var2;
                    } else {
                         System.out.println("IMPOSSIBILE DIVIDERE PER 0");
                         return;
                    }
                    break;
               default:
                    System.out.print("operatore non valido");
                    return;
          }

          System.out.println("Risultato: " + risultato);
          scanner.close();
     }
}
