package valute;

public class Valuta {
	private String skrIme;
	private String punoIme;
	public String getSkrIme() {
		return skrIme;
	}
	public void setSkrIme(String skrIme) {
		this.skrIme = skrIme;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skrIme == null) ? 0 : skrIme.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (skrIme == null) {
			if (other.skrIme != null)
				return false;
		} else if (!skrIme.equals(other.skrIme))
			return false;
		return true;
	}
	public String toString() {
		return "Skraceno ime:" + skrIme + ", puno ime:" + punoIme;
	}
	
}
