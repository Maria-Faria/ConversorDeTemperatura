package temperatura;

import javax.swing.JOptionPane;

public class Conversor {

    public static void converter(int escolha, int escolha2, double temp, String[] op) {
        double temp2;

        if(escolha == escolha2) {
            temp2 = temp;
            
            if(escolha == 2) {
                JOptionPane.showMessageDialog(null, temp + op[escolha].substring(0, 1)
                + " = " + temp2 + op[escolha].substring(0, 1));
            
            }else{
                JOptionPane.showMessageDialog(null, temp + "°" + op[escolha].substring(0, 1)
                + " = " + temp2 + "°" + op[escolha].substring(0, 1));
            }
        
        }else if(escolha == 0 && escolha2 == 1) {
            temp2 = temp * (9/5f) + 32;
        
        }else if(escolha == 0 && escolha2 == 2) {
            temp2 = temp + 273.15;
        
        }else if(escolha == 1 && escolha2 == 0) {
            temp2 = 5 * (temp - 32)/9f;
        
        }else if(escolha == 1 && escolha2 == 2) {
            temp2 = (temp - 32) * 5/9f + 273.15;
        
        }else {
            if(escolha2 == 0) {
                temp2 = temp - 273.15;
            
            }else{
                temp2 = (temp - 273.15) * 9/5 + 32;
            }
        }

        if(escolha == 2) {
        JOptionPane.showMessageDialog(null, temp + op[escolha].substring(0, 1)
        + " = " + temp2 + "°" + op[escolha2].substring(0, 1));
    
        }else if(escolha2 == 2) {
            JOptionPane.showMessageDialog(null, temp + "°" + op[escolha].substring(0, 1)
            + " = " + temp2 + op[escolha2].substring(0, 1));
        
        }else{
            JOptionPane.showMessageDialog(null, temp + "°" + op[escolha].substring(0, 1)
            + " = " + temp2 + "°" + op[escolha2].substring(0, 1));
        } 
    }
    public static void main(String[] args) {
        double temp;
        String op[] = {"Celsius", "Fahrenheit", "Kelvin"};
        int escolha, escolha2;

        temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da temperatura a ser convertida"));
        escolha = JOptionPane.showOptionDialog(null, "Selecione a unidade de medida da temperatura a ser convertida", "Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);
    
        escolha2 = JOptionPane.showOptionDialog(null, "Selecione a unidade de medida para conversão", "Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);

        converter(escolha, escolha2, temp, op);
    }
}