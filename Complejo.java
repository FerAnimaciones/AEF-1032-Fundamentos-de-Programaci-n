   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño  27 SEPTIEMBRE  2012 Ya casi OCTRUBRE 
   import java.io.*;      
   public class Complejo
   {
      private double real=0,imag=0;
      public void leer()
      {
         real=Double.parseDouble(showInputDialog("Cual es el numero real:"));
         imag=Double.parseDouble(showInputDialog("Cual es la parte imaginaria \u31F0 :"));
      }
      public void mostrar()
      {
         showMessageDialog(null,"El numero real es "+real+" + "+imag+"i.");
      }
      public Complejo mas (Complejo b)
      {
         Complejo t=new Complejo();
         t.real=real+b.real;
         t.imag=imag+b.imag;
         return t;
      }
      public Complejo menos (Complejo b)
      {
         Complejo t=new Complejo();
         t.real=real-b.real;
         t.imag=imag-b.imag;
         return t;
      }
   	
      public static void main(String Yosune[])
      {
         Complejo a=new Complejo(), b=new Complejo(),c=new Complejo(),d=new Complejo();		
         a.leer();
         a.mostrar();
         b.leer();
         b.mostrar();
         c=a.mas(b);
         c.mostrar();
			d=a.menos(b);
			d.mostrar();
			
      }
   }