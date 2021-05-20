package ro.ase.csie.cts.g1088.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {
	List<MementoSuperErou> salvari = new ArrayList<>();
	
	public void adaugaSalvare(MementoSuperErou memento) {
		salvari.add(memento);
	}
	
	public MementoSuperErou getUltimaSalvare() {
		if (salvari.size() > 0) {
			MementoSuperErou ultimaSalvare = salvari.get(salvari.size() - 1);
			salvari.remove(ultimaSalvare);
			return ultimaSalvare;
		} 
		return null;
	}
}
