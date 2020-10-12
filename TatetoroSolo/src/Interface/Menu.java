package Interface;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Menu extends GraphicInterface {
	private Image black;
	private Image tatetiN;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setUp();
		JLabel lblNewLabel = new JLabel("");
		black = new ImageIcon(this.getClass().getResource("/black.png")).getImage();
		tatetiN = new ImageIcon(this.getClass().getResource("/tatetiN.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(tatetiN));
		lblNewLabel_1.setBounds(120, 30, 221, 80);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Play playW = new Play();
				playW.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(161, 130, 150, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Como jugar");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				howToPlay howTo = new howToPlay(contentPane.getBackground());
				howTo.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(161, 220, 150, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(161, 310, 150, 40);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel.setIcon(new ImageIcon(black));
		lblNewLabel.setBounds(0, 0, 472, 450);
		contentPane.add(lblNewLabel);
		
	}
}

