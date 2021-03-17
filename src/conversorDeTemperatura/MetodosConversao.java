package conversorDeTemperatura;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MetodosConversao {
    
    //arredonda pra quantas casas vc quiser
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double converterParaCelcius(double grau,String temperatura){
        double convertido = 0;

        if(temperatura.equals("Fahrenheit")){
            convertido = (grau - 32)/1.8;
        }
        else if(temperatura.equals("Kelvin")){
            convertido = grau - 273;
        }

        convertido = round(convertido,2);
        return convertido;
    }

    public static double converterParaKelvin(double grau, String temperatura){
        double convertido = 0;

        if(temperatura.equals("Celcius")){
            convertido = grau + 273;
        }

        //convertendo de Fahrenheit  para Kelvin
        else{
            convertido = (grau + 459.67) * (5.0/9.0);
        }
        convertido = round(convertido,2);
        return convertido;
    }

    public static double converterParaFahrenheit (double grau, String temperatura){
        double convertido = 0;

        if(temperatura.equals("Celcius")){
            convertido = (grau * (9.0/5.0)) + 32;
        }

        //convertendo de Kelvin  para Fahrenheit
        else{
            convertido = (grau * (9.0/5.0)) - 459.67;
        }

        convertido = round(convertido,2);
        return convertido;
    }
}
