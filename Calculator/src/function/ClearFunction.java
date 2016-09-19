package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ClearFunction implements ActionListener {
	private JTextField textfield;

	public ClearFunction(JTextField textfield) {
		this.textfield = textfield;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
    textfield.setText("");
	}

}
