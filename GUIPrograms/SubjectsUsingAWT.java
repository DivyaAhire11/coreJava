import java.awt.*;

class Subjects extends Frame{
      Label l1;
      Checkbox cb1,cb2,cb3,cb4;
      Button b;
      TextField tf;
      Subjects(){
          setBounds(500,200,400,400);
          setTitle("Subjects GUI PROGRAM");
          setLayout(new FlowLayout());
          l1 = new Label("Choose Your Subjects");
          cb1 = new Checkbox("PHP");
          cb2 = new Checkbox("JAVA");
          cb3 = new Checkbox("PYTHON");
          cb4 = new Checkbox("C");
          b = new Button("OKK");
          tf = new TextField(20);
          tf.setEditable(false);

          add(l1);
          add(cb1);
          add(cb2);
          add(cb3);
          add(cb4);
          add(b);
          add(tf);

          setVisible(true);
      }
}
class TestMain{
    public static void main(String []args){
        Subjects s = new Subjects();
    }
}