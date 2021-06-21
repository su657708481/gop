

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

public class HK_Victoria_Harbour {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkwdly1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkwdly2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkwdly3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkwdly4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkwdly5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkwdly6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hkwdly7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hkwdly8.jpg");	
	
	/*public static void main(String[] args) {
		HK_Victoria_Harbour xv = new HK_Victoria_Harbour();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Victoria Harbour");
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
			area0.setText("         ά�����Ǹۣ�Victoria Harbour�����ά�ۣ���λ������ر�����������۵��;����뵺֮��ĺ��ۡ����ڸ���ˮ�Ϊ��Ȼ���ۣ����������С�����֮�顱��������������Ȼ���ۡ�������������ҹ����֮������" +
					"ά�����Ǹ۵����֣�����Ӣ����ά������Ů����һ���ļ��Կ����ɽ����������ѱ�Ӣ���˿����г�Ϊ���ǵ��������ۿڵ�Ǳ�������������������϶����ۣ���չ��Զ���ĺ���ó����ҵ��ά�����Ǹ�һֱӰ����۵���ʷ���Ļ���" +
					"������۵ľ��ú�����ҵ��չ������۳�Ϊ���ʴ󻯴��еĹؼ�֮һ��ά�����Ǹ���λ����۵���۵��;����뵺֮��ĸۿںͺ��������޵ĵ�һ�󺣸ۣ���������󣬽����������ľɽ�ɽ�Ͱ�������Լ����¬��" +
					"ά�����Ǹ�ˮ���������ɫ���ˣ����۵����������������ļ�װ����������֮һ�ġ���ӿ������ͷ����ÿ���ճ����䣬��æ�Ķɺ�С�ִ������ϱ�����֮�䣬�洬�����֡��۹⴬����־��ֺ��������ŵ�����������֯��һ������ĺ��Ϸ������¡�");
			area0.setLineWrap(true);
			area0.setEditable(false);
			area0.setFont(new Font("Serif",Font.BOLD,16));
			area0.setBackground(Color.pink);
			area0.setForeground(Color.blue);	
			area0.setSize(550, 360);
			pane0.add(area0);
			//pane0.add(new JScrollPane(area0));
			c0.add(pane0);
			frame0.setSize(554, 370);
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
