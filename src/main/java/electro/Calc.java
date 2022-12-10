/*
 * 
 */
package electro;

// TODO: Auto-generated Javadoc
/**
 * The Class Calc.
 */
public abstract class Calc {
	
	/** The base tarif. */
	private double baseTarif = 150;
	private double windowCleaningTarif=0;
	
	/**
	 * Mul.
	 *
	 * @param indications the indications
	 * @param sum the sum
	 * @return the double
	 */
	public double sumBaseTarif(double value, double sum) {
		sum+=baseTarif*value;
		return sum;
	}
	
	public void sumA() {	
		
	}
	
	public double sumWCTarif(double value, double sum) {
		sum+=windowCleaningTarif*value;
		return sum;
	}
	/**
	 * Gets the base tarif.
	 *
	 * @return the base tarif
	 */
	public double getBaseTarif() {
		return baseTarif;	
	}
	
	
	public double getWCTarif() {
		return windowCleaningTarif;	
	}
	
	/**
	 * Sets the base tarif.
	 *
	 * @param tarif the new base tarif
	 */
	public void setBaseTarif(double tarif) {
		this.baseTarif=tarif;
	}
	
	
	public void setWCTarif(double tarif) {
		this.windowCleaningTarif=tarif;
	}


}
