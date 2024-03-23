import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JPanel {
	public RadioButton() {
		JRadioButton maleRdb = new JRadioButton("Masculino"); 
		JRadioButton femaleRdb = new JRadioButton("Femenino");
		
		add(maleRdb);
		add(femaleRdb);
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(maleRdb);
		sexo.add(femaleRdb);
	}
}
