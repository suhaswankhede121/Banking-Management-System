
package atm_simulator;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ministatement extends JFrame implements ActionListener{
 
    JTable t1;
    JButton b1;
    String x[] = {"Deposit","Withdraw","Balance","customer_name","date"};
    String y[][] = new String[20][5];
    int i=0, j=0;
    
    ministatement(){
        super("Mini Statement");
        setSize(1200,650);
        setLocation(200,200);
        
        try{
            conn c1  = new conn();
            String s1 = "select * from bank";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
               
                y[i][j++]=rs.getString("deposite");
                y[i][j++]=rs.getString("withdrawn");
                y[i][j++]=rs.getString("balence");
                y[i][j++]=rs.getString("customer_name");
                y[i][j++]=rs.getString("date");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new ministatement().setVisible(true);
    }
    
}
