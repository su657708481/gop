

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

public class HK_CEC {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkhzzx1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkhzzx2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkhzzx3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkhzzx4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkhzzx5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkhzzx6.jpg");

	/*public static void main(String[] args) {
		HK_CEC xv = new HK_CEC();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Convention and Exhibition Centre");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(570,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ��ۻ���չ�����ģ���ۻ�չ����,Hong Kong Convention and Exhibition Centre��HKCEC��λ��������е���ۻ���չ�����ģ���������������½���Ⱥ�еĴ�����֮һ��" +
						"���������ͻ��鼰չ����;֮�⣬���ﻹ���������Ǽ��Ƶꡢ�칫��¥�ͺ�����Ԣ��һ��������������������������ɣ��ڸ������ü���չ���������ֲ������㽨��֮�У�����������չ����֮һ��" +
						"1997��7��1����ۻع��й�������ڸô����У���Ϊ������Ŀ�Ľ��㣬�������صķ���չ��ʽ��̬��Ҳ��������ά�����Ǹ������˲���ɫ�ʡ���չ�����ó�׷�չ��ӵ�У������´������ŵ�ȫ�ʸ�������������ۻ���չ�����ģ��������޹�˾����" +
						"��չ2����һ��Կ�Ϊ���Ͼ��㳡������������ۻع�Ľ��Ͼ������������ÿ�����������ʽ�ĵط�����ۻ���չ����������Ϊ���������Ի������Ҫ���鳡�أ�����1997��7��1����ۻع��й�������ڴ˾����⣬" +
						"��������1997������������ᣬ2000�����޵�Ѷչ�ȡ�2005������ó����֯����������������ۻ���չ����������Ҫ���ء�");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(550, 400);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(554, 400);
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
		lb2.setBounds(575, 0, 285, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(865, 0, 285, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 355, 285, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(290, 355, 285, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(580, 355, 570, 350);
				
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		
		//pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
