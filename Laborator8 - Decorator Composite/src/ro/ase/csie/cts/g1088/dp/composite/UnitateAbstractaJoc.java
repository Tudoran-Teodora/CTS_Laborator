package ro.ase.csie.cts.g1088.dp.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC {

	//interfata nodurilor frunza este mostenita
	//definim interfata specifica nodurilor copil
	
	/*public abstract void adaugaCaracter(UnitateAbstractaJoc unitate);
	public abstract void stergeCaracter(UnitateAbstractaJoc unitate);
	public abstract UnitateAbstractaJoc getCaracter(int index);*/
	
	public void adaugaCaracter(UnitateAbstractaJoc unitate) {
		throw new UnsupportedOperationException();
	}
	
	public void stergeCaracter(UnitateAbstractaJoc unitate){
		throw new UnsupportedOperationException();
	}
	public UnitateAbstractaJoc getCaracter(int index){
		throw new UnsupportedOperationException();
	}
}
