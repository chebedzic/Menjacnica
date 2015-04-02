package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valuta;
import valute.Vrednost;

public class RadMenjacnice implements MenjacnicaInterfejs {

	private LinkedList<Vrednost> kursevi = new LinkedList<Vrednost>();

	public void dodavanjeKursa(GregorianCalendar gc, float srednjiKurs,
			float kupovniKurs, float prodajniKurs, Valuta valuta) {
		Vrednost vr = new Vrednost();
		vr.setDatum(gc);
		vr.setKupvniKurs(kupovniKurs);
		vr.setNazivValute(valuta);
		vr.setProdajniKurs(prodajniKurs);
		vr.setSrednjiKurs(srednjiKurs);
		kursevi.add(vr);
	}
	public void brisanjeKursa(GregorianCalendar gc) {
		for (int i = 0; i < kursevi.size(); i++) {
			if (kursevi.get(i).getDatum().equals(gc)) {
				kursevi.remove(i);
				return;
			}
		}
	}
	public Vrednost pronalazenjeKursa(GregorianCalendar gc) {
		for (int i = 0; i < kursevi.size(); i++) {
			if (kursevi.get(i).getDatum().equals(gc)) {
				return kursevi.get(i);
			}
		}
		throw new RuntimeException("Nepostoji kurs za trazeni datum");
	}

}
