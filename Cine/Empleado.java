//class Empleado.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

   public class Empleado
   {
      private String Nombre,Direccion;
      private double costo;
   
      public void ingDataEmpleado()
      {
         Nombre=showInputDialog("Ingrese el nombre el empleado: ");
         Direccion=showInputDialog("Ingrese la direccion del empleado : ");
      } 
      public void mostraDataEmpleado()
      {
         showMessageDialog(null,"Nombre del empleado : "+Nombre+" \n Direccion del empleado: "+Direccion);
      }
   }