import java.util.Random;

public class NameGenerator {
    
    
    public static int numeroAleatorio(int maximo){
        Random rnd = new Random();
        return rnd.nextInt(maximo);
    }

    public static String nomeAleatorio(){
        String lexicon = "abcdefghijklmnopqrstuvwxyz";
        String nome = "";
        String sobreNome = "";
        String nomeFinal = "";

        //pegando letras aleatorias para criar nome de tamanho maximo 10 e minimo 2
        for(int i = 0; i<= numeroAleatorio(8)+2; i++){
            nome = nome + lexicon.charAt(numeroAleatorio(lexicon.length()-1));

            //colocando a primeira letra em maiuscula
            if(nome.length() == 1){
                nome = nome.toUpperCase();
            }
        }
        
        System.out.println("Nome: " + nome);

        //pegando letras aleatorias para criar sobrenome de tamanho maximo 15 e minimo 2
        for(int i = 0; i<= numeroAleatorio(13) + 2; i++){
            sobreNome = sobreNome + lexicon.charAt(numeroAleatorio(lexicon.length()-1));

            //colocando a primeira letra em maiuscula
            if(sobreNome.length() == 1){
               sobreNome=sobreNome.toUpperCase();
            }
        }
        System.out.println("Sobrenome: " + sobreNome);
        nomeFinal = nome + " " + sobreNome;

        System.out.println("Nome Completo: " + nomeFinal);
        return nomeFinal;
    }


}
