

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Qujiang_Pool {
	
	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xaqjc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xaqjc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xaqjc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xaqjc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xaqjc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xaqjc6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xaqjc7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "xaqjc8.jpg");
	
	/*public static void main(String[] args) {
		XA_Qujiang_Pool xv = new XA_Qujiang_Pool();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Qujiang Pool");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(280,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("         �����أ������غ���ʢ�����ƣ���ʱǧ�꣬���й��Ŵ��羰԰��֮���䡣�ش�������һƬ��Ȼ���ӣ���Ϊ�B�ޣ����������빬--�˴�����" +
						"�����ʱ����ˮ�����죬�ذ����ۣ������ƹ���֮������ȡ����������������޽����˳ǣ��������������֮�У��ĳ�ܽ�سء��ƴ����ģӪ�������������������Է�����гǣ��������������¿��ţ������س�Ϊˮ��ǧĶ�����ھ���������ʤ�ء�" +
						"��������������������������������԰���硱������Ҥ���¡��ȵ�ʴ�˵����ʹ����������Զ����������������ĩ����������ս�ҹ�����ܣ���ˮ�𽥸ɺԣ��󱻿�Ϊ���ԣ�԰��ʢ���������档                                                                                                                  " +
						"��Ԫ2007��7�£������о���������������Ͷ���ʣ�������������ʷˮϵ�����￱̽�ɹ����滮����ռ��1500Ķ������ʷ�Ļ������ﱣ�����������Ϊһ��Ĵ��Ϳ���ʽ԰����̬����--��������ַ��԰��" +
						"��Ϊ�������ص㽨����Ŀ����ʱһ�꣬��2008��7��1�ս��ɿ��š���������ַ��԰�����غ��۷磬��������Դ������ԭ������xi�����������ӣ�����ʷʢ�����������֣�Ҳ���������ʳǸ��˼ƻ����Ŀ���֮��������Ϊ�����������Ž��ںϡ�������Ȼ��г�Ľ���䷶��");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(600, 400);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(604, 400);
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
		lb2.setBounds(290, 0, 280, 250);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 280, 450);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(870, 0, 280, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(0, 355, 280, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(290, 255, 280, 450);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(580, 455, 280, 250);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(870, 355, 280, 350);

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
