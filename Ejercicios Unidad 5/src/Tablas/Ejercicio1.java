package Tablas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtcedula;
	private JTextField txtapellidos;
	private JTextField txtnombres;
	private JTextField txtsalario;
	private JTable tbldatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("DATOS DE USUARIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 54, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 91, 46, 14);
		contentPane.add(lblNombres);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 131, 46, 14);
		contentPane.add(lblGenero);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 170, 46, 14);
		contentPane.add(lblSalario);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(103, 8, 96, 20);
		contentPane.add(txtcedula);
		txtcedula.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(100, 51, 99, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(103, 88, 96, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtsalario = new JTextField();
		txtsalario.setText("0");
		txtsalario.setBounds(103, 167, 99, 20);
		contentPane.add(txtsalario);
		txtsalario.setColumns(10);
		
		JComboBox cmbgenero = new JComboBox();
		cmbgenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		cmbgenero.setBounds(100, 127, 99, 22);
		contentPane.add(cmbgenero);
		
		tbldatos = new JTable();
		tbldatos.setBounds(241, 11, 345, 242);
		contentPane.add(tbldatos);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Restriccion datos = new Restriccion (txtcedula.getText(),txtsalario.getText());
			//validacion de cedula
			if(datos.validarCedula(txtcedula.getText())==false) {
				JOptionPane.showMessageDialog(null, "Cédula incorrecta, pof favor vuelva a ingresarla");
				txtcedula.setText("");
				txtcedula.requestFocus();
			}
			else if(txtapellidos.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese los apellidos");
				txtapellidos.requestFocus();
			}
			else if(txtnombres.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese los nombres");
				txtnombres.requestFocus();
			}
			else if(datos.validarSalario(txtsalario.getText())==false) {
				JOptionPane.showMessageDialog(null, "Salario incorrecto, pof favor vuelva a ingresarla");
				txtcedula.setText("0");
				txtcedula.requestFocus();
			}
				try {
					FileWriter fw = new FileWriter("trabajadores.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(txtcedula.getText()+" ");
					bw.write(txtapellidos.getText()+" ");
					bw.write(txtnombres.getText()+" ");
					bw.write(cmbgenero.getSelectedItem()+" ");
					bw.write(txtsalario.getText()+" ");
					bw.newLine();
					bw.flush();
					JOptionPane.showMessageDialog(null, "Se guardo con exito");
					txtcedula.setText("");
					txtapellidos.setText("");
					txtnombres.setText("");
					txtsalario.setText("0");
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error de compialcion");
				}
			}
		});
		btnguardar.setBounds(40, 276, 89, 23);
		contentPane.add(btnguardar);
		
		JButton btnmostrar = new JButton("Mostrar");
		btnmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileReader fr=new FileReader("trabajadores.txt");
					BufferedReader br= new BufferedReader (fr);
					DefaultTableModel modeltable=new DefaultTableModel();
					String linea;
					modeltable.addColumn("");
					while((linea=br.readLine())!=null) 
					{
						modeltable.addRow(new String [] {linea});
					}
					tbldatos.setModel(modeltable);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error de compialcion");
				}
			}
		});
		btnmostrar.setBounds(241, 276, 89, 23);
		contentPane.add(btnmostrar);
	}
}
