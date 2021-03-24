import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

//I struggled on this lab i will be in class next Tuesday to go over this if that's okay??
public class Counter implements ActionListener {
  JLabel leftLabel, rightLabel;
  int leftCount;
  int rightCount;

  Counter(){

leftLabel = new JLabel("Left Label");
rightLabel = new JLabel("Right Label");


JFrame frame = new JFrame ("Let's Count");
frame.setLayout = (new FlowLayout());
frame.setSize(200,110);

JButton left = new JButton ("Left");
JButton right = new JButton ("Right");

leftCount = 0;
rightCount = 0;

left.addActionListener(this);
right.addActionListener(this);

frame.add(leftLabel);
frame.add(rightLabel);

JLabel leftLabel = new JLabel("Count " + leftLabel);
JLabel rightLabel = new JLabel("Count " + rightLabel);

JButton reset = new JButton ("Reset");
reset.addActionListener(this);
frame.add(reset);
frame.setVisible(true);
  }
public void actionPerformed (ActionEvent ae) {
  if (ae.getActionCommand().equals("Left"))
    (leftLabel++);
    leftLabel.setText("You pressed Left!");
  }
else if
    (ae.getActionCommand().equals("Right")){
    (rightLabel++);
      rightLabel.setText("You pressed Right!");
    }
  else if 
    (reset == 0);
          }