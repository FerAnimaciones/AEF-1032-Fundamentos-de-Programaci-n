 /*****************************************************************************************
 * @class ArrayFloatTriCorto.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.50   
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; //PROMIDO HOJA POR HOJA/RENGLON POR RENGLON
   import java.io.*;          
   import java.util.Scanner;
   public class ArrayFloatTriCorto
   {  
      private float a[][][];
      private int tam=0,tam2=0,tam3=0;
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"Numero de renglones: "));
         tam2=Integer.parseInt(showInputDialog(null,"Numero de columnas: "));
         tam3=Integer.parseInt(showInputDialog(null,"Numero de paginas: "));
         a=new float [tam3][tam][tam2];
         for(int z=0;z<tam3;z++)//Pagina
         {      
            for(int x=0;x<tam;x++)//Fila
            {
               for(int y=0;y<tam2;y++)//Columna
               {
                  a[z][x][y]=Float.parseFloat(showInputDialog(null,"Ingrese el numero en renglon #"+(x+1)+" en la columna #"+(y+1)+", la pagina #"+(z+1)+" : \n" ));       
               }
            }
         }
      }
      public void promRenglon2()//
      {
         String cad="",ma="";
         double cont=0;
         float suma=0,sumatotal=0;
         int z=0;
         for( z=0;z<tam3;z++)
         {
            cad=cad+"HOJA: #"+(z+1)+"\n";
            for(int x=0;x<tam;x++)
            {
               for(int y=0;y<tam;y++)
               {
                  suma=suma+a[z][x][y];ma=ma+a[z][x][y]+" ";cont++;System.out.print(cont+" \n");                     System.out.print("La suma es: "+suma);      
                  sumatotal=sumatotal+a[z][x][y];
               }
               ma=ma+"\n";
            }
            showMessageDialog(null,"La matriz es:\n"+ma+" El promedio es:\n"+(suma/cont)+"\n La suma es: "+suma,"La Hoja es: "+(z+1),PLAIN_MESSAGE);             cad="";            suma=0;            cont=0;            ma="";
         }
         showMessageDialog(null,"La suma total de las "+tam3+" matriz es "+sumatotal+".","La suma Total",PLAIN_MESSAGE);
      }  	  
      public static void main( String args[] )
      {
         int t=1;ArrayFloatTriCorto f=new ArrayFloatTriCorto();f.leer();f.promRenglon2();         
      }      
   }