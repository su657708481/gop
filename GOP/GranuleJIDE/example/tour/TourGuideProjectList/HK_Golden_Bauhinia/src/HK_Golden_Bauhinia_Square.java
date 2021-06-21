

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

public class HK_Golden_Bauhinia_Square {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkjzj1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkjzj2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkjzj3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkjzj4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkjzj5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkjzj6.jpg");

	/*public static void main(String[] args) {
		HK_Golden_Bauhinia_Square xv = new HK_Golden_Bauhinia_Square();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Golden Bauhinia Square");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(765,450);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ���Ͼ��㳡λ����ۻ�չ���ĵ��¼����ԵĲ���������԰�ڡ�����Զʢ�����Ͼ��������ܣ����Ͼ�����������ۻ���չ�����������ԵĲ���������԰�ڡ�" +
						"���Ͼ��㳡���汻ά�����Ǹ۰�Χ����ά�۵�����λ�ã���԰��ļ�ɳ�׶��ţ��ǹ۾��ĺõط���1997��7��1������ر�����������������������һ�����Ͼ�ͭ��������ۡ�" +
						"���Ͼ�ͭ�񱻰����ڻ�չ�����ԣ���Դ󺣣�����㳡Ҳ������Ϊ�����Ͼ��㳡��������6�׵�ͭ����ʽ����Ϊ����Զʢ�����Ͼ�������Ԣ�������Զ���ٲ�ʢ��" +
						"�ڽ��Ͼ��㳡Ʈ�����й����켰����������죬ÿ������8ʱ����������ʽ����6����н�����ʽ��ÿ���7��1������������������պ�10��1���й������գ�" +
						"���ﶼ�����¡�ص�������ʽ����������������������������Ҫ��Ա��ϯ�����з���ӵ�ֱ��������ͷɹ��㳡�Ͽգ����������������ˮ���ݣ���������������ο�ǰ�����͡�" +
						"�ڽ��Ͼ��㳡һ�ǻ������Ÿ�20�׵���ۻع���������Ͼ�ͭ��ң���Ӧ�������206��ʯ�������ɣ�ÿ��ʯ�����1842��2047����ÿ����ݡ�" +
						"����6��Բ��ʯ��ѡ����ǳɫ����ʯ�Ƴɣ��ֱ����1842�ꡢ1860�ꡢ1898�ꡢ1982�ꡢ1984�꼰1990�꣬�������õƹ�Ĳ��������־�������ʽ�ع��й���1997�ꡣ");
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
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(770, 0, 380, 223);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(770, 227, 380, 223);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 455, 380, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(385, 455, 380, 250);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(770, 455, 380, 250);
				
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
