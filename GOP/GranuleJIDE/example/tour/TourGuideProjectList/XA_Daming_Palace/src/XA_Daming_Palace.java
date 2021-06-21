

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Daming_Palace {

	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xadmg1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xadmg2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xadmg3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xadmg4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xadmg5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xadmg6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xadmg7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "xadmg8.jpg");	
	
	/*public static void main(String[] args) {
		XA_Daming_Palace xv = new XA_Daming_Palace();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Huaqing Spring");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(265,231);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 237, 265, 231);
		final JButton lb3 = new JButton(xc3);
		lb3.setBounds(275, 0, 600, 468);
		lb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        唐大明宫是东方园林建筑艺术的杰出代表，被誉为丝绸之路的东方圣殿。大明宫遗址是1961年国务院首批公布的重点文物保护单位，是国际古遗址理事会确定的具有世界意义的重大遗址保护工程，是丝绸之路整体申请世界文化遗产的重要组成部分。" +
						      "大明宫国家遗址公园是西安城市建设、大遗址保护和改善民生的重点工程，西安的“城市中央公园”，使大明宫遗址区保护成为带动西安率先发展、均衡发展、科学发展的城市增长极，成为西安未来城市发展的生态基础、最重要的人文象征，并成为" +
						      "世界文明古都的重要支撑，进一步提升西安的城市特色。");
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
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(885, 0, 265, 231);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(885, 237, 265, 231);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(0, 474, 380, 231);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(385, 474, 380, 231);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(770, 474, 380, 231);
				
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
