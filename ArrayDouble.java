 /*****************************************************************************************
 * @class ArrayFloat.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/11/12
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; 
   import java.io.*;                
   import java.util.Scanner;
   public class ArrayDouble
   { 
      private int tam=0;
      private double a[],b[],c[];
      public void leerd()
      {
         tam=Integer.parseInt(showInputDialog(null,"De que tama�o del arrgelo: "));
         a=new double [tam];
         b=new double [tam];
         c=new double [tam];
         for(int i=0;i<tam;i++)
         {
            a[i]=Double.parseDouble(showInputDialog(null,"Ingrese el numero,  #"+(i+1)+" :"));
         }
      }
      public void mostrard()//=========================================================
      {
         String cad="";
         for(int i=0;i<tam;i++)
         {
            cad=cad+"A "+(i+1)+": "+a[i]+" \n ";
         }
         showMessageDialog(null,"Los numeros ingresados son :\n "+cad+" ");
      }
      public  double dMay()
      {
         Double m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m<a[i])
            {
               m=a[i];
            }
         }
         return m;
      }
      public double dMen()//==================================================
      {
         double m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m>a[i])
            {
               m=a[i];
            }
         }
         return m;
      }
      public String Ordenar(int n)//=======================================================
      {        
         String cad="";
         for(int i=0;i<tam;i++)
         {
            b[i]=a[i];
         }
         double temp;
         int t = a.length;
         for (int i = 1; i < t; i++) {
            for (int k = t- 1; k >= i; k--) {
               if(a[k] < a[k-1]){
                  temp = a[k];
                  a[k] = a[k-1];
                  a[k-1]= temp;
               }
            }
         }
         if(n==1)
         {
            for(int i=0;i<tam;i++)
            {
               cad=cad+"\n "+a[i];
            }
         }
         else if(n==2)
         {
            for(int i=(tam-1);i>=0;i--)
            {
               cad=cad+"\n "+a[i];
            }
         }
         for(int i=0;i<tam;i++)
         {
            a[i]=b[i];
         }
         return cad;
      }
      public static void main( String args[] )
      {
         int t=1;
         for(int i=0;i<t;i++)
         {
            int op=Integer.parseInt(showInputDialog(null,
               "Ingrese una opcion: \n 1)Ingresar tama�o arreglo \n 2) mostrar datos nombres \n 3)Menor \n 4)Mayor\n 5)Descendente \n 6)Ascendente \n 7)Todas"));
            ArrayDouble f=new ArrayDouble();
            switch(op)
            {
               case 1: 	
                  f.leerd();
                  t++;
                  break;
               case 2:
                  f.mostrard();
                  t++;
                  break;
               case 3:
                  showMessageDialog(null,"El menor es: "+f.dMen());
                  t++;
                  break;
               case 4:
                  showMessageDialog(null,"El mayor es: "+f.dMay());
                  t++;
                  break;
               case 5: 
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(1));
                  t++;
                  break;
               case 6: 
                  showMessageDialog(null,"El Ordenamiento Ascendente: "+f.Ordenar(2));
                  t++;
                  break;
               case 7: 
                  f.leerd();
                  f.mostrard();
                  showMessageDialog(null,"El menor es: "+f.dMen());
                  showMessageDialog(null,"El mayor es: "+f.dMay());
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(1));
                  showMessageDialog(null,"El Ordenamiento Ascendente: "+f.Ordenar(2));
                  t++;
                  break;
               default:
                  t++;
                  break;
            }
         }	
      } 
   }