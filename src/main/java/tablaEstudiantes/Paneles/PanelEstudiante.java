package tablaEstudiantes.Paneles;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;

public class PanelEstudiante extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfApellido1;
	private JTextField jtfApellido2;
	private JTextField jtfNombre;
	private JTextField jtfDNI;
	private JTextField jtfDireccion;
	private JTextField jtfTelefono;
	private JTextField jtfEmail;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public PanelEstudiante() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 178, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Gestión de Estudiante");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		jtfNombre.setColumns(10);
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		panel.add(jtfNombre, gbc_jtfNombre);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido1:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfApellido1 = new JTextField();
		GridBagConstraints gbc_jtfApellido1 = new GridBagConstraints();
		gbc_jtfApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido1.gridx = 1;
		gbc_jtfApellido1.gridy = 3;
		panel.add(jtfApellido1, gbc_jtfApellido1);
		jtfApellido1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido2:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfApellido2 = new JTextField();
		GridBagConstraints gbc_jtfApellido2 = new GridBagConstraints();
		gbc_jtfApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido2.gridx = 1;
		gbc_jtfApellido2.gridy = 4;
		panel.add(jtfApellido2, gbc_jtfApellido2);
		jtfApellido2.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("DNI:");
		GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4_1.gridx = 0;
		gbc_lblNewLabel_4_1.gridy = 5;
		panel.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
		
		jtfDNI = new JTextField();
		jtfDNI.setColumns(10);
		GridBagConstraints gbc_jtfDNI = new GridBagConstraints();
		gbc_jtfDNI.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDNI.gridx = 1;
		gbc_jtfDNI.gridy = 5;
		panel.add(jtfDNI, gbc_jtfDNI);
		
		
		JLabel lblNewLabel_4_2 = new JLabel("Dirección:");
		GridBagConstraints gbc_lblNewLabel_4_2 = new GridBagConstraints();
		gbc_lblNewLabel_4_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4_2.gridx = 0;
		gbc_lblNewLabel_4_2.gridy = 6;
		panel.add(lblNewLabel_4_2, gbc_lblNewLabel_4_2);
		
		jtfDireccion = new JTextField();
		jtfDireccion.setColumns(10);
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 1;
		gbc_jtfDireccion.gridy = 6;
		panel.add(jtfDireccion, gbc_jtfDireccion);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_4_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_3_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4_3_1.gridx = 0;
		gbc_lblNewLabel_4_3_1.gridy = 7;
		panel.add(lblNewLabel_4_3_1, gbc_lblNewLabel_4_3_1);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 7;
		panel.add(jtfEmail, gbc_jtfEmail);
		
		JLabel lblNewLabel_4_3 = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblNewLabel_4_3 = new GridBagConstraints();
		gbc_lblNewLabel_4_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4_3.gridx = 0;
		gbc_lblNewLabel_4_3.gridy = 8;
		panel.add(lblNewLabel_4_3, gbc_lblNewLabel_4_3);
		
		jtfTelefono = new JTextField();
		jtfTelefono.setColumns(10);
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 1;
		gbc_jtfTelefono.gridy = 8;
		panel.add(jtfTelefono, gbc_jtfTelefono);

	}

	/**
	 * 
	 */
	
	public String getId() {
		return this.jtfId.getText();
	}
	/**
	 * 
	 */
	
	public String getNombre() {
		return this.jtfNombre.getText();
	}
	
	/**
	 * 
	 */
	
	public String getApellido1() {
		return this.jtfApellido1.getText();
	}
	
	/**
	 * 
	 */
	
	public String getApellido2() {
		return this.jtfApellido2.getText();
	}
	
	/**
	 * 
	 */
	
	public String getTelefono() {
		return this.jtfTelefono.getText();
	}
	
	/**
	 * 
	 */
	
	public String getDNI() {
		return this.jtfDNI.getText();
	}
	
	/**
	 * 
	 */
	
	public String getDireccion() {
		return this.jtfDireccion.getText();
	}
	
	/**
	 * 
	 */
	
	public String getEmail() {
		return this.jtfEmail.getText();
	}
	
	/**
	 * 
	 */
	
	public void setId(String s) {
		this.jtfId.setText(s);
	}
	/**
	 * 
	 */
	
	public void setDNI(String s) {
		this.jtfDNI.setText(s);
	}
	/**
	 * 
	 */
	
	public void setNombre(String s) {
		this.jtfNombre.setText(s);
	}
	/**
	 * 
	 */
	
	public void setApellido1(String s) {
		this.jtfApellido1.setText(s);
	}
	/**
	 * 
	 */
	
	public void setApellido2(String s) {
		this.jtfApellido2.setText(s);
	}
	
	/**
	 * 
	 */
	
	public void setTelefono(String s) {
		this.jtfTelefono.setText(s);
	}
	/**
	 * 
	 */
	
	public void setDireccion(String s) {
		this.jtfDireccion.setText(s);
	}
	
	/**
	 * 
	 */
	public void setEmail(String s) {
		this.jtfEmail.setText(s);
	}
}

