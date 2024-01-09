import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseFake extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	
	public MouseFake() {
		JPanel panel = new JPanel();
		CardLayout card = new CardLayout();
		panel.setLayout(card);
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_31260077656000");
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JPanel fake = new JPanel();
		JLabel lblfake = new JLabel("물고기야");
		fake.add(lblfake);
		panel.add(fake, "fake");
		add(panel);
		
		JLabel lblNewLabel = new JLabel("아이디");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 92, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 43, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel, -335, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, -393, SpringLayout.EAST, panel_1);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("로그인");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 91, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, -151, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, -136, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -34, SpringLayout.EAST, panel_1);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, 93, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 17, SpringLayout.EAST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textField, 127, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, -208, SpringLayout.EAST, panel_1);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, passwordField);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, passwordField);
		sl_panel_1.putConstraint(SpringLayout.NORTH, passwordField, 270, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, passwordField, 304, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, passwordField, 110, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("물고기야");
		lblNewLabel_2.setPreferredSize(new Dimension(48, 54));
		panel.add(lblNewLabel_2, "name_31276369568900");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				card.show(panel, "fake");
			}
		});
		
		showGUI();
		
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseFake();
	}
}
