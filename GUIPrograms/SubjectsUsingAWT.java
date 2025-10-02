import java.awt.*;
import java.awt.event.*;

class Subjects extends Frame implements ActionListener{
      Label l1;
      Checkbox cb[];
      Button b;
      TextField tf;
      Subjects(){
          setBounds(500,200,400,400);
          setTitle("Subjects GUI PROGRAM");
           setLayout(new FlowLayout());
          l1 = new Label("Choose Your Subjects");
          cb = new Checkbox[4];

          cb[0] = new Checkbox("PHP");
          cb[1]= new Checkbox("JAVA");
          cb[2]= new Checkbox("PYTHON");
          cb[3]= new Checkbox("C");

          b = new Button("OKK");
          tf = new TextField(20);
          tf.setEditable(false);

          add(l1);
         for(int i = 0;i<4;i++){
            add(cb[i]);
         }
          add(b);
          add(tf);

          b.addActionListener(this);
          
          setVisible(true);
        
      }
      public void actionPerformed(ActionEvent ae){
           String msg = "";
           for(int i=0;i<4;i++){
            if(cb[i].getState()){
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