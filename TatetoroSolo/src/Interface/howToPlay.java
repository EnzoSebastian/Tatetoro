package Interface;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class howToPlay extends GraphicInterface {
	private Image image;
	private Image black;


	/**
	 * Create the frame.
	 */
	public howToPlay(Color color) {
		setUp();
		image = new ImageIcon(this.getClass().getResource("/toroidal.png")).getImage();
		black = new ImageIcon(this.getClass().getResource("/black.png")).getImage();
		
		JTextPane txtpnElObjetivoDel = new JTextPane();
		txtpnElObjetivoDel.setFont(new Font("Cambria", Font.BOLD, 14));
		txtpnElObjetivoDel.setText(" Este juego es similar al ta-te-ti clasico sobre un tablero de 3 × 3,"
				+ " pero se considera que las celdas estan conectadas de manera toroidal. Es decir, un jugador"
				+ " gana si ubica tres piezas propias en tres celdas seguidas (en una misma fila, columna o diagonal),"
				+ " y se considera que una diagonal continua del otro lado del tablero. Por ejemplo, las siguientes"
				+ " posiciones son ganadoras para el jugador que juega con los cırculos:");
		txtpnElObjetivoDel.setBounds(79, 11, 320, 170);
		txtpnElObjetivoDel.setEditable(false);
		contentPane.add(txtpnElObjetivoDel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu frame = new Menu();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(373, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(79, 205, 320, 150);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(black));
		lblNewLabel_1.setBounds(0, 0, 472, 450);
		contentPane.add(lblNewLabel_1);
	}
}
