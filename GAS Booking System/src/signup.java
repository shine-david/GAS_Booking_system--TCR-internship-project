import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class signup extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JRadioButton r1,r2;
    JButton b,b1;
    JDateChooser dateChooser;

    signup(){
        setTitle("NEW CONNECTION APPLICATION FORM");

        l1 = new JLabel("NEW CONNECTION ");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(230,20,600,40);
        add(l1);

        l2 = new JLabel("Enter Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(340,80,600,30);
        add(l2);

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100,140,100,30);
        add(l3);

        l4 = new JLabel("Consumer No (6-digit):");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100,190,200,30);
        add(l4);

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100,240,200,30);
        add(l5);

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100,290,200,30);
        add(l6);

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100,340,200,30);
        add(l7);

        l8 = new JLabel("Phone Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100,390,200,30);
        add(l8);

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100,440,200,30);
        add(l9);

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100,490,200,30);
        add(l10);

        l11 = new JLabel("State:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100,540,200,30);
        add(l11);

        l12 = new JLabel("Pin Code:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(100,590,200,30);
        add(l12);

        l13 = new JLabel("Password:");
        l13.setFont(new Font("Raleway", Font.BOLD, 20));
        l13.setBounds(100,640,200,30);
        add(l13);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(300,140,400,30);
        add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(300,190,400,30);
        add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        t3.setBounds(300,340,400,30);
        add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        t4.setBounds(300,390,400,30);
        add(t4);

        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        t5.setBounds(300,440,400,30);
        add(t5);

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        t6.setBounds(300,490,400,30);
        add(t6);

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        t7.setBounds(300,540,400,30);
        add(t7);

        t8 = new JTextField();
        t8.setFont(new Font("Raleway", Font.BOLD, 14));
        t8.setBounds(300,590,400,30);
        add(t8);

        t9 = new JTextField();
        t9.setFont(new Font("Raleway", Font.BOLD, 14));
        t9.setBounds(300,640,400,30);
        add(t9);

        b = new JButton("Submit");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(570,700,120,30);
        add(b);
        b.addActionListener(this);


        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(200,700,80,30);
        add(b1);
        b1.addActionListener(this);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(340,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        String cname = t1.getText();
        String cid = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String email = t3.getText();
        String phone = t4.getText();
        String address = t5.getText();
        String city = t6.getText();
        String state = t7.getText();
        String pincode = t8.getText();
        String pass = t9.getText();

        try{
            if (ae.getSource() == b1) {
                setVisible(false);
                new login().setVisible(true);
            }
            else if(ae.getSource()==b) {
                if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("")
                || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("") || t8.getText().equals("")
                || t9.getText().equals("") || dob.equals("") || gender.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c1 = new Conn();
                    String q1 = "insert into details values('" + cid + "','" + cname + "','" + gender + "','" + dob + "','" + email + "','" + phone + "','" + address + "','" + city + "','" + state + "','" + pincode + "')";
                    String q2 = "insert into login values('" + cid + "','" + pass + "')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "CONNECTION ADDED SUCCESSFULLY");
                    new login().setVisible(true);
                    setVisible(false);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new signup().setVisible(true);
    }
}