package principal;

import javax.swing.JOptionPane;
import calculadora.Calculadora;

public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
           opcao =  JOptionpane.showInputDialog("1 - Leitura \n2 - Soma n3 - Subtração")
        }
    }
    
}
