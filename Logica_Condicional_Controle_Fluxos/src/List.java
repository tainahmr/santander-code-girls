import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Crie uma lista e adicione sete notas: ");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(3.0);
        notas.add(2.0);
        notas.add(1.0);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 por 5.5:");
        notas.set(notas.indexOf(5d), 5.5);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba a terceira nota: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 1.0: ");
        notas.remove(1.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 5.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 5.0) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        
        
       


    }
}
