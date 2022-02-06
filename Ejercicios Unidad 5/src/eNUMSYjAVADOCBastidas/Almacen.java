package eNUMSYjAVADOCBastidas;
/**
 * Importamos liberias correspondientes para el funcionamiento de nuestro Jframe
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author Brian Bastidas
 * Se abre la clase y se trae del Jframe al codigo de la clase "Almacen".
 */
public class Almacen extends JFrame {
	/**
	 * Se declaran las variables a usar y se declara dos variables globales.
	 */
	float pricetwiva;
	float utopri;
	private JPanel contentPane;
	private JTextField txtcantidad;
	private JTextField txtpreciounitario;
	private JTextField txtpreciototal;
	private JTextField txtpreciototalsiniva;
	private JTextField txtiva;
	private JTextField txtpreciototalconiva;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Almacen frame = new Almacen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the Almacen frame.
	 */
	public Almacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Le damos estilo al label Electrodomesticos.
		 */
		JLabel lblNewLabel = new JLabel("Electrodomesticos ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 38, 123, 18);
		contentPane.add(lblNewLabel);
		/**
		 * Configuramos el ComboBox y llamamos a la class enum ListaElec.
		 */
		JComboBox cboelectro = new JComboBox();
		cboelectro.setBounds(202, 37, 171, 22);
		contentPane.add(cboelectro);
		cboelectro.setModel(new DefaultComboBoxModel(ListaElec.values()));
		/**
		 * Le damos estilo al label cantidad del electrodomestico.
		 */
		JLabel lblNewLabel_1 = new JLabel("cantidad del electrodomestico");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 80, 204, 16);
		contentPane.add(lblNewLabel_1);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(202, 79, 86, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		/**
		 * Le damos estilo al label precio unitario.
		 */
		JLabel lblNewLabel_2 = new JLabel("precio unitario ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 120, 123, 20);
		contentPane.add(lblNewLabel_2);
		
		txtpreciounitario = new JTextField();
		txtpreciounitario.setText("0");
		txtpreciounitario.setBounds(202, 120, 86, 20);
		contentPane.add(txtpreciounitario);
		txtpreciounitario.setColumns(10);
		
		txtpreciototal = new JTextField();
		txtpreciototal.setText("0");
		txtpreciototal.setEditable(false);
		txtpreciototal.setBounds(202, 151, 86, 20);
		contentPane.add(txtpreciototal);
		txtpreciototal.setColumns(10);
		/**
		 * Le damos estilo al label precio total.
		 */
		JLabel lblNewLabel_3 = new JLabel("precio total ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 151, 79, 14);
		contentPane.add(lblNewLabel_3);
		/**
		 * Le damos estilo al label precio total (sin iva).
		 */
		JLabel lblNewLabel_4 = new JLabel("precio total (sin iva)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 193, 123, 18);
		contentPane.add(lblNewLabel_4);
		
		txtpreciototalsiniva = new JTextField();
		txtpreciototalsiniva.setText("0");
		txtpreciototalsiniva.setEditable(false);
		txtpreciototalsiniva.setBounds(202, 193, 86, 20);
		contentPane.add(txtpreciototalsiniva);
		txtpreciototalsiniva.setColumns(10);
		/**
		 * Le damos estilo al label IVA.
		 */
		JLabel lblNewLabel_5 = new JLabel("IVA");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 238, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtiva = new JTextField();
		txtiva.setText("0");
		txtiva.setEditable(false);
		txtiva.setBounds(202, 236, 86, 20);
		contentPane.add(txtiva);
		txtiva.setColumns(10);
		/**
		 * Le damos estilo al label precio total (con iva).
		 */
		JLabel lblNewLabel_6 = new JLabel("precio total (con iva)");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 277, 145, 18);
		contentPane.add(lblNewLabel_6);
		
		txtpreciototalconiva = new JTextField();
		txtpreciototalconiva.setText("0");
		txtpreciototalconiva.setEditable(false);
		txtpreciototalconiva.setBounds(202, 277, 62, 20);
		contentPane.add(txtpreciototalconiva);
		txtpreciototalconiva.setColumns(10);
		/**
		 * Configuramos el boton calcular
		 */
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Declaramos una variable float para IVA.
				 */
				float Iva=(float) 0.12;
				/**
				 * Configuramos la operacion del txtpreciototal en el cual se le obtiene multiplicando txtpreciounitario y txtcantidad.
				 */
				txtpreciototal.setText(Float.parseFloat(txtpreciounitario.getText())*Float.parseFloat(txtcantidad.getText())+"");
				/**
				 * Empleamos la primera variable global "pricetwiva" para almacenar la suma del precio total.
				 */
				pricetwiva += Float.parseFloat(txtpreciototal.getText());
				/**
				 * Configuramos txtpreciototalsiniva pasando el float :pricetwiva a String para que se muestre en el cuadro del txt.
				 */
				txtpreciototalsiniva.setText(Float.toString(pricetwiva));
				/**
				 * Configuramos el txtiva, sacando el iva multiplicando pricetwiva por Iva que tiene un valor del 0.12%, 
				 * para obtener el valor y pasarloa  String para que se muestre en el cuadro del txt.
				 */
				txtiva.setText(Float.toString(pricetwiva*Iva));
				//txtiva.setText()
				/**
				 * Empleamos la segunda variable global "utopri" para almacenar la suma del precio total(sin iva) con el IVA faltante.
				 */
				utopri+=pricetwiva+Float.parseFloat(txtiva.getText());
				/**
				 * Configuramos txtpreciototalconiva pasando el float :utopri a String para que se muestre en el cuadro del txt.
				 */
				txtpreciototalconiva.setText(Float.toString(utopri));
			}
		});
		btncalcular.setBounds(284, 315, 89, 23);
		contentPane.add(btncalcular);
		/**
		 * Configuramos el boton nuevo para que se quiten los valores de un electrodmestico se pongan en 0,
		 *  de esta forma para colocar los valores del siguiente producto
		 */
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpreciounitario.setText("0");
				txtpreciototal.setText("0");
				//txtpreciototalsiniva.setText("0");
				//txtpreciototalconiva.setText("0");
				txtiva.setText("0");
			}
		});
		btnNuevo.setBounds(416, 315, 89, 23);
		contentPane.add(btnNuevo);
	}
}
