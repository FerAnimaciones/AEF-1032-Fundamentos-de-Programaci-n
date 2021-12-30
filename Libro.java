   import java.io.*;//class Libro.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012
   public class Libro
   {
      private String nom,autu,descrip,edit;
      private int pag;
      public void ingDataLibro()
      {
         nom=showInputDialog("Ingrese el nombre del libro:   ");
         autu=showInputDialog("Ingrese el nombre del autor del libro: ");
         pag=Integer.parseInt(showInputDialog("Ingrese el numero de paginas: "));
         descrip=showInputDialog("Ingrese una decripcion del libro:");
         edit=showInputDialog("Ingrese la edtitorial del libro:");
      }    
      public void mostraDataLibro()
      {
         showMessageDialog(null,"El nombre del libro es: "+nom+" \n El aturo es : "+autu+" \n Las paginas son: "+pag+"\n La descripcion es la siguiente: "+descrip+".", "Informacion del  libro. " ,INFORMATION_MESSAGE);
      } 
      public static void main(String ar[])
      {
         Libro lil=new Libro();
         lil.ingDataLibro();
         lil.mostraDataLibro();       
      }  	
   }