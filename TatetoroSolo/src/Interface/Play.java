package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Logic.Board;

@SuppressWarnings("serial")
public class Play extends GraphicInterface {
	private Board board;
	private Image tatetiB;
	private boolean winner;

	/**
	 * Create the frame.
	 */
	public Play() {
		setUp();
		board = new Board();
		tatetiB = new ImageIcon(this.getClass().getResource("/tatetiB.png")).getImage();
		contentPane.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("TURN :");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(10, 11, 65, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(String.valueOf(board.getTurn()));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(85, 11, 21, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLAYER :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setBounds(346, 11, 85, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3.setBounds(441, 11, 21, 20);
		getContentPane().add(lblNewLabel_3);

		JButton button1 = new JButton("");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button1.addMouseListener(new MouseAdapter() {
			int posicion = 1;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button1, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button1.setBounds(7, 135, 145, 85);
		getContentPane().add(button1);

		JButton button4 = new JButton("");
		button4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button4.addMouseListener(new MouseAdapter() {
			int posicion = 4;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button4, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button4.setBounds(7, 230, 145, 85);
		getContentPane().add(button4);
		
		JButton button7 = new JButton("");
		button7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button7.addMouseListener(new MouseAdapter() {
			int posicion = 7;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button7, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button7.setBounds(7, 325, 145, 85);
		getContentPane().add(button7);

		JButton button2 = new JButton("");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button2.addMouseListener(new MouseAdapter() {
			int posicion = 2;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button2, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button2.setBounds(162, 135, 145, 85);
		getContentPane().add(button2);

		JButton button5 = new JButton("");
		button5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button5.addMouseListener(new MouseAdapter() {
			int posicion = 5;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button5, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button5.setBounds(162, 230, 145, 85);
		getContentPane().add(button5);
		
		JButton button8 = new JButton("");
		button8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button8.addMouseListener(new MouseAdapter() {
			int posicion = 8;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button8, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button8.setBounds(162, 325, 145, 85);
		getContentPane().add(button8);
		
		JButton button3 = new JButton("");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button3.addMouseListener(new MouseAdapter() {
			int posicion = 3;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button3, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button3.setBounds(317, 135, 145, 85);
		getContentPane().add(button3);

		JButton button6 = new JButton("");
		button6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button6.addMouseListener(new MouseAdapter() {
			int posicion = 6;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button6, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button6.setBounds(317, 230, 145, 85);
		getContentPane().add(button6);


		JButton button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button9.addMouseListener(new MouseAdapter() {
			int posicion = 9;

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!winner) {
					pressButton(button9, posicion, lblNewLabel_1, lblNewLabel_3);	
				}
			}
		});
		button9.setBounds(317, 325, 145, 85);
		getContentPane().add(button9);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu frame = new Menu();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(373, 421, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(190, 421, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Play playW = new Play();
				playW.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 421, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(tatetiB));
		lblNewLabel_4.setBounds(114, 42, 221, 80);
		contentPane.add(lblNewLabel_4);
		
	}
	
	public void pressButton(JButton button, int position,JLabel label1,JLabel label2) {
		String ficha = board.pressButton(position);
		if ( ficha != "") {
			if(ficha == "X") {
				button.setForeground(Color.BLUE);
			}
			else {
				button.setForeground(Color.RED);
			}
			button.setText(ficha);
			label1.setText(String.valueOf(board.getTurn()));
			label2.setText(board.returnPlayer());
			if (board.getWinner()) {
				JOptionPane.showMessageDialog(this, "El ganador es: " + ficha);
				winner = true;
			}
		}
	}

}
