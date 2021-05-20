package ro.ase.csie.cts.g1088.dp.memento;

public class SuperErou {
	String nume;
	int puncteViata;
	String magie;
	
	public SuperErou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
	}
	
	public void ataca() {
		System.out.println("ataca");
	}
	
	public void esteLovit(int puncte) {
		puncteViata -= puncte;
	}
	
	public void seVindeca(int puncte) {
		puncteViata += puncte;
	}
	
	public MementoSuperErou salvare() {
		return new MementoSuperErou(nume, puncteViata, magie);
	}
	
	public void incarcaSalvare(MementoSuperErou memento) {
		nume = memento.nume;
		puncteViata = memento.puncteViata;
		magie = memento.magie;
	}
}
