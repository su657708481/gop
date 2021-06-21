

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

public class HK_The_Peak {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hktpsd1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hktpsd2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hktpsd3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hktpsd4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hktpsd5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hktpsd6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hktpsd7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hktpsd8.jpg");	
	
	/*public static void main(String[] args) {
		HK_The_Peak xv = new HK_The_Peak();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("The Peak");
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
				area0.setText("        ���̫ƽɽ��(Victoria Peak)��һ��ָ��̫ƽɽɽ���������������˼��Ϊɽ����The Peak����̫ƽɽԭ����Ӳͷɽ�����ų���¯�壬����554�ף�����۵�����߷塣" +
						"̫ƽɽ��ʷ�ƾã�ӵ�ж�����ƣ�����ͬ��������ָ�ķ�Χ��������ͬ��̫ƽɽ���׳Ƴ���ɽ�����οͱص������ε㡣��������Ը��ά�����Ǹ۵���۵��������뵺������" +
						"����������С�����֮�项������ҹ����ɽ��һ�����ǹ��������Ĺ�ۡ���ڡ�����ϲ�����ε���ʿ�������ɴ��𲽣�����С���ŵ�����ս�۵�����̫ƽɽ�׳�ɽ�����۾���۵���������" +
						"̫ƽɽ����۵�֮�ۣ�Ҳ�Ǹ��ά�����Ǹ۾�ɫ����ѵص㣬������۵ĵ�һ���㡣һֱ����۵ı�־�����ֳ�ά�����Ƿ����ɽ���Ǹ۵��ʢ���ĺ����߼�סլ����" +
						"����̫ƽɽ�����Գ˳��ӹ�·��������ɽ����������������ο�ϲ��ѡ���ɽ�³�����Ϊ����ǰ��ɽ���ȿ���ּ���������ֵ�Ľ�ͨ���ߡ��������ҹ��ɽ���羰���в�ͬ��" +
						"�������ǲ��Ǹ��������ˣ�Ҳһ��Ҫ���ŵ�̫ƽɽ��ҹ�����;���ѵĵص���������Ĺ۾�̨���³���վ�Ե�ʨ��ͤ����ҹ����ۻ��������������ҹĻ����֮�ʣ�վ��̫ƽɽ�Ϸ���������" +
						"ֻ������ǧ�ƻ��ӳ���£��۵��;���������Ƕ��ά�����Ǹ�����������飬�����ӳ��");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
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
