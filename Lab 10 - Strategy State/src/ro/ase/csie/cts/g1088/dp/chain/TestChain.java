package ro.ase.csie.cts.g1088.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		ModulProcesareMesaj filtru = new ModulFiltruRomana();
		ModulProcesareMesaj privat = new ModulMesajePrivate();
		ModulProcesareMesaj grup = new ModulMesajeGrup();
		
		filtru.next = privat;
		privat.next = grup;
		
		filtru.procesareMesaj(new MesajChat("Hello World", 20, "@everyone"));
	}

}
