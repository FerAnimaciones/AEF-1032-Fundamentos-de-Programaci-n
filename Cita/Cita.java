//class Cita.java
import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012 
import java.io.*;                

public class Cita
{
 private String fecha; //Resumen de los conceptops que vimos para el lunes 
 private int hora;
 private String evento;
 
 public void leer()
 {
  fecha=showInputDialog("Ingrese la fecha");
  hora=Integer.parseInt(showInputDialog("Ingrese la hora"));
  evento=showInputDialog("Ingrese el evento:");
 }
 public void mostrar()
 {
  showMessageDialog(null,"La fecha establecidad es:   "+fecha+"\n La hora establecida es la siguiente :  "+hora+"\n El evento es :  "+evento);
 }
 public static void main(String ar[])
 {
  Cita c=new Cita();
  c.leer();
  c.mostrar();
 }
 
}