   import static javax.swing.JOptionPane.*;//Fernando Manuel Avila Cataño  20 SEPTIEMBRE  2012 
   import java.io.*;   
   public class Racional
   {
      private  double n=0,d=0;
      public void leer()
      {    
         n=Integer.parseInt(showInputDialog("Ingrese el numerador: \n"));
         d=Integer.parseInt(showInputDialog("Ingrese el denominador :\n"));
      }
      public  void mostrar()
      {
         mcd();
         showMessageDialog(null,"El numero racional es \n\n   "+n+"\n _____ \n   "+d+" ","Numero racional",INFORMATION_MESSAGE);
      }
      public Racional mas(Racional r)
      {
         Racional  t=new Racional();
         t.n=n*r.d+d*r.n;
         t.d=d*r.d;
         return t;      
      }
      public Racional nos(Racional r)
      {
         Racional  t=new Racional();
         t.n=n*r.d-d*r.n;
         t.d=d*r.d;
      	//t.mcd();
         return t;      
      }
      public void mcd()
      {
         double mcd=0,resto=0;
         double min=0,max=0;    
         min=Math.min(n,d);
         max=Math.max(n,d);
         mcd=resto=0;			
         while(min!=0)
         {
            resto=max%min;
            max=min;
            min=resto;     
         }
         mcd=max;
         n=n/max;
         d=d/max;
      }
      public static void main(String args[])
      {
         Racional ra=new Racional();
         Racional y=new Racional();
         Racional z=new Racional();	
         int n=1;
         for(int l=0;l<n;l++)
         {
            int op=0;
            op=Integer.parseInt(showInputDialog("Ingrese una opcion:\n 1)Leer \n 2)Mostrar  \n 3) Sumar \n 4)Restar "));
            switch (op) 
            {
               case 1:
                  ra.leer();
                  z.leer();
                  n++;
                  break;
               case 2:
                  ra.mostrar();
                  z.mostrar();
               y.mostrar();
                  n++;
                  break;
               case 3:
                  z=ra.mas(z);
                  z.mostrar();            
                  n++;
                  break;
               case 4:
                  z=ra.nos(z);
                  z.mostrar();              
                  n++;
                  break;
            }
         }
      }
   }