package ro.ase.csie.cts.g1088.dp.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class AdapterEa2CaracterJoc extends CaracterJoc {
	
	InterfataCaracterEA caracterEA;

	public AdapterEa2CaracterJoc(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}

	@Override
	public void seDeplaseaza() {
		caracterEA.move();
		
	}
	
	

}
