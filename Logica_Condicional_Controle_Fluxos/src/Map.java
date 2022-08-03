import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
    
    public static void main(String[] args){
        System.out.println("Crie um dicionário que relacione os modelos de carro e seus respectivos consumo de combustível:");
        HashMap<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson encontra-se na lista: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno") + "Km/L");

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma += iterator.next();

        }
        System.out.println("Exiba a soma dos consumos: " + soma + "Km/L");

        System.out.println("Exiba a média do consumo: " + soma/carrosPopulares.size() + "Km/L");

        System.out.println("Remova os carros com consumo igual a 15.6Km/L");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

                    
        
    }

   
    }
    

