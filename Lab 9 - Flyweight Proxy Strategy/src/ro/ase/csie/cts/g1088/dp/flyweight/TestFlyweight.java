package ro.ase.csie.cts.g1088.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		DateEcran soldat1 = new DateEcran(100, 50, 50, "Verde");
		DateEcran soldat2 = new DateEcran(100, 500, 50, "Rosu");
		DateEcran cladire1 = new DateEcran(100, 100, 0, "Gri");
		DateEcran cladire2 = new DateEcran(10, 100, 0, "Maro");
		
		Model3DFactory.getModel(TipModel3D.SOLDAT).afisareEcran(soldat1);
		Model3DFactory.getModel(TipModel3D.SOLDAT).afisareEcran(soldat2);
		Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire1);
		Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire2);
	}

}
