package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by mmcalvarez on 11/2/2016.
 */
public class Calculator implements ActionListener{

    private static BigDecimal a ,b, result;  //used big decimal to apply quotients with remainders
    private static int op;  //indicator for what operation is used

    //used GUI form
    private JPanel panel;
    private JButton clearbtn;
    private JButton divbtn;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton plusbtn;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton minusbtn;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton mulbtn;
    private JButton btn0;
    private JButton dotbtn;
    private JButton equalsbtn;
    private JTextField textField1;

    public Calculator() {

        textField1.setFont(new Font("Verdana", Font.PLAIN, 12));
        equalsbtn.addActionListener(this);
        equalsbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        dotbtn.addActionListener(this);
        dotbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn0.addActionListener(this);
        btn0.setFont(new Font("Verdana", Font.PLAIN, 15));
        mulbtn.addActionListener(this);
        mulbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn3.addActionListener(this);
        btn3.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn2.addActionListener(this);
        btn2.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn1.addActionListener(this);
        btn1.setFont(new Font("Verdana", Font.PLAIN, 15));
        minusbtn.addActionListener(this);
        minusbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn6.addActionListener(this);
        btn6.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn5.addActionListener(this);
        btn5.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn4.addActionListener(this);
        btn4.setFont(new Font("Verdana", Font.PLAIN, 15));
        plusbtn.addActionListener(this);
        plusbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn9.addActionListener(this);
        btn9.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn8.addActionListener(this);
        btn8.setFont(new Font("Verdana", Font.PLAIN, 15));
        btn7.addActionListener(this);
        btn7.setFont(new Font("Verdana", Font.PLAIN, 15));
        divbtn.addActionListener(this);
        divbtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        clearbtn.addActionListener(this);
        clearbtn.setFont(new Font("Verdana", Font.PLAIN, 15));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            textField1.setText(textField1.getText().concat(btn1.getText()));
        }
        if(e.getSource() == btn2){
            textField1.setText(textField1.getText().concat(btn2.getText()));
        }
        if(e.getSource() == btn3){
            textField1.setText(textField1.getText().concat(btn3.getText()));
        }
        if(e.getSource() == btn4){
            textField1.setText(textField1.getText().concat(btn4.getText()));
        }
        if(e.getSource() == btn5){
            textField1.setText(textField1.getText().concat(btn5.getText()));
        }
        if(e.getSource() == btn6){
            textField1.setText(textField1.getText().concat(btn6.getText()));
        }
        if(e.getSource() == btn7){
            textField1.setText(textField1.getText().concat(btn7.getText()));
        }
        if(e.getSource() == btn8) {
            textField1.setText(textField1.getText().concat(btn8.getText()));
        }
        if(e.getSource() == btn9){
            textField1.setText(textField1.getText().concat(btn9.getText()));
        }
        if(e.getSource() == btn0){
            textField1.setText(textField1.getText().concat(btn0.getText()));
        }
        if(e.getSource() == dotbtn){
            textField1.setText(textField1.getText().concat(dotbtn.getText()));
        }
        if(e.getSource() == plusbtn){
            a = new BigDecimal(textField1.getText());
            op = 1;
            textField1.setText("");
        }
        if(e.getSource() == minusbtn){
            a = new BigDecimal(textField1.getText());
            op = 2;
            textField1.setText("");
        }
        if(e.getSource() == mulbtn){
            a = new BigDecimal(textField1.getText());
            op = 3;
            textField1.setText("");
        }
        if(e.getSource() == divbtn){
            a = new BigDecimal(textField1.getText());
            op = 4;
            textField1.setText("");
        }
        if(e.getSource() == equalsbtn){
            b = new BigDecimal(textField1.getText());
            switch (op){
                case 1: {
                    result = a.add(b);
                    break;
                }
                case 2: {
                    result = a.subtract(b);
                    break;
                }
                case 3: {
                    result = a.multiply(b);
                    break;
                }
                case 4 : {
                    result = a.divide(b, MathContext.DECIMAL32);    //7-digit decimal format
                    break;
                }
                default: result = new BigDecimal("0");
            }
            textField1.setText(result + "");
        }
        if(e.getSource() == clearbtn){
            clear();
        }
    }

    public void clear(){
        textField1.setText("");
        result = BigDecimal.ZERO;
        op = 0;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 430);
        frame.setVisible(true);
    }

}
