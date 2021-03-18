package randomNameGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        //System.out.println(NameGenerator.nomeSenhaAleatorio());
        String resposta =JOptionPane.showInputDialog(null,"Você quer salvar os nomes e senhas em um arquivo? (y/n)");

        int voltas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos pares de nomes e senhas vc quer gerar? (digite um número inteiro)"));

        //quis salvar num arquivo
        if (resposta.equals("y") || resposta.equals("Y")){
            try {
                File arquivo = new File("DesafioProgramacao\\src\\randomNameGenerator\\nomes.txt");
                FileWriter myWriter = new FileWriter("DesafioProgramacao\\src\\randomNameGenerator\\nomes.txt");
                for (int i = 0; i<voltas; i++){
                    myWriter.write(NameGenerator.nomeSenhaAleatorio() + "\n" + " " + "\n");
                    
                }
                
                myWriter.close();
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
                System.exit(0);
            
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Criação do arquivo falhou (entre outros problemas)");
            }
        }

        //n quis salvar num arquivo
        else{
            for (int i = 0; i<voltas; i++){
                System.out.println(NameGenerator.nomeSenhaAleatorio() + "\n" + " " + "\n");
                System.exit(0);
            }
        }
        
        

    }
    
}
