public class App {
    public static void main(String[] args) {
        ClasseCarro carro1 = new ClasseCarro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setTanqueCombustivel(59);

        System.out.println("A cor do carro é " + carro1.getCor());
        System.out.println("O modelo do carro é " + carro1.getModelo());
        System.out.println("A capacidade do tanque é " + carro1.getTanqueCombustivel() + "L");
        System.out.println("Para encher o tanque é R$ " + carro1.totalValorTanque(6.39));

        ClasseCarro carro2 = new ClasseCarro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println("A cor do carro é " + carro2.getCor());
        System.out.println("O modelo do carro é " + carro2.getModelo());
        System.out.println("A capacidade do tanque é " + carro2.getTanqueCombustivel() + "L");
        System.out.println("Para encher o tanque é R$ " + carro2.totalValorTanque(6.46));
        
    }
    
}
