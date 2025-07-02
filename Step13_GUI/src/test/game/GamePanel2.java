package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel2 extends JPanel {

	Image unitImage;
	
	int unitX=0;
	int unitY=0;
	
	public GamePanel2() {
		setPreferredSize(new Dimension(500, 800));
		
		URL url=getClass().getResource("/images/unit1.png");
		unitImage=new ImageIcon(url).getImage();
		
		MouseMotionAdapter adapter=new MouseMotionAdapter() {@Override
		public void mouseMoved(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			unitX=x;
			unitY=y;
		}
		};
		
		addMouseMotionListener(adapter);
		
		Timer timer=new Timer(10, (e)->{
			repaint();
		});
		timer.start();
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(unitImage, unitX-50, unitY-50, 100, 100, this);
		
	}
}
