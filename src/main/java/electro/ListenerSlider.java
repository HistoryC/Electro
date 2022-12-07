package electro;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.JSlider;
import javax.swing.JLabel;

public class ListenerSlider implements ChangeListener{
	
	@Override
	public void stateChanged(ChangeEvent e) {
		int value = ((JSlider)e.getSource()).getValue();
		JLabel text = Main.gui.getTextSize();
		text.setText("Площадь квартиры кв/м2: " + value);
		

	}
}
