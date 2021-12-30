/*****************************************************************************************
 * @class Metodos.java
 * @author Fernando Manuel Avila Cataño 
 * @version 2.00 2012/10/11----2012/11/07
 *****************************************************************************************/
   import static javax.swing.JOptionPane.*;
   import java.io.*;                
   import java.util.Scanner;
   public class Metodos
   {
      public static int suma(int x,int y)
      {
         return x+y;
      }
      public static int restar(int x,int y)
      {
         return x+y;
      }
      public static int mayor(int a, int b)
      {
         int mayor=0;
         if(a==b || b==a)
         {
            showMessageDialog(null,"Son iguales");
         }
         else
         {
            if(a<b)
            { 
               mayor=b;
            }
            else
            {
               mayor=a;
            }
         }
         return mayor;
      }
      public static int plabras(String texto)
      {
         int p=0;
         String palabra="";
         for(int c=0;c<texto.length();c++)
         {
            if(!texto.substring(c,c+1).equals(" "))
            {
               palabra=palabra+texto.substring(c,c+1);
            }    
            else
            {
               if(!palabra.equals(""))
               {
                  p++;
                  palabra="";
               }
            }
            if(!palabra.equals(" "))
            {
               p++;
            }
         }
         return p;
      }
      public static int palabras2(String texto)
      {
         int index=0,p=0,index2=0;
         texto=texto.toUpperCase();
         String	a="A";
         if(texto.length()>0)
         {
            while(texto.indexOf(a)>-1)
            {
               texto=texto.substring(texto.indexOf(a)+a.length(),texto.length());
               p++;
               System.out.print(p);
            }  
         }
         else 
         {
            System.out.print("Error no hay palabras");
            showMessageDialog(null,"Error no hay palabras");
            p=0;
         }  	
         return p;
      } 
      public static void infi()
      {
         for(int i=0;i<=6000000;i++)
         {
            System.out.print(i+"\n");
         }
      }
      public static String vocales(String texto)
      { 
         String [] a_bucar={"A","E","I","O","U"};
         int index;
         int total=0,p[],deIndex[];
         p=new int [5];
         deIndex=new int[5];
         texto=texto.toUpperCase();
         String cadena="";
         for(int i=0;i<5;i++)
         {
            while ((index=texto.indexOf(a_bucar[i],deIndex[i]))>-1)
            {
               p[i]++;
               deIndex[i]=index+1;
               System.out.print(deIndex[i]);
               total++;
            }
         }
         cadena="\n El total de letras es \n A: "+p[0]+"\n E:"+p[1]+"\n I:"+p[2]+"\n O: "+p[3]+"\n U: "+p[4]+".";
         return cadena;                        
      }
      public static int vocales2(String texto)
      {//Resivir frase y sustiruir por letas con la letra elejida
         texto=texto.toUpperCase();
         int vocal=0; String vocales="AEIOU";
         for(int c=0;c<texto.length();c++)
            if(texto.charAt(c)=='A')
               vocal++;
         return vocal;
      }
      public static String vocales3(String texto,String cambiar,String newtex)
      {
         texto=texto.replace( cambiar,newtex ); 
         return texto;
      }
      public static int conversionBin(int binario)
      {
         String resul="";
         while(binario>=1)
         {
            resul=binario%2+resul;
            binario=binario/2;			  
         }
         System.out.print(resul);
         return binario;
      }
      public static int conversionDec(String deci)
      {
         int aux=0;
         int p=0;
         for(int c=deci.length()-1;c>=0;c--)
         {
            if(deci.charAt(c)=='1') /*int n=((int)deci.charAt(c))-48;*/          
            {  /*if(n==1)             Metodo 2       */
               aux=aux+(int)Math.pow(2,p);      
            }	
            p++;  
         }
         System.out.print(aux+"    ");
         return aux;
      }
      public static String conversionHex(int binario)
      {
         String resul="";
         int a=0;
         while(binario>=1)
         {
            a=binario%16;
            if(a>9)
            {        		
               if(a==10)	  
               {
                  resul="A"+resul;
               }
               if(a==11)
               {
                  resul="B"+resul;
               }
               if(a==12)
               {
                  resul="C"+resul;
               }
               if(a==13)
               {
                  resul="D"+resul;
               }
               if(a==14)
               {
                  resul="E"+resul;
               }
               if(a==15)
               {
                  resul="F"+resul;
               }
            }
            else
            {
               resul=binario%16+resul;            
            }
            binario=binario/16;
         }     
         System.out.print("El Hexadecimal es :"+resul+".");
         return resul;
      }
      public static String conversionHexd(String deci)
      { 
         int aux=0;
         int p=0;
         String conver="";
         deci=deci.toUpperCase();     	
         for(int c=deci.length()-1;c>=0;c--)
         { 
            if(deci.charAt(c)=='A')      
            {  
               aux=(aux+10)*(int)Math.pow(16,p);  				   
            }
            else if(deci.charAt(c)=='B')      
            {  
               aux=aux+11*(int)Math.pow(16,p);  			   
            }
            else if(deci.charAt(c)=='C')      
            {  
               aux=aux+12*(int)Math.pow(16,p);  					   
            }	
            else if(deci.charAt(c)=='D')      
            {  
               aux=aux+13*(int)Math.pow(16,p); 				   
            }
            else if(deci.charAt(c)=='E')      
            {  
               aux=aux+14*(int)Math.pow(16,p); 	 				   
            }	
            else if(deci.charAt(c)=='F')      
            {  
               aux=aux+15*(int)Math.pow(16,p);  			   
            }          
            else 
            {
               aux=aux+(((int)deci.charAt(c)-48)*(int)Math.pow(16,p));				 
            }
            p++;  
         }  
         conver=conver+aux;
         return conver;
      } 
      public static String conversionOcta(int octal)
      {
         String resul="";
         while(octal>=1)
         {
            resul=octal%8+resul;
            octal=octal/8;			  
         }
         return resul;
      }
      public static String conversionDeciOctal(String octal)
      { 
         int aux=0;
         int p=0;
         String conver="";	
         for(int c=octal.length()-1;c>=0;c--)
         { 
            if(octal.charAt(c)=='8' || octal.charAt(c)=='9')
            {
               conver="Error ingresastes un 8 o un 9.";
            }
            else
            {
               aux=aux+(((int)octal.charAt(c)-48)*(int)Math.pow(8,p));			
            }	 
            p++;  
         }  
         conver=conver+aux;
         return conver;
      }  	
      public static int conversionDeciOctal2(int octalI)
      { 
         String octal="";
         int conversion=0;
         int aux=0;
         int p=0;
         octal=Integer.toString(octalI);
         String conver="";	
         for(int c=octal.length()-1;c>=0;c--)
         { 
            if(octal.charAt(c)=='8' || octal.charAt(c)=='9')
            {
               conver="Error ingresastes un 8 o un 9.";
            }
            else
            {
               aux=aux+(
                  ((int)octal.charAt(c)-48)*(int)Math.pow(8,p));			
            }	 
            p++;  
         }  
         conver=conver+aux;
         conversion=Integer.parseInt(conver);
         return aux;
      }  
   /**************************************************************************************************************      
                                         		        Menu																                
   ***************************************************************************************************************/	    
      public static void main(String ar[])
      {
         Metodos lil=new Metodos();
         int t=1;  
         for(int l=0;l<t;l++)
         {
            String cad="";
            String op="";
            int num=0;
            int num2=0;
            int c=0;
            Object seleccion1 = showInputDialog(null,"Seleccion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "Mayor",
                  "Sumar","Contar Palaras","Contar Palaras2","Vocales","Vocales2","Vocales3",
                  "ConversionBin","ConversionDeci","ConversionHex","ConversionHexDecimal",
                  "conversionOctal","conversionDeciOctal","conversionDeciOctal2","Salir" }, "opcion 1");	
            op=(String)seleccion1; 
            switch(op)
            {
               case "Mayor":
                  num=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  num2=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  showMessageDialog(null,mayor(num,num2));
                  t++;
                  break;
               case "Sumar":
                  num=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  num2=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  showMessageDialog(null,suma(num,num2));
                  t++;
                  break;
               case "Restar":
                  num=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  num2=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
                  showMessageDialog(null,restar(num,num2));
                  t++;
                  break;
               case "Contar Palaras":
                  cad="cadena";
                  cad=showInputDialog(null,"Ingrese una cadena");
                  showMessageDialog(null,plabras(cad));
                  t++;
                  break;
               case "Contar Palaras2":
                  cad="";
                  cad=showInputDialog(null,"Ingrese una cadena");
                  showMessageDialog(null,"El numero de letras A en el texto: "+cad+". \n es el siguiente: "+palabras2(cad));
                  t++;
                  break;
               case "Vocales":
                  cad="";
                  cad=showInputDialog(null,"Ingrese una cadena");
                  showMessageDialog(null,"El numero de vocales en: "+cad+". \n es el siguiente. \n"+vocales(cad));
                  t++;
                  break;
               case "Vocales2":
                  cad="";
                  cad=showInputDialog(null,"Ingrese una cadena");
                  showMessageDialog(null,"El numero de vocales en: "+cad+". \n es el siguiente. \n"+vocales2(cad));
                  t++;
                  break;
               case "Vocales3":
                  cad="";
                  String cad2="",cad3="";
                  cad=showInputDialog(null,"Ingrese una cadena");
                  cad2=showInputDialog(null,"Ingrese la letra que desea quitar.");
                  cad3=showInputDialog(null,"Sustituir por:");
                  showMessageDialog(null,"El texto cambiado es el siguiente: \n"+vocales3(cad,cad2,cad3));
                  t++;
                  break;
               case"ConversionBin":
                  conversionBin(123);
                  t++;
                  break;     
               case"ConversionDeci":
                  String enviar="11011";
                  conversionDec(enviar);
                  t++;
                  break;         		
               case "Infi":
                  infi();
                  break;
               case"ConversionHex":
                  int a=Integer.parseInt(showInputDialog(null,"Ingrese el numero decimal: "));
                  showMessageDialog(null,"El Hexadecimal es: "+conversionHex(a)+", del decimal recivido: "+a+".");
                  t++;
                  break;    
               case"ConversionHexDecimal":
                  String b=showInputDialog(null,"Ingrese el numero HEXADECIMAL: ");
                  showMessageDialog(null,"El decimal es: "+conversionHexd(b)+", del hexadecimal recivido: "+b+".");
                  t++;
                  break;  			
               case "conversionOctal":
                  c=Integer.parseInt(showInputDialog(null,"Ingrese el numero Decimal: "));
                  showMessageDialog(null,"El numero octal es: "+conversionOcta(c)+" del decimal recibido: "+c+"."); t++;
                  break; 
               case "conversionDeciOctal":
                  cad=showInputDialog(null,"Ingrese el numero Octal: ");
                  showMessageDialog(null,"El numero decimal es: "+conversionDeciOctal(cad)+" del octal recibido: "+cad+".");						t++;
                  break;   
               case "conversionDeciOctal2":
                  c=Integer.parseInt(showInputDialog(null,"Ingrese el numero Octal: "));
                  showMessageDialog(null,"El numero decimal es: "+conversionDeciOctal2(c)+" del octal recibido: "+c+".");						t++;
                  break;        		
               case "Salir":                      
                  break;           		
            }
         }
      }
   }