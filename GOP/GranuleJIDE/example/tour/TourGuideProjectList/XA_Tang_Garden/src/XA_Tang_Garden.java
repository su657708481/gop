
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Tang_Garden {
	
	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xadtfry1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xadtfry2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xadtfry3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xadtfry4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xadtfry5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xadtfry6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xadtfry7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "xadtfry8.jpg");	
	
	// public static void main(String[] args) {
	// 	XA_Tang_Garden xv = new XA_Tang_Garden();
	// 	xv.show();
	// }
	
	public void show() {
		final JFrame jf = new JFrame("Tang Garden");
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
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(325, 0, 500, 350);
		final JButton lb5 = new JButton(xc5);
		lb5.setBounds(325, 355, 500, 350);
		lb5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			jf.setEnabled(false);
			final JFrame frame0 = new JFrame("Notice");
			Container c0 = frame0.getContentPane();
			JPanel pane0 = new JPanel();		
			pane0.setLayout(null);
			final JTextArea area0 = new JTextArea();		
			area0.setText("地址：陕西省西安市曲江新区芙蓉西路99号。                     " +
					"最佳旅游时节：春夏季节最佳。                                              " +
					"交通：乘坐公交21、22、24、41、212、224、237、320(游9)、601、609、610、715、720路可到。                                      " +
					"提示：大唐芙蓉园站分为西门站和南门站（其中西门站有两个）。大唐芙蓉园现开放北门（春明门）、西门（御苑门）和唐市出入口，其中西门为正门，一般游客都是从此门进入。");
			area0.setLineWrap(true);
			area0.setEditable(false);
			area0.setFont(new Font("Serif",Font.BOLD,18));
			area0.setBackground(Color.pink);
			area0.setForeground(Color.blue);	
			area0.setSize(500, 320);
			pane0.add(area0);
			//pane0.add(new JScrollPane(area0));
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
