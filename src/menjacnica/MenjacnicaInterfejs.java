package menjacnica;

import java.util.GregorianCalendar;

import valute.Valuta;

public interface MenjacnicaInterfejs {
public void dodavanjeKursa(GregorianCalendar gc, float srednjiKurs, float kupovniKurs, float prodajniKurs, Valuta valuta);
public void brisanjeKursa(GregorianCalendar gc);
public void pronalazenjeKursa(GregorianCalendar gc);
}
