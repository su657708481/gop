

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HK_Repulse_Bay {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkqsw1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkqsw2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkqsw3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkqsw4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkqsw5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkqsw6.jpg");
	
	/*public static void main(String[] args) {
		HK_Repulse_Bay xv = new HK_Repulse_Bay();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Repulse Bay");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(285,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ���ǳˮ��ųơ����µ�һ�塱��Ҳ�С����������ġ�֮�������������ߴ����Ե�ɳ̲��ǳˮ��Ӣ����ΪRepulse Bay��epulseΪ �����ˡ�֮�⣬����ǰһ�Ҹ���Ѳ�ߴ���Ӣ������ս�����֡�" +
						"ǳˮ������۵�֮�ϣ���ɽ����������������Σ��»�̲������ƽ�˾���ˮ��ɳϸ��ɳ̲�����ྻ��ˮǳ���Ҷ�ů������ˮ����ʮ�����϶�����ʮ�����϶�֮�䣬�����Ǹ�������Ū����ʤ�أ�" +
						"Ҳ�����˱����������羰�������գ��㽭�˾�֮һ�ġ�������������ָ�ľ���ǳˮ��ĺ���ԡ����ǳˮ������������סլ��֮һ���ڶ�ı�����լ�鲼�ں�����µ��ϣ����о�����۸�����γϡ�" +
						"����յĺ�լ���Ű���ġ����֮���������ἰ��ǳˮ��Ƶ����ѱ����Ӱ��԰����԰��ǰͥ����������ǳˮ��Ƶ����ʽ԰�ֽ�����񣬺����Ϊ���̳�����Ԣ���á�" +
						"ͬʱҲ��������ܻ�ӭ����ͨ�����ߴ����Ե�Ӿ̲�������˱ص��������羰������������⡢ɳ̲����ˮȷʵ�����⵴��ۡ�ǳˮ����ƽɳϸ��̲���������¶�ƽ������ˮ��ů��" +
						"����ʱ�ڣ���ǳˮ�������ֵ�ʱ�򡣴����οͷ�ӵ������ɳ̲����ɽ�˺�����ʽӾװ�����һ��ɫ�ʰ�쵵Ļ��档��ʹ���ڶ��죬��̲��Ҳ���Կ�������Ӿװ��������Ů��ǳˮ�嶫�˵������£�" +
						"����������տ�¯���ڳ���ҰȤ�ķ�Χ֮�У�����Ϸˮ����οͿ��Ծ����Ʒ���տ�����ζ����ɳ̲��Χ�����Ƽҡ���͵�ͳ����г����ٺ��Ĳ������������ͺ��������������İ��ĺõط���");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(560, 420);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(564, 420);
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
		lb2.setBounds(290, 0, 285, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 570, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 355, 570, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(575, 355, 285, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(865, 355, 285, 350);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);

		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}
	
}
