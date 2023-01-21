package BlackJack_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BlackJack_App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack_App frame = new BlackJack_App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlackJack_App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel inicio = new JPanel();
		contentPane.add(inicio, "name_176543992180000");
		inicio.setLayout(null);
		
		JLabel lbl_name = new JLabel("Name:");
		lbl_name.setForeground(new Color(255, 255, 255));
		lbl_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_name.setBounds(307, 312, 65, 26);
		inicio.add(lbl_name);
		
		textField = new JTextField();
		textField.setBounds(271, 351, 138, 26);
		inicio.add(textField);
		textField.setColumns(10);
		
		JButton btn_play = new JButton("PLAY");
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_play.setBounds(296, 200, 89, 23);
		inicio.add(btn_play);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setIcon(new ImageIcon("C:\\Users\\Ibai Alvarez\\Desktop\\ProyectosJAVA\\BlackJack\\src\\resources\\crupier.jpg"));
		lbl_fondo.setBounds(0, 0, 708, 439);
		inicio.add(lbl_fondo);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("C:\\Users\\Ibai Alvarez\\Desktop\\ProyectosJAVA\\BlackJack\\src\\resources\\crupier.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image img_fondo = img.getScaledInstance(lbl_fondo.getWidth(), lbl_fondo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(img_fondo);
		lbl_fondo.setIcon(imageIcon);
		
		JPanel tablero = new JPanel();
		contentPane.add(tablero, "name_176548224081800");
		tablero.setLayout(null);
		
		JPanel fin = new JPanel();
		fin.setLayout(null);
		contentPane.add(fin, "name_176721581162400");
		
		JLabel fin_txt = new JLabel("FIN DEL JUEGO");
		fin_txt.setFont(new Font("Tahoma", Font.PLAIN, 27));
		fin_txt.setBounds(254, 170, 231, 54);
		fin.add(fin_txt);
	}
}
