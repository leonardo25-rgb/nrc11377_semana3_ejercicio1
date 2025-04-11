package ejer1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(42, 29, 87, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número");
			lblNewLabel_1.setBounds(42, 54, 99, 29);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número (opcional)");
			lblNewLabel_2.setBounds(42, 94, 125, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(190, 26, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(190, 58, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(190, 91, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Suma 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(360, 29, 138, 36);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Suma 3 enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(360, 90, 138, 36);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Suma 2 reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(360, 151, 138, 36);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(42, 138, 250, 112);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Verificando");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		Calculadora c = new Calculadora(n1,n2);
		txtS.setText("");
		txtS.append("La suma es: " + c.Sumar(n1, n2));
	}catch (Exception e2) {
		JOptionPane.showMessageDialog(this,"Ingrese números enteros");
	}
	
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			txtS.setText("");
			Calculadora c = new Calculadora(n1,n2,n3);
			txtS.append("La suma es: " + c.Sumar(n1, n2, n3));
		}catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese números enteros");
		}
	}
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(txtN1.getText());
			double num2 = Double.parseDouble(txtN2.getText());
			Calculadora c = new Calculadora(num1,num2);
			txtS.setText("");
			txtS.append("La suma es: " + c.Sumar(num1, num2));
		}catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese números reales");
		}
	}
}
