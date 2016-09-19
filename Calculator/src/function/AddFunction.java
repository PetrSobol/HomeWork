package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddFunction implements ActionListener {
	private JTextField numbers;
	private JTextField sign;
	private JTextField printnumbers;
	private String signs;
   
	public AddFunction(JTextField text1, JTextField text2, JTextField text3, String signs) {
		this.numbers = text1;
		this.sign = text2;
		this.printnumbers = text3;
		this.signs = signs;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(printnumbers.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Do not number");
			
		}else{
			numbers.setText(printnumbers.getText());
			sign.setText(signs);
			printnumbers.setText("");
		}
		
		
	}

}
