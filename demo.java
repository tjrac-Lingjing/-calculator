package d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class demo extends JFrame{

	JButton jb[]=new JButton[23];
	
	public demo(){
	       setTitle("计算器");//标题
	       setBounds(200,40,515,660);//先位置，后大小
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       Container c = getContentPane();//获取窗体容器
	       
	       c.setLayout(null);
	       JTextField t1 = new JTextField(); 
	       t1.setBounds(10,10,480,60);
		   t1.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
	       t1.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		   t1.setColumns(12);//12列
		   t1.setEditable(false);
	       t1.setBackground(Color.WHITE);
	       c.add(t1);
	       JTextField t2 = new JTextField();
	       t2.setBounds(10,80,480,60);
		   t2.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
	       t2.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		   t2.setColumns(12);//12列
		   t2.setEditable(false);
	       t2.setBackground(Color.WHITE);
	       c.add(t2);
	       
	       jb[0] = new JButton("mc");
	       jb[1] = new JButton("m+");
	       jb[2] = new JButton("m-");
	       jb[3] = new JButton("mr");
	       jb[4] = new JButton("AC");
	       jb[5] = new JButton("<-");
	       jb[6] = new JButton("+/-");
	       jb[7] = new JButton("/");
	       jb[8] = new JButton("7");
	       jb[9] = new JButton("8");
	       jb[10] = new JButton("9");
	       jb[11] = new JButton("*");
	       jb[12] = new JButton("4");
	       jb[13] = new JButton("5");
	       jb[14] = new JButton("6");
	       jb[15] = new JButton("-");
	       jb[16] = new JButton("1");
	       jb[17] = new JButton("2");
	       jb[18] = new JButton("3");
	       jb[19] = new JButton("+");
	       jb[20] = new JButton("0");
	       jb[21] = new JButton(".");
	       jb[22] = new JButton("=");
	      
	       jb[0].setBounds(10,160,120,40);
	       jb[1].setBounds(130,160,120,40);
	       jb[2].setBounds(250,160,120,40);
	       jb[3].setBounds(370,160,120,40);
	       jb[4].setBounds(10,200,120,80);
	       jb[5].setBounds(130,200,120,80);
	       jb[6].setBounds(250,200,120,80);
	       jb[7].setBounds(370,200,120,80);
	       jb[8].setBounds(10,280,120,80);
	       jb[9].setBounds(130,280,120,80);
	       jb[10].setBounds(250,280,120,80);
	       jb[11].setBounds(370,280,120,80);
	       jb[12].setBounds(10,360,120,80);
	       jb[13].setBounds(130,360,120,80);
	       jb[14].setBounds(250,360,120,80);
	       jb[15].setBounds(370,360,120,80);
	       jb[16].setBounds(10,440,120,80);
	       jb[17].setBounds(130,440,120,80);
	       jb[18].setBounds(250,440,120,80);
	       jb[19].setBounds(370,440,120,80);
	       jb[20].setBounds(10,520,240,80);
	       jb[21].setBounds(250,520,120,80);
	       jb[22].setBounds(370,520,120,80);

	       for(int i=0;i<23;i++) {
	    	   jb[i].setBackground(Color.LIGHT_GRAY);
	    	   jb[i].setFont(new java.awt.Font("宋体", Font.BOLD,25));
	    	   c.add(jb[i]);
	       }
	       jb[4].setForeground(Color.RED);
	       jb[5].setForeground(Color.RED);
	       jb[22].setBackground(Color.ORANGE);
           jb[0].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				t1.setText("mc");			   
				
			}
		});
           jb[1].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("m+");			   
   				
   			}
   		});
           jb[2].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("m-");			   
   				
   			}
   		});
           jb[3].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("mr");			   
   				
   			}
   		});
           jb[4].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("");			   
   				
   			}
   		});
           jb[5].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("<-");			   
   				
   			}
   		});
           jb[6].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText("+/-");			   
   				
   			}
   		});
           jb[7].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText(t1.getText()+"/");			   
   				
   			}
   		});
           jb[8].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText(t1.getText()+"7");			   
   				
   			}
   		});
           jb[9].addActionListener(new ActionListener() {
   			
   			public void actionPerformed(ActionEvent e) {
   				t1.setText(t1.getText()+"8");			   
   			}
   		});
           jb[10].addActionListener(new ActionListener() {
      			
      			public void actionPerformed(ActionEvent e) {
      				t1.setText(t1.getText()+"9");			   
      			}
      		});
           jb[11].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"*");			   
     			}
     		});
           jb[12].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"4");			   
     			}
     		});
           jb[13].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"5");			   
     			}
     		});
           jb[14].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"6");			   
     			}
     		});
           jb[15].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"-");			   
     			}
     		});
           jb[16].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"1");			   
     			}
     		});
           jb[17].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"2");			   
     			}
     		});
           jb[18].addActionListener(new ActionListener() {
     			
     			public void actionPerformed(ActionEvent e) {
     				t1.setText(t1.getText()+"3");			   
     			}
     		}); 
           jb[19].addActionListener(new ActionListener() {
      			
      			public void actionPerformed(ActionEvent e) {
      				t1.setText(t1.getText()+"+");			   
      			}
      		});
           jb[20].addActionListener(new ActionListener() {
      			
      			public void actionPerformed(ActionEvent e) {
      				t1.setText(t1.getText()+"0");			   
      			}
      		}); 
           jb[21].addActionListener(new ActionListener() {
      			
      			public void actionPerformed(ActionEvent e) {
      				t1.setText(t1.getText()+".");			   
      			}
      		}); 
           jb[22].addActionListener(new ActionListener() {
      			
      			public void actionPerformed(ActionEvent e) {
      				t1.setText("=");			   
      			}
      		});
    	       
 	       
	       
	       
	       setVisible(true);//窗体可见

	}

	public static void main(String[] args) {
	
		demo d = new demo();
	     
	}
}


