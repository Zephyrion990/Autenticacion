import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		// Tamaño
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		

		setTitle("Registro");
		setBounds(screenWidth / 2, screenHeight / 2, 500, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JTabbedPane compExample= new JTabbedPane();
		Registro registro = new Registro();
		ComboBox comboBoxExample = new ComboBox();
		Slider sliderExample = new Slider();
		RadioButton radioExample = new RadioButton();
		
		compExample.addTab("Registro", registro);
		compExample.addTab("ComboBox", comboBoxExample);
		compExample.addTab("RadioButton", radioExample);
		compExample.addTab("Slider", sliderExample);
		
		add(compExample);
			
	}
}
