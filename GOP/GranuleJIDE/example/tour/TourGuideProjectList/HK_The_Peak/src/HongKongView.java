import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class HongKongView {
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	String path = new String("D:\\Resources\\IconHK\\");
	
	ImageIcon head = new ImageIcon(path + "head3.jpg");
	
	ImageIcon icon1 = new ImageIcon(path + "hk1.jpg");
	ImageIcon icon2 = new ImageIcon(path + "hk2.jpg");
	ImageIcon icon3 = new ImageIcon(path + "hk3.jpg");
	ImageIcon icon4 = new ImageIcon(path + "hk4.jpg");
	ImageIcon icon5 = new ImageIcon(path + "hk5.jpg");
	ImageIcon icon6 = new ImageIcon(path + "hk6.jpg");
	
	ImageIcon intro = new ImageIcon(path + "hkintro.jpg");
	
	ImageIcon gw0 = new ImageIcon(path + "hkzh.jpg");
	ImageIcon gw1 = new ImageIcon(path + "hkzd.jpg");
	ImageIcon gw2 = new ImageIcon(path + "hksd.jpg");
	ImageIcon gw3 = new ImageIcon(path + "hktg.jpg");
	
	ImageIcon hv1 = new ImageIcon(path + "hkwdlyw.jpg");
	ImageIcon hv2 = new ImageIcon(path + "hkxgdd.jpg");
	ImageIcon hv3 = new ImageIcon(path + "hkhzzx.jpg");
	ImageIcon hv4 = new ImageIcon(path + "hktps.jpg");
	ImageIcon hv5 = new ImageIcon(path + "hktlw.jpg");
	ImageIcon hv6 = new ImageIcon(path + "hkwj.jpg");
	ImageIcon hv7 = new ImageIcon(path + "hkqsw.jpg");
	ImageIcon hv8 = new ImageIcon(path + "hkjzjgc.jpg");
	
	ImageIcon he1 = new ImageIcon(path + "hkhygy1.jpg");
	ImageIcon he2 = new ImageIcon(path + "hkhygy2.jpg");
	ImageIcon he3 = new ImageIcon(path + "hkhygy3.jpg");
	ImageIcon he4 = new ImageIcon(path + "hkhygy4.jpg");
	ImageIcon he5 = new ImageIcon(path + "hkhygy5.jpg");
	ImageIcon he6 = new ImageIcon(path + "hkdsn1.jpg");
	ImageIcon he7 = new ImageIcon(path + "hkdsn2.jpg");
	ImageIcon he8 = new ImageIcon(path + "hkdsn3.jpg");
	ImageIcon he9 = new ImageIcon(path + "hkdsn4.jpg");
	ImageIcon he10 = new ImageIcon(path + "hkdsn5.jpg");
	
	ImageIcon xc1 = new ImageIcon(path + "hkxc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkxc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkxc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkxc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkxc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkxc6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hkxc7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hkxc8.jpg");
	
	/*public static void main(String args[]) {
		HongKongView mygb = new HongKongView();
		mygb.show();
	}*/

	public void show(){
		final JFrame frame = new JFrame("HongKong Guard");
		Container c = frame.getContentPane();	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(gb);   

		JPanel pane = new JPanel();
		pane.setSize(1280,80);
		final JLabel label = new JLabel(head);
		pane.add(label);
		c.add(pane);
		
		JPanel pane1 = new JPanel();
		pane1.setBounds(15, 85, 400, 300);
		pane1.setBackground(Color.red);
		JButton button = new JButton(icon1);	
		pane1.add(button);	
		JPanel pane2 = new JPanel();
		pane2.setBounds(430, 85, 400, 300);
		pane2.setBackground(Color.green);
		JButton button2 = new JButton(icon2);	
		pane2.add(button2);
		JPanel pane3 = new JPanel();
		pane3.setBounds(845, 85, 400, 300);
		pane3.setBackground(Color.blue);
		JButton button3 = new JButton(icon3);	
		pane3.add(button3);		
		JPanel pane4 = new JPanel();
		pane4.setBounds(15, 390, 400, 300);
		pane4.setBackground(Color.gray);
		JButton button4 = new JButton(icon4);	
		pane4.add(button4);		
		JPanel pane5 = new JPanel();
		pane5.setBounds(430, 390, 400, 300);
		pane5.setBackground(Color.orange);
		JButton button5 = new JButton(icon5);	
		pane5.add(button5);		
		JPanel pane6 = new JPanel();
		pane6.setBounds(845, 390, 400, 300);
		pane6.setBackground(Color.pink);
		JButton button6 = new JButton(icon6);	
		pane6.add(button6);		
        c.add(pane);
        c.add(pane1);
        c.add(pane2);
        c.add(pane3);
        c.add(pane4);
        c.add(pane5);
        c.add(pane6);
		
        button.addActionListener(new ActionListener() {		
		
			public void actionPerformed(ActionEvent arg0) {
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();
				c0.add(pane0);
				pane0.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
				final JLabel lb0 = new JLabel(intro);
				pane0.add(lb0);			
				frame0.setSize(1024, 620);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 							
			}
		});
        
        button2.addActionListener(new ActionListener() {		
		
			public void actionPerformed(ActionEvent arg0) {
				final JFrame frame0 = new JFrame("Shopping");
				frame0.setLayout(null);
				Container c0 = frame0.getContentPane();				
				JPanel pane0 = new JPanel();				
				pane0.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
				pane0.setSize(1024, 200);
				final JLabel lb0 = new JLabel(gw0);
				pane0.add(lb0);	
				JPanel pane1 = new JPanel();				
				pane1.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
				pane1.setBounds(9, 210, 330, 400);
				final JLabel lb1 = new JLabel(gw1);
				pane1.add(lb1);			
				JPanel pane2 = new JPanel();				
				pane2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
				pane2.setBounds(347, 210, 330, 400);
				final JLabel lb2 = new JLabel(gw2);
				pane2.add(lb2);			
				JPanel pane3 = new JPanel();				
				pane3.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
				pane3.setBounds(685, 210, 330, 400);
				final JLabel lb3 = new JLabel(gw3);
				pane3.add(lb3);						
				c0.add(pane0);
				c0.add(pane1);
				c0.add(pane2);
				c0.add(pane3);
				frame0.setSize(1024, 640);
				c0.setBackground(Color.black);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 							
			}
		});
        
        button3.addActionListener(new ActionListener() {		
			
			public void actionPerformed(ActionEvent arg0) {
				final JFrame frame0 = new JFrame("Apealling view");
				Container c0 = frame0.getContentPane();			
				JPanel pane0 = new JPanel();
				pane0.setLayout(null);
				pane0.setBackground(Color.black);
				JButton hkv1 = new JButton(hv1);
				hkv1.setSize(510, 338);
				pane0.add(hkv1);
				JButton hkv2 = new JButton(hv2);
				hkv2.setBounds(514, 0, 510, 169);
				pane0.add(hkv2);
				JButton hkv3 = new JButton(hv3);
				hkv3.setBounds(514, 169, 510, 169);
				pane0.add(hkv3);
				JButton hkv4 = new JButton(hv4);
				hkv4.setBounds(0, 341, 510, 113);
				pane0.add(hkv4);
				JButton hkv5 = new JButton(hv5);
				hkv5.setBounds(0, 454, 510, 113);
				pane0.add(hkv5);
				JButton hkv6 = new JButton(hv6);
				hkv6.setBounds(0, 567, 510, 113);
				pane0.add(hkv6);
				JButton hkv7 = new JButton(hv7);
				hkv7.setBounds(514, 341, 255, 339);
				pane0.add(hkv7);
				JButton hkv8 = new JButton(hv8);
				hkv8.setBounds(769, 341, 255, 339);
				pane0.add(hkv8);
				
				c0.add(pane0);				
				frame0.setSize(1024, 680);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 							
			}
		});
        
        button4.addActionListener(new ActionListener() {		
		
			public void actionPerformed(ActionEvent arg0) {
				int re = JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ����������Ƶ��", "ȷ��", JOptionPane.OK_CANCEL_OPTION);
				if(re == JOptionPane.OK_OPTION){
					try {
//						String path = System.getProperty("user.dir");
						String path = new String("D:\\Resources");
						Runtime.getRuntime().exec("explorer "+path+"\\Video\\Hong Kong.mp4");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}					
			}
		});
        
        button5.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				final JFrame frame0 = new JFrame("Snacks");
				Container c0 = frame0.getContentPane();
	
				JPanel pane0 = new JPanel();				
				pane0.setLayout(null);
				pane0.setSize(1020, 673);
				final JLabel lb1 = new JLabel(xc1);
				lb1.setSize(252 ,335);
				final JLabel lb2 = new JLabel(xc2);
				lb2.setBounds(256, 0, 252, 335);
				final JLabel lb3 = new JLabel(xc3);
				lb3.setBounds(512, 0, 252, 335);
				final JLabel lb4 = new JLabel(xc4);
				lb4.setBounds(768, 0, 252, 335);
				final JLabel lb5 = new JLabel(xc5);
				lb5.setBounds(0, 339, 252, 335);
				final JLabel lb6 = new JLabel(xc6);	
				lb6.setBounds(256, 339, 252, 335);
				final JLabel lb7 = new JLabel(xc7);	
				lb7.setBounds(512, 339, 252, 335);
				final JLabel lb8 = new JLabel(xc8);	
				lb8.setBounds(768, 339, 252, 335);		
				pane0.add(lb1);
				pane0.add(lb2);
				pane0.add(lb3);
				pane0.add(lb4);
				pane0.add(lb5);
				pane0.add(lb6);
				pane0.add(lb7);
				pane0.add(lb8);	
				pane0.setBackground(Color.black);
		
				c0.add(pane0);		
				frame0.setSize(1024, 700);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 							
			}
		});
        
        button6.addActionListener(new ActionListener() {		
		
			public void actionPerformed(ActionEvent arg0) {				
				final JFrame frame0 = new JFrame("Entertainment");
				Container c0 = frame0.getContentPane();
				
				JPanel pane0 = new JPanel();
				pane0.setLayout(null);
				pane0.setBackground(Color.black);
				JButton hkv1 = new JButton(he1);
				hkv1.setSize(505, 200);
				pane0.add(hkv1);
				JLabel hkv2 = new JLabel(he2);
				hkv2.setBounds(0, 204, 250, 200);
				pane0.add(hkv2);
				JLabel hkv3 = new JLabel(he3);
				hkv3.setBounds(255, 204, 250, 200);
				pane0.add(hkv3);
				JLabel hkv4 = new JLabel(he4);
				hkv4.setBounds(0, 408, 505, 136);
				pane0.add(hkv4);
				JLabel hkv5 = new JLabel(he5);
				hkv5.setBounds(0, 548, 505, 136);
				pane0.add(hkv5);
				JLabel hkv6 = new JLabel(he6);
				hkv6.setBounds(515, 0, 505, 136);
				pane0.add(hkv6);
				JLabel hkv7 = new JLabel(he7);
				hkv7.setBounds(515, 140, 250, 200);
				pane0.add(hkv7);
				JLabel hkv8 = new JLabel(he8);
				hkv8.setBounds(770, 140, 250, 200);
				pane0.add(hkv8);
				JLabel hkv9 = new JLabel(he9);
				hkv9.setBounds(515, 344, 505, 136);
				pane0.add(hkv9);
				JButton hkv10 = new JButton(he10);
				hkv10.setBounds(515, 484, 505, 200);
				pane0.add(hkv10);
				
				hkv1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){			
						frame.setEnabled(false);
						final JFrame frame0 = new JFrame("Disneyland Introduction");
						Container c0 = frame0.getContentPane();
						JPanel pane0 = new JPanel();		
						pane0.setLayout(null);
						final JTextArea area0 = new JTextArea();		
						area0.setText("        ��ۺ���԰���С�ȫ�����ܻ�ӭ�����⹫԰�����������ǵ�����ģ�����������й�԰��������������ˮ��ݡ���֮һ���ȶ�����ҫ�� " +
								"λ����۵��������ۺ���԰������ȫ�����ܻ�ӭ�����⹫԰֮һ��ռ��170ӢĶ�������ֲ�������ɽ�ϼ�����ӹȵء���԰��ɽ�Ϻ�ɽ�������֣�" +
								"ɽ������ۺ���԰����Ҫ���֣��к���ݡ����ιݡ�����糡������ӣ�ɽ�µ�ˮ����԰�������޵�һ��ˮ���������ģ����л�԰�糡������ݼ������������������ļ��Ŵ�ȡ�" +
								"��ۺ���԰�볡�˴�ȫ��������Ծ������14λ��������������Ϊ��5λ����ȫ�й�����������߾ݵ�1λ��ӵ��ȫ���������ĺ���ˮ��ݼ���������԰��" +
								"�����ﲻ�����Կ���Ȥζʮ���¶�����ֳ���������ݻ��к�ʨ��ɱ�˾��Ⱦ����ؼ����ݣ�����ǧ��ٹֵĺ��������ࡢ�������Ƶĺ���Ħ��������ʽ�������մ̼��Ļ���������ʩ��" +
								"���ɽ����Ħ���֡��������ȣ����о��մ̼���Խ��ɳ�������֮�ã��Ƿø��ÿ����˵ĵط���");
						area0.setLineWrap(true);
						area0.setEditable(false);
						area0.setFont(new Font("Serif",Font.BOLD,16));
						area0.setBackground(Color.pink);
						area0.setForeground(Color.blue);	
						area0.setSize(540, 400);
						pane0.add(area0);
						c0.add(pane0);
						frame0.setSize(544, 400);
						frame0.setLocationRelativeTo(null);
						frame0.setResizable(false);
						frame0.setVisible(true); 
						frame0.addWindowListener(new WindowAdapter(){
							public void windowClosing(WindowEvent e){
								frame.setEnabled(true);
							}
						});		
					}
				});
				hkv10.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){			
						frame.setEnabled(false);
						final JFrame frame0 = new JFrame("Introduction");
						Container c0 = frame0.getContentPane();
						JPanel pane0 = new JPanel();		
						pane0.setLayout(null);
						final JTextArea area0 = new JTextArea();		
						area0.setText("        ��۵�ʿ����԰��Disneyland, Hong Kong�������126.82���꣬��ȫ�������С�ĵ�ʿ����԰���������ϵĵ������ʿ����԰��������������԰���ж��ڵ��������̣����е�һ�������������ڶ�����" +
								"��۵�������ר����·��˹������������վ����ʿ��վ��Ϊȫ����ڶ���������ʿ�����·ר�ߡ���۵�ʿ����԰����������������衹����۵�ʿ��������ʹ��ѧ������������԰�Ĺٷ���ͨ����ΪӢ�ļ����ģ���ͨ�����㶫������" +
								"��۵�ʿ����԰����һЩ��һ�޶�����ɫ���㡢���ҵ�ʿ������Ƶ꣬ �Լ���ʶ��˵Ĺ����ʳ��������ʩ����԰�����ϰ����ĸ�����������������8�����������Ͷ�����7��������5��������������ʿ����԰�����" +
								"������������С���֡��������������Ӫ������̽�����硱�����������硱�͡��������硱��������ɽ�ȡ���������ׯ԰�����ڽ��������˼��������ĵ�ʿ�ᾭ����¼�������ʩ�⣬��۵�ʿ����԰�������۵��Ļ���ɫ��" +
								"��˼һЩרΪ��۶����������ʩ�����ֱ��ݼ�Ѳ�Ρ�����԰�ڻ���Ѱ�õ�ʿ��Ŀ�ͨ������������С��ά�ᡢ��ľ�����ҹ��˯���˹����ȡ�");
						area0.setLineWrap(true);
						area0.setEditable(false);
						area0.setFont(new Font("Serif",Font.BOLD,15));
						area0.setBackground(Color.pink);
						area0.setForeground(Color.blue);	
						area0.setSize(540, 400);
						pane0.add(area0);
						c0.add(pane0);
						frame0.setSize(544, 400);
						frame0.setLocationRelativeTo(null);
						frame0.setResizable(false);
						frame0.setVisible(true); 
						frame0.addWindowListener(new WindowAdapter(){
							public void windowClosing(WindowEvent e){
								frame.setEnabled(true);
							}
						});			
					}
				});	
				
				c0.add(pane0);
				frame0.setSize(1024, 710);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 							
			}
		});
               
        frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
             
		frame.setSize(1280, 720);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}