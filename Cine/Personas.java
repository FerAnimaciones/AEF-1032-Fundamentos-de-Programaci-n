//class Personas.java
import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

public class Personas
{
 private String personas;
 
 public void ingDataPersona()
 {
  personas=showInputDialog("Ingrese las personas: ");
 } 
 public void mostraDataPersona()
 {
   showMessageDialog(null,"Las personas son: "+personas);
 }
}