//class Personal.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012 
   import java.io.*;                
   public class Personal
   {
      Desarrolladora desa=new Desarrolladora();
      Puesto pe=new Puesto();
      String nombre_empleado[] = new String[10];
      String direccion_emp[] = new String[10];
      String tele_emp[] = new String[10];
      String puesto[] = new String[10];
      int n=0;
      public void leer()
      {
         nombre_empleado[n]=showInputDialog("Nombre del empleado:");
         direccion_emp[n]=showInputDialog("Dirrecion del empleado:");
         tele_emp[n]=showInputDialog("Telefono del empleado:");
         //puesto[n]=showInputDialog("Ocupacion del empleado:");
         Object puesto2 =showInputDialog(null,"Seleccione un puesto ocupacional","Seleccione una opcion",QUESTION_MESSAGE,null,new Object[] { pe.nombre_puesto[0],pe.nombre_puesto[2],pe.nombre_puesto[3],pe.nombre_puesto[4]},"opcion 1");          	
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del empleado:\n Nombre: "+nombre_empleado[con]+"\n Dirrecion: "+direccion_emp[con]+"\n Telefono: "+tele_emp[con]+"\n Ocupacion del empleado: "+puesto[con]+".",desa.nombre_empre+" Empleado No:"+con,INFORMATION_MESSAGE);
         }
      }
   }