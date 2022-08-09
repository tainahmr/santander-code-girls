import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {

    public static void main(String[] args) {
        //imprimir um arquivo no console
        String nomeDoArquivo = "NomeNascimento.txt";
        try {
            ImprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showInputDialog("Revise o nome do arquivo que você deseja imprimir.");

        } 
        catch (IOException e) {
            JOptionPane.showInputDialog("Ocorreu um erro inesperado. Entre em contato com o suporte.");
            
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

        public static void ImprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
            
            File file = new File(nomeDoArquivo);

            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
        
    }

    
    

    
}
