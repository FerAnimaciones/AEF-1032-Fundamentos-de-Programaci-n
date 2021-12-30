 /*****************************************************************************************
 * @class ArrayStringExamen.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/12/07
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*;  
   public class ArrayStringExamen
   { 
      private int tam=0,tam2=0;
      private String a[][];
      public void leer()
      {
         String aux=" ",aux2="";
         tam=Integer.parseInt(showInputDialog(null,"De que tamano es el arrgelo"));
         tam2=Integer.parseInt(showInputDialog(null,"De que tamano es el arrgelo"));    
         a=new String [tam][tam2];
         for(int y=0;y<tam;y++)
         {
            for(int x=0;x<tam2;x++)
            {
               a[x][y]=showInputDialog(null,"Ingrese el numero "+(x+1)+" en "+(y+1)+" :");
               a[x][y]=a[x][y].toUpperCase();
            }
         }
      }
      public void mostrar()
      {
         int hex=1;
         String cad="";
         for(int y=0;y<tam;y++)
         {
            for(int x=0;x<tam2;x++)
            {
               for(int c=a[x][y].length()-1;c>=0;c--)
               { 
                  if(a[x][y].charAt(c)=='A' || a[x][y].charAt(c)=='B' || a[x][y].charAt(c)=='C' || a[x][y].charAt(c)=='D' || a[x][y].charAt(c)=='E' || a[x][y].charAt(c)=='F' )      
                  { 
                     hex=0;
                     break;
                  }		
                  else 
                  {
                     hex=1;
                  }
               }
               if(hex==1)
               { 
                  int aux=Integer.parseInt(a[x][y]);
                  if(aux%2==0)
                  {
                     if(aux==0)
                     {
                        cad=cad+"Cero"+" ";
                     }
                     else
                     {
                        cad=cad+"Par"+" ";
                     }
                  }    
                  else
                  {
                     if(aux%2!=0)
                     {
                        cad=cad+"Impar"+" ";
                     }
                  }
               }
               else
               {
                  cad=cad+"Hexa"+" ";
               }
            }
            cad=cad+"\n";
         }
         showMessageDialog(null,"La matriz es :\n"+cad+" ");
      }
      public static void main( String args[] )
      {
         ArrayStringExamen llamar=new ArrayStringExamen();
         llamar.leer();
         llamar.mostrar();
      }
   }