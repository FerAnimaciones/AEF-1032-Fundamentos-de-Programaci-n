   import static javax.swing.JOptionPane.*; 
   public class Arrayhoy
   {
      private int tam=0,tam2=0;
      double aux=0,aux2=0;
      private double a[][];
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"Ingrese X: "));
         tam2=Integer.parseInt(showInputDialog(null,"Ingrese Y: "));
         a= new double [tam][tam2];
         for(int x=0;x<tam;x++)
         {
            for(int y=0;y<tam2;y++)
            {
               aux=Double.parseDouble(showInputDialog(null,"Ingrese una cantidad double: "));
               aux2=(int)aux;
					System.out.print(aux2+"\n");
               if(aux2>=0.50)
               {
                  a[x][y]=aux+(aux-aux2); 
						 
               }
               if(aux2>=1)
               {
                  a[x][y]=aux;
               }       	 
            }
         }
      }  	
      public void mostrar()
      {
         for(int x=0;x<tam;x++)
         {
            for(int y=0;y<tam2;y++)
            {
               showMessageDialog(null,a[x][y]);     	 
            }
         }
      }
   	
      public static void main( String args[] )
      {
         Arrayhoy llamar=new Arrayhoy();
         llamar.leer();
         llamar.mostrar();
        
      }
   	
   }
      
