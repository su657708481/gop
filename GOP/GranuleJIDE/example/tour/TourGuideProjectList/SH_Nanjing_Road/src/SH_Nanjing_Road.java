

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Nanjing_Road {
	
	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shnjl1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shnjl2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shnjl3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shnjl4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shnjl5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shnjl6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shnjl7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shnjl8.jpg");	
	
	/*public static void main(String[] args) {
		SH_Nanjing_Road xv = new SH_Nanjing_Road();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Nanjing Road");
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
			area0.setText("        上海南京路是著名的繁华商业街之一，也是上海开埠后最早建立的一条商业街，这里是万商云集、寸土寸金的宝地，是上海对外开放的窗口。" +
					"它东起外滩、西迄延安西路，横跨静安、黄浦两区，全长5.5公里，以西藏中路为界分为东西两段。南京路是极富历史文化商业价值的著名传统商业街，" +
					"素有“中华商业第一街”之美誉。传统与现代的交织为这条百年老街增添了别样的魅力。是与纽约的第五大道、巴黎的香榭丽舍大街、伦敦的牛津街、东京的银座齐名的世界超一流商业街。" +
					"这里是万商云集的宝地，是上海对外开放窗口，也是国内外购物者的天堂。");
			area0.setLineWrap(true);
			area0.setEditable(false);
			area0.setFont(new Font("Serif",Font.BOLD,18));
			area0.setBackground(Color.pink);
			area0.setForeground(Color.blue);	
			area0.setSize(500, 360);
			pane0.add(area0);
			//pane0.add(new JScrollPane(area0));
			c0.add(pane0);
			frame0.setSize(504, 360);
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
