package electro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class ListenerCalc implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox<String> combo1 = Main.gui.getComboTarif();
		JComboBox<String> combo2 = Main.gui.getComboWindowCleaning();
		String item1 = (String)combo1.getSelectedItem();
		String item2 = (String)combo2.getSelectedItem();
		String[] transfer1 = Main.gui.getTransferTarif();
		String[] transfer2 = Main.gui.getTransferWindowCleaning();
		JCheckBox[] arrayCheckBox = Main.gui.getCheckBox();
		JLabel Output = Main.gui.getLabelOutput();
		JSlider sliderSize = Main.gui.getSliderSize();
		
		
		if (item1==transfer1[0]) {
			double[] cost = {2000,400,800,500,400,300,900,700,2000,1000};
			One_tarif tarif;
			if (item2==transfer2[0]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 150, 2);
				Output.setText(tarif.toString());
			}
			else if (item2==transfer2[1]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 150, 1);
				Output.setText(tarif.toString());
			}
		}
		
		if (item1==transfer1[1]) {
			double[] cost = {2000,400,800,500,400,300,900,700,2000,1000};
			One_tarif tarif;
			if (item2==transfer2[0]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 450, 2);
				Output.setText(tarif.toString());
			}
			else if (item2==transfer2[1]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 450, 1);
				Output.setText(tarif.toString());
			}
		}
		
		if (item1==transfer1[2]) {
			double[] cost = {2000,400,800,500,400,300,900,700,2000,1000};
			One_tarif tarif;
			if (item2==transfer2[0]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 340, 2);
				Output.setText(tarif.toString());
			}
			else if (item2==transfer2[1]) {
				tarif = new One_tarif(arrayCheckBox, cost, sliderSize.getValue(), 340, 1);
				Output.setText(tarif.toString());
			}
		}		
	}

}
