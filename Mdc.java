   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  18 SEPTIEMBRE  2012 
   import java.io.*;      
   public class Mdc
   {
      public void md()
      {
         double num1,num2,mcd=0,min;
      
         num1 = Double.parseDouble(showInputDialog("Ingrese un numero:\n"));
      
         num2 = Double.parseDouble(showInputDialog("Ingrese un numero:\n"));
         if(num1 < num2)
         {
            min = num1;
         }
         else{
            min = num2;
         }  
         for(double i=1;i<=min;i++)
         {
            if(num1 % i == 0 && num2 % i == 0)
            {
               mcd = i;
            }
         }
         showMessageDialog(null," El MCD de "+num1+ " y " +num2+ " es: "+mcd,"",INFORMATION_MESSAGE);
      }
      public static void main(String args[])
      {
         Mdc m=new Mdc();
         m.md();
      }
   }