package valute;

import java.util.GregorianCalendar;

public class Vrednost {
private Valuta nazivValute;
private GregorianCalendar datum;
private float kupvniKurs;
private float srednjiKurs;
private float prodajniKurs;
public Valuta getNazivValute() {
	return nazivValute;
}
public void setNazivValute(Valuta nazivValute) {
	this.nazivValute = nazivValute;
}
public GregorianCalendar getDatum() {
	return datum;
}
public void setDatum(GregorianCalendar datum) {
	this.datum = datum;
}
public float getKupvniKurs() {
	return kupvniKurs;
}
public void setKupvniKurs(float kupvniKurs) {
	this.kupvniKurs = kupvniKurs;
}
public float getSrednjiKurs() {
	return srednjiKurs;
}
public void setSrednjiKurs(float srednjiKurs) {
	this.srednjiKurs = srednjiKurs;
}
public float getProdajniKurs() {
	return prodajniKurs;
}
public void setProdajniKurs(float prodajniKurs) {
	this.prodajniKurs = prodajniKurs;
}

}
