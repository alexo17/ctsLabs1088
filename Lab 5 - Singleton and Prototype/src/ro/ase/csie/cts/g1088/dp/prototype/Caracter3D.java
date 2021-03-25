package ro.ase.csie.cts.g1088.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {
	
	private String fisierModel3D;
	private String culoare;
	private int inaltime;
	private ArrayList<Integer> puncteGrafic;
	
	private Caracter3D() {
		
	}
	
	public Caracter3D(String fisierModel3D) {
		System.out.println("Se incarca modelul 3D din " + fisierModel3D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.fisierModel3D = fisierModel3D;
		
		Random random = new Random();
		puncteGrafic = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Caracter3D copie = new Caracter3D();
		copie.fisierModel3D = fisierModel3D;
		copie.culoare = culoare;
		copie.puncteGrafic = (ArrayList<Integer>) puncteGrafic.clone();
		return copie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caracter3D [fisierModel3D=");
		builder.append(fisierModel3D);
		builder.append(", culoare=");
		builder.append(culoare);
		builder.append(", inaltime=");
		builder.append(inaltime);
		builder.append(", puncteGrafic=");
		builder.append(puncteGrafic);
		builder.append("]");
		return builder.toString();
	}
	
	
}
