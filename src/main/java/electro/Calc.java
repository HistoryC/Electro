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
	/** The Window Cleaning tarif. */
	private double windowCleaningTarif=0;
	
	/**
	 * перемножение с переменной baseTarif
	 * @param value - размер квартиры
	 * @param sum
	 * @return sum
	 */
	public double sumBaseTarif(double value, double sum) {
		sum+=baseTarif*value;
		return sum;
	}
	/**
	 * сумма
	 */
	public void sumA() {	
		
	}
	/**
	 * перемножение с переменной windowCleaningTarif
	 * @param value - стоимость мойки окон
	 * @param sum
	 * @return sum
	 */
	public double sumWCTarif(double value, double sum) {
		sum+=windowCleaningTarif*value;
		return sum;
	}
	/**
	 * возвращает значение переменной baseTarif
	 * @return baseTarif
	 */
	public double getBaseTarif() {
		return baseTarif;	
	}
	
	/**
	 * возвращает значение переменной windowCleaningTarif
	 * @return windowCleaningTarif
	 */
	public double getWCTarif() {
		return windowCleaningTarif;	
	}
	
	/**
	 * устанавливает переменной baseTarif новое значение
	 * @param tarif
	 */
	public void setBaseTarif(double tarif) {
		this.baseTarif=tarif;
	}
	
	/**
	 * устанавливает переменной windowCleaningTarif новое значение
	 * @param tarif
	 */
	public void setWCTarif(double tarif) {
		this.windowCleaningTarif=tarif;
	}


}
