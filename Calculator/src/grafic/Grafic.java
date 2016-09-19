package grafic;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import function.AddFunction;
import function.ClearFunction;
import function.Printsumma;

public class Grafic extends JFrame {
	private JPanel panel = new JPanel();
	private JTextField printsuma = new JTextField();
	private JButton summa = new JButton("=");
	private JButton minus = new JButton("-");
	private JButton add = new JButton("+");
	private JButton division = new JButton("/");
	private JButton multiplaction = new JButton("*");
	private JButton clear = new JButton("c");
	private JTextField informationNumbers = new JTextField();
	private JTextField informationSign = new JTextField();

	private void setFontButton(JButton button) {
        button.setFont(new Font("Dialog", Font.CENTER_BASELINE, 30));
	}

	public Grafic() {
		super("Калькулятор");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(printsuma, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		printsuma.setFont(new Font("Dialog", Font.CENTER_BASELINE, 25));
		panel.setLayout(new GridLayout(3, 2));
		panel.add(summa);
		panel.add(minus);
		panel.add(division);
		panel.add(multiplaction);
		panel.add(clear);
		panel.add(add);
		functiodAdd();
		setFontButton(add);
		setFontButton(clear);
		setFontButton(division);
		setFontButton(minus);
		setFontButton(multiplaction);
		setFontButton(summa);

	}

	private void functiodAdd() {

		clear.addActionListener(new ClearFunction(printsuma));
		add.addActionListener(new AddFunction(informationNumbers, informationSign, printsuma, "+"));
		minus.addActionListener(new AddFunction(informationNumbers, informationSign, printsuma, "-"));
		division.addActionListener(new AddFunction(informationNumbers, informationSign, printsuma, "/"));
		multiplaction.addActionListener(new AddFunction(informationNumbers, informationSign, printsuma, "*"));
		summa.addActionListener(new Printsumma(informationNumbers, informationSign, printsuma));

	}

}
