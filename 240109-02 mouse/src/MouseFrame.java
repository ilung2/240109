import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MouseFrame extends JFrame {
	public MouseFrame() {
		JPanel pnl = new JPanel();
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		pnl.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				System.out.println("마우스 버튼 땜");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼 누름");
				System.out.println("마우스 버튼:" + e.getButton());
				if (SwingUtilities.isLeftMouseButton(e)) {
					System.out.println("왼쪽 버튼 누름");
				}
				System.out.println("마우스 누른 수: " + e.getClickCount());
						
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭");
			}
			@Override
			public void mouseExited(MouseEvent e) {
//				System.out.println("마우스가 버튼 밖으로 나감");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
//				System.out.println("마우스가 버튼 안으로 들어옴");
//				System.out.println("X 좌표: " + e.getX()); // 버튼 기준
//				System.out.println("Y 좌표: " + e.getY());
//				System.out.println(e.getLocationOnScreen()); // 화면 기준
				
			}
		});
		
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		
		add(pnl);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseFrame();
	}
}
