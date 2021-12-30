   import java.util.Random;


   public class NumeroAleatorio
   {
   
      public static void main(String[] args)
      {  
      // TODO Auto-generated method stub
         Random r = new Random();
         int limite=10;     
         System.out.println(r.nextInt());
         System.out.println(r.nextInt(limite+1));
      }
   }