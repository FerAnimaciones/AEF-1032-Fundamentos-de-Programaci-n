//class Cine.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012
   public class Cine
   {
      private String nombrec,direccion,numtele;
      private int numsucur;
   
      public void ingDataCine()
      {
         nombrec=showInputDialog("Ingrese el nombre del cine: ");
         direccion=showInputDialog("Ingrese la direccion de la sucursal: ");
         numtele=showInputDialog("Ingrese el numero de telefono: ");
      } 
   
      public void mostraDataCine()
      {
         showMessageDialog(null,"El nombre del cine es: "+nombrec+" \n la direccion del cine es: "+direccion+" \n Numero de telefono: "+numtele);
      }
   /*
   public class taquilla
   { // echo por Erika Nayarit Reyes 
   }
   
   public void empleados_ingre
   {
   private String tipo_empleado;
   
   tipo_empleado=showInputDialog("Ingresa la ocupacion del empleado: ");
   }*/
   
      public static void main(String ar[])
      {
         Cine ci=new Cine();
         Sala sa=new Sala();
         Boleto bo=new Boleto();
         Pelicula pe=new Pelicula();
         Empleado em=new Empleado();
         Taquilla ta=new Taquilla();
         Cliente cli=new Cliente();
         Personas per=new Personas();
         int op,n=1,op2;
         for(int v=0;v<n;v++)
         {
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Datos del Cine \n 2)Datos Sala \n 3) Datos Boletos \n 4) Pelicula \n 5) Empleado \n 6) Taquilla \n 7) Cliente \n 8) Personas :\n\n\n"));
            switch (op) 
            {
               case 1:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos cine \n 2) Ver datos cine. "));
                  if(op2==1)
                  {  
                     ci.ingDataCine();
                  }
                  else
                  {
                     ci.mostraDataCine();
                  }
                  n++;
                  op2=0;
                  break;
               case 2: 
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Sala \n 2) Ver datos Sala. "));
                  if(op2==1)
                  {  
                     sa.ingDataSala();
                  }
                  else
                  {
                     sa.mostraDataSala();
                  }   
                  op2=0;
                  n++;
                  break;
               case 3:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Boleto \n 2) Ver datos Boleto. "));
                  if(op2==1)
                  {  
                     bo.ingDataBoleto();
                  }
                  else
                  {
                     bo.mostraDataBoleto();
                  }   
                  op2=0;
                  n++;
                  break;
               case 4:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Pelicula \n 2) Ver datos Pelicula. "));
                  if(op2==1)
                  {  
                     pe.ingDataPelicula();
                  }
                  else
                  {
                     pe.mostraDataPelicula();
                  }   
                  op2=0;
                  n++;
                  break;
               case 5:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Empleado \n 2) Ver datos Empleado. "));
                  if(op2==1)
                  {  
                     em.ingDataEmpleado();
                  }
                  else
                  {
                     em.mostraDataEmpleado();
                  }   
                  op2=0;
                  n++;
                  break;
               case 6:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Taquilla \n 2) Ver datos Taquilla. "));
                  if(op2==1)
                  {  
                     ta.ingDataTaquilla();
                  }
                  else
                  {
                     ta.mostraDataTaquilla();
                  }   
                  op2=0;
                  n++;
                  break;
               case 7:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Cliente \n 2) Ver datos Cliente. "));
                  if(op2==1)
                  {  
                     cli.ingDataCliente();
                  }
                  else
                  {
                     cli.mostraDataCliente();
                  }   
                  op2=0;
                  n++;
                  break;
               case 8:
                  op2=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1) Agregar Datos Personas \n 2) Ver datos Personas. "));
                  if(op2==1)
                  {  
                     per.ingDataPersona();
                  }
                  else
                  {
                     per.mostraDataPersona();
                  }   
                  op2=0;
                  n++;
                  break;
               default:  showMessageDialog(null,"Saliendo");
                  break;
            }
         }
      }
   }