package PromedioBastidasAverage;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Tablas.Restriccion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class AverageBastidas extends JFrame {

	private JPanel contentPane;
	private JTextField txtapellidos;
	private JTextField txtnombres;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;
	private JTable tblpromedio;
	private JTextField txtpromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AverageBastidas frame = new AverageBastidas();
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
	public AverageBastidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APELLIDOS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 26, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRES");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 63, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NOTA1");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 145, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NOTA2");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 181, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox cmbmateria = new JComboBox();
		cmbmateria.setModel(new DefaultComboBoxModel(new String[] {"BASE DE DATOS", "INTERNET DE LAS COSAS", "REDES II", "SISTEMAS OPERATIVOS", "POO", "FILOSOFIA FILOSOFIA DE LAS C.COMP"}));
		cmbmateria.setBounds(125, 103, 128, 22);
		contentPane.add(cmbmateria);
		
		JLabel lblNewLabel_2 = new JLabel("MATERIA");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 103, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(124, 23, 129, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(124, 61, 129, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtnota1 = new JTextField();
		txtnota1.setText("0");
		txtnota1.setBounds(124, 143, 86, 20);
		contentPane.add(txtnota1);
		txtnota1.setColumns(10);
		
		txtnota2 = new JTextField();
		txtnota2.setText("0");
		txtnota2.setBounds(124, 179, 86, 20);
		contentPane.add(txtnota2);
		txtnota2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("NOTA3");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 206, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtnota3 = new JTextField();
		txtnota3.setText("0");
		txtnota3.setBounds(124, 210, 86, 20);
		contentPane.add(txtnota3);
		txtnota3.setColumns(10);
		
		JButton btnNewButton = new JButton("MOSTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr=new FileReader("NOTAS.txt");
					BufferedReader br= new BufferedReader (fr);
					DefaultTableModel modeltable=new DefaultTableModel();
					String linea;
					modeltable.addColumn("");
					while((linea=br.readLine())!=null) 
					{
						modeltable.addRow(new String [] {linea});
					}
					tblpromedio.setModel(modeltable);
				}
				catch(Exception s) {
					JOptionPane.showMessageDialog(null, "Error de compialcion");
				}
			}
		});
		btnNewButton.setBounds(10, 316, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GUARDAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestriccionAverage notas = new RestriccionAverage (txtnota1.getText(),txtnota2.getText(),txtnota3.getText());
				//validacion de notas
				if(notas.validarnota1(txtnota1.getText())==false) {
					JOptionPane.showMessageDialog(null, "Nota parcial 1 incorrecta, pof favor vuelva a ingresarla");
					txtnota1.setText("");
					txtnota1.requestFocus();
				}
				else if(notas.validarnota1(txtnota2.getText())==false) {
					JOptionPane.showMessageDialog(null, "Nota parcial 2 incorrecta, pof favor vuelva a ingresarla");
					txtnota2.setText("");
					txtnota2.requestFocus();
				}
				else if(notas.validarnota1(txtnota3.getText())==false) {
					JOptionPane.showMessageDialog(null, "Nota parcial 3 incorrecta, pof favor vuelva a ingresarla");
					txtnota3.setText("");
					txtnota3.requestFocus();
				}else {
				try {
					FileWriter fw = new FileWriter("NOTAS.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(txtapellidos.getText()+" ");
					bw.write(txtnombres.getText()+" ");
					bw.write(cmbmateria.getSelectedItem()+" ");
					bw.write(txtnota1.getText()+" ");
					bw.write(txtnota2.getText()+" ");
					bw.write(txtnota3.getText()+" ");
					bw.write(txtpromedio.getText()+" ");
					bw.newLine();
					bw.flush();
					JOptionPane.showMessageDialog(null, "Se guardo con exito");
					txtapellidos.setText("");
					txtnombres.setText("");
					txtnota1.setText("0");
					txtnota2.setText("0");
					txtnota3.setText("0");
					txtpromedio.setText("0");
				}
				catch(Exception s) {
					JOptionPane.showMessageDialog(null, "Error de compialcion");
				}
			}}
		});
		btnNewButton_1.setBounds(134, 316, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PROMEDIO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        txtpromedio.setText(((Float.parseFloat(txtnota1.getText()) + Float.parseFloat(txtnota2.getText()) + Float.parseFloat(txtnota3.getText()) )/3)+"");
			}
		});
		btnNewButton_2.setBounds(258, 316, 89, 23);
		contentPane.add(btnNewButton_2);
		
		tblpromedio = new JTable();
		tblpromedio.setBounds(375, 27, 356, 248);
		contentPane.add(tblpromedio);
		
		JLabel lblNewLabel_6 = new JLabel("PROMEDIO");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 241, 78, 14);
		contentPane.add(lblNewLabel_6);
		
		txtpromedio = new JTextField();
		txtpromedio.setText("0");
		txtpromedio.setEditable(false);
		txtpromedio.setBounds(125, 241, 86, 20);
		contentPane.add(txtpromedio);
		txtpromedio.setColumns(10);
	}

}
