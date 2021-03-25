package ro.ase.csie.cts.g1088.dp.singleton.registru;

import java.util.Hashtable;

public class ConexiuneBD {
	
	private String ip;
	private String denumire;
	
	private static Hashtable<String, ConexiuneBD> conexiuni = new Hashtable();
	
	private ConexiuneBD(String ip, String denumire) {
		this.ip = ip;
		this.denumire = denumire;
	}
	
	public static synchronized ConexiuneBD getConexiune(String ip, String denumire) {
		ConexiuneBD conexiune = conexiuni.get(ip);
		if (conexiune == null) {
			conexiune = new ConexiuneBD(ip, denumire);
			conexiuni.put(ip, conexiune);
		} 
		return conexiune;
	}
}
