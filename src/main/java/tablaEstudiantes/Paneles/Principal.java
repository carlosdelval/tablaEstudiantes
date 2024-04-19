package tablaEstudiantes.Paneles;

import java.awt.EventQueue;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tablaEstudiantes.controladores.ControladorEstudiante;
import tablaEstudiantes.entidades.Estudiante;
import tablaEstudiantes.tablas.DatosDeTabla;
import tablaEstudiantes.tablas.MiTableModel;

import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private PanelEstudiante panelDatos;
	private MiTableModel tableModel;
	private JButton btnNewButton;
	private JSplitPane splitPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		
		panelDatos = new PanelEstudiante();
		tableModel = new MiTableModel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setResizeWeight(0.5);
		contentPane.add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				muestraDatos();
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panelDatos);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save();
			}
		});
		panelDatos.add(btnNewButton, BorderLayout.SOUTH);
	}
	
	/**
	 * Método que muestra los datos seleccionados de la tabla en pantalla
	 */
	
	private void muestraDatos() {
		int fila = this.table.getSelectedRow();
		this.panelDatos.setId(this.tableModel.getValueAt(fila,0).toString());
		this.panelDatos.setNombre((String)this.tableModel.getValueAt(fila,1));
		this.panelDatos.setApellido1((String)this.tableModel.getValueAt(fila,2));
		this.panelDatos.setApellido2((String)this.tableModel.getValueAt(fila,3));
		this.panelDatos.setDNI((String)this.tableModel.getValueAt(fila,4));
		this.panelDatos.setDireccion((String)this.tableModel.getValueAt(fila,5));
		this.panelDatos.setEmail((String)this.tableModel.getValueAt(fila,6));
		this.panelDatos.setTelefono((String)this.tableModel.getValueAt(fila,7));
	}
	
	/**
	 * Método que guarda los cambios y los aplica a la tabla
	 */

	private void save() {
		ControladorEstudiante ce = new ControladorEstudiante();
		ce.update(Integer.parseInt(this.panelDatos.getId()),this.panelDatos.getNombre(), this.panelDatos.getApellido1(),
				this.panelDatos.getApellido2(), this.panelDatos.getDNI(), this.panelDatos.getDireccion(), this.panelDatos.getEmail(),
				this.panelDatos.getTelefono());
		actualizaTabla();
	}
	
	/**
	 * Actualiza los datos de la tabla despues de un update
	 */
	
	private void actualizaTabla() {
		this.tableModel.setDatos(DatosDeTabla.getDatosDeTabla());
		table.repaint();
	}
}
