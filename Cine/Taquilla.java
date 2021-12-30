//class Taquilla.java
import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

public class Taquilla
{
 private String fecha,hora;
 private double num_boletos;
 
 public void ingDataTaquilla()
 {
  num_boletos=Double.parseDouble(showInputDialog("Ingrese el costo de el boleto"));
 } 
 public void mostraDataTaquilla()
 {
   showMessageDialog(null,"El numero de boletos es : "+num_boletos);
 }
}