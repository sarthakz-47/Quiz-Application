/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz extends JFrame implements ActionListener{
    String[][] questions = new String[10][5];
    String[][] answers = new String[10][2];
    String[][] useranswers = new String[10][1];
    JLabel quesno, ques;
    JRadioButton bt1, bt2, bt3, bt4;
    ButtonGroup groupOptions;
    JButton next, lifeline, submit;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String name;
    Quiz(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(40,0,1453,823);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 380);
        add(image);
        //ques no
        quesno = new JLabel();
        quesno.setBounds(150, 420, 300, 45);
        quesno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(quesno);
        //ques
        ques = new JLabel();
        ques.setBounds(200, 420, 900, 45);
        ques.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(ques);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        //options
        bt1 = new JRadioButton();
        bt1.setBounds(250, 500, 500, 26);
        bt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt1.setBackground(Color.WHITE);
        add(bt1);
        bt2 = new JRadioButton();
        bt2.setBounds(250, 560, 500, 26);
        bt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt2.setBackground(Color.WHITE);
        add(bt2);
        bt3 = new JRadioButton();
        bt3.setBounds(250, 620, 500, 26);
        bt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt3.setBackground(Color.WHITE);
        add(bt3);
        bt4 = new JRadioButton();
        bt4.setBounds(250, 680, 500, 26);
        bt4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt4.setBackground(Color.WHITE);
        add(bt4);
        //group options(select option only once)
        groupOptions = new ButtonGroup();
        groupOptions.add(bt1);
        groupOptions.add(bt2);
        groupOptions.add(bt3);
        groupOptions.add(bt4);
        //next. lifeline and submit buttons
        next = new JButton("Next");
        next.setBounds(1130,500,160,40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 20));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1130,580,160,40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lifeline.setBackground(Color.BLUE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        submit = new JButton("Submit");
        submit.setBounds(1130,660,160,40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        //to set submit as disable for start questions
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        start(count);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            ans_given = 1;
            if (groupOptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupOptions.getSelection().getActionCommand();
            }
            //while quesno 10 appears submit bt should be enabled and next button should be disabled
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                bt2.setEnabled(false);
                bt3.setEnabled(false);
            } else {
                bt1.setEnabled(false);
                bt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else {
            ans_given = 1;
            if (groupOptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupOptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time left - "+timer+" Seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        if(timer>0){
            g.drawString(time, 1090, 480);
        }else{
            g.drawString("Times up!!", 1150, 480);
        }
        timer--;
        //to call timer again and again after 1sec
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){  //ans is selected before the times up
            ans_given = 0;
            timer = 15;
        }else if(timer<0){   //check if ans is selected or not and get value of ans selected
            timer = 15;
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { //submit button
                if (groupOptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupOptions.getSelection().getActionCommand();
                }
                
                for(int i=0; i<useranswers.length; i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { //next button
                if (groupOptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupOptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        if (count >= questions.length) { // Prevent ArrayIndexOutOfBoundsException
            return;
        }
        quesno.setText("" + (count + 1) +". ");
        ques.setText(questions[count][0]);
        bt1.setText(questions[count][1]);
        bt1.setActionCommand(questions[count][1]);
        bt2.setText(questions[count][2]);
        bt2.setActionCommand(questions[count][2]);
        bt3.setText(questions[count][3]);
        bt3.setActionCommand(questions[count][3]);
        bt4.setText(questions[count][4]);
        bt4.setActionCommand(questions[count][4]);
        
        groupOptions.clearSelection();
        
        if (count == questions.length - 1) {
            next.setEnabled(false);
            submit.setEnabled(true);
        } else {
            next.setEnabled(true);
            submit.setEnabled(false);
        }
    }
    
    public static void main(String[] args){
        new Quiz("user");
    }
}
