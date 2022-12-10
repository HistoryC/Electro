package electro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ListenerCalc implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox<String> combo1 = Main.gui.getComboTarif();
		JComboBox<String> combo2 = Main.gui.getComboWindowCleaning();
		String item1 = (String)combo1.getSelectedItem();
		String item2 = (String)combo2.getSelectedItem();
		String[] transfer1 = Main.gui.getTransferTarif();
		String[] transfer2 = Main.gui.getTransferWindowCleaning();
		JLabel Output = Main.gui.getLabelOutput();	
		
		if (item1==transfer1[0]) {
			if (item2==transfer2[0]) {
				Output.setText("1");
			}
			else if (item2==transfer2[1]) {
				Output.setText("2");
				System.out.print(false);
			}
		}
		
		if (item1==transfer1[1]) {

			if (item2==transfer2[0]) {
				Output.setText("3");
			}
			else if (item2==transfer2[1]) {
				Output.setText("4");
			}
		}
		
		if (item1==transfer1[2]) {

			if (item2==transfer2[0]) {
				Output.setText("5");
			}
			else if (item2==transfer2[1]) {
				Output.setText("6");
			}
		}		
	}
}
