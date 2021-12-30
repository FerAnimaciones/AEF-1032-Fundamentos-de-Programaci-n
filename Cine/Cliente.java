//class Cliente.java
import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño AGOSTO 2012

public class Cliente
{
 private String nomcli;
 
 public void ingDataCliente()
 {
  nomcli=showInputDialog("Ingrese el nombre del cliente : ");
 } 
 public void mostraDataCliente()
 {
   showMessageDialog(null,"Nombre del cliente: "+nomcli);
 }
}