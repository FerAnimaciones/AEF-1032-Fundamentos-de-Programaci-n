 /*****************************************************************************************
 * @class ArrayIntBi.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/11/27
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; 
   import java.io.*;               //suma numeros pares, promedio de numeros pares, buscar elemnto en el arreglo y retorna las cordenadas
   import java.util.Scanner;//crear la matriz flotante double
   public class ArrayDoubleBi
   { 
      private double a[][];
      private int tam=0,tam2=0,c=0;
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"Numero de renglones: "));
         c=tam;
         tam2=Integer.parseInt(showInputDialog(null,"Numero de columnas: "));
         this.a=new double [tam][tam2];
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               a[i][e]=Double.parseDouble(showInputDialog(null,"Ingrese el numero del renglon #"+(i+1)+" en la columna"+(e+1)+" :"));
            }
         }
      }
      public void mostrar()
      {
         String cad="";
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               cad=cad+(a[i][e])+" ";
            }
            cad=cad+"\n";
         }
         showMessageDialog(null,"El arreglo es:\n"+cad);
      }
      public void mayor()
      {
         double com=0;
         com=a[0][0];
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(com<a[i][e])
               {
                  com=a[i][e];
               }
            }
         }
         showMessageDialog(null,"El elemento mayor de la matriz es: "+com);
      }
      public void menor()
      {
         double com=0;
         com=a[0][0];
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<c;e++)
            {
               if(com>a[i][e])
               {
                  com=a[i][e];
               }
            }
         }
         showMessageDialog(null,"El elemento menor de la matriz es: "+com);
      }
      public void sumapar()
      {
         double sum=0;
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(a[i][e]%2==0)
               {
                  sum=sum+(a[i][e]);
               }
            }
         }
         showMessageDialog(null,"La suma de las matrices : "+sum);
      }
      public void promedioPar()
      {
         double sum=0,cont=0;
         double prome=0;
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(a[i][e]%2==0)
               {
                  sum=sum+(a[i][e]);
                  cont++;
               }
               else
               {
                  sum=sum+0;
               }
            }
         }
         if(sum==0)
         {
            prome=0;
         }
         else
         {
            prome=(sum/cont);
         }
         showMessageDialog(null,"El promedio par de la matriz es: "+prome);
      }   	
      public void promedioTodo()
      {
         double sum=0,cont=0;
         double prome=0;
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               sum=sum+(a[i][e]);
               cont++;           
            }
         }
         prome=sum/cont;
         showMessageDialog(null,"El promedio de la matriz es: "+prome);
      } 	
      public  String eleB(int bus)
      {
         String pos="";
      
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(a[i][e]==bus)
               {
                  pos=pos+"El renglon es: "+i+", la columna es: "+e+".\n";
               }
            }
         }
         if(pos=="")
         {
            pos="No se encontro el numero en la matriz.";
         }
         return pos;
      }   
      public  void eleB2()
      {
         String pos="";
         int  bus=Integer.parseInt(showInputDialog(null,"Ingrese el elemento a buscar: "));
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(a[i][e]==bus)
               {
                  pos=pos+"El renglon es: "+i+", la columna es: "+e+".\n";
               }
            }
         }
         if(pos=="")
         {
            pos="No se encontro el numero en la matriz.";
         }
         showMessageDialog(null,""+pos);     
      }  
      public double sumaDiago()
      {
         double sumadiago=0;
         int e=0;     	
         for(int i=0;i<tam;i++)
         {
            for( e=0;e<tam2;e++)
            {
               sumadiago=sumadiago+a[i][e];
               i++;                
            }
            e++; 
         }
         return sumadiago;
      }
      public double sumaDiago2()
      {
         double sumadiago=0;
			int e=0;     	
         for(int i=0;i<tam;i++)
         {
            sumadiago=sumadiago+a[i][i];
         }
         return sumadiago;
      }
      public static void main( String args[] )
      {
         ArrayDoubleBi f=new ArrayDoubleBi();
         int t=1;
         int bus2=0;
         for(int i=0;i<t;i++)
         {
            int op=Integer.parseInt(showInputDialog(null,
               "Ingrese una opcion: "/*\n 1)Ingresar tama�o arreglo \n 2) mostrar datos nombres \n 3)Menor \n 4)Mayor\n 5)Descendente \n 6)Ascendente \n"*/+" 9)Todas"));
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
                  f.mayor();
                  t++;
                  break;
               case 4:
                  f.menor();
                  t++;
                  break;
               case 5: 
                  f.sumapar();
                  t++;
                  break;
               case 6: 
                  f.promedioPar();
                  t++;
                  break;
               case 7: 
                  f.promedioTodo();
                  t++;
                  break;
               case 8: 
                  bus2=Integer.parseInt(showInputDialog(null,"Ingrese el elemento a buscar: "));
                  f.eleB(bus2);
                  t++;
                  break;
               case 9: 
                  f.leer();
                  f.mostrar();
                  f.mayor();
                  f.menor();
                  f.sumapar();
                  f.promedioPar();
                  f.promedioTodo();
                  bus2=Integer.parseInt(showInputDialog(null,"Ingrese el elemento a buscar: "));
                  showMessageDialog(null, f.eleB(bus2));
                  showMessageDialog(null,"1)La suma de la diagonal es: "+ f.sumaDiago());
                  showMessageDialog(null,"2)La suma de la diagonal es: "+ f.sumaDiago2());
                  t++;
                  break;
               default:
                  t++;
                  break;
            }
         }	
      } 
   }