package bastidasvmc;

import controlado.controlle;
import modeloo.modell;
import vista.vistav;

public class Bastidasvmcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modell m= new modell();
		vistav v= new vistav();
		controlle si = new controlle(v, m);
		si.t();
		v.setVisible(true);
	}

}
