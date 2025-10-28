package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class Login extends JFrame implements ActionListener{
    JButton Rules, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        //To place an image on to screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        add(image);
        //to set the image layout (customize)
        setLayout(null);
        image.setBounds(0, 0, 600, 500);
        //to add text
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(770, 60, 300, 45);
        heading.setFont(new Font("Bradley Hand ITC", Font.BOLD, 40));
        //Set-Text-Color
        heading.setForeground(Color.BLUE);
        //Set-Text-Color(by creating obj)
        heading.setForeground(new Color(30,144,254));
        //to see which of the font families we can use
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fonts));
        //Get name
        JLabel name = new JLabel("Enter your name");
        name.setBounds(855, 150, 300, 20);
        name.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        add(name);
        //Set-Text-Color(by creating obj)
        name.setForeground(new Color(30,144,254));
        add(heading);
        //To add text-box
        tfname = new JTextField();
        tfname.setBounds(735,190,325,25);
        tfname.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        add(tfname);
        //Add buttons (back & rules)
        //rules
        Rules = new JButton("Rules");
        Rules.setBounds(735, 255, 90, 25);
        Rules.setBackground(new Color(30,144,254));
        Rules.setForeground(Color.WHITE);
        Rules.addActionListener(this);
        add(Rules);
        //back
        back = new JButton("back");
        back.setBounds(970, 255, 90, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        setSize(1200,500);
        setLocation(170, 150);
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}

