package conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class universidad extends JFrame {

	private JPanel contentPane;
	Connection conexion = null;
	private static final String URL = "jdbc:mysql://localhost:3306/universidad";
	private static final String USER = "root";
	private static final String PASS = "";
	private JTextField txtcedula;
	private JTextField txtapellidos;
	private JTextField txtnombres;
	private JTextField txtlugardenacimiento;
	private JTextField txtnotadegrado;
	PreparedStatement ps;
	private JTextField txtfecha_nac;
	private JLabel lblNewLabel_5;
	private JButton btnbuscar;
	ResultSet rs;
	private JButton btndelete;
	private JButton btnnuevo;
	private JScrollPane scrollPane;
	private JTable tbldatos;
	
	public Connection getConection(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 conexion = DriverManager.getConnection(URL, USER, PASS);
		 JOptionPane.showMessageDialog(null, "Se ha conectado con exito");
		} 
		catch(Exception e) {
			
				JOptionPane.showMessageDialog(null, "error al conectar ");
				e.printStackTrace();
		}
		return conexion;
		
	}
	//method borrar_textos
	public void borrar_textos() {
		 txtcedula.setText("");
			txtapellidos.setText("");
		    txtnombres.setText("");
			txtlugardenacimiento.setText("");
			txtfecha_nac.setText("");
			txtnotadegrado.setText("");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					universidad frame = new universidad();
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
	public universidad() {
		setTitle("COENXION A LA BDD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("PROBAR CONEXION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//Connection conexion;
					conexion= getConection();
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "error al conectar ");
				}
				
			}
		});
		btnNewButton.setBounds(126, 334, 146, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(10, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 72, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(10, 117, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("lugar de naicmeinto");
		lblNewLabel_3.setBounds(10, 173, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota de grado");
		lblNewLabel_4.setBounds(10, 216, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(106, 28, 86, 20);
		contentPane.add(txtcedula);
		txtcedula.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(106, 69, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(106, 114, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtlugardenacimiento = new JTextField();
		txtlugardenacimiento.setBounds(106, 170, 86, 20);
		contentPane.add(txtlugardenacimiento);
		txtlugardenacimiento.setColumns(10);
		
		txtnotadegrado = new JTextField();
		txtnotadegrado.setText("0");
		txtnotadegrado.setBounds(106, 213, 86, 20);
		contentPane.add(txtnotadegrado);
		txtnotadegrado.setColumns(10);
		
		JButton btnguardar = new JButton("guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Connection conexion;
				try {
					conexion= getConection();
					ps=conexion.prepareStatement("INSERT INTO estudiantes(cedula,apellidos,nombres,lugar_nacimiento,fecha_nacimiento,nota_grado)VALUE(?,?,?,?,?,?)");
					ps.setString(1, txtcedula.getText());
					ps.setString(2, txtapellidos.getText());
					ps.setString(3, txtnombres.getText());
					ps.setString(4, txtlugardenacimiento.getText());
					ps.setDate(5, Date.valueOf(txtfecha_nac.getText()));
					ps.setString(6, txtnotadegrado.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "save succesr ");
					//añadir fila
					Object [] fila= new Object[6];
					fila[0]=txtcedula.getText();
					fila[1]=txtapellidos.getText();
					fila[2]=txtnombres.getText();
					fila[3]=txtlugardenacimiento.getText();
					fila[4]=txtfecha_nac.getText();
					fila[5]=txtnotadegrado.getText();
					
					conexion.close();
					borrar_textos();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "error al conectar estudia ");
				}
			}
		});
		btnguardar.setBounds(10, 296, 89, 23);
		contentPane.add(btnguardar);
		
		txtfecha_nac = new JTextField();
		txtfecha_nac.setBounds(106, 257, 86, 20);
		contentPane.add(txtfecha_nac);
		txtfecha_nac.setColumns(10);
		
		lblNewLabel_5 = new JLabel("fechnaciemitno");
		lblNewLabel_5.setBounds(10, 260, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		btnbuscar = new JButton("busacr");
		btnbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conexion= getConection();
				try {
					ps=conexion.prepareStatement("SELECT * FROM estudiantes WHERE cedula=?");
					 ps.setString(1, txtcedula.getText());
			            rs = ps.executeQuery();
		            if(rs.next()) {
		                //txtApel.setCedula(rs.getInt("Cedula"));
		            	txtapellidos.setText(rs.getString("apellidos"));
		                txtnombres.setText(rs.getString("nombres"));
		                txtlugardenacimiento.setText(rs.getString("lugar_nacimiento"));
		                txtfecha_nac.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
		                txtnotadegrado.setText(String.valueOf(rs.getDouble("nota_grado")));
		                //btnmodificar.setEnabled(true);
		                //btnNuevo.setEnabled(true);
		            }
		            conexion.close();
		        } catch (Exception e1) {
		        }
			}
		});
		btnbuscar.setBounds(215, 300, 89, 23);
		contentPane.add(btnbuscar);
		
		JButton btnmodificar = new JButton("MODIFICAR");
		btnmodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion= getConection();
                try {

                    ps = conexion.prepareStatement("UPDATE estudiantes SET cedula = ?, apellidos = ?"
                            + ", nombres = ?, lugar_nacimiento = ?, fecha_nacimiento = ?, nota_grado = ?"
                            + " WHERE cedula = ?");
                    ps.setString(1, txtcedula.getText());
					ps.setString(2, txtapellidos.getText());
					ps.setString(3, txtnombres.getText());
					ps.setString(4, txtlugardenacimiento.getText());
					ps.setDate(5, Date.valueOf(txtfecha_nac.getText()));
					ps.setDouble(6, Double.valueOf(txtnotadegrado.getText()));
                    ps.setString(7, txtcedula.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se modificó con éxito!");
                    conexion.close();
                    borrar_textos();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Hubo un error en la conexion");
                }
			}
		});
		btnmodificar.setBounds(10, 334, 89, 23);
		contentPane.add(btnmodificar);
		
		btndelete = new JButton("delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion= getConection();
                try {
                    ps = conexion.prepareStatement("DELETE FROM estudiantes WHERE cedula = ?");
                    ps.setString(1, txtcedula.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se elimino con éxito!");
                    conexion.close();
                    borrar_textos();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Hubo un error en la conexion");
                }

			}
		});
		btndelete.setBounds(303, 334, 89, 23);
		contentPane.add(btndelete);
		
		btnnuevo = new JButton("nuevo");
		btnnuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar_textos();
				//conexion= getConection();
                   // txtcedula.setText("");
					//txtapellidos.setText("");
				    //txtnombres.setText("");
					//txtlugardenacimiento.setText("");
					//txtfecha_nac.setText("");
					//txtnotadegrado.setText("");
			}
		});
		btnnuevo.setBounds(116, 296, 89, 23);
		contentPane.add(btnnuevo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(338, 31, 454, 253);
		contentPane.add(scrollPane);
		
		tbldatos = new JTable();
		tbldatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conexion= getConection();
				int fila=tbldatos.getSelectedRow();
				String ced=tbldatos.getValueAt(fila, 0).toString();
				//System.out.println(ced);
				try {
					ps=conexion.prepareStatement("SELECT * FROM estudiantes WHERE cedula=?");
					ps.setString(1, ced);
					rs=ps.executeQuery();
					if(rs.next()) {
					txtcedula.setText(rs.getString("cedula"));
					txtapellidos.setText(rs.getString("apellidos"));
					txtnombres.setText(rs.getString("nombres"));
					txtlugardenacimiento.setText(rs.getString("lugar_nacimiento"));
					txtfecha_nac.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
					txtnotadegrado.setText(String.valueOf(rs.getDouble("nota_grado")));
					}
					conexion.close();
				}
				catch(Exception ex){
					  JOptionPane.showMessageDialog(null, "Hubo un error");
					
				}
			}
		});
		//scrollPane.setColumnHeaderView(tbldatos);
		scrollPane.setRowHeaderView(tbldatos);
		scrollPane.setViewportView(tbldatos);
		try {
			DefaultTableModel modelo= new DefaultTableModel() {
				//bloquear columans para no editar
				public boolean isCellEditable(int filas, int col) {
					if((col == 0) || (col == 1) || (col == 2) || (col == 3) || (col == 4) || (col == 5)) {
						return false;
					}
					else {
						return true;
					}
					
				}
			};
			tbldatos.setModel(modelo);
			modelo.addColumn("Cedula");
			modelo.addColumn("apellidos");
			modelo.addColumn("nombres");
			modelo.addColumn("lugar_nacimiento");
			modelo.addColumn("fecha_nacimiento");
			modelo.addColumn("nota_grado");
			conexion= getConection();
			ps=conexion.prepareStatement("SELECT*FROM estudiantes");
			rs=ps.executeQuery();//eejcutar la consukta y todo lso datos los almacena en rs
			ResultSetMetaData rstabla =(ResultSetMetaData) rs.getMetaData();
			int numCampos = rstabla.getColumnCount();//obtener cuanats columnas tiene la tabla
			//System.out.println(numCampos);
			//recorrer tabla estudaintes
			while(rs.next()) {
				Object [] filas= new Object[numCampos];
				for(int i=0;i<numCampos;i++){
					filas[i]=rs.getObject(i+1);
					//System.out.println(filas[i]);
				}
				modelo.addRow(filas);
			}
			 conexion.close();
		}
		catch(Exception e) {
			  JOptionPane.showMessageDialog(null, "Hubo un error");
		}
	}
}
