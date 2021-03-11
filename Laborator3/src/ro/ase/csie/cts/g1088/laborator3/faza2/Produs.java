package ro.ase.csie.cts.g1088.laborator3.faza2;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {

	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if (pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}
	
	public static void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if (vechimeClientInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}
	
	public static float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM
				: (float) vechimeClientInAni / 100;
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	

	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient {
		validarePret(pretInitial);
		validareVechimeClient(vechimeClientInAni);
		float pretFinal = 0;
		float discountFidelitate = getDiscountFidelitate(vechimeClientInAni);
		float discount = tipProdus.getDiscount();
		float valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount);
		switch(tipProdus) {
			case NOU:
				pretFinal = pretInitial;
				break;
			case DISCOUNT:
				pretFinal = valoareDiscountTipProdus
				- discountFidelitate * valoareDiscountTipProdus;
				break;
			case STOC_LIMITAT:
				pretFinal = valoareDiscountTipProdus
				- discountFidelitate * valoareDiscountTipProdus;
				break;
			case VECHI:
				pretFinal = valoareDiscountTipProdus
				- discountFidelitate * valoareDiscountTipProdus;
				break;
			default:
				throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat");
		}
		
//		if (tipProdus == TipProdus.NOU) {
//			pretFinal = pretInitial;
//		} else if (tipProdus == TipProdus.DISCOUNT) {
//			float discount = TipProdus.DISCOUNT.getDiscount();
//			pretFinal = (pretInitial - (discount * pretInitial))
//					- discountFidelitate * (pretInitial - (discount * pretInitial));
//		} else if (tipProdus == TipProdus.STOC_LIMITAT) {
//			float discount = TipProdus.STOC_LIMITAT.getDiscount();
//			pretFinal = (pretInitial - (discount * pretInitial))
//					- discountFidelitate * (pretInitial - (discount * pretInitial));
//		} else if (tipProdus == TipProdus.VECHI) {
//			float discount = TipProdus.VECHI.getDiscount();
//			pretFinal = (pretInitial - (discount * pretInitial))
//					- discountFidelitate * (pretInitial - (discount * pretInitial));
//		}
		return pretFinal;
	}
}