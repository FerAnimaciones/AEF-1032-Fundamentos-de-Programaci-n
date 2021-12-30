//class Sala.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

   public class Sala
   {
      private int num,capa;
      private String tipo;
   
      public void ingDataSala()
      {
         num=Integer.parseInt(showInputDialog("Ingrese el numero de sala: "));
         capa=Integer.parseInt(showInputDialog("Ingrese la capacidad de la sala "+num+" : "));
         tipo=showInputDialog("Ingrese el tipo de sala : ");
      } 
      public void mostraDataSala()
      {
         showMessageDialog(null,"El numero de la sala es: "+num+" \n la capacidade de la sala es: "+capa+" \n El tipo de sala es: "+tipo);
      }
   }