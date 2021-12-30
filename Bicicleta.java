//class Bicicleta.java
  import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  SEPTIEMBRE 2012 
   import java.io.*;                

   public class Bicicleta extends Automovil
   {
      String tam[] = new String[10];
      int n=0;
      public void leer()
      {
         super.leer();
         tam[n]=showInputDialog("Cual es el tama�o del la bicicleta:");
         n++;
      }
      public void mostrar()
      {
         super.mostrar();
         for(int cont=0;cont<n;cont++)
         {
            showMessageDialog(null,"El tama�o es:"+tam[cont]);
         }
      }
   }