import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExerciciosList {
    public static void main(String[] args) {
    /*faça um programa que receba a temperatura média de 6 meses e armazene-as em uma lista.
    Calcule a média semestral das temperaturas, mostre as temperaturas acima da média e em que mês ocorreram.*/
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while(true){
            if(count==6) break;

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;

        }
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        scan.close();

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.println("\nMédia das temperaturas: %.1f\n" + media);

        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));
        
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()){
            double temp = iterator.next();
            if(temp > media) {
                switch (count){
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                    }
                }
                count++;

                }
             
            }
        }


    
    

