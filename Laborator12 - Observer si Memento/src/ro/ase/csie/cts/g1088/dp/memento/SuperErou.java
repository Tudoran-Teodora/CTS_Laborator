package ro.ase.csie.cts.g1088.dp.memento;

public class SuperErou {

	String nume;
	int punctaViata;
	String magie;
	public SuperErou(String nume, int punctaViata, String magie) {
		super();
		this.nume = nume;
		this.punctaViata = punctaViata;
		this.magie = magie;
	}
	
	public void ataca() {
		System.out.println("Ataca");
	}
	
	public void esteLovid(int puncte) {
		this.punctaViata-=puncte;
	}
	
	public void seVindeca(int puncte) {
		this.punctaViata+=puncte;
	}
	
	public MementoSuperErou salvare() {
		return new MementoSuperErou(nume, punctaViata,magie);
	}
	
	public void incarcaSalvare(MementoSuperErou memento) {
		this.nume=memento.nume;
		this.punctaViata=memento.punctaViata;
		this.magie=memento.magie;
	}
}
