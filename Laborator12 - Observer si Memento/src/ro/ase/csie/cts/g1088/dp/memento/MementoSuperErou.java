package ro.ase.csie.cts.g1088.dp.memento;

import java.util.Date;

public class MementoSuperErou {

	String nume;
	int punctaViata;
	String magie;
	
	Date dataSalvare;

	public MementoSuperErou(String nume, int punctaViata, String magie) {
		super();
		this.nume = nume;
		this.punctaViata = punctaViata;
		this.magie = magie;
		this.dataSalvare=new Date();
	}
	
}
