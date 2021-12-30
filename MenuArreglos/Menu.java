   /*****************************************************************************************
 * @class MenuArray.java
 * @author Fernando Manuel Avila Cataño 
 * @version 2.01 2012/11/12
 *****************************************************************************************/  
   import java.io.*;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.ImageIcon;
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JPanel;
   public class Menu extends JFrame
   {
      private JTextField campo1,campo2;  private JComboBox tra1=new JComboBox();  private JComboBox tra2=new JComboBox();	
      private JButton bot = new JButton( "Salir" ); private JButton bot1 = new JButton( "Arreglo String" );  private JButton bot2 = new JButton( "Arreglo Int" );
      private JButton bot3 = new JButton( "Arreglo float" ); private JButton bot4 = new JButton( "Arreglo Double" );
      private String orin="";
      public static void main( String args[] )
      { 
         Menu ventana = new Menu();
         ventana.setLocationRelativeTo(null);    
         ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   	
      }	 
      public Menu()
      {
         super("Ejercicios Java Clase Fundamentos de programacion");
         Container cont= getContentPane();
         cont.setLayout(null);
         Meto poner = new Meto();
         ImageLabel label = new ImageLabel(new ImageIcon(this.getClass().getResource(("/img/logo.png")))); 	
         this.setIconImage (new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
         label.setLocation(550,10);
         cont.add(label);                //20   130   239   350 
         bot.setBounds(670,30,100,50);
         bot.setActionCommand("Salir");
         bot.addActionListener(poner); 
         bot1.setBounds(20,80,120,35);
         bot1.setActionCommand("1");
         bot1.addActionListener(poner);     
         bot2.setBounds(150,80,120,35);
         bot2.setActionCommand("2");
         bot2.addActionListener(poner);
         bot3.setBounds(280,80,120,35);
         bot3.setActionCommand("3");
         bot3.addActionListener(poner);
         bot4.setBounds(410,80,120,35);
         bot4.setActionCommand("4");
         bot4.addActionListener(poner);
         cont.add(bot1); cont.add(bot2); cont.add(bot3);
         cont.add(bot4);
         cont.add(bot); //20   130   239   350 
         setSize(800,600);
         setVisible( true );
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         //setBackground(Color.BLACK);
         //g.fillRect(0,0,450,300);
         //g.drawRect(0,0,450,300);
         g.setColor(Color.BLACK);
         Font f= new Font("Arial",/*Font.BOLD*/+Font.PLAIN/*ITALIC*/,16/*18*/);
         g.setFont(f);
         g.drawString("Alumno: Fernando Manuel Avila Cataño ",30,60);
         g.drawString("Clase: Fundamentos de Programacion ",30,80);
         g.drawString("Instituto Tecnol�gico de Tepic ",30,100);
      }
      private class Meto implements ActionListener
      {
         ArrayString a1=new  ArrayString();
         ArrayInt a2=new  ArrayInt();
         ArrayFloat a3=new  ArrayFloat();
         ArrayDouble a4=new  ArrayDouble();
         public void actionPerformed(ActionEvent e)
         { 
            String metodosB[] = 
               {
                  "1","2","3","4"
                  };
            int t=(metodosB.length)-1;
            if(e.getActionCommand().equals("Salir"))
            { 
               System.exit(0); 
            } 
            else
            {
               for(int i=0;i<=t;i++)
               {  
                  if(e.getActionCommand().equals(metodosB[i]))
                  { 
                     if(metodosB[i]=="1")
                     {
                        a1.a4();
                     }
                     else if(metodosB[i]=="2")
                     {
                        a2.a3();
                     }
                     else if(metodosB[i]=="3")
                     {
                        a3.a2();
                     }
                     else if(metodosB[i]=="4")
                     {
                        a4.a1();
                     }
                  } 
               }
            }
         } 
      }  
      class ImageLabel extends JLabel 
      {
         public ImageLabel(String img)
         {
            this(new ImageIcon(img));
         }
         public ImageLabel(ImageIcon icon) 
         {
            setIcon(icon);
         // setMargin(new Insets(0,0,0,0));
            setIconTextGap(0);
         // setBorderPainted(false);
            setBorder(null);
            setText(null);
            setSize(icon.getImage().getWidth(null),icon.getImage().getHeight(null));
         }
      } 
   }