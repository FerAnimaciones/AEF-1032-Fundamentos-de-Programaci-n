   import  java.io.*;//class PanesEx.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012
   public class PanesEx
   {
      public void op1()
      {
         int seleccion = showOptionDialog(null,"Seleccione una opcion","Selector de opciones disponibles: ",YES_NO_CANCEL_OPTION,QUESTION_MESSAGE,null,new Object[] { "opcion 1", "opcion 2", "opcion 3" },"opcion 1");
         if (seleccion != -1)
         {
            showMessageDialog(null,"Usted Selecciono:  "+(seleccion+1)+".   Continua demostracion.");
         }
      }
      public void op2()
      {
         int choice = showOptionDialog(null,"�Deseas cerrar esta ventana?","�Salir?",YES_NO_OPTION,QUESTION_MESSAGE,null, null, null);
         if (choice == YES_OPTION)
         {
            showMessageDialog(null,"Saliendo de la demostracion. ");
            System.exit(0);
         }
         else
         {
            showMessageDialog(null,"Continuando con la demostracion. ");
         }
      }
      public void op3()
      {
         Object seleccion2 =showInputDialog(null,"Seleccione opcion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "Japon", "Mexico", "USA" },"opcion 1");      
         showMessageDialog(null,"Usted eligio: "+seleccion2);				
      }
      public void op4()
      {
         showMessageDialog(null,"Aviso de demostracion 1.");//Normal
         showMessageDialog(null,"Aviso de demostracion 2.","Mensajes",PLAIN_MESSAGE);//Plain 
         showMessageDialog(null,"Aviso de demostracion 3.","Mensajes",ERROR_MESSAGE);//Error  
         showMessageDialog(null,"Aviso de demostracion 4.","Mensajes",INFORMATION_MESSAGE);//information  
         showMessageDialog(null,"Aviso de demostracion 5.","Mensajes",WARNING_MESSAGE);//WARNING     
         showMessageDialog(null,"Aviso de demostracion 6.","Mensajes",QUESTION_MESSAGE);//QUESTION  
      }
      public void op5()
      {
         int confirmado = showConfirmDialog(null,"Te gusta Japon \n�Lo confirmas?");
         if (OK_OPTION == confirmado)
         {
            showMessageDialog(null,"Confirmacion."); 
         }
         else
         {
            showMessageDialog(null,"ok no te gusta."); 
         }
      }
      public void op6()
      {
         double num1,num2;
         num1=Double.parseDouble(showInputDialog(null,"Ingrese una cantidad:  ",QUESTION_MESSAGE));   
         num2=Double.parseDouble(showInputDialog(null,"Ingrese una cantidad:  ",QUESTION_MESSAGE));       
         showMessageDialog(null,"La suma total es:"+(num1+num2));
      }
      public static void main(String arg[])
      {
         PanesEx pane=new PanesEx();
         pane.op1();
         pane.op2();
         pane.op3();
         pane.op4();
         pane.op5();
         pane.op6();
      }  	
   }