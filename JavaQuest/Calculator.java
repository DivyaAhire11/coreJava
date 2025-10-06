import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//implements ActionListener
class Calculator extends JFrame{
     String msg = " ";
     int v1,v2,res;
     JTextField t1;
     JPanel p1,p2;
     JButton b[] = new JButton[10];
     JButton add,sub,mul,div,equal,clr;
     Calculator(){
          setBounds(300,100,400,500);
          setTitle("Calculator");
          setLayout(new BorderLayout());

          p1 = new JPanel();
          p2 = new JPanel();
         

          t1 = new JTextField(20);
          p1.add(t1);

          p2.setLayout(new GridLayout(5,4));
         
         for(int i=0;i<10;i++){
           b[i] = new JButton(""+i);
          }
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        clr = new JButton("C");
        equal = new JButton("=");

           
        for(int i=0;i<10;i++){
           p2.add(b[i]);
        }
        p2.add(add);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);
        p2.add(clr);
        p2.add(equal);

      
        // for(int i=0;i<16;i++){
        //     b[i].addActionListener(this);
        // }
        
          add(p1,BorderLayout.NORTH);
          add(p2);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
     }
/*
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("0")){
            t1.setText(t1.getText()+"0");
        }
        if(ae.getActionCommand().equals("1")){
            t1.setText(t1.getText()+"1");
        }
         if(ae.getActionCommand().equals("2")){
            t1.setText(t1.getText()+"2");
        }
         if(ae.getActionCommand().equals("3")){
            t1.setText(t1.getText()+"3");
        }
         if(ae.getActionCommand().equals("4")){
            t1.setText(t1.getText()+"4");
        }
         if(ae.getActionCommand().equals("5")){
            t1.setText(t1.getText()+"5");
        }
         if(ae.getActionCommand().equals("6")){
            t1.setText(t1.getText()+"6");
        }
         if(ae.getActionCommand().equals("7")){
            t1.setText(t1.getText()+"7");
        }
         if(ae.getActionCommand().equals("8")){
            t1.setText(t1.getText()+"8");
        }
         if(ae.getActionCommand().equals("9")){
            t1.setText(t1.getText()+"9");
        }
         if(ae.getActionCommand().equals("+")){
            t1.setText(t1.getText()+"+");
        }
         if(ae.getActionCommand().equals("-")){
            t1.setText(t1.getText()+"-");
        }
         if(ae.getActionCommand().equals("*")){
            t1.setText(t1.getText()+"*");
        }
         if(ae.getActionCommand().equals("/")){
            t1.setText(t1.getText()+"/");
        }
         if(ae.getActionCommand().equals(".")){
            t1.setText(t1.getText()+".");
        }
         if(ae.getActionCommand().equals("=")){
            String s = t.getText();
            if(s.charAt(0) == '-')
               s = "0".concat(t);

               String cno[] = s.split("[^0-9\\.]");
               float no[] = new float[cno.length];
               char op[] = new char[cno.lenth];

               for(int i=0;i<cno.length;i++){
                
               }
        }
     }
}
*/

}
class TestCalculator{
    public static void main(String args[]){
        new Calculator();
    }
}