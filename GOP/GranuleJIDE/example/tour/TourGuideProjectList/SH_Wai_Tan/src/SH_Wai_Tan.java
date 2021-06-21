

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Wai_Tan {

	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shwt1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shwt2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shwt3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shwt4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shwt5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shwt6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shwt7.jpg");
	
	/*public static void main(String[] args) {
		SH_Wai_Tan xv = new SH_Wai_Tan();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Wai Tan");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(800,500);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("开放时间： 全天                                                                      " +
						"门票价格： 免费                                                                        " +
						"景区地址： 中山东一路                                                          " +
						"最佳时间：春秋两季，一般是3-5月和9-10月                           " +
						"交通指南： 868路 921路 37路 55路 65路 33路 123区间路[5]");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,18));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 280);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 280);
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
		lb2.setBounds(810, 0, 340, 245);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(810, 255, 340, 245);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 505, 280, 200);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(290, 505, 280, 200);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(580, 505, 280, 200);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(870, 505, 280, 200);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);

		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}
	
}
