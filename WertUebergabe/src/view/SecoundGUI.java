package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SecoundGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblVorname2;
	private JTextField txt_Uebergabe;

	
	
	/**
	 * Create the frame.
	 */
	public SecoundGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVorname2 = new JLabel("Vorname:");
		lblVorname2.setBounds(21, 54, 126, 14);
		contentPane.add(lblVorname2);
		
		txt_Uebergabe = new JTextField();
		txt_Uebergabe.setBounds(108, 51, 86, 20);
		contentPane.add(txt_Uebergabe);
		txt_Uebergabe.setColumns(10);
		
		this.add(lblVorname2); 
		this.add(txt_Uebergabe); 
		
	}

	public void resetViw() {
		this.lblVorname2.setText("");
	}
	
	public String getEingabe() {
		return this.txt_Uebergabe.getText(); 
	}
	
}
