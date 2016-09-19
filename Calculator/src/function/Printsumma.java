package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Printsumma implements ActionListener {
	private JTextField numbers;
	private JTextField sign;
	private JTextField field;
	Integer number;
	Integer number2;

	public Printsumma(JTextField numbers, JTextField sign, JTextField textField) {
		this.numbers = numbers;
		this.sign = sign;
		this.field = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) throws NumberFormatException {
		if (sign.getText().equals("+")) {
			try {
				number = Integer.parseInt(numbers.getText());
				number2 = Integer.parseInt(field.getText());
				number += number2;
				field.setText(number.toString());
				System.out.println(number);
			} catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Wrong format!!");
			}

		} else if (sign.getText().equals("-")) {
			try {
				number = Integer.parseInt(numbers.getText());
				number2 = Integer.parseInt(field.getText());
				number -= number2;
				field.setText(number.toString());
			} catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Wrong format!!");
			}

		} else if (sign.getText().equals("/")) {
			try {
				number = Integer.parseInt(numbers.getText());
				number2 = Integer.parseInt(field.getText());
				if(number2!=0){
					number /= number2;
					field.setText(number.toString());	
				}else{
					JOptionPane.showMessageDialog(null, "You can not divide by zero");
				}
				
			} catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Wrong format!!");
			}

		} else if (sign.getText().equals("*")) {
			try {
				number = Integer.parseInt(numbers.getText());
				number2 = Integer.parseInt(field.getText());
				number *= number2;
				field.setText(number.toString());
			} catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Wrong format!!");
			}

		} else {
			System.out.println("No matches found!!");
		}

	}

}
