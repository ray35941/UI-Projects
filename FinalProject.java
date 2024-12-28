/*  CSCI 280
    Kai Ding
    Final Project
    This program is going to create a caculator that operates the basic methods (+,-,*,/)
*/
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;

class FinalProject extends JFrame implements ActionListener{


        // create panels.       
        JPanel panel1 = new JPanel(); // create panel for textbox.
        JPanel panel2 = new JPanel(); // create panel for the buttons.

        // create an output bar for the caculator.
        JTextField textbox = new JTextField();

        // create constructor. Define variables.
        public FinalProject(){
        this.createwindow();
        this.addButtons();
        this.create_textbox_for_outputs();
        }

        // Create the window for the calculator.
        public void createwindow(){
        this.setTitle("Calculator, the great tool!");
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        // Create the textbox to output the values.
        public void create_textbox_for_outputs(){
        this.textbox.setPreferredSize(new Dimension(200,40));
        panel1.add(textbox);
        panel1.setBackground(Color.green);
        this.add(panel1, BorderLayout.NORTH); // add textbox to the panel.
        }

        // Create Buttons.
        public void addButtons(){
        this.panel2.setLayout(new GridLayout(4,4));
        // create buttons for +, - , * , /, . , =, (-), %. And Make them show in the textbox when each of them is selected.
        JButton button1 = new JButton("+");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setForeground(Color.blue);
        button1.setBackground(Color.white);
        button1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button1);
        JButton button2 = new JButton("-");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setForeground(Color.blue);
        button2.setBackground(Color.white);
        button2.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button2);
        JButton button3 = new JButton("*");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setForeground(Color.blue);
        button3.setBackground(Color.white);
        button3.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button3);
        JButton button4 = new JButton("/");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setForeground(Color.blue);
        button4.setBackground(Color.white);
        button4.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button4);
        JButton button5 = new JButton("=");
        button5.addActionListener(this);
        button5.setFocusable(false);
        button5.setForeground(Color.blue);
        button5.setBackground(Color.white);
        button5.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button5);
        JButton button6 = new JButton(".");
        button6.addActionListener(this);
        button6.setFocusable(false);
        button6.setForeground(Color.blue);
        button6.setBackground(Color.white);
        button6.setFont(new Font("Times New Roman",Font.BOLD, 20));
        panel2.add(button6);

        JButton button20 = new JButton("%");
        button20.addActionListener(this);
        button20.setFocusable(false);
        button20.setForeground(Color.blue);
        button20.setBackground(Color.white);
        button20.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button20);
        JButton button19 = new JButton("(-)");
        button19.addActionListener(this);
        button19.setFocusable(false);
        button19.setForeground(Color.blue);
        button19.setBackground(Color.white);
        button19.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button19);

        // special operation for (-).
        button19.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double tempvalue = Double.parseDouble(textbox.getText());
                tempvalue  = 0 - tempvalue;
                textbox.setText(String.valueOf(tempvalue));
            }
        });

        // create buttons for 0~9.
        JButton button7 = new JButton("1");
        button7.addActionListener(this);
        button7.setFocusable(false);
        button7.setBackground(Color.white);
        button7.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button7);
        JButton button8 = new JButton("2");
        button8.addActionListener(this);
        button8.setFocusable(false);
        button8.setBackground(Color.white);
        button8.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button8);
        JButton button9 = new JButton("3");
        button9.addActionListener(this);
        button9.setFocusable(false);
        button9.setBackground(Color.white);
        button9.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button9);
        JButton button10 = new JButton("4");
        button10.addActionListener(this);
        button10.setFocusable(false);
        button10.setBackground(Color.white);
        button10.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button10);
        JButton button11 = new JButton("5");
        button11.addActionListener(this);
        button11.setFocusable(false);
        button11.setBackground(Color.white);
        button11.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button11);
        JButton button12 = new JButton("6");
        button12.addActionListener(this);
        button12.setFocusable(false);
        button12.setBackground(Color.white);
        button12.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button12);
        JButton button13 = new JButton("7");
        button13.addActionListener(this);
        button13.setFocusable(false);
        button13.setBackground(Color.white);
        button13.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button13);
        JButton button14 = new JButton("8");
        button14.addActionListener(this);
        button14.setFocusable(false);
        button14.setBackground(Color.white);
        button14.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button14);
        JButton button15 = new JButton("9");
        button15.addActionListener(this);
        button15.setFocusable(false);
        button15.setBackground(Color.white);
        button15.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button15);
        JButton button16 = new JButton("0");
        button16.addActionListener(this);
        button16.setFocusable(false);
        button16.setBackground(Color.white);
        button16.setFont(new Font("Times New Roman",Font.BOLD, 15));
        panel2.add(button16);

        // create delete and clear button.
        JButton button17 = new JButton("AC");
        button17.addActionListener(this);
        button17.setFocusable(false);
        button17.setForeground(Color.red);
        button17.setBackground(Color.white);
        button17.setFont(new Font("Times New Roman",Font.BOLD, 20));           // Clear Button.
        panel2.add(button17);
        button17.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textbox.setText("");
            }
        });


        JButton button18 = new JButton("C");
        button18.addActionListener(this);
        button18.setFocusable(false);
        button18.setForeground(Color.red);
        button18.setBackground(Color.white);
        button18.setFont(new Font("Times New Roman",Font.BOLD, 20));          // Delete Button.
        panel2.add(button18);
        button18.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String temp = textbox.getText();
                textbox.setText("");
                for (int i=0; i < temp.length() - 1; i++){
                    textbox.setText(textbox.getText() + temp.charAt(i));
                }
            }

        });

        

        this.add(panel2, BorderLayout.CENTER); // add buttons to the panel.
        }
        
        // Main Function.
        public static void main(String[] args){
            FinalProject calculator = new FinalProject();
            calculator.setVisible(true);
        }

        // Declaration of variables.
        String input1 = null;
        String operation = null;

        // Get the value, and make each button to work
        @Override
        public void actionPerformed(ActionEvent e){

            String chosenButton = e.getActionCommand();
            if (".0123456789".indexOf(chosenButton) != -1){
                this.textbox.setText(textbox.getText() + chosenButton);
                this.textbox.setHorizontalAlignment(textbox.RIGHT);
            }
            else if (chosenButton.matches("[\\+\\-*/(-)%]{1}")){
                operation = chosenButton;
                input1 = this.textbox.getText();
                this.textbox.setText(""); 
            }
            else if (chosenButton.equals("=")){
                Double value1 = Double.valueOf(input1);
                Double value2 = Double.valueOf(this.textbox.getText());
                Double result = 0.0;
                switch (operation){
                    case "+":

                    result = value1 + value2;
                        break;

                    case "-":
                    result = value1 - value2;
                        break;

                    case "*":
                    result = value1 * value2;
                        break;

                    case "%":
                    result = value1 % value2;
                        break;
                    
                    case "/":
                    if (value2 != 0){
                        result = value1 / value2;
                    }
                    // this.textbox.setText("Can not divide 0."); This line doesn't work as expected, so commented out.
                    System.out.println("can not divide by 0");
                    break;
                }
            this.textbox.setText(result.toString()); // Convert to String and show the value on the textbox.

            }

        }
        
}
    

