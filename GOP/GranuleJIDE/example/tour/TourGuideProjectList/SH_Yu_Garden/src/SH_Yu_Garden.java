

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Yu_Garden {
	
	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shyy1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shyy2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shyy3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shyy4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shyy5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shyy6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shyy7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shyy8.jpg");	
	
	/*public static void main(String[] args) {
		SH_Yu_Garden xv = new SH_Yu_Garden();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Yu Garden");
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
				area0.setText("         豫园坐落于位于上海市中心的黄浦区，是明朝时期的私人花园，建于1559年，充分展现了中国古典园林的建筑与设计风格。" +
						"如今，它已经成为到上海观光的国内外游客常去的游览胜地。园内有江南三大名石之称的玉玲珑、1853年小刀会起义的指挥所点春堂，园侧有城隍庙及商店街等游客景点。" +
						"豫园素有“城市山林”之誉，又有“奇秀甲于东南”之说，是上海著名的江南古典园林，有着400多年的历史，属国家重点文物保护单位。“豫园已成为上海的骄傲”。" +
						"现在所说的豫园，通常包括了进入豫园几条热闹的街道以及豫园的标志九曲桥、湖心亭等。豫园内楼阁参差，山石峥嵘，湖光潋滟，素有“奇秀甲江南”之誉。" +
						"内有穗堂、大假山、铁狮子、快楼、得月楼、玉玲珑、积玉水廊、听涛阁、涵碧楼、内园静观大厅、古戏台等亭台楼阁以及假山、池塘等四十余处古代建筑，" +
						"设计精巧、布局细腻，以清幽秀丽、玲珑剔透见长，具有小中见大的特点，体现明清两代南方园林建筑艺术的风格，是江南古典园林中的一颗明珠。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(515, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(519, 380);
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
