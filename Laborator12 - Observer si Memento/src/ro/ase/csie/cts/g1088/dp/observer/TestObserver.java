package ro.ase.csie.cts.g1088.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ModulStareConexiunServer conexiune=new ModulStareConexiunServer();
		ModulNotificariIUI notificari=new ModulNotificariIUI();
		ModulSalvareAutomata backup=new ModulSalvareAutomata();
		
		conexiune.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
		
		conexiune.register(backup);
		conexiune.register(notificari);

		conexiune.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);
		
		conexiune.unregister(backup);
		
		conexiune.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);

	}

}
