package electro;
import javax.swing.JCheckBox;
public final class One_tarif extends Calc {
	
	//private JCheckBox[] checkBox;
	//private double[] cost = {2000,400,800,500,400,300,900,700,2000,1000};
	private double sum=0;
	
	protected One_tarif(JCheckBox[] checkB, double[] cost, double size, double baseTarif, double WCTarif) {
		//System.out.println(checkB.length);
		for (int i = 0; i < checkB.length-2; i++) {
			if(checkB[i] != null) {
				if(checkB[i].isSelected()) {
					sum = sumA(cost[i], sum);
				}
			}
			
		}
		setWCTarif(WCTarif);
		for (int i = checkB.length-2; i < checkB.length; i++)
		if(checkB[i] != null) {
			if(checkB[i].isSelected()) 
			{
				sum = sumWCTarif(cost[i], sum);
			}
		}
		setBaseTarif(baseTarif);
		//System.out.println(baseTarif);
		sum = sumBaseTarif(size,sum);
		//System.out.println(sumBaseTarif(size,sum));
		//System.out.println(sum);
		
	}
	
	private double sumA(double cost, double sum) {	
		sum+=cost;
		return sum;
	}
	
	public double getSum() {
		return sum;
	}
	
	public String toString() {
		
		return String.valueOf(getSum())+ " руб.";
	}
	

}
