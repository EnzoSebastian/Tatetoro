package Interface;

import java.awt.Color;
import java.awt.DisplayMode;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GraphicInterface extends JFrame {

	protected JPanel contentPane;
	protected int width;
	protected int height;
	protected DisplayMode mode;

	public GraphicInterface() {
		width = 472;
		height = 450;
		mode = this.getGraphicsConfiguration().getDevice().getDisplayMode();
	}

	protected void setUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((mode.getWidth()/2)-(width/2), (mode.getHeight()/2)-(height/2), width, height);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
