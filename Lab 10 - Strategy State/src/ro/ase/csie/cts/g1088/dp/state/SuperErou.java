package ro.ase.csie.cts.g1088.dp.state;

public class SuperErou {
	public static final int PUNCTE_NIVEL_CRITIC = 50;
	public static final int PUNCTE_NIVEL_NORMAL = 500;
	int puncteViata;
	String efectMagic;
	String nume;
	
	InterfataModDeplasare stareDeplasare = null;
	
	public SuperErou(String nume) {
		super();
		this.puncteViata = PUNCTE_NIVEL_NORMAL;
		this.nume = nume;
		stareDeplasare = new StareDeplasareNormala();
	}
	
	public void esteAtacat(int puncteLovitura) {
		System.out.println(nume + " este lovit cu " + puncteLovitura);
		puncteViata -= puncteLovitura;
		if (puncteViata < PUNCTE_NIVEL_CRITIC) {
			stareDeplasare = new StareDeplasareRanitCritic();
		} else if (puncteViata < PUNCTE_NIVEL_NORMAL) {
			stareDeplasare = new StareDeplasareRanit();
		}
	}
	
	public void seVindeca(int puncte) {
		System.out.println("Eroul se vindeca");
		puncteViata += puncte;
		if (puncteViata > PUNCTE_NIVEL_NORMAL) {
			stareDeplasare = new StareDeplasareNormala();
		} else if (puncteViata > PUNCTE_NIVEL_CRITIC) {
			stareDeplasare = new StareDeplasareRanit();
		}
	}
	
	public void seDeplaseaza() {
		stareDeplasare.seMisca(this);
	}
}
