package ro.ase.csie.cts.g1088.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		 ModulStareConexiuneServer conexiune = new ModulStareConexiuneServer();
		 
		 InterfataStatusConexiuneServer notificari = new ModulNotificariUI();
		 InterfataStatusConexiuneServer backup = new ModulSalvareAutomata();
		 
		 conexiune.register(backup);
		 conexiune.register(notificari);
		 
		 conexiune.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);
		 
		 conexiune.unregister(backup);
		 
		 conexiune.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
	}

}
