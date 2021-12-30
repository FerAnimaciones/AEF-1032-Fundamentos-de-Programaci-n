//class Persona.java
import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

public class Persona
{
 private String nombre;
 private int edad;
 private int n;
 public void leer()
 {
  nombre=showInputDialog("Ingrese el nombre");
  System.out.print(nombre);
  n=1;
 }
 public void mostrar()
 {
 if(n==1)
  {
   System.out.print(nombre+edad);
   showMessageDialog(null,nombre);
  }
  else
  {
    showMessageDialog(null,"Error");
  }
 }
 public static void main(String ar[])
 {
  Persona p=new Persona();
  p.leer();
  p.mostrar();
 }
}