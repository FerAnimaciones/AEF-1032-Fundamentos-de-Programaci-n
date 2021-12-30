   /*****************************************************************************************
 * @class MenuMetodos.java
 * @author Fernando Manuel Avila Cataño 
 * @version 1.50 2012/11/12
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
      private JButton bot = new JButton( "Salir" ); private JButton bot1 = new JButton( "Suma" );  private JButton bot2 = new JButton( "Resta" );
      private JButton bot3 = new JButton( "Mayor" ); private JButton bot4 = new JButton( "Contar Palabras 1" );
      private JButton bot5 = new JButton( "Contar Palabras 2" ); private JButton bot6 = new JButton( "Vocales" );
      private JButton bot7 = new JButton( "Vocales2" ); private JButton bot8 = new JButton( "Vocales3" );
      private JButton bot9 = new JButton( "ConversionBin" ); private JButton bot10 = new JButton( "ConversionDeci" );
      private JButton bot11 = new JButton( "ConversionHex" );private JButton bot12 = new JButton( "ConversionHexDecimal" );
      private JButton bot13 = new JButton( "conversionOctal" );private JButton bot14 = new JButton( "conversionDeciOctal" );private JButton bot15 = new JButton( "conversionDeciOctal2" );
      private JButton bot16 = new JButton( "Arreglos" );
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
         bot1.setBounds(20,80,100,35);
         bot1.setActionCommand("Suma");
         bot1.addActionListener(poner);     
         bot2.setBounds(130,80,100,35);
         bot2.setActionCommand("Restar");
         bot2.addActionListener(poner);
         bot3.setBounds(239,80,100,35);
         bot3.setActionCommand("Mayor");
         bot3.addActionListener(poner);
         bot4.setBounds(350,80,100,35);
         bot4.setActionCommand("Contar Palaras");
         bot4.addActionListener(poner);
         bot5.setBounds(20,120,100,35);
         bot5.setActionCommand("Contar Palaras2");
         bot5.addActionListener(poner);
         bot6.setActionCommand("Vocales");
         bot6.addActionListener(poner);
         bot6.setBounds(130,120,100,35);
         bot7.setActionCommand("Vocales2");
         bot7.addActionListener(poner);
         bot7.setBounds(239,120,100,35);
         bot8.setActionCommand("Vocales3");
         bot8.addActionListener(poner);
         bot8.setBounds(350,120,100,35);
         bot9.setActionCommand("ConversionBin");
         bot9.addActionListener(poner);
         bot9.setBounds(20,160,100,35);      	
         bot10.setActionCommand("ConversionDeci");
         bot10.addActionListener(poner);
         bot10.setBounds(130,160,100,35);
         bot11.setActionCommand("ConversionHex");
         bot11.addActionListener(poner);
         bot11.setBounds(239,160,100,35);
         bot12.setActionCommand("ConversionHexDecimal");
         bot12.addActionListener(poner);
         bot12.setBounds(350,160,100,35);
         bot13.setActionCommand("conversionOctal");
         bot13.addActionListener(poner);
         bot13.setBounds(20,200,100,35);
         bot14.setActionCommand("conversionDeciOctal");
         bot14.addActionListener(poner);
         bot14.setBounds(130,200,100,35);
         bot15.setActionCommand("conversionDeciOctal");
         bot15.addActionListener(poner);
         bot15.setBounds(239,200,100,35);
         bot16.setActionCommand("      ");
         bot16.addActionListener(poner);
         bot16.setBounds(350,200,100,35);
         cont.add(bot1); cont.add(bot2); cont.add(bot3);
         cont.add(bot4); cont.add(bot5); cont.add(bot6);
         cont.add(bot7); cont.add(bot8); cont.add(bot9);
         cont.add(bot10);cont.add(bot11);cont.add(bot12);
         cont.add(bot13);cont.add(bot14);cont.add(bot15);
         cont.add(bot16);
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
         Metodos meto=new Metodos();
         public void actionPerformed(ActionEvent e)
         { 
            String metodosB[] = 
               {
                  "Suma","Restar","Mayor","Contar Palaras","Contar Palaras2",
                  "Vocales","Vocales2","Vocales3","ConversionBin","ConversionDeci",
                  "ConversionHex","ConversionHexDecimal","conversionOctal","conversionDeciOctal",
                  "conversionDeciOctal2"	
                  };
            String metodosL[] = 
               {
                  "Sumar","Restar","Mayor","Contar Palaras","Contar Palaras2",
                  "Vocales","Vocales2","Vocales3","ConversionBin","ConversionDeci",
                  "ConversionHex","ConversionHexDecimal","conversionOctal","conversionDeciOctal",
                  "conversionDeciOctal2"	
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
                     meto.Men(metodosL[i]);
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