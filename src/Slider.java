import javax.swing.JPanel;
import javax.swing.JSlider;

public class Slider extends JPanel{
	public Slider() {
		JSlider slider = new JSlider(0, 100,10);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		add(slider);
		
	}
}
