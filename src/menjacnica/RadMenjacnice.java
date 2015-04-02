package menjacnica;

import java.util.GregorianCalendar;

import valute.Valuta;
import valute.Vrednost;

public class RadMenjacnice implements MenjacnicaInterfejs {
	Vrednost[] kursevi = new Vrednost[365];
	int br = 0;

	public void dodavanjeKursa(GregorianCalendar gc, float srednjiKurs,
			float kupovniKurs, float prodajniKurs, Valuta valuta) {
		Vrednost vr = new Vrednost();
		vr.setDatum(gc);
		vr.setKupvniKurs(kupovniKurs);
		vr.setNazivValute(valuta);
		vr.setProdajniKurs(prodajniKurs);
		vr.setSrednjiKurs(srednjiKurs);
		kursevi[br] = vr;
	}

	public void brisanjeKursa(GregorianCalendar gc) {
		for (int i = 0; i < kursevi.length; i++) {
			if (kursevi[i].getDatum().equals(gc)) {
				kursevi[i] = null;
				return;
			}
		}

	}

	public Vrednost pronalazenjeKursa(GregorianCalendar gc) {
		for (int i = 0; i < kursevi.length; i++) {
			if (kursevi[i].getDatum().equals(gc)) {
				return kursevi[i];
			}

		}
		throw new RuntimeException("Nema trazenog datuma");

	}

}
