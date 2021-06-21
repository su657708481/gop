import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class XianView implements ActionListener{
	
		JPanel jp1=new JPanel();
		
		String path = new String("E:\\ggggop\\GOP\\GranuleJIDE\\example\\tour\\Resources\\IconXA\\");
		
		ImageIcon head = new ImageIcon(path + "head1.jpg");
		ImageIcon body1 = new ImageIcon(path + "body1.jpg");
		ImageIcon body2 = new ImageIcon(path + "body2.jpg");
		
		ImageIcon t31 = new ImageIcon(path + "ta31.jpg");
		ImageIcon t32 = new ImageIcon(path + "ta32.jpg");
		ImageIcon t33 = new ImageIcon(path + "ta33.jpg");
		ImageIcon t34 = new ImageIcon(path + "ta34.jpg");
		ImageIcon t35 = new ImageIcon(path + "ta35.jpg");
		ImageIcon t36 = new ImageIcon(path + "ta36.jpg");
		ImageIcon t37 = new ImageIcon(path + "ta37.jpg");
		ImageIcon t38 = new ImageIcon(path + "ta38.jpg");
		
		ImageIcon xc1 = new ImageIcon(path + "xaxc1.jpg");
		ImageIcon xc2 = new ImageIcon(path + "xaxc2.jpg");
		ImageIcon xc3 = new ImageIcon(path + "xaxc3.jpg");
		ImageIcon xc4 = new ImageIcon(path + "xaxc4.jpg");
		ImageIcon xc5 = new ImageIcon(path + "xaxc5.jpg");
		ImageIcon xc6 = new ImageIcon(path + "xaxc6.jpg");
		ImageIcon xc7 = new ImageIcon(path + "xaxc7.jpg");
		ImageIcon xc8 = new ImageIcon(path + "xaxc8.jpg");
		ImageIcon xc9 = new ImageIcon(path + "xaxc9.jpg");
		ImageIcon xc10 = new ImageIcon(path + "xaxc10.jpg");
		
		ImageIcon icon1 = new ImageIcon(path + "x01.jpg");
		ImageIcon icon2 = new ImageIcon(path + "x02.jpg");
		ImageIcon icon3 = new ImageIcon(path + "x03.jpg");
		ImageIcon icon4 = new ImageIcon(path + "x04.jpg");
		ImageIcon icon5 = new ImageIcon(path + "x05.jpg");
		ImageIcon icon6 = new ImageIcon(path + "x06.jpg");
				
		JButton button1 = new JButton(icon1);
		JButton button2 = new JButton(icon2);
		JButton button3 = new JButton(icon3);
		JButton button4 = new JButton(icon4);
		JButton button5 = new JButton(icon5);
		JButton button6 = new JButton(icon6);		
		CardLayout cl=new CardLayout();
				
		/*public static void main(String[] args) {
			XianView xv = new XianView();
			xv.show();
		}*/
			public void actionPerformed(ActionEvent e) {
				String string=e.getActionCommand();
				if("1".equals(string)) cl.show(jp1,"1");
				if("2".equals(string)) cl.show(jp1,"2");
				if("3".equals(string)) cl.show(jp1,"3");
				if("5".equals(string)) cl.show(jp1,"5");			
		}
		public void show() {
			JFrame jf = new JFrame("Xian Guard");
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setLayout(null);
	        Container c = jf.getContentPane();       
	        
			JPanel pane = new JPanel();
			c.add(pane);
			pane.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
			pane.setSize(1280,100);
			final JLabel label = new JLabel(head);
			pane.add(label);
			
			JPanel pane1 = new JPanel();
			c.add(pane1);
			pane1.setBounds(0, 100, 1280, 650);
			pane1.setLayout(new BorderLayout());
			pane1.setBackground(Color.pink);
			jp1.setLayout(cl);
			
			JLabel ta1 = new JLabel(body1);
			jp1.add(ta1,"1");
			JLabel ta2 = new JLabel(body2);
			jp1.add(ta2,"2");
			
			JPanel pane3 = new JPanel();
			pane3.setLayout(null);
			JButton ta31 = new JButton(t31);
			ta31.setBounds(25, 2, 600, 180);
			pane3.add(ta31);
			JButton ta32 = new JButton(t32);
			ta32.setBounds(655, 2, 600, 180);
			pane3.add(ta32);
			JButton ta33 = new JButton(t33);
			ta33.setBounds(25, 192, 400, 180);
			pane3.add(ta33);
			JButton ta34 = new JButton(t34);
			ta34.setBounds(440, 192, 400, 180);
			pane3.add(ta34);
			JButton ta35 = new JButton(t35);
			ta35.setBounds(855, 192, 400, 180);
			pane3.add(ta35);
			JButton ta36 = new JButton(t36);
			ta36.setBounds(25, 382, 400, 180);
			pane3.add(ta36);
			JButton ta37 = new JButton(t37);
			ta37.setBounds(440, 382, 400, 180);
			pane3.add(ta37);
			JButton ta38 = new JButton(t38);
			ta38.setBounds(855, 382, 400, 180);
			pane3.add(ta38);
			
			pane3.setBackground(Color.black);
			jp1.add(pane3,"3");
			
			JPanel pane0 = new JPanel();				
			pane0.setLayout(null);
			pane0.setSize(1275, 560);
			final JLabel lb1 = new JLabel(xc1);
			lb1.setSize(415,275);
			final JLabel lb2 = new JLabel(xc2);
			lb2.setBounds(430, 0, 207, 275);
			final JLabel lb3 = new JLabel(xc3);
			lb3.setBounds(638, 0, 207, 275);
			final JLabel lb4 = new JLabel(xc4);
			lb4.setBounds(860, 0, 207, 275);
			final JLabel lb5 = new JLabel(xc5);
			lb5.setBounds(1068, 0, 207, 275);
			final JLabel lb6 = new JLabel(xc6);	
			lb6.setBounds(0, 285, 207, 275);
			final JLabel lb7 = new JLabel(xc7);	
			lb7.setBounds(208, 285, 207, 275);
			final JLabel lb8 = new JLabel(xc8);	
			lb8.setBounds(430, 285, 207, 275);
			final JLabel lb9 = new JLabel(xc9);	
			lb9.setBounds(638, 285, 207, 275);
			final JLabel lb10 = new JLabel(xc10);
			lb10.setBounds(860, 285, 415, 275);		
			pane0.add(lb1);
			pane0.add(lb2);
			pane0.add(lb3);
			pane0.add(lb4);
			pane0.add(lb5);
			pane0.add(lb6);
			pane0.add(lb7);
			pane0.add(lb8);
			pane0.add(lb9);
			pane0.add(lb10);	
			pane0.setBackground(Color.black);
			jp1.add(pane0,"5");
			
			final JPanel jPanel=new JPanel();
			jPanel.setBackground(Color.black);
			jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,25,3));
			button1.setActionCommand("1");
			button2.setActionCommand("2");
			button3.setActionCommand("3");
			button5.setActionCommand("5");
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					int re = JOptionPane.showConfirmDialog(null, "niqueding?", "queding", JOptionPane.OK_CANCEL_OPTION);
					if(re == JOptionPane.OK_OPTION){
						try {
//							String path = System.getProperty("user.dir");
							String path = new String("E:\\ggggop\\GOP\\GranuleJIDE\\example\\tour\\Resources");
							Runtime.getRuntime().exec("explorer "+path+"\\Video\\Xian.mp4");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			});
			button5.addActionListener(this);		
			pane1.add(jPanel,BorderLayout.NORTH);
			pane1.add(jp1,BorderLayout.CENTER);
			jf.pack();
			jf.setSize(1280, 750);
			jf.setLocationRelativeTo(null);
			jf.setResizable(false);
			jf.setVisible(true);		
		}	
	
	
}
