

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

public class HK_Avenue_of_Stars {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkxgdd1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkxgdd2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkxgdd3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkxgdd4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkxgdd5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkxgdd6.jpg");

	/*public static void main(String[] args) {
		HK_Avenue_of_Stars xv = new HK_Avenue_of_Stars();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Avenue of Stars");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(300,350);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 355, 300, 350);
		final JButton lb3 = new JButton(xc3);
		lb3.setBounds(305, 0, 540, 450);
		lb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ����ǹ�����Avenue of Stars����λ����۾�����ɳ�׶����ļ�ɳ�׺�����԰�������������ĶԳ���ά�����Ǹۡ�2003�꣬�������緢չ���޹�˾����4000���Ԫ�����˽���" +
						"��2004��4��27�տ�Ļ�����ƽ�����ر������������������������ο͹۹⡣�ǹ���Ϊ������۵�Ӱ��Ľܳ���ʿ����ɫ���㣬��Ч�������ǹ������ܳ���Ӱ�����ߵķ���������ӡ��Ƕ�����Ƶļ������ң�" +
						"����������������ǹ����ϣ�Ŀǰ�ǹ���������100����Ӱ�����ߵļ������ҡ������ǹ������ڹۿ��ڶ�������ӡͬʱ���ɴ��ݵ����͵����������ά�����Ǹ۾�ɫ����۵��ذ���ɫ������" +
						"���ﻹ�����ո�µĶ�ý��ƹ����ֻ��ݣ��ò�ӽ�㽭������͵㡣���ǹ�������ӵ׳����ά�����Ǹ۷�⼰��۵��ķ������ᾰ�£��������У��ɰ��޵к��������۵ס�" +
						"����������͡��ò�ӽ�㽭����ý��ƹ����ֻ��ݵ���ѵص㣻������ͻ�����ݣ�ÿ��8:00��ҫ��۵�ҹ�գ����ǹ������ڽ�������ͷ��������ɳ��վ����ͨ�����״" +
						"������ϣ���ǰ������òͼ��ι������Ļ����㣬����������ݡ����̫�չݼ�����Ļ����ĵȣ�Ҳֻ�����֮ң��");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(550, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(554, 380);
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
		lb4.setBounds(305, 455, 540, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(850, 0, 300, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(850, 355, 300, 350);
				
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
