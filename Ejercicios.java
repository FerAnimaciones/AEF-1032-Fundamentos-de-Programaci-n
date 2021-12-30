/*****************************************************************************************
 * @class Ejecicios.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.00 2012/10/11
 *****************************************************************************************/
   import static javax.swing.JOptionPane.*;
   import java.io.*;    
   import java.util.Random;            
   import java.util.Scanner;
   public class Ejercicios
   {
      public static void ejer1_1()
      {
         int n1=Integer.parseInt(showInputDialog("Ingrese un numero: \n")); 
         int n2=Integer.parseInt(showInputDialog("Ingrese un numero: \n"));   
         showMessageDialog(null,"La suma es: "+(n1+n2)+"\n La multiplicacion es: "+(n1*n2)+"\n La Resta es: "+(n1-n2));  
      }
      public static void ejer1_2()
      {
         double area=0,circ=0;
         float radio=Float.parseFloat(showInputDialog("Ingrese un numero: \n")); 
         area=Math.PI*Math.pow(radio,2);
         circ=2*Math.PI*radio;
         showMessageDialog(null,"La area es: "+area+"\n La circunferencia: "+circ);
      }
      public static void ejer1_3()
      {
         double can=Double.parseDouble(showInputDialog("Ingrese la catidad: \n")); 
         double con=can*11.96;
         showMessageDialog(null,"El resultado es: "+con);
      }
      public static void ejer1_4()
      {
         double eca=Double.parseDouble(showInputDialog("Ingrese la catidad: \n")); 
         double hec=(4047*eca)/10000;
         showMessageDialog(null,"La hectarea es: "+hec);
      }
      public static void ejer1_5()
      {
         int i=0;
         double tasa,inte,total=0;
         double md=Double.parseDouble(showInputDialog("Ingrese la catidad: \n")); 
         tasa=Double.parseDouble(showInputDialog("Ingrese la tasa: \n")); 
         while(i<=30)
         {
            inte=tasa/100;
            total=inte*md;
            i++;
         }
         showMessageDialog(null,"LEl total del mes es: "+total);
      }
      public static void ejer1_6()
      {
         double mon=0,enga=0,mensu=0;
         mon=Double.parseDouble(showInputDialog("Ingrese la catidad: \n")); 
         enga=(mon*35)/100;
         mensu=(mon-enga)/18;
         showMessageDialog(null,"La mensuaidad es: "+mensu);
      }
      public static void ejer1_7()
      {
         double mon=0,enga=0,mensu=0,interes=0;
         mon=Double.parseDouble(showInputDialog("Ingrese el costo: \n")); 
         enga=(mon*35)/100;
         mensu=(mon-enga)/36;
         interes=(mensu*12)/100;
         mensu=mensu-interes;
         showMessageDialog(null,"La mensuaidad es: "+mensu);
      }
      public static void ejer1_8()
      {
         double r=0,a=0,g=0,ab=0,al=0,at=0,vol=0;;
         r=Double.parseDouble(showInputDialog("Ingrese el radio: \n")); 
         a=Double.parseDouble(showInputDialog("Ingrese la altura: \n")); 
         g=Double.parseDouble(showInputDialog("Ingrese la generatriz: \n")); 
         ab=Math.PI*Math.pow(r,2);
         al=Math.PI*r*g;
         at=ab+al;
         vol=(1/3)*ab*al;
         showMessageDialog(null,"Ab="+ab+" al="+al+" at="+at+" vol="+vol);   
      }
      public static void ejer1_9()
      { 
         double r=0,a=0,v=0;
         r=Double.parseDouble(showInputDialog("Ingrese el radio: \n"));
         a=4*Math.PI*Math.pow(r,2) ;
         v=(4/3)*Math.PI*Math.pow(r,3);
         showMessageDialog(null,"A ="+a+" v="+v);   
      }
      public static void ejer1_10()
      {
         double l=0,ab=0,al=0,at=0,v=0;
         l=Double.parseDouble(showInputDialog("Ingrese el radio: \n"));
         ab=Math.pow(l,2);
         al=4*Math.pow(l,2);
         at=6*Math.pow(l,2);
         v=Math.pow(l,3);
         showMessageDialog(null,"Ab ="+ab+" v="+v+" al"+al+" at"+at);   
      }
      public static void Distancia()//1.11
      {
         int x1,x2,x3,y1,y2,y3;
         double d1=0,d2=0,d3=0,p=0;
         x1=Integer.parseInt(showInputDialog("Ingrese Coordenads x1:"));
         y1=Integer.parseInt(showInputDialog("Ingrese Coordenads y1:"));
         x2=Integer.parseInt(showInputDialog("Ingrese Coordenads x2:"));
         y2=Integer.parseInt(showInputDialog("Ingrese Coordenads y2:"));
         x3=Integer.parseInt(showInputDialog("Ingrese Coordenads x3:"));
         y3=Integer.parseInt(showInputDialog("Ingrese Coordenads y3:"));
         d1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
         d2=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
         d3=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
         p=d1+d2+d3;
         showMessageDialog(null,"El perimetro es: "+p);
      }
      public static void ejer1_12()
      {
         int x1,x2,x3,y1,y2,y3;
         double area=0;
         x1=Integer.parseInt(showInputDialog("Ingrese Coordenads x1:"));
         y1=Integer.parseInt(showInputDialog("Ingrese Coordenads y1:"));
         x2=Integer.parseInt(showInputDialog("Ingrese Coordenads x2:"));
         y2=Integer.parseInt(showInputDialog("Ingrese Coordenads y2:"));
         x3=Integer.parseInt(showInputDialog("Ingrese Coordenads x3:"));
         y3=Integer.parseInt(showInputDialog("Ingrese Coordenads y3:"));
         area=(1/2)*Math.abs(x1*(y2-y3)+2*(y3-y1)+x3*(y1-y2));
         showMessageDialog(null,"El area es: "+area);
      }
      public static void ejer1_13()
      {
         float p,ap,al,ab, al2,at,vol;
         p=Integer.parseInt(showInputDialog("Ingrese base:"));
         ap=Integer.parseInt(showInputDialog("Ingrese apotema:"));
         al=Integer.parseInt(showInputDialog("Ingrese altura:"));
         ab=p*ap/2;
         al2=p*al;
         at=2*ab+al;
         vol=ab*al;
         showMessageDialog(null," Area de la base ="+ab+"\n El area lateral ="+al+"\n El area total ="+at+"\n El volumen es ="+vol);  
      }
      public static void ejer2_1()
      {
         double seno=0,coseno=0,tan=0;
         seno=Double.parseDouble(showInputDialog("Ingrese el seno: \n")); 
         while(coseno==0)
         {
            coseno=Double.parseDouble(showInputDialog("Ingrese el coseno: \n")); 
            if(coseno==0)
            {
               showMessageDialog(null,"Ingrese un coseno libre de 0.");
            }
         }
         tan=Math.sin(seno)/Math.cos(coseno);
         showMessageDialog(null,"La tangente es: "+tan);
      }
      public static void ejer2_2()
      {
         double seno=0,coseno=0,cot=0;
         coseno=Double.parseDouble(showInputDialog("Ingrese el coseno: \n")); 
         while(seno==0)
         {
            seno=Double.parseDouble(showInputDialog("Ingrese el seno: \n")); 
            if(seno==0)
            {
               showMessageDialog(null,"Ingrese un seno libre de 0.");
            }
         }
         cot=Math.cos(coseno)/Math.sin(seno);
         showMessageDialog(null,"La cotangente es:  "+cot);
      }		
      public static void ejer2_3()
      {
         float 	monto,total;
         showMessageDialog(null,"Descuento de 8% a toda compra mayor que 2500");
         float compra=Integer.parseInt(showInputDialog("Ingrese el precio de la compra"));
         if(compra>2500)
         {
            monto=compra*8/100;
            showMessageDialog(null,"Su descuento es: "+monto);
            total=compra-monto;
            showMessageDialog(null,"Su total a pagar: "+total);
         }
         else 
         {
            showMessageDialog(null,"Su total "+compra);
         }
      }
   		
      public static void ejer2_4()
      {
         float incremento,total;
         showMessageDialog(null,"Aumento de 15% si el sueldo es inferior a $1000 y 12% caso contrario");
         float sueldo=Integer.parseInt(showInputDialog("Ingrese el precio de la compra"));
         if(sueldo<1000)
         {
            incremento=sueldo*15/100;
            showMessageDialog(null,"Su aumento"+incremento);
            total=sueldo+incremento;
            showMessageDialog(null,"el aumento con 15% es "+total);
         } 
         else 
         {
            incremento=sueldo*12/100;
            showMessageDialog(null,"Su aumento "+incremento);
            total=sueldo+incremento;
            showMessageDialog(null,"el aumento con 12% es "+total);
         }      
      }
      public static void ejer2_5()
      {
         int a,b,c,d;
         double resultado1,resultado2;
         showMessageDialog(null,"Funcion2_5");
         a=Integer.parseInt(showInputDialog("Ingrese valor de A"));
         b=Integer.parseInt(showInputDialog("Ingrese el valor de B"));
         c=Integer.parseInt(showInputDialog("Ingrese el valor de C"));
         d=Integer.parseInt(showInputDialog("Ingrese el valor de D"));     
         resultado1=Math.sqrt(Math.pow(a-c,2)/d);
         resultado2=Math.sqrt(Math.pow(a-b,3)/d);
         showMessageDialog(null,"El resultado de la operacion A-C^2/D es ="+resultado1);
         showMessageDialog(null,"El resultado de la operacion A-B^3/D es ="+resultado2);
      }
      public static void ejer2_6()
      {
         float dist = Float.parseFloat(showInputDialog("Ingrese la distancia: "));
         float tiem = Float.parseFloat(showInputDialog("Ingrese los dias de estancia: "));
      
         double costo;
      	
         costo = (dist*2)*0.23;
         if ((tiem>7) && ((dist*2)>800))
            costo = costo*.7;
      		
         showMessageDialog(null,"Costo total: "+costo);
      
      }
   	
      public static void ejer2_7(){
         double sueldo = Integer.parseInt(showInputDialog("Ingrese el sueldo del trabajador: "));
      	
      	
         if (sueldo < 10000)
            sueldo = sueldo + (sueldo*.15);
      	
         if ((10000 <= sueldo) && (sueldo<= 15000))
            sueldo = sueldo + (sueldo*11);
      	
         if (sueldo>15000)
            sueldo = sueldo + (sueldo*.08);
      		
         showMessageDialog(null,"Sueldo total: "+sueldo);
      
      }
   	
      public static void ejer2_8(){
         int a = Integer.parseInt(showInputDialog("Valor uno"));
         int b = Integer.parseInt(showInputDialog("Valor dos"));
      
         if (a%b==0)
            showMessageDialog(null,b+" es divisible de: "+a);
         else
            showMessageDialog(null,b+" no es divisible"+a);
      
      
      
      }//funcion2.8
   
   
   	
      public static void ejer2_9()//Ejercicio 2.9 25/Octubre/2012 
      { // A unas horas de
         int n=Integer.parseInt(showInputDialog("Igrese el elevador o N: \n"));
         int a=Integer.parseInt(showInputDialog("Igrese la A: \n"));
         if(a==0)
         {  
            while(a==0)
            {
               showMessageDialog(null,"Error ingreso un 0 \n Vuelva a ingresar una cantidad. ");
               a=Integer.parseInt(showInputDialog("Igrese la A: \n"));
            }
         }
         double i=Math.pow(a,-n);
         double d=1/(Math.pow(a,n));
         if(i==d)
         {
            showMessageDialog(null,"La igualdad  se cumple  ");
         }
         else
         {
            showMessageDialog(null,"La igualdad no se cumple:  ");
         }
      }
      public static void esPrimo()
      {
         int n=Integer.parseInt(showInputDialog("Ingrese un numero: \n"));  
         int d=0,i=2;
         while(d==0 && i<Math.sqrt(n))
         {
            if(n%i==0)
            {
               d++;  
            }
            i++;
         }
         if(d==0)
         {
            showMessageDialog(null,n+", es primo");
         }
         else
         {
            showMessageDialog(null,n+",no es primo");
         }
      }
      public static void esPrimoIn()
      {
         String primo="",noprimo="";
         int n=Integer.parseInt(showInputDialog("Ingrese un rango: \n"));  
         for(int f=1;f<=n;f++)
         { 
            int d=0,i=2;
            while(d==0 && i<=Math.sqrt(f))
            {
               if(f%i==0)
               {
                  d++;   
               }
               i++;
            }
            if(d==0)
            {
               primo=primo+f+",";
            }
         }
         showMessageDialog(null,primo+"");
      }  
      public static void Serie()//3.5
      {//Redes neuronales leer index_number D: 
         int n;
         double s=0;
         String cad="S=";
         n=Integer.parseInt(showInputDialog("Ingrese el valor"));
         for(float i=1;i<=n;i++)
         {
            s=s+1/i;
         }
         showMessageDialog(null,"La sere es: "+s);
      	/*                   parte 2                   */
         s=0;
         for(float i2=1;i2<=n;i2++)
         {
            s=s+1/i2;
            cad=cad+" +1/"+i2+"";
         }
         showMessageDialog(null,"La serie es "+cad+" = "+s+".");     	
      }		
      public static void Empleado()//3.7
      {
         int n=0;   
      }	
      public static void ejer3_10()//3.10
      {
         double p=1;
         String cad="";
         double n=Double.parseDouble(showInputDialog("Ingrese un rango: \n"));  
         for(int i=1;i<=n;i++)
         {
            p=p*i;
            cad=cad+","+p;
         }
         showMessageDialog(null,"Esto:"+cad); 
      }	
      public static void ejer3_13()//3.13
      {// 22/Octubre/2012 ya cai con index_number :(
         int n1=0,n2=0,n3=0,n4=0;
         double n=0;
         do
         {
            n=Double.parseDouble(showInputDialog("Ingrese una calificacion: \n"));
            if(n<=10 && n>=8)
            {
               n1++;
            } 
            if(n<=7.99 && n>=6)
            {
               n2++;
            }
            if(n<=5.99 && n>=4)
            {
               n3++;
            }
            if(n<=3.99 && n>=0)
            {
               n4++;
            }
         }while(n!=-1);
         showMessageDialog(null,"Los rangos 0---3.99:  "+n4+"\n 4---5.99:  "+n3+"\n 6---7.99:   "+n2+" \n 8---10: "+n1+" \n Fin.");
      }
      public static void ejer3_20()// Ejercicio 3.20
      {
         int index_number=0;
         String NOM[] = new String[10];
         String DIR[] = new String[10];
         double REGINI[] = new double[10];
         double REGFIN[] = new double[10];
         double kvh[]= new double[10];
         double totap[]= new double[10];
         double totalf=0;
         NOM[index_number]=showInputDialog("Ingrese su nombre: \n"); 
         DIR[index_number]=showInputDialog("Ingrese su direccion: \n"); 
         REGINI[index_number]=Double.parseDouble(showInputDialog("Ingrese el ingreso inicial es de: \n"));
         REGFIN[index_number]=Double.parseDouble(showInputDialog("Ingrese el ingreso  final  es de: \n")); 
         kvh[index_number]=REGINI[index_number]+REGFIN[index_number];
         if(kvh[index_number]<=140)
         {
            totap[index_number]=35;
            totalf=35;
         }
         if(kvh[index_number]>140 && kvh[index_number]>=170)
         {
            totap[index_number]=35+kvh[index_number]*.98;
            totalf=35+kvh[index_number]*.98;
         }
         if(kvh[index_number]>310)	
         {
            totap[index_number]=35+170*.98+kvh[index_number]*0.67;
            totalf=35+170*.98+kvh[index_number]*0.67;
         }
         showMessageDialog(null,NOM[index_number]);
      	
      }
      public  void ejer3_30()//Ejercico 3.30
      { //24 Octubre del 2012
         double sen=0; double x; int numero; 
      	     
         x = Double.parseDouble(showInputDialog(null,"Ingrese la base: "));     
         System.out.println("Ingrese el numero de terminos:");       
         numero = Integer.parseInt(showInputDialog(null,"Ingrese el numero de terminos: ")); 
      
         int i=1; 
         while(i<=numero){
            int fact = 1;
            int j=1;
            while(j<=(1+(2*(i-1)))){
               fact= fact*j;
               j++;
            }
            if(i%2==0)
               sen = sen - (Math.pow(x,(1+(2*(i-1)))) /fact);    
            else
               sen = sen + (Math.pow(x,(1+(2*(i-1)))) /fact); 
            i++;
         }  
         showMessageDialog(null,"El seno de: " +x+ " es " +sen);
      	
      }
      public static void Numperfect()
      {
         int n=Integer.parseInt(showInputDialog("Ingrese un numero: \n")); 
         int d=0;
         for(int i=1;i<=(n/2);i++)
         {
            if(n%i==0)
            {
               d=d+i;
            }
         }
         if(d==n)
         {
            showMessageDialog(null,n+" El numero es perfecto"); 
         }
         else
         {
            showMessageDialog(null,n+" El numero no es perfecto"); 
         }    
      } 	
      public  void sumaDeNum()//Suma de un simple numero
      {// Roxy a perdido mi confianza por que weston la cago muy FEO 25/10/2012,pues aun esta index_number y B
         int suma=0;
         String cadena="";
         System.out.print("El valor de N es: ");
         for(int n=1;n<=10;n=n+1)
         {
            suma=suma+n;
            System.out.print(" "+suma+", ");
            if(n==10)
            {
               cadena=cadena+suma+".";
            }
            else
            {
               cadena=cadena+suma+"+";
            }
         }
         showMessageDialog(null,"La suma es: "+suma+"\n La serie de la suma es: "+cadena); 
      } 	
      public void ejer_3_41()
      {
         int anox=0,carry_y=0;
         int alum[][]=new int [10][5];
      }
   	
      public void ejer_3_42()
      {
         int x=0,n=00,k=0;
         Random r = new Random();
         int limite=2;     
         if(r.nextInt(limite+1)==1)
         {
            n=20;
         }
         else
         {
            n=484;
         }
         while(n>0)
         {
            k=n%10;
            x=x*10+k;
            n=n/10;
         }
         showMessageDialog(null,"X="+x);
      }
      public void ejer_3_43()
      {
         int n=11,i=0,r=0,d =0;
         i=2;
         while(i<=n)
         {
            if(i<4)
            {
               showMessageDialog(null,"I: "+i);
            }
            else
            {
               if(i%2!=0)
               {
                  r=1/2;
                  d=3;
                  while(d<=r &&(i%d)!=0)
                  {
                     d=d+2;
                  }
                  if(i%d!=0)
                  {
                     showMessageDialog(null,"I: "+i);
                  }
               }
            }
            i=i+i;
         }
      }
      public void ejer_3_44()
      {
         int n=5,i=0,p1=0,p2=0;
         if(n>0)
         {
            i=0;
            if(i<n)
            {
               p1=n-2*1;
               p2=i;
               while((p2+1)<=n && p1>=p2)
               {
                  showMessageDialog(null,"P1= "+p1+" P2="+p2+" I="+i);
                  p1=p1-1;
                  p2=p2+1;
               }
               i=i+1;
            }
         }
         else
         {
            showMessageDialog(null,"Error");
         }
      }	
   /**************************************************************************************************************
       
                                         		        Menu
   																  
   ***************************************************************************************************************/	
      public static void main(String ar[])
      {
         Ejercicios lil=new Ejercicios();
         int t=1;  
         for(int l=0;l<t;l++)
         {
            String op="";
            Object seleccion = showInputDialog(null,"Seleccione opcion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "PS 1", "PS 2", "PS 3","Salir" }, "opcion 1");	
            if(seleccion=="PS 1")
            {
               Object seleccion1 = showInputDialog(null,"Seleccione opcion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "PS 1.1", "PS 1.2", "PS 1.3","PS 1.4","PS 1.5","PS 1.6","PS 1.8","PS 1.9","PS 1.10","PS 1.11","PS 1.12","PS 1.13","Numero Perfecto","Es primo","Es primo2","Suma de numero","Volver" }, "opcion 1");	
               op=(String)seleccion1; 
            }
            if(seleccion=="PS 2")
            {
               Object seleccion2 = showInputDialog(null,"Seleccione opcion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "PS 2.1", "PS 2.2", "PS 2.3","PS 2.9","Volver" }, "opcion 2");	
               op=(String)seleccion2; 
            }
            if(seleccion=="PS 3")
            {
               Object seleccion3 = showInputDialog(null,"Seleccione opcion","Selector de opciones",QUESTION_MESSAGE,null,new Object[] { "PS 3.1", "PS 3.2", "PS 3.3","PS 3.5","PS 3.13","PS 3.20","PS 3.30","PS 3.42","PS 3.43","PS 3.44" ,"Volver"}, "opcion 3");
               op=(String)seleccion3; 	
            }     
            switch(op)
            {
               case "Es primo":
                  lil.esPrimo();
                  t++;
                  break;
               case "Es primo2":
                  lil.esPrimoIn();
                  t++;
                  break;
               case "PS 1.1":
                  lil.ejer1_1();
                  t++; 
                  break;
               case "PS 1.2":
                  lil.ejer1_2();
                  t++; 
                  break;
               case "PS 1.3":
                  lil.ejer1_3();
                  t++; 
                  break;
               case "PS 1.4":
                  lil.ejer1_4();
                  t++; 
                  break;
               case "PS 1.5":
                  lil.ejer1_5();
                  t++; 
                  break;
               case "PS 1.6":
                  lil.ejer1_6();
                  t++; 
                  break;
               case "PS 1.7":
                  lil.ejer1_7();
                  t++; 
                  break;
               case "PS 1.8":
                  lil.ejer1_8();
                  t++; 
                  break;
               case "PS 1.9":
                  lil.ejer1_9();
                  t++; 
                  break;
               case "PS 1.10":
                  lil.ejer1_10();
                  t++; 
                  break;							
               case "PS 1.11":
                  lil.Distancia();
                  t++;
                  break;	
               case "PS 1.12":
                  lil.ejer1_12();
                  t++; 
                  break;
               case "PS 1.13":
                  lil.ejer1_13();
                  t++; 
                  break;										
               case "PS 2.1":
                  lil.ejer2_1();
                  t++; 
                  break;
               case "PS 2.2":
                  lil.ejer2_2();
                  t++; 
                  break;
               case "PS 2.9":
                  lil.ejer2_9();
                  t++; 
                  break;
              /* case 4:
                  lil.Empleado();
                  t++;
                  break;*/
               case "PS 3.5":
                  lil.Serie();
                  t++;
                  break;
               case "PS 3.10":
                  lil.ejer3_10();
                  t++;
                  break;
               case "PS 3.13":
                  lil.ejer3_13();
                  t++;
                  break;
               case "PS 3.20":
                  lil.ejer3_20();
                  t++;
                  break;
               case "PS 3.30":
                  lil.ejer3_30();
                  t++;
                  break;
               case "PS 3.42":
                  lil.ejer_3_42();
                  t++;
                  break;
               case "PS 3.43":
                  lil.ejer_3_43();
                  t++;
                  break;
               case "PS 3.44":
                  lil.ejer_3_44();
                  t++;
                  break;
               case "Numero Perfecto":
                  Numperfect();
                  t++;
                  break;
               case "Suma de numero":
                  lil.sumaDeNum();
                  t++;
                  break;
               case "Volver":
                  t++;
                  break;
            }
         }
      }
   }