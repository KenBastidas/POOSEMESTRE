package vista;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class vistav extends JFrame {

	private JPanel contentPane;
	public JTextField txtnumberone;
	public JTextField txtnumbertwo;
	public JTextField txtresult;
	public JButton btnSumar;
	public JButton btnless;
	public JButton btnpro;
	public JButton btndiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistav frame = new vistav();
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
	public vistav() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnumberone = new JTextField();
		txtnumberone.setBounds(137, 36, 86, 20);
		contentPane.add(txtnumberone);
		txtnumberone.setColumns(10);
		
		txtnumbertwo = new JTextField();
		txtnumbertwo.setBounds(137, 100, 86, 20);
		contentPane.add(txtnumbertwo);
		txtnumbertwo.setColumns(10);
		
		txtresult = new JTextField();
		txtresult.setEditable(false);
		txtresult.setBounds(137, 144, 86, 20);
		contentPane.add(txtresult);
		txtresult.setColumns(10);
		
		 btnSumar = new JButton("Sumar");
		btnSumar.setBounds(10, 215, 89, 23);
		contentPane.add(btnSumar);
		
		 btnless = new JButton("Restar");
		btnless.setBounds(134, 215, 89, 23);
		contentPane.add(btnless);
		
		 btnpro = new JButton("Multiplicar");
		btnpro.setBounds(263, 215, 89, 23);
		contentPane.add(btnpro);
		
		 btndiv = new JButton("Dividir");
		btndiv.setBounds(380, 215, 89, 23);
		contentPane.add(btndiv);
		
		JLabel lblNewLabel = new JLabel("number1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 39, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 103, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 147, 89, 14);
		contentPane.add(lblNewLabel_2);
	}
}
