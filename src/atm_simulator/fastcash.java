
package atm_simulator;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class fastcash extends JFrame implements ActionListener{

    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JTextField t1;
    
    fastcash(){
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("FAST CASH");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"FAST CASH");
    
        
        
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD, 38));
        
        l2 = new JLabel("Enter PIN");
        l2.setFont(new Font("System", Font.BOLD, 13));
        
        t1 = new JTextField();
        t1.setFont(new Font("System", Font.BOLD, 13));
    
       
        b1 = new JButton("Rs 100");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("Rs 500");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("Rs 1000");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("Rs 2000");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("Rs 5000");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("Rs 10000");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l2.setBounds(640,10,60,40);
        add(l2);
        
        t1.setBounds(710,10,60,40);
        add(t1);
        
        l1.setBounds(100,100,700,40);
        add(l1);
        
        b1.setBounds(40,250,300,60);
        add(b1);
        
        b2.setBounds(440,250,300,60);
        add(b2);
        
        b3.setBounds(40,360,300,60);
        add(b3);
        
        b4.setBounds(440,360,300,60);
        add(b4);
        
        b5.setBounds(40,470,300,60);
        add(b5);
        
        b6.setBounds(440,470,300,60);
        add(b6);
        
        b7.setBounds(240,600,300,60);
        add(b7);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(500,90);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
            try{        
           
            String a = t1.getText();
            double balence = 0;
            
            if(ae.getSource()==b1){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=100;
                        String q1= "insert into bank values('"+pin+"',null,100,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+100+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
            }
                
            
            else if(ae.getSource()==b2){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=500;
                        String q1= "insert into bank values('"+pin+"',null,500,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if(ae.getSource()==b3){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=1000;
                        String q1= "insert into bank values('"+pin+"',null,1000,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if(ae.getSource()==b4){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=2000;
                        String q1= "insert into bank values('"+pin+"',null,2000,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+2000+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if(ae.getSource()==b5){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=5000;
                        String q1= "insert into bank values('"+pin+"',null,5000,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if(ae.getSource()==b6){
                
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balence = rs.getDouble("balence");
                     
                        balence-=10000;
                        String q1= "insert into bank values('"+pin+"',null,10000,'"+balence+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully");
                    
                    new transactions().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
                
            
            else if(ae.getSource()==b7){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }

    
    public static void main(String[] args){
        new fastcash().setVisible(true);
    }
}
