package controlado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modeloo.modell;
import vista.vistav;

public class controlle {
	private vistav vie;
	@SuppressWarnings("unused")
	private modell mod;
	public controlle(vistav vie, modell mod) {
		//super();
		this.vie = vie;
		this.mod = mod;
		this.vie.btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mod.setNumeroone(Double.parseDouble(vie.txtnumberone.getText()));
				mod.setNumerotwo(Double.parseDouble(vie.txtnumbertwo.getText()));
				mod.suma();
				vie.txtresult.setText(String.valueOf(mod.getResult()));
			}
		});
		this.vie.btnless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mod.setNumeroone(Double.parseDouble(vie.txtnumberone.getText()));
				mod.setNumerotwo(Double.parseDouble(vie.txtnumbertwo.getText()));
				mod.less();
				vie.txtresult.setText(String.valueOf(mod.getResult()));
			}
		});
		this.vie.btnpro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mod.setNumeroone(Double.parseDouble(vie.txtnumberone.getText()));
				mod.setNumerotwo(Double.parseDouble(vie.txtnumbertwo.getText()));
				mod.multi();
				vie.txtresult.setText(String.valueOf(mod.getResult()));
			}
		});
		this.vie.btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mod.setNumeroone(Double.parseDouble(vie.txtnumberone.getText()));
				mod.setNumerotwo(Double.parseDouble(vie.txtnumbertwo.getText()));
				mod.divi();
				vie.txtresult.setText(String.valueOf(mod.getResult()));
			}
		});	
	}
	public void t() {
		vie.setTitle("menu");
		vie.setLocationRelativeTo(vie);
	}
}