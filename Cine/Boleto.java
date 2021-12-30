//class Boleto.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

   public class Boleto
   {
      private String fecha,hora;
      private double costo;
   
      public void ingDataBoleto()
      {
         fecha=showInputDialog("Ingrese la fecha de la pelicula : ");
         hora=showInputDialog("Ingrese la hora de la pelicula : ");
         costo=Double.parseDouble(showInputDialog("Ingrese el costo de el boleto"));
      } 
      public void mostraDataBoleto()
      {
         showMessageDialog(null,"La fecha de la pelicula: "+fecha+" \n La hora de la pelicula: "+hora+" \n El presio del boleto: "+costo);
      }
   }