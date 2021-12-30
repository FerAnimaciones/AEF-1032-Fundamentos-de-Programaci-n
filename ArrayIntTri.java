 /*****************************************************************************************
 * @class ArrayIntTri.java
 * @author Fernando Manuel Avila Cataño 
 * @version 2.00 2012/11/28 10:33 am
 *****************************************************************************************/  
   import static javax.swing.JOptionPane.*; //PROMIDO HOJA POR HOJA/RENGLON POR RENGLON
   import java.io.*;          
   import java.util.Scanner;
   import javax.swing.Icon;
   import javax.swing.ImageIcon;   
   public class ArrayIntTri
   {  
      private Icon icono=new ImageIcon("logo.png"); 
      private int a[][][];
      private int tam=0,tam2=0,tam3=0;
      public void leer()
      {
         Object aux;
         int index_number=0;
         tam=Integer.parseInt(showInputDialog(null,"Numero de renglones: "));
         tam2=Integer.parseInt(showInputDialog(null,"Numero de columnas: "));
         tam3=Integer.parseInt(showInputDialog(null,"Numero de paginas: "));
         this.a=new int [tam3][tam][tam2];
         for(int z=0;z<tam3;z++)//Pagina
         {      
            for(int x=0;x<tam;x++)//Fila
            {
               for(int y=0;y<tam2;y++)//Columna
               {
                  aux=showInputDialog(null,"Ingrese el numero en renglon #"+(x+1)+" en la columna #"+(y+1)+", la pagina #"+(z+1)+" : \n","Ingrese un dato",PLAIN_MESSAGE,icono,null,null );
                  a[z][x][y]= Integer.parseInt(String.valueOf(aux));       
               }
            }
         }
      }
      public void mostrar()
      {
         String cad="";
         for(int z=0;z<tam3;z++)
         {
            cad=cad+"Pagina: #"+(z+1)+"\n";
            for(int x=0;x<tam;x++)
            {
               for(int y=0;y<tam2;y++)
               {
                  cad=cad+(a[z][x][y])+" ";
               }
               cad=cad+"\n";
            }
            cad=cad+"\n";
         }
         showMessageDialog(null,"El arreglo es:\n"+cad,"",PLAIN_MESSAGE,icono);
         System.out.println(cad);
      
      }
      public void mostrar2()
      {
         String cad="";
         for(int z=0;z<tam3;z++)
         {
            cad=cad+"Pagina: #"+(z+1)+"\n";
            for(int x=0;x<tam;x++)
            {
               for(int y=0;y<tam2;y++)
               {
                  cad=cad+(a[z][x][y])+" ";
               }
               cad=cad+"\n";
            }
            showMessageDialog(null,"El arreglo es:\n"+cad,"La Hoja es: "+(z+1),PLAIN_MESSAGE,icono);
            cad="";
            System.out.println(cad);
         }
      }
      public void mostrar3()//
      {
         String cad="";
         int z=0;
         for(int x=0;x<tam3;x++)
         {
            cad=cad+"Capa: #"+(x+1)+"\n";
            for(z=0;z<tam2;z++)
            {
               for(int y=0;y<tam;y++)
               {
                  cad=cad+(a[z][x][y])+" ";            
               }
               cad=cad+"\n";
            }
            showMessageDialog(null,"La capa es arreglo es:\n"+cad,"La capa es: "+(x+1),PLAIN_MESSAGE,icono);
            cad="";
            System.out.println(cad);
         }
      }  
      public void mostrar4()//
      {
         String cad="";
         int z=0;
         for(int y=0;y<tam3;y++)
         {
            cad=cad+"Capa: #"+(y+1)+"\n";
            for(int x=0;x<tam2;x++)
            {
               for(z=0;z<tam;z++)
               {
                  cad=cad+(a[z][x][y])+" ";            
               }
               cad=cad+"\n";
            }
            showMessageDialog(null,"El renglon es arreglo es:\n"+cad,"La renglon es: "+(y+1),PLAIN_MESSAGE,icono);
            cad="";
            System.out.println(cad);
         }
      }  
      public void promRenglon()//
      {
         String cad="";
         double cont=0;
         int suma=0;
         int z=0;
         for(int x=0;x<tam3;x++)
         {
            cad=cad+"Capa: #"+(x+1)+"\n";
            for(z=0;z<tam2;z++)
            {
               for(int y=0;y<tam;y++)
               {
                 // cad=cad+(a[z][x][y])+" "; 
                  suma=suma+a[z][x][y];  
                  cont++;  
                  System.out.print(cont+" \n");   
                  System.out.print("La suma es: "+suma);      
               }
            }
            showMessageDialog(null,"El promedio es:\n"+(suma/cont),"La capa es: "+(x+1),PLAIN_MESSAGE,icono);
            cad="";
            suma=0;
            cont=0;
         }
      }
      public void promRenglon2()//
      {
         String cad="";
         double cont=0;
         int suma=0;
         int z=0;
         for(int y=0;y<tam3;y++)
         {
            cad=cad+"Capa: #"+(y+1)+"\n";
            for(z=0;z<tam2;z++)
            {
               for(int x=0;x<tam;x++)
               {
                  suma=suma+a[z][x][y];  
                  cont++;  
                  System.out.print(cont+" \n");   
                  System.out.print("La suma es: "+suma);      
               }
            }
            showMessageDialog(null,"El promedio es:\n"+(suma/cont),"La capa es: "+(y+1),PLAIN_MESSAGE,icono);
            cad="";
            suma=0;
            cont=0;
         }
      }  	  
      public int sumarArriba()
      {
         int suma=0;
         for(int z=0;z<tam3;z++)
         {
            for(int x=0;x<tam;x++)
            {
               suma=suma+(a[z][x][0]);
            }
         }
         return suma;
      }
      public void mostrarP()
      {
         String cad="";
         for(int y=0;y<tam3;y++)
         {
            for(int i=0;i<tam;i++)
            {
               for(int e=0;e<tam2;e++)
               {
                  if(a[y][i][e]%2==0)
                  {
                     cad=cad+"P ";
                  }
                  else
                  {
                     cad=cad+(a[y][i][e])+" ";
                  }
               }
               cad=cad+"\n";
            }
            cad=cad+"\n";
         }
         showMessageDialog(null,"El arreglo es:\n"+cad);
      }
   	
      public static void main( String args[] )
      {
         ArrayIntTri f=new ArrayIntTri();
         Icon icono2=new ImageIcon("logo.png"); 
         Object [] valores = {"respuesta1","respuesta2","respuesta3" }; 
         int t=1 , op=0;
         int bus2=0;
         for(int i=0;i<t;i++)
         {
            Object aux=(showInputDialog(null,
               "Ingrese una opcion: "/*\n 1)Ingresar tama�o arreglo \n 2) mostrar datos nombres \n 3)Menor \n 4)Mayor\n 5)Descendente \n 6)Ascendente \n"*/+" 9)Todas \n0) Salir ","Ingrese una opcion",PLAIN_MESSAGE,icono2,null,null)); 
            if (null==aux) 
            {
               t++;
            }     
            else if(aux.equals(""))
            {
               showMessageDialog(null,"Ingrese algo por favor. ","ERROR",ERROR_MESSAGE,icono2);
               t++;
            }   
            else
            {
               op = Integer.parseInt(String.valueOf(aux));      
               switch(op)
               {
                  case 1: 	
                     f.leer();
                     t++;
                     break;
                  case 2:
                     f.mostrar();
                     f.mostrar2();
                     t++;
                     break;
                  case 3:
                  //  f.mayor();
                     t++;
                     break;
                  case 4:
                  //  f.menor();
                     t++;
                     break;
                  case 5: 
                  // f.sumapar();
                     t++;
                     break;
                  case 6: 
                  // f.promedioPar();
                     t++;
                     break;
                  case 7: 
                  // f.promedioTodo();
                     t++;
                     break;
                  case 8: 
                     bus2=Integer.parseInt(showInputDialog(null,"Ingrese el elemento a buscar: "));
                  // f.eleB(bus2);
                     t++;
                     break;
                  case 9: 
                     f.leer();
                     f.mostrar();
                     f.mostrar2();
                     showMessageDialog(null,"La suma de la parte superior es: "+f.sumarArriba()+" ","",PLAIN_MESSAGE,icono2);
                     f.mostrar3();
                     f.promRenglon();
                     f.mostrar4();
                     f.promRenglon2();
                     f.mostrarP();
                     t++;
                     break;
                  case 10:
                     showMessageDialog(null,"La suma de la parte superior es: "+f.sumarArriba(),"",PLAIN_MESSAGE,icono2);         
                     t++;
                     break;
                  case 11:
                     f.promRenglon();
                     t++;
                     break;
                  default:
                     t++;
                     break;
                  case 0:
                     t=0;
                     break;
               }
            }
         }	
      }      
   }