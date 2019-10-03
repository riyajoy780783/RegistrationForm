package swingExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingExample { 
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String s1;
		JFrame f = new JFrame();
		JButton b = new JButton("Login");
		final JTextField tf1 = new JTextField();
		final JTextField tf2 = new JTextField();
		final JTextField tf3 = new JTextField();
		final JTextField tf4 = new JTextField();
		final JTextField tf5 = new JTextField();
		final JTextField tf6 = new JTextField();
		final JTextField tf7 = new JTextField();
		
		 JLabel tfShow1 = new JLabel("First Name");
		 JLabel tfShow2 = new JLabel("Last Name");
		 JLabel tfShow3 = new JLabel("User Name");
		 JLabel tfShow4 = new JLabel("Password");
		 JLabel tfShow5 = new JLabel("Re-password");
		 JLabel tfShow6 = new JLabel("Mobile");
		 JLabel tfShow7 = new JLabel("Email");
		 
		 JLabel tfShow8 = new JLabel();
		 JLabel tfShow9 = new JLabel();
		 JLabel tfShow10 = new JLabel();
		 JLabel tfShow11 = new JLabel();
		 JLabel tfShow12 = new JLabel();
		 JLabel tfShow13 = new JLabel();
		 JLabel tfShow14 = new JLabel();
		 
		
		
		JLabel l1 = new JLabel("First Name");
		l1.setBounds(50, 50, 100, 30);
		tf1.setBounds(200, 50, 200, 30);
		
		JLabel l2 = new JLabel("Last Name");
		l2.setBounds(50, 100, 100, 30);
		tf2.setBounds(200, 100, 200, 30);
		
		JLabel l3 = new JLabel("User Name");
		l3.setBounds(50, 150, 100, 30);
		tf3.setBounds(200, 150, 200, 30);
		
		JLabel l4 = new JLabel("Password");
		l4.setBounds(50, 200, 100, 30);
		tf4.setBounds(200, 200, 200, 30);
		
		JLabel l5 = new JLabel("Re-Password");
		l5.setBounds(50, 250, 100, 30);
		tf5.setBounds(200, 250, 200, 30);
		
		JLabel l6 = new JLabel("Mobile");
		l6.setBounds(50, 300, 100, 30);
		tf6.setBounds(200, 300, 200, 30);
		
		JLabel l7 = new JLabel("Email");
		l7.setBounds(50, 350, 100, 30);
		tf7.setBounds(200, 350, 200, 30);
		
		tfShow1.setBounds(50, 450, 100, 30);
		tfShow2.setBounds(50, 480, 100, 30);
		tfShow3.setBounds(50, 510, 100, 30);
		tfShow4.setBounds(50, 540, 100, 30);
		tfShow5.setBounds(50, 570, 100, 30);
		tfShow6.setBounds(50, 600, 100, 30);
		tfShow7.setBounds(50, 630, 100, 30);
		
		tfShow8.setBounds(200, 450, 100, 30);
		tfShow9.setBounds(200, 480, 100, 30);
		tfShow10.setBounds(200, 510, 100, 30);
		tfShow11.setBounds(200, 540, 100, 30);
		tfShow12.setBounds(200, 570, 100, 30);
		tfShow13.setBounds(200, 600, 100, 30);
		tfShow14.setBounds(200, 630, 100, 30);
		
		b.setBounds(75,400,200,40);
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfShow8.setText(tf1.getText());
				tfShow9.setText(tf2.getText());
				tfShow10.setText(tf3.getText());
				tfShow11.setText(tf4.getText());
				tfShow12.setText(tf5.getText());
				tfShow13.setText(tf6.getText());
				tfShow14.setText(tf7.getText());
				
			}
		});
		
		f.add(b);
		f.add(tfShow8);f.add(tfShow9);f.add(tfShow10);f.add(tfShow11);f.add(tfShow12);f.add(tfShow13);f.add(tfShow14);
		f.add(tfShow1);f.add(tfShow2);f.add(tfShow3);f.add(tfShow4);f.add(tfShow5);f.add(tfShow6);f.add(tfShow7);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(tf7);
		f.setSize(500,750);
		f.setLayout(null);
		f.setVisible(true);//visibility of frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Deallocating the memory when it close

	}
	
	

}
