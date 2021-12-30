//class Desarrolldora.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cata√±o SEPTIEMBRE 2012 
   import java.io.*;                
   public class Desarrolladora
   {   
      public static String nombre_empre="Nombre de la Empresa.";
      public void leer()
      {
         nombre_empre=showInputDialog("La empresa se llama:");    
      }
      public void mostrar()
      {
         showMessageDialog(null,"La empresa es: "+nombre_empre+".");
      }
   
      public static void main(String ar[])
      {
         Desarrolladora emp=new Desarrolladora();
         Personal per=new Personal();
         Proyecto po=new Proyecto();
         Puesto pe=new Puesto();
         Beta be=new Beta();
         Mark ma=new Mark();
         Web we=new Web();
         Musica mu=new Musica();
			Pedidos ped=new Pedidos();
         int n=1,op,op2;
         for(int v=0;v<n;v++)
         {
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1)Empresa \n 2)Personal \n 3) Puestos \n 4)Proyectos en desarrollo   \n 5)bETA  \n 6)CamapaÒa   \n 7)Web   \n 8)Musica \n 9)Pedidos  :\n\n\n"));
            switch (op) 
            {
               case 1:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar Nombre de la empresa. \n 2)Ver el nombre de la empresa."));
                  if(op2==1)
                  {            
                     emp.leer();
                  }
                  else
                  {
                     emp.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 2:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar personal. \n 2)Ver el personal."));
                  if(op2==1)
                  {            
                     per.leer();
                  }
                  else
                  {
                     per.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 3:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar Puesto. \n 2)Ver los Puesto."));
                  if(op2==1)
                  {            
                     pe.leer();
                  }
                  else
                  {
                     pe.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 4:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar Proyecto. \n 2)Ver los Proyectos."));
                  if(op2==1)
                  {            
                     po.leer();
                  }
                  else
                  {
                     po.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 5:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar Beta. \n 2)Ver los Beta."));
                  if(op2==1)
                  {            
                     be.leer();
                  }
                  else
                  {
                     be.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 6:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar CamapÒa. \n 2)Ver las campaÒas."));
                  if(op2==1)
                  {            
                     ma.leer();
                  }
                  else
                  {
                     ma.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 7:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar WebMasters. \n 2)Ver los datos de web."));
                  if(op2==1)
                  {            
                     we.leer();
                  }
                  else
                  {
                     we.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 8:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar Musicos. \n 2)Ver los musicos."));
                  if(op2==1)
                  {            
                     mu.leer();
                  }
                  else
                  {
                     mu.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
               case 9:
                  op2=Integer.parseInt(showInputDialog("Opciones: \n 1)Ingresar WebMasters. \n 2)Ver los datos de web."));
                  if(op2==1)
                  {            
                     ped.leer();
                  }
                  else
                  {
                     ped.mostrar();
                  }              
                  n++;
                  op2=0;
                  break;
            }         
         }      
      } 
   }