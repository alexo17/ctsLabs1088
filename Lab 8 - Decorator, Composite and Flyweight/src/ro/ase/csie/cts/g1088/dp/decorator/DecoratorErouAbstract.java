package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class DecoratorErouAbstract extends SuperErou {
	
	SuperErou erou = null;
	
	public DecoratorErouAbstract(SuperErou erou) {
		super(erou.nume, erou.puncteViata);
		this.erou = erou;
	}

	@Override
	public void alearga() {
		erou.alearga();
	}

	@Override
	public void esteLovit(int puncte) {
		erou.esteLovit(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		erou.seVindeca(puncte);
	}
	
	
}
