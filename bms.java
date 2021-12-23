package javaapplication47;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Ambreen Fatima
 */
public class login extends JFrame implements ActionListener {

    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    
    login(){
        setFont(new Font("System", Font.BOLD,22));
        Font f= getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("Bank Management System");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad="";
        pad= String.format("%"+w+"s", pad);
        setTitle(pad+"Bank Management System");
        
        l1 = new JLabel("WELCOME TO BMS"
                + "");
        l1.setFont(new Font("Osward",Font.BOLD,38));
        
        l2 = new JLabel("Card no:");
        l2.setFont(new Font("Raleway",Font.BOLD,28));
        
        l3 = new JLabel("Pin:");
        l3.setFont(new Font("Osward",Font.BOLD,28));
        
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        b1= new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2= new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3= new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(150,50,450,200);
        add(l1);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        
        tf1.setFont(new Font("Arial", Font.BOLD,14));
        tf1.setBounds(300,235,230,30);
        add(tf1);
        
        pf2.setFont(new Font("Arial", Font.BOLD,14));
        pf2.setBounds(300,310,230,30);
        add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD,14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD,14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD,14));
        b3.setBounds(300,450,230,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750,600);
        setLocation(500,100);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b2)
            {
                tf1.setText("");
                pf2.setText("");
            }
            else if(e.getSource()==b3)
            {
               signUp sign=  new signUp();
               sign.setVisible(true);
               setVisible(false);
            }
        }catch(Exception ae){
            ae.printStackTrace();
            System.out.println("error:" +ae);
        }
    }
      public static void main(String[] args){
        new login().setVisible(true);
    }
    public class signUp extends JFrame implements ActionListener  {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JComboBox c1,c2,c3;
    JButton b;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    
    signUp(){
        
        setFont(new Font("System", Font.BOLD,22));
        Font f= getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("New ACCOUNT APPLICATION FROM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad="";
        pad= String.format("%"+w+"s", pad);
        setTitle(pad+"New ACCOUNT APPLICATION FROM");
        
        l1 = new JLabel("APPLICATION FORM NO. "+ first);
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        
        l2 = new JLabel("page 1: Personal Details ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        
        l3 = new JLabel("Name: ");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        
        l4 = new JLabel("Father's Name: ");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        
        l5 = new JLabel("Date of birth: ");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        
        l6 = new JLabel("Gender: ");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        
        l7 = new JLabel("Email Address: ");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        
        l8 = new JLabel("Marital Status: ");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        
        l9 = new JLabel("Address: ");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        
        l10 = new JLabel("City: ");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        
        l11 = new JLabel("Pin Code: ");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        
        l12 = new JLabel("State: ");
        l12.setFont(new Font("Raleway",Font.BOLD,20));

        l13 = new JLabel("Date: ");
        l13.setFont(new Font("Raleway",Font.BOLD,12));
        
        l14 = new JLabel("Month: ");
        l14.setFont(new Font("Raleway",Font.BOLD,12));
        
        l15 = new JLabel("Year: ");
        l15.setFont(new Font("Raleway",Font.BOLD,12));
    
        t1= new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD,14));
        
        t2= new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD,14));
        
        t3= new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD,14));
    
        t4= new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD,14));
        
        t5= new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD,14));
        
        t6= new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD,14));
        
        t7= new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD,14));
    
        b= new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("UnMarried");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD,14));
        r5.setBackground(Color.WHITE);
        
        String date[] = {"1","2","3","4","5","6","7","8","9"};
        c1= new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[] = {"Jan","Feb","Mar","APril","May","June","July","Augest","Sep","Oct","Nov","Dec"};
        c2= new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004"};
        c3= new JComboBox(year);
        c3.setBackground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(140,20,600,40);
        add(l1);
        
        l2.setBounds(290,70,600,30);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        t1.setBounds(300,140,400,30);
        add(t1);
        
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t2.setBounds(300,190,400,30);
        add(t2);
        
        l5.setBounds(100,240,200,30);
        add(l5);
        
        l13.setBounds(300,240,40,30);
        add(l13);
        
        c1.setBounds(340,240,60,30);
        add(c1);
        
        l14.setBounds(410,240,50,30);
        add(l14);
        
        c2.setBounds(460,240,100,30);
        add(c2);
        
        l15.setBounds(570,240,40,30);
        add(l15);
        
        c3.setBounds(610,240,90,30);
        add(c3);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5.setBounds(650,390,100,30);
        add(r5);
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        t4.setBounds(300,440,400,30);
        add(t4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        t5.setBounds(300,490,400,30);
        add(t5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        t6.setBounds(300,540,400,30);
        add(t6);
        
        l12.setBounds(100,590,200,30);
        add(l12);
        
        t7.setBounds(300,590,400,30);
        add(t7);
        
        b.setBounds(620,660,80,30);
        add(b);
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
            }
    public void actionPerformed(ActionEvent e) {
           try{
                signUp2 sign2 = new signUp2();
                sign2.setVisible(true);
                setVisible(false);
               
               
           } catch(Exception ex)
           {
               ex.printStackTrace();
            System.out.println("error:" +ex);
           }}
public class signUp2 extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3;
    JRadioButton r1,r2,r3,r4;
    JComboBox c1,c2,c3,c4,c5;
    JButton b;
    
    signUp2(){
        
        setFont(new Font("System", Font.BOLD,22));
        Font f= getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("New ACCOUNT APPLICATION FROM - PART 2");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad="";
        pad= String.format("%"+w+"s", pad);
        setTitle(pad+"New ACCOUNT APPLICATION FROM - PART 2");
        
        l1 = new JLabel("Page 2: Additional Details ");
        l1.setFont(new Font("Raleway",Font.BOLD,28));
        
        l2 = new JLabel("Religion");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        
        l3 = new JLabel("Category: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4 = new JLabel("Income: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5 = new JLabel("Educational: ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        
        l6 = new JLabel("Occupation: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        
        l11 = new JLabel("Qualification");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
        l7 = new JLabel("Insurance Number: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8 = new JLabel("NIC Number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9 = new JLabel("Senior Citizon: ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        
        l10 = new JLabel("Existing Account: ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
       
        l12 = new JLabel("form no: ");
        l12.setFont(new Font("Raleway",Font.BOLD,13));
        
        b= new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        t1= new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD,14));
        
        t2= new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD,14));
        
        t3= new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD,14));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        
        String religion[] = {"Muslim","Hindu","Sikh","Christan","other"};
        c1= new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2= new JComboBox(category);
        c2.setBackground(Color.WHITE);
        
        String income[] = {"null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3= new JComboBox(income);
        c3.setBackground(Color.WHITE);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4= new JComboBox(education);
        c4.setBackground(Color.WHITE);
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5= new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        
        setLayout(null);
        
        l12.setBounds(700,10,600,30);
        add(l12);
        
        t3.setBounds(760,10,60,30);
        add(t3);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        l3.setBounds(100,170,320,30);
        add(l3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        l5.setBounds(100,270,150,30);
        add(l5);
        
        c4.setBounds(350,270,320,30);
        add(c4);
        
        l11.setBounds(100,290,150,30);
        add(l11);
        
        l6.setBounds(100,340,150,30);
        add(l6);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        l7.setBounds(100,390,150,30);
        add(l7);
        
        t1.setBounds(350,390,320,30);
        add(t1);
        
        l8.setBounds(100,440,180,30);
        add(l8);
        
        t2.setBounds(350,440,320,30);
        add(t2);
        
        l9.setBounds(100,490,150,30);
        add(l9);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b.setBounds(570,600,100,30);
        add(b);
        
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
                signUp3 sign3 = new signUp3();
                sign3.setVisible(true);
                setVisible(false);
               
               
           } catch(Exception ex)
           {
               ex.printStackTrace();
            System.out.println("error:" +ex);
           }
    }}
public class signUp3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1,b2;
    
    signUp3(){
        
         setFont(new Font("System", Font.BOLD,22));
        Font f= getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("New ACCOUNT APPLICATION FROM - PART 3");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad="";
        pad= String.format("%"+w+"s", pad);
        setTitle(pad+"New ACCOUNT APPLICATION FROM - PART 3");
        
        l1 = new JLabel("Page 3: Account Details ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        l2 = new JLabel("Account Type");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        
        l3 = new JLabel("Card number: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4148: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5 = new JLabel("(your 16-digit card number ): ");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque  Book and Statements: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        
       
        
        l7 = new JLabel("Pin: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8 = new JLabel("XXXX: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9 = new JLabel("4-digit password: ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        
        l10 = new JLabel("Services Required: ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
       l11 = new JLabel("form no");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
         b1= new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2= new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBackground(Color.WHITE);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBackground(Color.WHITE);
        
        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBackground(Color.WHITE);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBackground(Color.WHITE);
        
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBackground(Color.WHITE);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        
        r1 = new JRadioButton("Saving Accounts");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        
         t1= new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD,12));
        
        setLayout(null);
        
        l11.setBounds(700,10,70,30);
        add(l11);
        
        t1.setBounds(770,10,40,30);
        add(t1);
        
        l1.setBounds(280,50,400,40);
        add(l1);
        
        l2.setBounds(100,140,200,30);
        add(l2);
        
        r1.setBounds(100,180,150,30);
        add(r1);
        
        r2.setBounds(350,180,300,30);
        add(r2);
        
        r3.setBounds(100,220,250,30);
        add(r3);
        
        r4.setBounds(350,220,250,30);
        add(r4);
        
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5.setBounds(100,330,200,20);
        add(l5);
        
        l6.setBounds(330,330,500,20);
        add(l6);
        
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8.setBounds(330,370,200,30);
        add(l8);
        
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10.setBounds(100,450,200,30);
        add(l10);
        
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4.setBounds(350,450,200,30);
        add(c4);
        
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7.setBounds(100,680,600,20);
        add(c7);
        
        b1.setBounds(300,720,100,30);
        add(b1);
        
        b2.setBounds(420,720,100,30);
        add(b2);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
        Random ran = new Random();
            
            long first7 = (ran.nextLong() % 90000000L)+ 5040936000000000L;
            long first8 = Math.abs(first7);
            
            long first3 = (ran.nextLong() % 9000L)+ 1000L;
            long first4 = Math.abs(first3);
        try{
            
            if(ae.getSource() ==b1)
            {
                JOptionPane.showMessageDialog(null,"Card number: " + first8 + "\n Pin: " + first4);
                
            }
            else if(ae.getSource() ==b2)
            {
                System.exit(0);
            }
               
           } catch(Exception ex)
           {
               ex.printStackTrace();
            System.out.println("error:" +ex);
           }}}}           }