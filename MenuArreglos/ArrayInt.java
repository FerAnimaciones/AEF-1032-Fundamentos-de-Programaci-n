 /*****************************************************************************************
 * @class ArrayInt.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/11/12
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; //4 clases Array Enteros,dobles flotantes ++ string // nombre con mas lestras 
   import java.io.*;                //Alan, torres,ramon,ana
   import java.util.Scanner;
   public class ArrayInt
   { 
      private int tam=0;
      private int a[],b[],c[];
      public void leerInt()
      {
         tam=Integer.parseInt(showInputDialog(null,"De que tama�o del arrgelo: "));
         a=new int [tam];
         b=new int [tam];
         c=new int [tam];
         for(int i=0;i<tam;i++)
         {
            a[i]=Integer.parseInt(showInputDialog(null,"Ingrese el numero,  #"+(i+1)+" :"));
         }
      }
      public void mostrarInt()
      {
         String cad="";
         for(int i=0;i<tam;i++)
         {
            cad=cad+"A "+(i+1)+": "+a[i]+" \n ";
         }
         showMessageDialog(null,"Los numeros ingresados son :\n "+cad+" ");
      }
      public  int IntMay()
      {
         int m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m<a[i])
            {
               m=a[i];
            }
         }
         return m;
      }
      public  int IntMen()//-----------
      {
         int m=a[0];
         for(int i=1;i<tam;i++)
         {
            if(m>a[i])
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
         int temp;
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
      /*public  String OrdenarDesc()
      {
         String cad="";
         int temp;
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
         for(int i=0;i<tam;i++)
         {
            cad=cad+"\n "+a[i];
         }
         return cad;
      }*/
      public  String Promedio()
      {
         String cad="";
         float suma=0;
         int aux=0;
         for(int i=0;i<tam;i++)
         {
            if(a[i]%2==0)
            { 
               suma=suma+a[i];
               aux++;
            }
         }
         cad="El promedio es: "+(suma/aux);
         return cad;
      } 
      public  String SumaImpar()
      {
         String cad="";
         int suma=0,aux=0; 
         for(int i=0;i<tam;i++)
         {
            if(i%2!=0)
            { 
               suma=suma+a[i];
            }	 
         }
         cad="La suma es: "+(suma);
         return cad;
      } 	
      public int buscar(int n)
      {
         int pos=0;
         for(int i=0;i<tam;i++)
         {
            if(n==a[i])
            { 
               pos=(i);
               return pos;
            }	 
         }
         return -1;
      } 		
      public void a3()
      {
         int t=1,n=0;
         for(int i=0;i<t;i++)
         {
            int op=Integer.parseInt(showInputDialog(null,
               "Ingrese una opcion: \n 1)Ingresar tama�o arreglo \n 2) mostrar datos nombres \n 3)Menor \n 4)Mayor\n 5)Descendente \n 6)Ascendente \n 7)Promedio \n 8)Buscar \n 9)todas"));
            ArrayInt f=new ArrayInt();
            switch(op)
            {
               case 1: 	
                  f.leerInt();
                  t++;
                  break;
               case 2:
                  f.mostrarInt();
                  t++;
                  break;
               case 3:
                  showMessageDialog(null,"El menor es: "+f.IntMen());
                  t++;
                  break;
               case 4:
                  showMessageDialog(null,"El mayor es: "+f.IntMay());
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
                  showMessageDialog(null,f.Promedio());
                  break;
               case 8:
                  n=Integer.parseInt(showInputDialog(null,"Ingrese el numero a buscar:"));
                  if(f.buscar(n)==-1)
                  {
                     showMessageDialog(null,"El "+n+" no se encuentra en ninguna pocision");
                  }
                  else
                  {
                     showMessageDialog(null,"El "+n+" se encuentra en la pocicion: "+f.buscar(n));
                  }
                  t++;
                  break;
               case 9: 
                  f.leerInt();
                  f.mostrarInt();
                  showMessageDialog(null,"El menor es: "+f.IntMen());
                  showMessageDialog(null,"El mayor es: "+f.IntMay());
                  showMessageDialog(null,"El Ordenamiento Descendente: "+f.Ordenar(1));
                  showMessageDialog(null,"El Ordenamiento Ascendente: "+f.Ordenar(2));
                  showMessageDialog(null,f.Promedio());		
                  showMessageDialog(null,f.SumaImpar());
                  n=Integer.parseInt(showInputDialog(null,"Ingrese el numero a buscar:"));
                  if(f.buscar(n)==-1)
                  {
                     showMessageDialog(null,"El "+n+" no se encuentra en ninguna pocision");
                  }
                  else
                  {
                     showMessageDialog(null,"El "+n+" se encuentra en la pocicion: "+f.buscar(n));
                  }
                  t++;
                  break;
               default:
                  t++;
                  break;
            }
         }	
      } 
   }