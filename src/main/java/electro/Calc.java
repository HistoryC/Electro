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
	 * ������������ � ���������� baseTarif
	 * @param value - ������ ��������
	 * @param sum
	 * @return sum
	 */
	public double sumBaseTarif(double value, double sum) {
		sum+=baseTarif*value;
		return sum;
	}
	/**
	 * �����
	 */
	public void sumA() {	
		
	}
	/**
	 * ������������ � ���������� windowCleaningTarif
	 * @param value - ��������� ����� ����
	 * @param sum
	 * @return sum
	 */
	public double sumWCTarif(double value, double sum) {
		sum+=windowCleaningTarif*value;
		return sum;
	}
	/**
	 * ���������� �������� ���������� baseTarif
	 * @return baseTarif
	 */
	public double getBaseTarif() {
		return baseTarif;	
	}
	
	/**
	 * ���������� �������� ���������� windowCleaningTarif
	 * @return windowCleaningTarif
	 */
	public double getWCTarif() {
		return windowCleaningTarif;	
	}
	
	/**
	 * ������������� ���������� baseTarif ����� ��������
	 * @param tarif
	 */
	public void setBaseTarif(double tarif) {
		this.baseTarif=tarif;
	}
	
	/**
	 * ������������� ���������� windowCleaningTarif ����� ��������
	 * @param tarif
	 */
	public void setWCTarif(double tarif) {
		this.windowCleaningTarif=tarif;
	}


}
