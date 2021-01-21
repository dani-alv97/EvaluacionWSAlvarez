package ec.edu.ups.app.g1.prueba.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.app.g1.prueba.services.TitulosSOAP;
import ec.edu.ups.app.g1.prueba.services.TitulosSOAPService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class CrearTitulo extends JFrame {

	private static final QName SERVICE_NAME = new QName("http://services.prueba.g1.app.ups.edu.ec/",
			"TitulosSOAPService");
	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtTitulo;
	private JTextField txtUniversidad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearTitulo frame = new CrearTitulo();
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
	public CrearTitulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cedula:");
		lblNewLabel.setBounds(10, 11, 80, 14);
		contentPane.add(lblNewLabel);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(10, 70, 80, 14);
		contentPane.add(lblTitulo);

		JLabel lblUniversidad = new JLabel("Universidad:");
		lblUniversidad.setBounds(10, 134, 80, 14);
		contentPane.add(lblUniversidad);

		txtCedula = new JTextField();
		txtCedula.setBounds(120, 8, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);

		txtTitulo = new JTextField();
		txtTitulo.setColumns(10);
		txtTitulo.setBounds(120, 67, 86, 20);
		contentPane.add(txtTitulo);

		txtUniversidad = new JTextField();
		txtUniversidad.setColumns(10);
		txtUniversidad.setBounds(120, 131, 86, 20);
		contentPane.add(txtUniversidad);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL wsdlURL = TitulosSOAPService.WSDL_LOCATION;
				TitulosSOAPService ss = new TitulosSOAPService(wsdlURL, SERVICE_NAME);
				TitulosSOAP port = ss.getTitulosSOAPPort();
				{
					System.out.println("Invoking registrarTitulo...");
					java.lang.String _registrarTitulo_arg0 = txtCedula.getText();
					java.lang.String _registrarTitulo_arg1 = txtTitulo.getText();
					java.lang.String _registrarTitulo_arg2 = txtUniversidad.getText();
					port.registrarTitulo(_registrarTitulo_arg0, _registrarTitulo_arg1, _registrarTitulo_arg2);
				}
			}
		});
		btnCrear.setBounds(117, 186, 89, 23);
		contentPane.add(btnCrear);
	}
}
