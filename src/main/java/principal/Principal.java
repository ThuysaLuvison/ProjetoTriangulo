package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {

public static void main (String[] args){
Triangulo tril = new Triangulo();
tril.setBase (Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo")));
tril.setAltura (Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo")));

        JOptionPane.showMessageDialog(null, "A area do triangulo é " + tril.getArea());
}
}