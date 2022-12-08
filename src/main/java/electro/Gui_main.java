package electro;

import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Color;


public class Gui_main {
	private JComboBox<String> combo_tarif;
	private JComboBox<String> combo_windowCleaning;
	private JLabel TextOutput = new JLabel("");
	private String[] transfer1 = {"Поддерживающая", "После ремонта", "Генеральная"};
	private String[] transfer2 = {"Ручная", "Роботом"};
	private JFrame main_GUI;
	private JPanel main_panel;
	private JPanel addServices_panel;
	private JPanel windowCleaning_panel;
	private JSlider sliderSize;
	private JCheckBox checkBox1 = new JCheckBox();
	private JCheckBox checkBox2 = new JCheckBox();
	private JCheckBox checkBox3 = new JCheckBox();
	private JCheckBox checkBox4 = new JCheckBox();
	private JCheckBox checkBox5 = new JCheckBox();
	private JCheckBox checkBox6 = new JCheckBox();
	private JCheckBox checkBox7 = new JCheckBox();
	private JCheckBox checkBox8 = new JCheckBox();
	private JCheckBox checkBox9 = new JCheckBox();
	private JCheckBox checkBox10 = new JCheckBox();
	private JCheckBox[] arrayCheckBox = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10};
	private Border blackline = BorderFactory.createLineBorder(Color.black);
	private TitledBorder blineTitled_main;
	private TitledBorder blineTitled_addServices;
	private TitledBorder blineTitled_windowCleaning;
	private JLabel TextSize;
	private JLabel TextTarif;
	
	public Gui_main(String name, String label){	
	
		main_GUI = new JFrame("MegaClean");
		main_GUI.setTitle (name);
		main_GUI.setBounds(600,150,665,530);
		main_GUI.setResizable(false); 		
		
		main_panel = new JPanel();
		main_panel.setLayout(null);
		blineTitled_main = BorderFactory.createTitledBorder(blackline, "MegaClean");
		main_panel.setBorder(blineTitled_main);
		main_GUI.add(main_panel);
		
		addServices_panel = new JPanel();
		addServices_panel.setLayout(null);
		addServices_panel.setBounds(300, 80, 320, 270);
		blineTitled_addServices = BorderFactory.createTitledBorder(blackline, "Дополнительные услуги");
		addServices_panel.setBorder(blineTitled_addServices);
		main_panel.add(addServices_panel);
		
		windowCleaning_panel = new JPanel();
		windowCleaning_panel.setLayout(null);
		windowCleaning_panel.setBounds(30, 80, 250, 270);
		blineTitled_windowCleaning = BorderFactory.createTitledBorder(blackline, "Мойка стёкол");
		windowCleaning_panel.setBorder(blineTitled_windowCleaning);
		main_panel.add(windowCleaning_panel);

		
		TextTarif = new JLabel("Выберите вид уборки: ");
		TextTarif.setBounds(30, 15, 300, 30);
		main_panel.add(TextTarif);
		
		combo_tarif = new JComboBox<String>(transfer1);
		combo_tarif.setBounds(30,40,250,20);
		main_panel.add(combo_tarif);
		
		TextSize = new JLabel("Площадь квартиры кв/м2: 1");
		TextSize.setBounds(300, 15, 320, 30);
		main_panel.add(TextSize);
		
		sliderSize = new JSlider(1, 100, 1);
		sliderSize.setPaintTicks(true);
		ChangeListener sizeListener = new ListenerSlider();
		sliderSize.addChangeListener(sizeListener);
		sliderSize.setBounds(300,40,320,30);
		main_panel.add(sliderSize);
		
		checkBox1.setText("Химчистка дивана");
		checkBox1.setBounds(10, 20, 300, 20);
		addServices_panel.add(checkBox1);
		
		checkBox2.setText("Химчистка стула");
		checkBox2.setBounds(10, 50, 300, 20);
		addServices_panel.add(checkBox2);	
		
		checkBox3.setText("Химчистка дивана");
		checkBox3.setBounds(10, 80, 300, 20);
		addServices_panel.add(checkBox3);	
		
		checkBox4.setText("Химчистка ковра");
		checkBox4.setBounds(10, 110, 300, 20);
		addServices_panel.add(checkBox4);	
		
		checkBox5.setText("Химчистка пуфика");
		checkBox5.setBounds(10, 140, 300, 20);
		addServices_panel.add(checkBox5);	
		
		checkBox6.setText("Химчистка люстр");
		checkBox6.setBounds(10, 170, 300, 20);
		addServices_panel.add(checkBox6);	
		
		checkBox7.setText("Мытьё духовки, гриля и микроволновой печи");
		checkBox7.setBounds(10, 200, 300, 20);
		addServices_panel.add(checkBox7);
		
		checkBox8.setText("Мытьё холодильника, морозильника");
		checkBox8.setBounds(10, 230, 300, 20);
		addServices_panel.add(checkBox8);	
		
		combo_windowCleaning = new JComboBox<String>(transfer2);
		combo_windowCleaning.setBounds(10, 20, 150, 20);
		windowCleaning_panel.add(combo_windowCleaning);
		
		checkBox9.setText("С деревянными створками");
		checkBox9.setBounds(10, 50, 200, 20);
		windowCleaning_panel.add(checkBox9);
		
		checkBox10.setText("С пластиковыми створками");
		checkBox10.setBounds(10, 80, 200, 20);
		windowCleaning_panel.add(checkBox10);
		
		
		JLabel labelOutput = new JLabel("Всего сумма к оплате:");
		labelOutput.setBounds(30,300,250,30);
		main_panel.add(labelOutput);
		
		TextOutput = new JLabel("");
		TextOutput.setBounds(300,345,300,40);
		TextOutput.setEnabled(false);
		main_panel.add(TextOutput);
		
		
		
		JButton button_create = new JButton("Расчет платы");
		button_create.setBounds(30,380,590,40);
		ActionListener actionCreate = new ListenerCalc();
		button_create.addActionListener(actionCreate);
		main_panel.add(button_create);
		
		JButton button_exit = new JButton("Выход");
		button_exit.setBounds(30,430,590,40);
		ActionListener actionListener = new ListenerButton();
		button_exit.addActionListener(actionListener); 
		main_panel.add(button_exit);
		
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public JPanel getPanel() {
		return main_panel;
	}

	public String[] getTransferTarif() {
		return transfer1;
	}
	
	public String[] getTransferWindowCleaning() {
		return transfer2;
	}
	
	public JLabel getLabelOutput() {
		return TextOutput;
	}
	
	public JComboBox<String> getComboTarif() {
		return combo_tarif;
	}
	
	public JComboBox<String> getComboWindowCleaning() {
		return combo_windowCleaning;
	}
	
	public JSlider getSliderSize() {
		return sliderSize;
	}
	
	public JCheckBox[] getCheckBox() {
		return arrayCheckBox;
	}
	
	public JLabel getTextSize() {
		return TextSize;
	}
}
