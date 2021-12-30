//class Silla.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila CataÃ±o Winston Ramses Tenatic Bauistista Bañlos SEPTIEMBRE 2012 
   import java.io.*;                

   public class Silla
   {
      String nombre_silla[] = new String[10];
      String madera[] = new String[10];
      int numero_de_patas[] = new int[10];
      int cantidad[] = new int[10];
      int costo[] = new int[10];
      int n=0;
      public void leer()
      {
         nombre_silla[n]=showInputDialog("Nombre del la silla:");
         Object maderra=showInputDialog(null,"Seleccione una madera:","Seleccione una madera:",QUESTION_MESSAGE,null,new Object[] {"Álamo","Abedul","Aliso","Alnus glutinosa","Alnus incana","Carcoma","Roble","Nogal","Cerezo","Encina","Olivo","Castaño","Olmo"},"opcion 1");       
         madera[n]=(String)maderra;      
         cantidad[n]=Integer.parseInt(showInputDialog("Cantidad de sillas:"));
         numero_de_patas[n]=Integer.parseInt(showInputDialog("Numero de patas:"));
         costo[n]=Integer.parseInt(showInputDialog("Costo:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del la silla :\n Nombre: "+nombre_silla[con]+"\n Tipo de madera: "+madera[con]+"\n Capacidad: "+cantidad[con]+"\n Numero de patas"+numero_de_patas[con]+"."," Silla Fernando:"+con,INFORMATION_MESSAGE);
         }
      }
      public static void main(String ar[])
      {
         Silla lil=new Silla();
         int n=1;
         for(int l=0;l<n;l++)
         {
            int op=0;
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1)Ingresar Sillas \n 2)Ver sillas :\n"));
            switch (op) 
            {
               case 1:
                  lil.leer();
                  n++; 
                  break;
               case 2:
                  lil.mostrar();  
                  n++; 
                  break;   
            }
         }
      }  
   	
   }