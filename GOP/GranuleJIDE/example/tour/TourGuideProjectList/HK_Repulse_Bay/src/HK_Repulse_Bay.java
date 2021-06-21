

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HK_Repulse_Bay {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkqsw1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkqsw2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkqsw3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkqsw4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkqsw5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkqsw6.jpg");
	
	/*public static void main(String[] args) {
		HK_Repulse_Bay xv = new HK_Repulse_Bay();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Repulse Bay");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(285,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        香港浅水湾号称“天下第一湾”，也有“东方夏威夷”之美誉，是香港最具代表性的沙滩。浅水湾英文名为Repulse Bay，epulse为 “击退”之意，是以前一艘负责巡逻此区英国海军战舰名字。" +
						"浅水湾在香港岛之南，依山傍海，海湾呈新月形，坡缓滩长，波平浪静，水清沙细，沙滩宽阔洁净而水浅，且冬暖夏凉，水温在十六摄氏度至二十七摄氏度之间，历来是港人消夏弄潮的胜地，" +
						"也是游人必至的著名风景区。昔日，香江八景之一的“海国浮沉”，指的就是浅水湾的海滨浴场。浅水湾是香港最高尚住宅区之一，众多的别墅豪宅遍布于海湾的坡地上，其中就有香港富商李嘉诚、" +
						"包玉刚的豪宅；张爱玲的《倾城之恋》中所提及的浅水湾酒店现已变成了影湾园，该园的前庭再现了昔日浅水湾酒店的日式园林建筑风格，后部则辟为了商场及公寓大厦。" +
						"同时也是香港最受欢迎及交通最方便最具代表性的泳滩，是游人必到的著名风景区。这里的阳光、沙滩、海水确实令人意荡神驰。浅水湾浪平沙细，滩床宽阔，坡度平缓，海水温暖。" +
						"夏令时节，是浅水湾最热闹的时候。大批游客蜂拥而至，沙滩上人山人海，各式泳装组成了一幅色彩斑斓的画面。即使是在冬天，海滩上也可以看到身着泳装的青年男女。浅水湾东端的林荫下，" +
						"设置着许多烧烤炉。在充满野趣的氛围之中，搏浪戏水后的游客可以尽情地品尝烧烤的美味。在沙滩周围有许多酒家、快餐店和超级市场。临海的茶座，则是欣赏红日西沉，涛声拍岸的好地方。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(560, 420);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(564, 420);
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
		lb2.setBounds(290, 0, 285, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 570, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 355, 570, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(575, 355, 285, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(865, 355, 285, 350);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);

		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}
	
}
