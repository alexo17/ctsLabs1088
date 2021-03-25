package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {
	
	private String ip;
	private String denumire;
	
	private static ConexiuneBD conexiune = null;
	//eager
	//private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1", "cts");
	
	private ConexiuneBD() {
		
	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	//lazy instantiation
	public static synchronized ConexiuneBD getConexiune() {
		if (conexiune == null) {
			//date se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
		}
		return conexiune;
	}
}
