

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Chenghuang_Temple {
	
	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shchm1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shchm2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shchm3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shchm4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shchm5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shchm6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shchm7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shchm8.jpg");
	
	/*public static void main(String[] args) {
		SH_Chenghuang_Temple xv = new SH_Chenghuang_Temple();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Chenghuang Temple");
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
				area0.setText("         上海市老城隍庙坐落于上海市最为繁华的城隍庙旅游区，在上海地区众多的道教官观中，上海城隍庙以其历史悠久、建筑宏伟相著称，在国内外享有盛名。" +
						"始建于明代永乐年间（1403-1424），距今已有近六百年的历史。从明代永乐到清代道光上海城隍庙的庙基不断扩大，宫观建筑不断增加，最为繁盛时期，总面积达到49.9亩土地，约三万三千多平方米。" +
						"2005年，上海城隍庙大殿前厢房的使用权得以归还，随即开始了二期修复工程。今天的上海城隍庙，包括霍光殿、甲子殿、财神殿、慈航殿、城隍殿、娘娘殿、父母殿、关圣殿、文昌殿九个殿堂，总面积约二千余平方米。" +
						"在老城隍庙内，汇集了众多的上海地方小吃，绿波廊的特色点心，松月楼的素菜包，桂花厅的鸽蛋圆子，松云楼的八宝饭，还有南翔小笼和酒酿圆子，真可称得上是“小吃王国”了。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 350);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 350);
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

		pane0.setBackground(Color.gray);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
