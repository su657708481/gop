

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
			area0.setText("        �Ϻ��Ͼ�·�������ķ�����ҵ��֮һ��Ҳ���Ϻ����������罨����һ����ҵ�֣������������Ƽ����������ı��أ����Ϻ����⿪�ŵĴ��ڡ�" +
					"��������̲�������Ӱ���·����羲��������������ȫ��5.5�����������·Ϊ���Ϊ�������Ρ��Ͼ�·�Ǽ�����ʷ�Ļ���ҵ��ֵ��������ͳ��ҵ�֣�" +
					"���С��л���ҵ��һ�֡�֮��������ͳ���ִ��Ľ�֯Ϊ���������Ͻ������˱���������������ŦԼ�ĵ��������������������֡��׶ص�ţ��֡��������������������糬һ����ҵ�֡�" +
					"�����������Ƽ��ı��أ����Ϻ����⿪�Ŵ��ڣ�Ҳ�ǹ����⹺���ߵ����á�");
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
