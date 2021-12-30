//class Funciones.java sumar,restar,multipicarlos,dividirlo,mostrar  SARAI GONZALEZ ROSALES String Math leer
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  18 SEPTIEMBRE  2012
   import java.io.*;
   public class Funciones
   {
      public static void proceso()
      {//Sumatoria
         double an=0,bn=0,suma=0,resta=0,mul=0,di=0;
         an=Double.parseDouble(showInputDialog("Ingrese el primer numero:\n"));
         bn=Double.parseDouble(showInputDialog("Ingrese el segundo numero:\n"));
         suma=an+bn;
         resta=an-bn;
         mul=an*bn;
         di=(an/bn);
         showMessageDialog(null,"Las operaciones entre "+an+" y "+bn+" son. \n\n \nLa suma es:   "+suma+"\n La resta es: "+resta+"\nLa Multiplicacion es: "+mul+"\nLa divison es: "+di+"","Total de las operaciones",INFORMATION_MESSAGE);
      }
      public static void nombre()
      {//Repeticion del nombre
         String nombre;
         int v=0;
         nombre=showInputDialog("Ingrese el nombre:\n");
         v=Integer.parseInt(showInputDialog("Ingrese las veces que se mostrara el nombre:\n"));
         for(int i=0;i<v;i++)
         {
            showMessageDialog(null,nombre,"Repeticion Numero: "+(i+1),INFORMATION_MESSAGE);
         }
      }
      public static void mayor_menor()
      {//Mayor menor y igual
         int v=0,v2=0;
         v=Integer.parseInt(showInputDialog("Ingrese un numero:\n"));
         v2=Integer.parseInt(showInputDialog("Ingrese un numero:\n"));
         if(v>v2)
         {
            showMessageDialog(null,"El numero "+v+" es mayor que "+v2+".","Mayor menor",INFORMATION_MESSAGE);
         }
         else
         {
            showMessageDialog(null,"El numero "+v+" es menor  que "+v2+".","Mayor menor",INFORMATION_MESSAGE);
         }
         if(v==v2)
         {
            showMessageDialog(null,"El numero "+v+" son iguales "+v2+".","Mayor menor",INFORMATION_MESSAGE);
         }
      }
      public static void par_impar()
      {//Par e Impar
         int v=0;
         v=Integer.parseInt(showInputDialog("Ingrese un numero:\n"));
         if(v%2==0)
         {
            showMessageDialog(null,"El numero "+v+" es par .","Par o Imparr",INFORMATION_MESSAGE);
         }
         else
         {
            showMessageDialog(null,"El numero "+v+" no es par.","Par o Imparr",INFORMATION_MESSAGE);
         }
      }
      public static void  multiplo5()
      {//Multiplos de 5
         int v=0;
         v=Integer.parseInt(showInputDialog("Ingrese un numero:\n"));
         if(v%5==0)
         {
            showMessageDialog(null,"El numero "+v+" multiplo de 5 .","Multiplo de 5",INFORMATION_MESSAGE);
         }
         else
         {
            showMessageDialog(null,"El numero "+v+" no es multiplio de 5.","Multiplo de 5",INFORMATION_MESSAGE);
         }
      }
      public static void multiplosinf()
      {
         int v=0;
         String num="";
         v=Integer.parseInt(showInputDialog("Ingrese de repeticiones que se vera los multiplos de 5:\n"));
         for(int i=1;i<=v;i++)
         {
            if(i%5==0)
            {
               num+=" "+i+",";
               if(i%50==0)
               {
                  num+="\n";
               }
            }
         }
         showMessageDialog(null,"Los Numeros Multiplos son: \n "+num,"Multiplos de 5 serie",INFORMATION_MESSAGE);
      }
      public static void multiplicar()
      {
         int v=0;
         String tb="La multiplicacion es: \n";
         v=Integer.parseInt(showInputDialog("Ingrese el numero:\n"));
         for(int i=1;i<=10;i++)
         {
            tb=tb+v+"*"+i+"="+(v+i)+"\n";
         }
         showMessageDialog(null,""+tb,"Multiplicacion",INFORMATION_MESSAGE);
      }
      public static void multiplicar2()
      {
         int v=0,v2=0;
         String tb="La multiplicacion es: \n";
         v=Integer.parseInt(showInputDialog("Ingrese el numero:\n"));
         v2=Integer.parseInt(showInputDialog("Ingrese el limite:\n"));
         for(int i=1;i<=v2;i++)
         {
            tb=tb+v+"*"+i+"="+(v+i)+"\n";
         }
         showMessageDialog(null,""+tb,"Multiplicacion",INFORMATION_MESSAGE);
      }
      public static void elevar()
      {
         int v=0,v2=0;
         v=Integer.parseInt(showInputDialog("Ingrese el numero:\n"));
         v2=Integer.parseInt(showInputDialog("Ingrese la elevasion :\n"));
         showMessageDialog(null,"Al cuarado: "+( Math.pow(v,2)),"Multiplicacion",INFORMATION_MESSAGE);
         showMessageDialog(null,"Al "+v2+": "+( Math.pow(v,v2)),"Multiplicacion",INFORMATION_MESSAGE);
      }
      public static void main(String args[])
      {
         int n=1;
        // Funciones fun=new Funciones();
         for(int l=0;l<n;l++)
         {
            int op=0;
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1)Suma,Multiplicacion,Division \n 2)Repeticion de nombres\n 3)Mayor Menor  \n 4)Par Impar \n 5)Multiplo de 5 (Uno) \n 6)Multiplo de 5 (Serie) \n7) Multiplicar \n8) Multiplicar ingresando limites\n"));
            switch (op)
            {
               case 1:
                  proceso();
                  n++;
                  break;
               case 2:
                  nombre();
                  n++;
                  break;
               case 3:
                  mayor_menor();
                  n++;
                  break;
               case 4:
                  par_impar();
                  n++;
                  break;
               case 5:
                  multiplo5();
                  n++;
                  break;
               case 6:
                  multiplosinf();
                  n++;
                  break;
               case 7:
                  multiplicar();
                  n++;
                  break;
               case 8:
                  multiplicar2();
                  n++;
                  break;
               case 9:
                  elevar();
                  n++;
                  break;
            }
         }
      }
   }
