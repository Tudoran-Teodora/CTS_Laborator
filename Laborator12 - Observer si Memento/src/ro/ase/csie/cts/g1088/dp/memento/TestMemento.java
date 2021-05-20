package ro.ase.csie.cts.g1088.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
	
		ManagerIstoric istoric=new ManagerIstoric();
		SuperErou superman=new SuperErou("Superman",100,"Zboara");
		istoric.adaugaSalvare(superman.salvare());
		superman.esteLovid(10);
		superman.esteLovid(50);
		
		System.out.println("Puncte viata "+ superman.punctaViata);
		
		superman.incarcaSalvare(istoric.getUltimaSalvare());

		System.out.println("Puncte viata "+ superman.punctaViata);
	}

}
