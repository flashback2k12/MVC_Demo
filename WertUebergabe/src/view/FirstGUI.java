package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class FirstGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	private JTextField txt_Vorname;
	private JButton btnbergabe;
	private JButton btnNewGui; 
	
	
	
	/**
	 * Create the frame.
	 */
	public FirstGUI() {
		
		super("First GUI");
		
		initForm();
		
	}
	
	public void initForm() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
	/**
	 * Create Textfields, Buttons, Labels.
	 */
		
		JLabel lblVorname = new JLabel("Vorname: ");
		lblVorname.setBounds(10, 35, 113, 14);
		contentPane.add(lblVorname);
		
		JTextField txt_Vorname = new JTextField();
		txt_Vorname.setBounds(69, 32, 86, 20);
		contentPane.add(txt_Vorname);
		txt_Vorname.setColumns(10);
		
		JButton btnbergabe = new JButton("Uebergabe");
		btnbergabe.setBounds(10, 88, 145, 23);
		contentPane.add(btnbergabe);
		
		JButton btnNewGui = new JButton("NEW GUI");
		btnNewGui.setBounds(10, 122, 145, 23);
		contentPane.add(btnNewGui);
		
		this.add(lblVorname);
		this.add(txt_Vorname); 
		this.add(btnbergabe);
		this.add(btnNewGui); 
	
	}
	
	public void resetView() {
		this.txt_Vorname.setText(""); 
	}
	
	public String getVorname() {
		return this.txt_Vorname.getText();
	}
	
	public void setDatenUebergabeListener(ActionListener l) {
		this.btnbergabe.addActionListener(l); 		
	}
	
	public void setOpenNewGUIListener(ActionListener l) {
		this.btnNewGui.addActionListener(l);
	}
	
	
	public void openGUI() {
		SecoundGUI SGui = new SecoundGUI();
		SGui.setVisible(true); 
	}
		
}


