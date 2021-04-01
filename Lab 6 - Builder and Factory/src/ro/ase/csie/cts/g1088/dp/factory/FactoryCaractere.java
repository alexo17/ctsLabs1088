package ro.ase.csie.cts.g1088.dp.factory;

public class FactoryCaractere {
	
	public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
		CaracterAbstract caracter = null;
		
		switch(tip) {
		case DISNEY:
			caracter = new CaracterDisney("alb", nume);
			break;
		case MARVEL:
			caracter = new CaracterMarvel(50, nume);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return caracter;
	}
	
}
