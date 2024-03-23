import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBox extends JPanel{
	public ComboBox(){
		
		String [] frutaStrings = {"Banana", "Naranja","Pera", "Durazno"};
		
		JComboBox<String> listaFrutasBox = new JComboBox<String>(frutaStrings);
		listaFrutasBox.setSelectedIndex(0);
		add(listaFrutasBox);
		
	}
}
