

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SH_Chenghuang_Temple {
	
	String path = new String("D:\\Resources\\ViewIconSH\\");
	
	ImageIcon xc1 = new ImageIcon(path + "shchm1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shchm2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shchm3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shchm4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shchm5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shchm6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shchm7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shchm8.jpg");
	
	/*public static void main(String[] args) {
		SH_Chenghuang_Temple xv = new SH_Chenghuang_Temple();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Chenghuang Temple");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(370,450);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("         �Ϻ����ϳ������������Ϻ�����Ϊ�����ĳ����������������Ϻ������ڶ�ĵ��̹ٹ��У��Ϻ�������������ʷ�ƾá�������ΰ�����ƣ��ڹ���������ʢ����" +
						"ʼ��������������䣨1403-1424����������н����������ʷ�����������ֵ���������Ϻ������������������󣬹��۽����������ӣ���Ϊ��ʢʱ�ڣ�������ﵽ49.9Ķ���أ�Լ������ǧ��ƽ���ס�" +
						"2005�꣬�Ϻ���������ǰ�᷿��ʹ��Ȩ���Թ黹���漴��ʼ�˶����޸����̡�������Ϻ������������������ӵ�����Ⱥ������������ĸ���ʥ��Ĳ���Ÿ����ã������Լ��ǧ��ƽ���ס�" +
						"���ϳ������ڣ��㼯���ڶ���Ϻ��ط�С�ԣ��̲��ȵ���ɫ���ģ�����¥���ز˰��������ĸ뵰Բ�ӣ�����¥�İ˱�������������С���;���Բ�ӣ���ɳƵ����ǡ�С���������ˡ�");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 350);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 350);
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
		lb2.setBounds(380, 0, 190, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 190, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(780, 0, 370, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(0, 455, 370, 250);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(380, 355, 190, 350);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(580, 355, 190, 350);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(780, 255, 370, 450);

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
