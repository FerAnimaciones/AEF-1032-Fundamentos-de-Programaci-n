//class Automovil.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  SEPTIEMBRE 2012 
   import java.io.*;                

   public class Automovil
   {
      
      String marca[] = new String[10];
      String color[] = new String[10];
      String tipo[] = new String[10];
      int modelo[] = new int[10];
      float precio[] = new float[10];
      int n=0;
		int clasess=0;
      public void leer()
      {  
         //Bicicleta bi=new Bicicleta();
         if(clasess==1)
         {
            Object marcb=showInputDialog(null,"Seleccione una marca de auto:","Seleccione una carca de auto:",QUESTION_MESSAGE,null,new Object[] {"Apache"},"opcion 1");             
            marca[n]=(String)marcb;  
         }
         else
         {
            Object marct=showInputDialog(null,"Seleccione una marca de auto:","Seleccione una carca de auto:",QUESTION_MESSAGE,null,new Object[] {"GM","Opel","Saab","Vauxhall","Holden","Cadillac","Chevrolet"," Buick","Pontiac","Hummer","GMC","Saturn","Toyota","Daihatsu", "Scion", "Hino","Ford","Lincoln","Mercury","Jaguar","Land Rover", "Volvo","Aston Martin"," Mazda","Volkswagen","Skoda","Bentley", "Bugatti","Audi","Seat","Lamborghini","Renault","Nissan","Dacia", "Infiniti","Samsung","DaimlerChrysler","Mercedes","Dodge", "Jeep"," Ferrari"},"opcion 1");       
            marca[n]=(String)marct;  
         }  
          
         color[n]=showInputDialog("Cual es el color del autmovil:");
         modelo[n]=Integer.parseInt(showInputDialog("Cual es el a�o de este auto(modelo):"));
         precio[n]=Float.parseFloat(showInputDialog("Cual es el precio del auto:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del automovil :\n Marca: "+marca[con]+"\n Tipo de color: "+color[con]+"\n A�o del  automovil: "+modelo[con]+"\n Precio del auto"+precio[con]+"."," Automovil"+marca[con],INFORMATION_MESSAGE);
         }
      }
      public static void main(String ar[])
      {
         Automovil lol=new Automovil();
         Bicicleta bi2=new Bicicleta();
         int n=1;
			int ca=0;
         for(int l=0;l<n;l++)
         {
            int op=0;
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1)Ingresar Automovil  \n 2)Ver Automoviles :\n 3)Ingresar Bicicleta  \n 4)Ver Bicicleta :\n"));
            switch (op) 
            {
               case 1:
                  lol.leer();
                  n++; 
                  break;
               case 2:
                  lol.mostrar();  
                  n++; 
                  break;  
               case 3:
                 bi2.leer();  
                  n++; 
						ca=1;
                  break;   
               case 4:
                  bi2.mostrar();  
                  n++; 
                  break;
            		 
            }
         }
      }  
   	
   }