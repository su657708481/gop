

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
				area0.setText("         ͭ���壨Ӣ�����ƣ�Causeway Bay��ԭ�ƶ��ǣ�λ����۵������ı���֮��������۵���Ҫ��ҵ�����ֳ������еء�" +
						"�����ж�Ҵ��Ͱٻ���˾�������̳������������ٻ���ʱ���㳡������̨�㳡�Լ���ó���ġ�ͭ���幺��������ȫ�������ڶ���ĵضΣ�" +
						"����������ŦԼ�ĵ��������õضμ����˺ܶ๺�����ġ����ʵİٻ���˾�Լ��Ƶ�ȣ��ڽ�ͷ��β���кܶ������" +
						"���иߵ��ε�ʱ�г�����Ʒ�������������ҵ���������۲�ҹ����֮һ����ҹ��ͭ�����Ե����ֶ���æ��ֻ���ƻ�ͨ����" +
						"���ڣ�ͭ�����ѳ�Ϊ��ɳ����������Ҫ����������λ��ʱ���㳡���������Ƕ������ƾۼ��ĸ߼��ٻ��꣬���ٶ���Ʒ���Ե��е����ʽ���������÷ֵꡣ" +
						"ͭ���������������ݳ�Ʒ�ƿ��趥���콢��ı���֮�أ��������㼸�������ҵ������κ�һ���ݳ�Ʒ�Ƶĵ��̡�" +
						"ͬʱ���и۵���ɫ�ı�������Ʒ�������ǿ�����Դ�Ʒ�Ƶ���Ҳ�������������ԡ�");
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