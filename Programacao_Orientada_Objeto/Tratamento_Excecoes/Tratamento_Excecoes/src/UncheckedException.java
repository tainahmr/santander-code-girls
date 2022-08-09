import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) throws Exception {

        boolean continueLopping = true;

        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLopping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Informe um número inteiro.");
                
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por 0.");
    
            } 
            finally{
                System.out.println("Chegou no finally!");
            }

        } while(continueLopping);
        
        System.out.println("Chegou até aqui...");
        
    }

    public static int dividir(int a, int b) { return a / b; }
}
