  /*****************************************************************************************
 * @class Tutorias1.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00  
 *****************************************************************************************/    
	
	
	
   import static javax.swing.JOptionPane.*;// el * nos dice que agrega todo
   public class Tutoria1//Nombre de la clase
   /*
   public class Tutoria1, el PUBLIC nos indca que es la clase princial del archivo Tutoria1.java 
   */
   {
      private  int a=0,suma=0;//private nos indica que estas variables se usan en este archivo y que ademas como estan al principio de los metodos se pueden inicializar y no borrar hasta terminar el programa
      private float b=0;// Lo mismo pero con diferente tipo de dato
      public void ingresar()
      /*
      Este metodo VOID no retorna nada, y solo se llama inregresar 
      aqui es donde se ingresa los datos 
      Ya sea de manera grafica o por consola
      Usando SWING
      */
      {
         a=Integer.parseInt(showInputDialog(null,"Ingrese un numero entero: "));
      	/*Seingrese un dato tipo entero y usando SHOWINPUTDIALOG como metodo de ingresion grafico*/
         b=Float.parseFloat(showInputDialog(null,"Ingrese un numero flotante: "));
      	/*Seingrese un dato tipo flotante y usando SHOWINPUTDIALOG como metodo de ingresion grafico*/
         System.out.println(a);
      	//Se ve si realmente se ingreso el dato usando SYSTEM.OUT.PRINT();
      }
      public void mostra()//Metodo de mostrar mensajes;
      {
         showMessageDialog(null,"Nuestro entero ingresado es: "+a);
      	//Usamos el SHOWMESSAGEDIALOG paramostrar el mensaje NULL es para ponerlo en medio de la pantalla
         showMessageDialog(null,"Nuestro fltante ingresado es: "+b);
      }
   	
      public int sumar(int dato)//Metodo que ingresa un dato y que retorna otro dato de tipo entero
      {
         suma=suma+dato;
      	//suma la variable sin perder datos, ya que fue declara al princio fuera del metodo
         return suma;
      	//Retorna la variable SUMA declarada al principio 
      }
      public static void main(String Arg[])//Metodo main, es el principal y el que hace que el programa funcione
      {
         Tutoria1 llamar=new Tutoria1();
      	//Constructor
      	//Los constructores solo se unan para los metodos que no sean estatico y para llamar otro metodo de otra clase
         int con=0;//Variable que envia el dato al metodo de sumar
         llamar.ingresar();
      	//metodo+constructor
         llamar.mostra();
      	//metodo+constructor
         for(int i=0;i<10;i++)//Este for nos permite agregar 10 datos y sumarlor
         {
            con=Integer.parseInt(showInputDialog(null,"Ingrese su entero numero"+(i+1)+" :"));
            showMessageDialog(null,"Nestra suma es: "+llamar.sumar(con));
         	                                        //aqui se llama al constructor sumar y al mismo momento le damos el dato, y al mismo momento lo suma y nos muestra el resultado
         }
        
      }
   }