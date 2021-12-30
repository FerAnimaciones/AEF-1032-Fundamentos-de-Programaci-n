 /*****************************************************************************************
 * @class ArrayString.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.01 2012/11/12
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; //4 clases Array Enteros,dobles flotantes ++ string // nombre con mas lestras 
   import java.io.*;                //Alan, torres,ramon,ana
   import java.util.Scanner;
   public class ArrayString
   { 
      private int tam=0;
      private String a[],b[];
      public void leer()
      {
         String aux=" ",aux2="";
         tam=Integer.parseInt(showInputDialog(null,"De que tamano es el arrgelo"));
         a=new String [tam];
         b=new String [tam];
         for(int i=0;i<tam;i++)
         {
            a[i]=showInputDialog(null,"Ingrese el nombre numero "+(i+1)+" :");
            a[i]=a[i].toUpperCase();
         }
        /* for(int e=0;e<tam;e++)
         {
            aux=a[e];
            aux2=aux.toUpperCase();
            a[e]=aux2;
         }*/
      }
      public void mostrar()
      {
         String cad="";
         for(int i=0;i<tam;i++)
         {
            cad=cad+"A "+(i+1)+": "+a[i]+" \n ";
         }
         showMessageDialog(null,"Los nombres son :\n "+cad+" ");
      }
      public  String CadeMen()
      {
         String m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m.length()>a[i].length())
            {
               m=a[i];
            }
         }
         return m;
      }
      public  String CadeMay()
      {
         String m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m.length()<a[i].length())
            {
               m=a[i];
            }
         }
         return m;
      }	
      public String Ordenar(int n)//----------------
      {        
         String cad="";
         for(int i=0;i<tam;i++)
         {
            b[i]=a[i];
         }
         for(int j = 0; j < a.length; j++)
         { 
            for(int i = j + 1; i < a.length; i++) 
            { 
               if(a[i].compareTo(a[j]) < 0) 
               { 
                  String t = a[j]; 
                  a[j] = a[i]; 
                  a[i] = t; 
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
               "Ingrese una opcion: \n 1)Ingresar tama�o arreglo \n 2) mostrar datos nombres \n 3)Mostrar menor \n 4)Mostrar Mayor \n 5)Descedente \n 6)Ascendente \n 7) Todas"));
            ArrayString f=new ArrayString();
            switch(op)
            {
               case 1: 	
                  f.leer();
                  t++;
                  break;
               case 2:
                  f.mostrar();
                  t++;
                  break;
               case 3:		
                  showMessageDialog(null,"El menor es: "+f.CadeMen());
                  t++;
                  break;
               case 4:
                  showMessageDialog(null,"El mayor es: "+f.CadeMay());
                  t++;
                  break;
               case 5: 
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(1));
                  t++;
                  break;
               case 6: 
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(2));
                  t++;
                  break;
               case 7: 
                  f.leer();
                  f.mostrar();
                  showMessageDialog(null,"El menor es: "+f.CadeMen());
                  showMessageDialog(null,"El mayor es: "+f.CadeMay());
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(1));
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(2));
                  t++;
                  break;
            }
         }	 
      }
   }