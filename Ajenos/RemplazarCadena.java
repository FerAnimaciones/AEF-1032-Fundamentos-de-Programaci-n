 /*****************************************************************************************
 * @class ArrayStringExamen.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/12/07
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*;  
   public class RemplazarCadena
   { 
      private int tam=0,tam2=0;
      private String a[][];
      private String palabras[] =new String[2];
   
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"De que tamano es el arrgelo"));
         tam2=Integer.parseInt(showInputDialog(null,"De que tamano es el arrgelo"));    
         a=new String [tam][tam2];
         for(int y=0;y<tam;y++)
         {
            for(int x=0;x<tam2;x++)
            {
               a[x][y]=showInputDialog(null,"Ingrese el texto numero: "+(x+1)+" en "+(y+1)+" :");
               a[x][y]=a[x][y].toUpperCase();
            }
         }
         palabras[0]=showInputDialog(null,"Ingrese la palabra a cambiar 1: ");
         palabras[0]=palabras[0].toUpperCase();
         palabras[1]=showInputDialog(null,"Ingrese la palabra a cambiar 2: ");
         palabras[1]=palabras[1].toUpperCase();
      }
      public void acomodar()
      {
         int x=0;
         for(int y=0;y<tam;y++)
         {
            for( x=0;x<tam2;x++)
            {  
               if(y==0)
               {
                  a[x][y]=a[x][y].replace(palabras[0]," Winston " ); 
               }
               else
               {
                  a[x][y]=a[x][y].replace(palabras[1]," Bonito " ); 
                  System.out.print(palabras[1]);
               }
            }
         }
      }
      public String mostrar()
      {
		String cad=" ";
         for(int y=0;y<tam;y++)
         {
            for(int x=0;x<tam2;x++)
            {  
				 cad=cad+a[x][y];
            }
				cad=cad+" \n";
         }
			return cad;
      }
      public static void main( String args[] )
      {
         RemplazarCadena llamar=new  RemplazarCadena();
         llamar.leer();
         llamar.acomodar();
			showMessageDialog(null,llamar.mostrar());
      }
   }