import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends JFrame implements ActionListener{
      JLabel l1,l2,l3;
      JTextField tf1,tf2,tf3;
      JButton b1,b2,b3,b4;

      MyFrame2(){
        setTitle("Swing GUI");
        setBounds(400,100,400,400);
        setLayout(new FlowLayout());

        //Create Component
        l1 = new JLabel("Enter First Number ");
        l2 = new JLabel("Enter Second Number ");
        l3 = new JLabel("Result");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        tf3.setEditable(false);
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("DIV");

        //Add Component
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
      
        //Event
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
       
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent ae){
          int a,b,c=0;
          a = Integer.parseInt(tf1.getText());
          b = Integer.parseInt(tf2.getText());
          if(ae.getSource() == b1){
            c = a+b;
          }
          if(ae.getSource() == b2){
            c = a-b;
          }
          if(ae.getSource() == b3){
            c = a*b;
          }
          if(ae.getSource() == b4){
            c = a/b;
          }

          tf3.setText(""+c);
      }
}
class TestFrame2{
    public static void main(String args[]){
        MyFrame2 f = new MyFrame2();
    }
}