

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HK_Mong_Kok {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkwj1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkwj2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkwj3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkwj4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkwj5.jpg");
	
	/*public static void main(String[] args) {
		HK_Mong_Kok xv = new HK_Mong_Kok();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Mong Kok");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(572,200);
		final JButton lb2 = new JButton(xc2);
		lb2.setBounds(0, 205, 572, 295);
		lb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ���ǣ�Mong Kok��λ����۾����������˿��ܶȼ��ߣ�ƽ���ܶ�Ϊÿƽ������13���ˣ���ʱ��ػ�����Լ4��������λ���ֶص����ˣ����������ڷ�չ�ĵ������Աܷ�����������Ϊ������" +
						"�������в��پ��պۼ������ڴ��С�ﶼ�����ҵ���ʽ���꣬����꣬�齫�ݵȴ�ͳ���̣��̺Ž϶�ΪС����ҵ���������������ϵ�һЩ�ֵ�������������ѵ�Ѱ��̽�ط�ʽ��" +
						"���ֵ��صķ�ζ���ֶص���Ħ�Ǿ���ȫȻ��ͬ���ڽ��������������������ʢ�ĵ������Ǳ����˹�������ŵص㣬�����̵꼰���ݾ�ͨ��Ӫҵ��ȫ������ӵ�������У���ҵ����������" +
						"���̸��С�ɾ��£��ֶص�һ�θ��Ǿ������ڡ���ִ����ص���չ������������ÿ����ʱΪ����ɵƻ�ͨ��������ҹ�У����԰ټƵ�̯�Ӱ������Σ��������ֱ��ƽ�ۻ�Ʒ��" +
						"���ںܶ�̯�����������·����������˽�֮�׳ƣ��ӽ������һ��������ռ���͵�̯�ڵ�����Զ�����н�ͷϷ�����ݣ����ִ�����ƽ��ʽҹ�ܻᡣ����ֵ����ԣ��ÿͿɷ����������������������ò��" +
						"�����¾�¥����������סլ¥����̶�Ϊ�̵����������ֶص�Ϊ�磬�������ļ����ڶ��棬סլ�������档���ǽ�ͨʮ�ַ���й����������𳵡�������������ר��С��ͨ����ʻ������ʱ�ֶص��Զ�һ��������ˮй��ͨ��");
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
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(0, 505, 572, 200);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(578, 0, 572, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(578, 355, 572, 350);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);

		//pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}

}