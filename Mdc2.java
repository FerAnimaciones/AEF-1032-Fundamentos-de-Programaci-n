   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  21 SEPTIEMBRE  2012 Roxi :B
   import java.io.*;      //Light Bot //Resta numero racionales 1/2, Suma resta, Implementar Esta funcion , 
   public class Mdc2
   {
      public static void mcd()
      {
         double num1,num2,mcd=0,resto=0;
         double min=0,max=0;    
         num1 = Double.parseDouble(showInputDialog("Ingrese un numero:\n"));    
         num2 = Double.parseDouble(showInputDialog("Ingrese un numero:\n"));
         min=Math.min(num1,num2);
         max=Math.max(num1,num2);
         mcd=resto=0;			
         while(min!=0)
         {
            resto=max%min;
            max=min;
            min=resto;     
         }
         mcd=max;
         showMessageDialog(null,"Maximo Comun divisor de "+num1+" y "+num2+" \n Resultado= "+mcd+" ",".:Maximo Comun divisor:.",INFORMATION_MESSAGE);
      }
      public static void main(String args[])
      {
         mcd();
      }
   }