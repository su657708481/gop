

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Bell_Tower {
	
	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xazl1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xazl2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xazl3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xazl4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xazl5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xazl6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xazl7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "xazl8.jpg");
	
	public static void main(String[] args) {
		XA_Bell_Tower xv = new XA_Bell_Tower();
		xv.show();
	}
	
	public void show() {
		final JFrame jf = new JFrame("Qinling Mountain");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(370,450);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        西安钟楼，位于西安市中心城内东西南北四条大街的交汇处，是我国古代遗留下来众多钟楼中形制最大、保存最完整的一座。" +
						"西安钟楼无论从建筑规模、历史价值或艺术价值各方面衡量，都居全国同类建筑之冠。钟楼始建于明太祖朱元璋洪武十七年（公元1384年），因楼上悬挂铁钟一口而得名。" +
						"初建时，地址在今广济街口，与鼓楼对峙。明神宗万历十年（公元1582年）由巡安御使龚贤主持，将钟楼整体迁移于今址。" +
						"钟楼呈典型明代建筑艺术风格，重檐斗拱，攒顶高耸，屋檐微翘，华丽庄严。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,18));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 340);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 340);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 
				frame0.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						jf.setEnabled(true);
					}
				});
			}
	    });
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(380, 0, 190, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 190, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(780, 0, 370, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(0, 455, 370, 250);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(380, 355, 190, 350);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(580, 355, 190, 350);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(780, 255, 370, 450);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
		pane0.add(lb8);

		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
