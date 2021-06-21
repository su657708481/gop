

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

public class HK_Victoria_Harbour {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkwdly1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkwdly2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkwdly3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkwdly4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkwdly5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkwdly6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hkwdly7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hkwdly8.jpg");	
	
	/*public static void main(String[] args) {
		HK_Victoria_Harbour xv = new HK_Victoria_Harbour();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Victoria Harbour");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(315,232);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 236, 315, 232);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(0, 473, 315, 232);
		final JButton lb4 = new JButton(xc4);
		lb4.setBounds(325, 0, 500, 350);	
		lb4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			jf.setEnabled(false);
			final JFrame frame0 = new JFrame("Introduction");
			Container c0 = frame0.getContentPane();
			JPanel pane0 = new JPanel();		
			pane0.setLayout(null);
			final JTextArea area0 = new JTextArea();		
			area0.setText("         维多利亚港（Victoria Harbour）简称维港，是位于香港特别行政区的香港岛和九龙半岛之间的海港。由于港阔水深，为天然良港，香港亦因而有“东方之珠”、“世界三大天然良港”及“世界三大夜景”之美誉。" +
					"维多利亚港的名字，来自英国的维多利亚女王。一年四季皆可自由进出。早年已被英国人看中有成为东亚地区优良港口的潜力，后来从清政府手上夺得香港，发展其远东的海上贸易事业。维多利亚港一直影响香港的历史和文化，" +
					"主导香港的经济和旅游业发展，是香港成为国际大化大都市的关键之一。维多利亚港是位于香港的香港岛和九龙半岛之间的港口和海域，是亚洲的第一大海港，世界第三大，仅次于美国的旧金山和巴西的里约热内卢。" +
					"维多利亚港水面宽阔，景色迷人，海港的西北部有世界最大的集装箱运输中心之一的「葵涌货柜码头」。每天日出日落，繁忙的渡海小轮穿梭于南北两岸之间，渔船、邮轮、观光船、万吨巨轮和它们鸣放的汽笛声，交织出一幅美妙的海上繁华景致。");
			area0.setLineWrap(true);
			area0.setEditable(false);
			area0.setFont(new Font("Serif",Font.BOLD,16));
			area0.setBackground(Color.pink);
			area0.setForeground(Color.blue);	
			area0.setSize(550, 360);
			pane0.add(area0);
			//pane0.add(new JScrollPane(area0));
			c0.add(pane0);
			frame0.setSize(554, 370);
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
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(325, 355, 500, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(835, 0, 315, 232);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(835, 236, 315, 232);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(835, 473, 315, 232);
				
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
