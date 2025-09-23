import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Subjects extends JFrame implements ActionListener{
      JLabel l1;
      JCheckBox cb[];
      JButton b;
      JTextField tf;
      Subjects(){
          setBounds(500,200,400,400);
          setTitle("Subjects GUI PROGRAM");
          setLayout(new FlowLayout());
          l1 = new JLabel("Choose Your Subjects");
          cb = new JCheckBox[4]; //array of 4 checkbox

          cb[0] = new JCheckBox("PHP");
          cb[1]= new JCheckBox("JAVA");
          cb[2]= new JCheckBox("PYTHON");
          cb[3]= new JCheckBox("C");

          b = new JButton("OKK");
          tf = new JTextField(20);
          tf.setEditable(false);

          add(l1);
         for(int i = 0;i<4;i++){
            add(cb[i]);
         }
          add(b);
          add(tf);

          b.addActionListener(this);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
      }
      public void actionPerformed(ActionEvent ae){
           String msg = "";
           for(int i=0;i<cb.length;i++){
            if(cb[i].isSelected()){
               msg += cb[i].getLabel();
              }
           }
           
          tf.setText(msg);
      }
}
class TestMain{
    public static void main(String []args){
        Subjects s = new Subjects();
    }
}