//class Proyecto.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012 
   import java.io.*;                

   public class Proyecto
   {
      Desarrolladora desa=new Desarrolladora();
      public static String nombre_pro[] = new String[10];
      String fe_ini[] = new String[10];
		String fe_end[] = new String[10];
      int n=0;
      public void leer()
      {
         nombre_pro[n]=showInputDialog("Nombre del proyecto:");
         fe_ini[n]=showInputDialog("Fecha Inicio:");
         fe_end[n]=(showInputDialog("Fecha entrega:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del Poryecto:\n Nombre: "+nombre_pro[con]+"\n Fecha Inicio: "+fe_ini[con]+"\n Fecha Finalicacion : "+fe_end[con]+"\n.",desa.nombre_empre+" Empleado No:"+con,INFORMATION_MESSAGE);
         }
      }
   }