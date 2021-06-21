

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
				area0.setText("         ԥ԰������λ���Ϻ������ĵĻ�������������ʱ�ڵ�˽�˻�԰������1559�꣬���չ�����й��ŵ�԰�ֵĽ�������Ʒ��" +
						"������Ѿ���Ϊ���Ϻ��۹�Ĺ������οͳ�ȥ������ʤ�ء�԰���н���������ʯ֮�Ƶ������硢1853��С���������ָ�����㴺�ã�԰���г������̵�ֵ��ο;��㡣" +
						"ԥ԰���С�����ɽ�֡�֮�������С�������ڶ��ϡ�֮˵�����Ϻ������Ľ��Ϲŵ�԰�֣�����400�������ʷ���������ص����ﱣ����λ����ԥ԰�ѳ�Ϊ�Ϻ��Ľ�������" +
						"������˵��ԥ԰��ͨ�������˽���ԥ԰�������ֵĽֵ��Լ�ԥ԰�ı�־�����š�����ͤ�ȡ�ԥ԰��¥��βɽʯ��ɣ��������٣����С�����׽��ϡ�֮����" +
						"�������á����ɽ����ʨ�ӡ���¥������¥�������硢����ˮ�ȡ����θ󡢺���¥����԰���۴�������Ϸ̨��̨ͤ¥���Լ���ɽ����������ʮ�ദ�Ŵ�������" +
						"��ƾ��ɡ�����ϸ�壬������������������͸����������С�м�����ص㣬�������������Ϸ�԰�ֽ��������ķ���ǽ��Ϲŵ�԰���е�һ�����顣");
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
