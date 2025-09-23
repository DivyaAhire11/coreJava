import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
       Label l1,l2,l3;
         TextField tf1,tf2,tf3;
         Button b1,b2,b3,b4;
      MyFrame(){
        // super("This Is my Frame"); 
        setTitle("MyFrame");
        setLocation(400,200);
        setSize(400,400); 
        // setBackground(Color.pink);
       
         setLayout(new FlowLayout());
       
        
         //create
         l1 = new Label("First Number : ");
         l2 = new Label("Second Number : ");
         l3 = new Label("Result : ");
         tf1 = new TextField(20);
         tf2 = new TextField(20);
         tf3 = new TextField(20);
         tf3.setEditable(false);
         b1 = new Button("ADD");
         b2 = new Button("SUB");
         b3 = new Button("MUL");
         b4 = new Button("DIV");

          //add
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
       
        setVisible(true);
      
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
         tf3.setText(""+c);// set output as a String
      }
}

class TestFrame{
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
    }
}