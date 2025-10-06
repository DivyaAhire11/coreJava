import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginException extends Exception{
    int cnt;
    LoginException(int cnt){
        this.cnt = cnt;
    }
}
class LoginFrame extends Frame implements ActionListener{
    Label l1,l2;
    TextField tf1,tf2;
    Button b1,b2;
    int cnt = 3;

    LoginFrame(){
        setBounds(100,100,300,300);
        setTitle("Login");
        setLayout(new GridLayout(3,2));

        l1 = new Label("User Name : ");
           add(l1);
        tf1 = new TextField(20);
           add(tf1);
        l2 = new Label("Password :");
           add(l2);
        tf2 = new TextField(20);
           add(tf2);
        b1 = new Button("Login");
           add(b1);
        b2 = new Button("Clear");
           add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        pack();
    }

        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
               try{
                  if(cnt > 0){
                     if(tf1.getText().equals(tf2.getText())){
                        JOptionPane.showMessageDialog(null,"Login SuccessFully!","Success",JOptionPane.INFORMATION_MESSAGE);
                        cnt = 3;
                     }else{
                        cnt--;
                        throw new LoginException(cnt);
                     }
                  
                   }else{
                     throw new LoginException(cnt);
                   }             

               }catch(LoginException le){
                  if(cnt == 0){
                    JOptionPane.showMessageDialog(null,"You have crossed your Limit!","Error",JOptionPane.ERROR_MESSAGE);
                
                  }else{
                    JOptionPane.showMessageDialog(null,"You have "+cnt+" Attempts remaining","warning",JOptionPane.WARNING_MESSAGE);
                  }
               }
                tf1.setText("");
                tf2.setText("");
             
            }
            if(ae.getSource() == b2){
                tf1.setText("");
                tf2.setText("");
                tf1.requestFocus();
            }
        }
  public static void main(String args[]){
       new LoginFrame();
  }
}
