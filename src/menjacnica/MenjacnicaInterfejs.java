package menjacnica;

import java.util.GregorianCalendar;

import valute.Valuta;
import valute.Vrednost;

public interface MenjacnicaInterfejs {
public void dodavanjeKursa(GregorianCalendar gc, float srednjiKurs, float kupovniKurs, float prodajniKurs, Valuta valuta);
public void brisanjeKursa(GregorianCalendar gc);
public Vrednost pronalazenjeKursa(GregorianCalendar gc);
}
