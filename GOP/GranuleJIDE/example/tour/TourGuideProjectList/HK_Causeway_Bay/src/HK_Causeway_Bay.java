

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HK_Causeway_Bay {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hktlw1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hktlw2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hktlw3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hktlw4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hktlw5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hktlw6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hktlw7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hktlw8.jpg");
	ImageIcon xc9 = new ImageIcon(path + "hktlw9.jpg");
	
	/*public static void main(String[] args) {
		HK_Causeway_Bay xv = new HK_Causeway_Bay();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Causeway Bay");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(380,270);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(385, 0, 380, 160);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(770, 0, 380, 270);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 275, 380, 155);
		final JButton lb5 = new JButton(xc5);
		lb5.setBounds(385, 165, 380, 375);
		lb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("         铜锣湾（英文名称：Causeway Bay，原称东角）位于香港岛的中心北岸之西，是香港的主要商业及娱乐场所集中地。" +
						"区内有多家大型百货公司及大型商场，包括：崇光百货、时代广场、利舞台广场以及世贸中心。铜锣湾购物区亦是全世界租金第二贵的地段，" +
						"仅次于美国纽约的第五大道。该地段集中了很多购物中心、日资的百货公司以及酒店等，在街头巷尾还有很多餐厅，" +
						"所有高档次的时尚潮流物品都可以在这里找到。还是香港不夜市区之一。入夜后，铜锣湾显得热闹而繁忙，只见灯火通明。" +
						"现在，铜锣湾已成为尖沙咀以外最重要的旅游区。位于时代广场的连卡佛是顶级名牌聚集的高级百货店，不少顶级品牌以店中店的形式在这里设置分店。" +
						"铜锣湾更是世界各大奢侈品牌开设顶级旗舰店的必争之地，在这里你几乎可以找到世界任何一家奢侈品牌的店铺。" +
						"同时富有港岛特色的本地自主品牌与明星开设的自创品牌店面也在这里熠熠生辉。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(530, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(534, 380);
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
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(770, 275, 380, 155);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(0, 435, 380, 270);
		final JLabel lb8 = new JLabel(xc8);
		lb8.setBounds(385, 545, 380, 160);
		final JLabel lb9 = new JLabel(xc9);
		lb9.setBounds(770, 435, 380, 270);
		
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
		pane0.add(lb8);
		pane0.add(lb9);
		
		//pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}

}