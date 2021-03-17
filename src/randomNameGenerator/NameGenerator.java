package randomNameGenerator;

import java.util.Random;

public class NameGenerator {
    
    
    public static int numeroAleatorio(int maximo){
        Random rnd = new Random();
        //gera um numero 0 >= x < maximo
        return rnd.nextInt(maximo);
    }
    public static boolean ePar(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    public static String nomeSenhaAleatorio(){
        String consoanteLexicon = "bcdfghjklmnopqrstuvwxyz";
        String vogalLexicon = "aeiou";
        String nome = "";
        String sobreNome = "";
        String senha = "";
        String credenciais = "";
        
        //pegando letras aleatorias para criar nome de tamanho maximo 10 e minimo 2
        for(int i = 0; i<= numeroAleatorio(9)+2; i++){
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
        for(int i = 0; i<= numeroAleatorio(14) + 2; i++){
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

        //gerando uma senha q combina vogais, consoantes e numeros com tamanho aleatorio entre 8 e 15

        for(int i =0; i<= numeroAleatorio(7)+8; i++){
            //gera um numero entre 0 e 2. 0 = consoante, 1 = vogal, 2 = numero de 0 a 9
            switch (numeroAleatorio(3)) {
                case 0:
                    senha = senha + consoanteLexicon.charAt(numeroAleatorio(consoanteLexicon.length()-1));
                    break;
                case 1:
                senha = senha + vogalLexicon.charAt(numeroAleatorio(vogalLexicon.length()-1));  
                    break;
                
                case 2:
                senha = senha + ("" + numeroAleatorio(9));
                    break;
                default:
                    System.out.println("Case estranho");
                    break;
            }
        }
        
        credenciais = "Seu nome agr é: " + nome + " " + sobreNome + "\nSenha: " + senha;
        return credenciais;
    }


}
