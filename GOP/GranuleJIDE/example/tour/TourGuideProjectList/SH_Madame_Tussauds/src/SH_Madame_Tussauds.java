

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Madame_Tussauds {
	
	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shds1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shds2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shds3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shds4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shds5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shds6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shds7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shds8.jpg");
	
	/*public static void main(String[] args) {
		SH_Madame_Tussauds xv = new SH_Madame_Tussauds();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Madame Tussauds");
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
				area0.setText("         �Ϻ���ȫ����ʮ������ѡ��������ӱ��������Ϊȫ���6����ɯ��������ݵ���ŵء��Ϻ���ɯ�����������2006��5��1�տ�ҵ�������˶�ɯ���������200��ľ��裬" +
						"չʾΩ��ΩФ����������ʹ�����л�������Ŀ�е�Ӣ������뻥�����������оŸ�����չ����չ������Ҧ�������衢���˺�ķ�����Ƶϡ�����������������������������ձ���" +
						"����������¶������˹̹���������������ȶ����Ǵġ��°���Lady Gaga����С�ա�����ı���������Ƚ���������������������������Ͼ����ޱȵ�����Ч�����߿Ƽ��Ļ������飬" +
						"���òι��߷·����������˵��У����İ���ż�������Ӵ�����Ⱦ���ǵ�������ɡ�");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 320);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 320);
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
