
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class XA_Huaqing_Spring {

	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xahqc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xahqc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xahqc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xahqc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xahqc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xahqc6.jpg");
		
	/*public static void main(String[] args) {
		XA_Huaqing_Spring xv = new XA_Huaqing_Spring();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Huaqing Spring");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(1090,480);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 490, 226, 215);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(231, 490, 226, 215);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(460, 490, 226, 215);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(691, 490, 226, 215);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(922, 490, 226, 215);
		final JButton lb7 = new JButton("<html>��<br>��<br>��<br>��</html>");
		lb7.setFont(new Font("Serif",Font.BOLD,28));
		lb7.setForeground(Color.blue);
		lb7.setFocusPainted(false);
		lb7.setMargin(new Insets(0,0,0,0));
		lb7.setBounds(1100, 10, 40, 470);
		lb7.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        ����أ��������幬��λ����������������ɽ��´����������30���������ɽ������μˮ��������Ȫ�������Ƶ��й��Ŵ��빬���ܡ��ء������塢������ͳ���ߣ���������ˮ����Ϊ�����������ֵ��йٱ�Է������ʯ����˽���ɽ�����������޳ǣ�������Ȫ����" +
						      "��ʷ���׼����ŷ��������֤��������ؾ���6000����Ȫ����ʷ��3000��Ļʼ�԰�ֽ���ʷ��1982�꣬����ر���Ϊȫ����һ���ص�羰��ʤ����2007��5��8�գ�����ؾ�������׼Ϊ����5A�����ξ������Ƽ�����·��:��԰ > ������ > ���� > ������ > ���� > ����" +
						      "̨ > ���� ���� > ���� ���� > �ɻ��� > ���������� > ��ͤ > ��ͤ > ����� > �ɻ��� > ��������ַ����� > ���й� > ������ > ܽ�غ��羰�� > ���񻷷�گ���幬�ڻ���");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,18));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 380);
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
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
	
		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	
}
