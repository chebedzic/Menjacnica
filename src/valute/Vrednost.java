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
		if (nazivValute != null) {
			this.nazivValute = nazivValute;
		} else {
			throw new RuntimeException("Greska:nedozvoljn unos podataka");
		}
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum != null) {
			this.datum = datum;
		} else {
			throw new RuntimeException("Greska: ne dozvoljen unos.");
		}
	}

	public float getKupvniKurs() {
		return kupvniKurs;
	}

	public void setKupvniKurs(float kupvniKurs) {
		if (kupvniKurs > 0) {
			this.kupvniKurs = kupvniKurs;
		} else {
			throw new RuntimeException("Greska:nedozvoljena uneta vrednost");
		}
	}

	public float getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(float srednjiKurs) {
		if (srednjiKurs > 0) {
			this.srednjiKurs = srednjiKurs;
		} else {
			throw new RuntimeException("Greska:nedozvoljena uneta vrednost");
		}
	}

	public float getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(float prodajniKurs) {
		if (prodajniKurs > 0) {
			this.prodajniKurs = prodajniKurs;
		} else {
			throw new RuntimeException("Greska:nedozvoljena uneta vrednost");
		}
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result
				+ ((nazivValute == null) ? 0 : nazivValute.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vrednost other = (Vrednost) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		return true;
	}

	public String toString() {
		return "Naziv valute:" + nazivValute + ", datum:" + datum
				+ ", kupvni kurs:" + kupvniKurs + ", srednji kurs:"
				+ srednjiKurs + ", prodajni kurs:" + prodajniKurs;
	}

}
