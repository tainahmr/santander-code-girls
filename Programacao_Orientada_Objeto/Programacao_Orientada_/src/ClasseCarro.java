public class ClasseCarro {
    
        String cor;
        String modelo;
        int tanqueCombustivel;

        //construtor
        ClasseCarro(){

        }
        
        ClasseCarro(String cor, String modelo, int tanqueCombustivel){
            this.cor = cor;
            this.modelo = modelo;
            this.tanqueCombustivel = tanqueCombustivel;
        }

        //get / set
        void setCor(String cor) {
            this.cor = cor;

        }
        String getCor() {
            return cor;
        }
        void setModelo(String modelo){
            this.modelo = modelo;
        }
        String getModelo() {
            return modelo;
        }
        void setTanqueCombustivel(int tanqueCombustivel){
            this.tanqueCombustivel = tanqueCombustivel;
        }
        int getTanqueCombustivel() {
            return tanqueCombustivel;
        }

        //método
        double totalValorTanque(double valorCombustivel){
            return tanqueCombustivel*valorCombustivel;

        }
    
}
