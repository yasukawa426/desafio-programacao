package conversorDeTemperatura;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Para qual temperatura você quer converter? (Digite o número da opção)\n1-Celcius\n2-Fahrenheit\n3-Kelvin"));

        //converter para Celcius
        if(temperatura==1){
            temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "De qual temperatura você está convertendo? (Digite o número da opção)\n1-Fahrenheit\n2-Kelvin"));
            //Fahrenheit para Celcius
            if(temperatura==1){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "F em Celcius é:\n" + MetodosConversao.converterParaCelcius(grau, "Fahrenheit") + "ºC");
            }
            //Kelvin para Celcius
            else if (temperatura==2){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "K em Celcius é:\n" + MetodosConversao.converterParaCelcius(grau, "Kelvin") + "ºC");
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa não é uma opção válida.");
            }
        }
        //converter para Fahrenheit
        else if(temperatura==2){
            temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "De qual temperatura você está convertendo? (Digite o número da opção)\n1-Celcius\n2-Kelvin"));
            //Celcius para Feh
            if(temperatura==1){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "C em Fehriasdhi é:\n" + MetodosConversao.converterParaFahrenheit(grau, "Celcius") + "F");
            }
            //Kelvin para Fejhuiehua
            else if (temperatura==2){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "K em Fehuhaus é:\n" + MetodosConversao.converterParaFahrenheit(grau, "Kelvin") + "F");
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa não é uma opção válida.");
            }
        }
        //converter para Kelvin
        else if(temperatura==3){
            temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "De qual temperatura você está convertendo? (Digite o número da opção)\n1-Celcius\n2-Fahrehint"));
            //Celcius para Kelvin
            if(temperatura==1){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "C em Kelvin é:\n" + MetodosConversao.converterParaKelvin(grau, "Celcius") + "K");
            }
            //Fauasurhuash para Kelvin 
            else if (temperatura==2){
                int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura para converter (Apenas números, separe decimais com .)"));

                JOptionPane.showMessageDialog(null, grau + "F em Kelvin é:\n" + MetodosConversao.converterParaKelvin(grau, "Fahrehint") + "K");
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa não é uma opção válida.");
            }
        }
        //ta trollando
        else{
            JOptionPane.showMessageDialog(null, "Essa não é uma opção válida.");
        }
        System.out.println(MetodosConversao.converterParaFahrenheit(281, "Kelvin" ));
    }
}
