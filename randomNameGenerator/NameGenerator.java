import java.util.Random;

public class NameGenerator {
    
    

    public static String nomeAleatorio(){
        Random numeroAl = new Random();
        int tamanhoNome = numeroAl.nextInt(20);
        String lexicon = "abcdefghijklmnopqrstuvwxyz";
        String nome = "";
        String sobreNome = "";
        String nomeFinal = "";

        //pegando letras aleatorias para criar nome de tamanho aleatorio
        for(int i = 0; i<= tamanhoNome; i++){
            nome = nome + lexicon.charAt(numeroAl.nextInt(25));
        }
        
        System.out.println("Nome: " + nome);

        tamanhoNome = numeroAl.nextInt(20);

        //pegando letras aleatorias para criar sobrenome de tamanho aleatorio
        for(int i = 0; i<= tamanhoNome; i++){
            sobreNome = sobreNome + lexicon.charAt(numeroAl.nextInt(25));
        }
        System.out.println("Sobrenome: " + sobreNome);
        nomeFinal = nome + " " + sobreNome;

        System.out.println("Nome Completo: " + nomeFinal);
        return nomeFinal;
    }


}
