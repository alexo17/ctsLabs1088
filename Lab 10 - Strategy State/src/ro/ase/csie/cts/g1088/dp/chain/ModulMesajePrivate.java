package ro.ase.csie.cts.g1088.dp.chain;

public class ModulMesajePrivate extends ModulProcesareMesaj {

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if (!mesaj.destinatie.toLowerCase().equals("@everyone")) { 
			System.out.println("Mesaj privat pentru: " + mesaj.destinatie + ": " + mesaj.text);
		} else {
			if (next != null) {
				next.procesareMesaj(mesaj);
			}
		}
	}

}
