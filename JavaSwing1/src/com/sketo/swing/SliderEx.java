package com.sketo.swing;
import javax.swing.*;

public class SliderEx extends JFrame
{
	public SliderEx()
	{
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);
	}
	public static void main(String[]args)
	{
		SliderEx s=new SliderEx();
		s.pack();
		s.setVisible(true);
	}
	

}
