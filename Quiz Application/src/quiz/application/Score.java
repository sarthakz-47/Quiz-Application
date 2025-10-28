
package quiz.application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
	JButton Playagain, close;
    Score(String name, int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(800,650);
        setLocation(370,90);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        //Thanking
       JLabel heading = new JLabel("Thank you "+name+" for playing Simple Minds :)");
       heading.setBounds(20, 50, 800, 45);
       heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
       heading.setForeground(Color.darkGray);
       add(heading);
       //Display score
       JLabel FScore = new JLabel("Your score is "+score);
       FScore.setBounds(490, 250, 200, 45);
       FScore.setFont(new Font("Tahoma", Font.BOLD, 22));
       FScore.setForeground(Color.darkGray);
       add(FScore);
       //play again
       Playagain = new JButton("Play Again");
       Playagain.setBounds(450, 310, 100, 30);
       Playagain.setBackground(new Color(30,144,254));
       Playagain.setForeground(Color.WHITE);
       Playagain.addActionListener(this);
       add(Playagain);
       
       close = new JButton("Close");
       close.setBounds(620, 310, 90, 30);
       close.setBackground(new Color(30,144,254));
       close.setForeground(Color.WHITE);
       close.addActionListener(this);
       add(close);
       setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Playagain) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                setVisible(false);
                new Login(); // Reset to the login screen or restart quiz
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
