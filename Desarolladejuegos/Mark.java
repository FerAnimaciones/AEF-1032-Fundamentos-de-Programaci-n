//class Beta.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012 
   import java.io.*;                

   public class Mark
   {
      Desarrolladora desa=new Desarrolladora();
      public static String nombre_puesto[] = new String[10];
      String cate_puesto[] = new String[10];
      int capacidad[] = new int[10];
      int n=0;
      public void leer()
      {
         nombre_puesto[n]=showInputDialog("Nombre de campa�a:");
         capacidad[n]=Integer.parseInt(showInputDialog("DIAS DE LA CAMPA�A:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos de la camapa�a :\n Nombre: "+nombre_puesto[con]+"\n Dias: "+capacidad[con]+"\n.",desa.nombre_empre+" Empleado No:"+con,INFORMATION_MESSAGE);
         }
      }
   }