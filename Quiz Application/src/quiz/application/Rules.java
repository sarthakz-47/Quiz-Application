package quiz.application;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //to add text
        JLabel heading = new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(50, 20, 700, 45);
        heading.setFont(new Font("Bradley Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        //to add rules
        JLabel rules = new JLabel();
        rules.setBounds(30, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"        
        );
        start = new JButton("Start");
        start.setBounds(650, 520, 90, 25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        //back
        back = new JButton("back");
        back.setBounds(50, 520, 90, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        add(rules);
        setSize(800,650);
        setLocation(370,90);
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==start){
        new Quiz(name);
        setVisible(false);
    }else if(ae.getSource()==back){
        new Login();
        setVisible(false);
    }
}
    
    public static void main(String[] args){
        new Rules("User");
    }
}