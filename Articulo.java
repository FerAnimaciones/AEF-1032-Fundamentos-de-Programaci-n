   import java.io.*;//class Articulo.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012
    public class Articulo
   {
      private String cb,desc,clave;
      private double precio;
       public void ingDataArticulo()
      {
         clave=showInputDialog("Ingrese la clave del produtco:   ");
         cb=showInputDialog("Ingrese el codigo de barras: ");
         precio=Double.parseDouble(showInputDialog("Ingrese el precio del articulo: "));
         desc=showInputDialog("Ingrese una decripcion del producto:");
      }    
       public void mostraDataArticulo()
      {
         showMessageDialog(null,"La clave del articulo es: "+clave+" \n El codigo de barras es: "+cb+" \n El precio es: "+precio+"\n La descripcion del producto es: "+desc+".", "Informacion del producto. " ,INFORMATION_MESSAGE);
      } 
       public static void main(String ar[])
      {
         Articulo art=new Articulo();
         art.ingDataArticulo();
         art.mostraDataArticulo();       
      }  	
   }  