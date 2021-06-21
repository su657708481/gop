

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HK_Avenue_of_Stars {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkxgdd1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkxgdd2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkxgdd3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkxgdd4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkxgdd5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkxgdd6.jpg");

	/*public static void main(String[] args) {
		HK_Avenue_of_Stars xv = new HK_Avenue_of_Stars();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Avenue of Stars");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(300,350);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 355, 300, 350);
		final JButton lb3 = new JButton(xc3);
		lb3.setBounds(305, 0, 540, 450);
		lb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        香港星光大道（Avenue of Stars）是位于香港九龙尖沙咀东部的尖沙咀海滨花园，沿新世界中心对出的维多利亚港。2003年，由新世界发展有限公司斥资4000万港元赞助兴建，" +
						"在2004年4月27日开幕，并移交予港特别行政区政府，供市民休憩及游客观光。星光大道为表扬香港电影界的杰出人士的特色景点，仿效好莱坞星光大道，杰出电影工作者的芳名与手掌印镶嵌在特制的纪念牌匾，" +
						"以年代依次排列在星光大道上，目前星光大道可容纳100名电影工作者的纪念牌匾。漫步星光大道，在观看众多名人手印同时，可从容地欣赏到香港著名的维多利亚港景色、香港岛沿岸特色建筑，" +
						"这里还是香港崭新的多媒体灯光音乐汇演－幻彩咏香江理想观赏点。“星光大道”坐拥壮丽的维多利亚港风光及香港岛的繁华都会景致，漫步其中，可把无敌海景尽收眼底。" +
						"这里更是欣赏“幻彩咏香江”多媒体灯光音乐汇演的最佳地点；此项大型户外表演，每晚8:00闪耀香港的夜空！“星光大道”邻近天星码头及地铁尖沙咀站，交通方便易达；" +
						"游览完毕，再前往购物、用餐及参观其他文化景点，如香港艺术馆、香港太空馆及香港文化中心等，也只是咫尺之遥。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(550, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(554, 380);
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
		lb4.setBounds(305, 455, 540, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(850, 0, 300, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(850, 355, 300, 350);
				
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
