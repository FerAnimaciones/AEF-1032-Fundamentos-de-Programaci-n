//class Pelicula.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

   public class Pelicula
   {
      private String Titulo, Genero;
   
      public void ingDataPelicula()
      {
         Titulo=showInputDialog("Ingrese el titulo de la pelicula : ");
         Genero=showInputDialog("Ingrese el genero de la pelicula: ");
      } 
      public void mostraDataPelicula()
      {
         showMessageDialog(null,"La Pelicula es : "+Titulo+" \n La genero de la pelicula: "+Genero);
      }
   }