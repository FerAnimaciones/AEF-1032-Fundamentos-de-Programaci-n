   import static javax.swing.JOptionPane.*;
   public class Array3Dint{
      private int h,r,c,M[][][];
   
      public void leer(){
         h=Integer.parseInt(showInputDialog(null,"Dame el numero de Hojas","Hojas",2));
         r=Integer.parseInt(showInputDialog(null,"Dame el numero de Renglones","Renglones",2));
         c=Integer.parseInt(showInputDialog(null,"Dame el numero de Columnas","Columnas",2));
         M=new int[h][r][c];
         for (int s=0;s<h;s++)
            for (int i=0;i<r;i++)
               for (int k=0;k<c;k++)
               //M[s][i][k]=Integer.parseInt(showInputDialog("M["+s+"]"+"["+i+"]"+"["+k+"]"));
                  M[s][i][k] = ((int)(Math.random()*(9-1+1)+1));
      }//leer
   
      public void mostrar(){
         String cad="";
         for (int s=0;s<h;s++){
            for (int i=0;i<r;i++){
               for (int k=0;k<c;k++)cad=cad+M[s][i][k]+" ";
               cad=cad+"\n";
            }//for de r	
            showMessageDialog(null,cad,"Hoja "+s,s);	
            cad="";	
         }//for de s
      }//mostrar
      public void mostrarMul5(){
         String cad="";
         String mul="";
         for (int s=0;s<c;s++)
         {
            for (int i=0;i<r;i++)
            {
               for (int k=0;k<h;k++)
               {   
					System.out.print(M[s][i][k]+"\n");
                  if(M[s][i][k]%5==0)
                  {
                     mul=mul+M[s][i][k]+" ";
                  }
               }
					mul=mul+" \n";
            }//for de i
            showMessageDialog(null,mul,"Columna "+s,0);	
            cad="";	
         }//for de k
      }//mostrar
      public static void main (String arreglo[]){
         Array3Dint x=new Array3Dint(); x.leer(); x.mostrar(); 
         x.mostrarMul5();
      }//main
   }//class