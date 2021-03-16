import java.util.Random;

public class NameGenerator {
    
    
    public static int numeroAleatorio(int maximo){
        Random rnd = new Random();
        return rnd.nextInt(maximo);
    }
    public static boolean ePar(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    public static String nomeAleatorio(){
        String consoanteLexicon = "bcdfghjklmnopqrstuvwxyz";
        String vogalLexicon = "aeiou";
        String nome = "";
        String sobreNome = "";
        String nomeFinal = "";

        //pegando letras aleatorias para criar nome de tamanho maximo 10 e minimo 2
        for(int i = 0; i<= numeroAleatorio(8)+2; i++){
            //Se par, escolhe uma vogal
            if(ePar(i)){
                nome = nome + vogalLexicon.charAt(numeroAleatorio(vogalLexicon.length()-1));  
            }
            else{
                nome = nome + consoanteLexicon.charAt(numeroAleatorio(consoanteLexicon.length()-1));
            }
            

            //colocando a primeira letra em maiuscula
            if(nome.length() == 1){
                nome = nome.toUpperCase();
            }
        }
        

        //pegando letras aleatorias para criar sobrenome de tamanho maximo 15 e minimo 2
        for(int i = 0; i<= numeroAleatorio(13) + 2; i++){
            if(ePar(i)){
                sobreNome = sobreNome + vogalLexicon.charAt(numeroAleatorio(vogalLexicon.length()-1));  
            }
            else{
                sobreNome = sobreNome + consoanteLexicon.charAt(numeroAleatorio(consoanteLexicon.length()-1));
            }
            
            //colocando a primeira letra em maiuscula
            if(nome.length() == 1){
                nome = nome.toUpperCase();
            }
            //colocando a primeira letra em maiuscula
            if(sobreNome.length() == 1){
               sobreNome=sobreNome.toUpperCase();
            }
        }
        
        nomeFinal = nome + " " + sobreNome;
        return nomeFinal;
    }


}
