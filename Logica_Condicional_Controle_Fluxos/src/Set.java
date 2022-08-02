import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args){

        System.out.println("Crie um conjunto e adicione as notas: ");
        HashSet<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("A média dos valores: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0:");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista:");
        Iterator<Double> iterator1 =  notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7.0) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem informada: ");
        HashSet<Double> notas1 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        TreeSet<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto 0");
        notas.clear();
        System.out.println("confira se o conjunto 0 está vazio: " + notas.isEmpty());
        System.out.println("confira se o conjunto 1 está vazio: " + notas1.isEmpty());
    } 
    
}
