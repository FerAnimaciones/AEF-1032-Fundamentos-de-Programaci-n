 /*****************************************************************************************
 * @class ArrayIntBi.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/11/26 && Modificado 2012/11/27
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; 
   import java.io.*;               //suma numeros pares, promedio de numeros pares, buscar elemnto en el arreglo y retorna las cordenadas
   import java.util.Scanner;//crear la matriz flotante double
   public class ArrayIntBi
   { 
      private int a[][];
      private int tam=0,tam2=0,c=0;
      public void leer()
      {
         tam=Integer.parseInt(showInputDialog(null,"Numero de renglones: "));
         c=tam;
         tam2=Integer.parseInt(showInputDialog(null,"Numero de columnas: "));
         this.a=new int [tam][tam2];
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               a[i][e]=Integer.parseInt(showInputDialog(null,"Ingrese el numero del renglon #"+(i+1)+" en la columna"+(e+1)+" :"));
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
         int com=0;
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
         int com=0;
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
         int sum=0;
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
         int sum=0,cont=0;
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
         int sum=0,cont=0;
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
      public int sumaDiago()
      {
         int sumadiago=0,e=0;     	
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
      public String sumaDiago4()
      {  
         String cadena="";
         int sumadiago=0,e=0;     	
         for(int i=0;i<tam;i++)
         {
            for( e=0;e<tam2;e++)
            {   
               sumadiago=sumadiago+a[i][e];
               cadena=cadena+a[i][e];        
               i++;                
            }
         
            cadena=cadena+" ";
            System.out.print(1);
            
            cadena=cadena+"\n";
            e++; 
         }
         cadena="La diagnonal :\n"+cadena+" = "+sumadiago;
         return cadena;
      }
      public int sumaDiago2()
      {
         String cad="";
         int sumadiago=0,e=0;     	
         for(int i=0;i<tam;i++)
         {
            sumadiago=sumadiago+a[i][i];
            cad=cad+a[i][i];
            cad=cad+"\n";
         }
         showMessageDialog(null,"La diagnonal :\n "+cad+" = "+sumadiago,"La suma de la diagonal mas la matriz",PLAIN_MESSAGE);
         return sumadiago;
      }
      public String sumaDiago3()
      {
         String cad="";
         int sumadiago=0,e=0;     	
         for(int i=0;i<tam;i++)
         {
            sumadiago=sumadiago+a[i][i];
            cad=cad+a[i][i];
            cad=cad+"\n";
         }
         cad="La diagnonal :\n"+cad+" = "+sumadiago;
         return cad;
      }
      public void mostrar2()
      {
         String cad="";
         for(int i=0;i<tam;i++)
         {
            for(int e=0;e<tam2;e++)
            {
               if(a[i][e]%2==0)
               {
                  cad=cad+" P ";
               }
               else
               {
                  cad=cad+(a[i][e])+" ";
               }
            }
            cad=cad+"\n";
         }
         showMessageDialog(null,"El arreglo es:\n"+cad);
      } 	
      public static void main( String args[] )
      {
         ArrayIntBi f=new ArrayIntBi();
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
                  f.mostrar2();
                  showMessageDialog(null,f.sumaDiago3()); 
                  showMessageDialog(null,f.sumaDiago4(),"El nuevo mensaje ",PLAIN_MESSAGE); 
                  t++;
                  break;
               default:
                  t++;
                  break;
            }
         }	
      } 
   }