   import static javax.swing.JOptionPane.*; 
   public class WinstonKarla
   {
      private int tam=0,tam2=0,tam3=0;
      private String cad="";
      private float a[][][];
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"Ingrese la renglon: "));
         tam2=Integer.parseInt(showInputDialog(null,"Ingrese el columna: "));
         tam3=Integer.parseInt(showInputDialog(null,"Ingrese Hoja: "));
         a= new float [tam3][tam][tam2];
         for(int z=0;z<tam3;z++)
         {    
            for(int x=0;x<tam;x++)
            {
               for(int y=0;y<tam2;y++)
               {
                  a[z][x][y]=Float.parseFloat(showInputDialog(null,"Ingrese el numero "+(y+1)+":"));   cad=cad+a[z][x][y]+"  ";
               }
               cad=cad+"\n";
            }
            cad=cad+"\n";
         }
         cad=cad+"\n";
      }  	
      public void mostrar()
      {
         int a,b,c;
         showMessageDialog(null,"El arreglo es: \n"+cad);
         a=Integer.parseInt(showInputDialog(null,"En que hoja esta: "));
         b=Integer.parseInt(showInputDialog(null,"En que renglon esta: "));
         c=Integer.parseInt(showInputDialog(null,"En que columna esta: "));
         showMessageDialog(null,"El numero que busca en la pocicion "+a+","+b+","+c+" es:"+this.a[a-1][b-1][c-1]);   
      }
      public static void main( String args[] )
      {
         WinstonKarla llamar=new WinstonKarla();llamar.leer();llamar.mostrar();    
      }
   }
      
