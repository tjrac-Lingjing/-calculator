package mycalculation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

public class calculation extends JFrame implements ActionListener {

	boolean clear = true;
	boolean isResult = false;
	boolean click = true;
	int a = 0;
	JButton num[]=new JButton[10];
	JButton op[]=new JButton[5];
	JButton point = new JButton(".");
	JTextField text,text1;
	String symbol;
	String sym1=null,sym2=null;
	double n1,n2;
	
	public calculation()
	{
		setTitle("制造计算器大队的计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,300,515,660);//前面两个是窗口出现的坐标（x,y），后面是窗体的长和宽
		this.setResizable(false);
		
		Container contentPane= getContentPane();//内容面板
		contentPane.setLayout(null);//new BorderLayout());//设为边界布局
		/*
		JPanel panel1 = new JPanel();
		contentPane.add(panel1,BorderLayout.NORTH);
		panel1.setLayout(new GridLayout(0,1,0,0));//设为网格布局，一列多行*/
	
		JTextField text1 = new JTextField();//上面那个文本框
        text1.setBounds(10,10,480,60);
        text1.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		text1.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		text1.setEditable(false);//不可编辑
		text1.setColumns(12);
		text1.setBackground(Color.WHITE);
		//panel1.add(text1);
		contentPane.add(text1);
		
		
		/*  根据卢梦婷代码修改
		 *   t1.setBounds(10,10,480,60);
		   t1.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
	       text1.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		   t1.setColumns(12);//12列
		   t1.setEditable(false);
	       text1.setBackground(Color.WHITE);*/
		
		JTextField text = new JTextField();//下面的文本框
	    text.setBounds(10,80,480,60);
	    text.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		text.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		text.setEditable(false);//不可编辑
		text.setColumns(10);//设为10列
		text.setBackground(Color.WHITE);
		//panel1.add(text);
		contentPane.add(text);
		
		
		/*JPanel panel2 = new JPanel();
		contentPane.add(panel2);//默认为contentPane中间
		panel2.setLayout(new BorderLayout(0,0));
		
		JPanel p1 =new JPanel();
		FlowLayout f1_p1 = (FlowLayout) p1.getLayout();//设为流水布局
		f1_p1.setHgap(60);
		panel2.add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		panel2.add(p2,BorderLayout.WEST);
		p2.setLayout(new GridLayout(0,1,5,5));
		
		JPanel p3 = new JPanel();
		panel2.add(p3,BorderLayout.CENTER);
		p3.setLayout(new GridLayout(0,5,5,5));*/
		
		/*jb[0] = new JButton("X²");
	       jb[1] = new JButton("m+");
	       jb[2] = new JButton("m-");
	       jb[3] = new JButton("mr");
	       jb[4] = new JButton("AC");
	       jb[5] = new JButton("<=");
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
	    	   contentPane.add(jb[i]);
	       }
	       jb[4].setForeground(Color.RED);
	       jb[5].setForeground(Color.RED);
	       jb[22].setBackground(Color.ORANGE);
	       jb[0].addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					text1.setText("X²");			   
					
				}
			});
	           jb[1].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("m+");			   
	   				
	   			}
	   		});
	           jb[2].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("m-");			   
	   				
	   			}
	   		});
	           jb[3].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("mr");			   
	   				
	   			}
	   		});
	           jb[4].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("");			   
	   				
	   			}
	   		});
	           jb[5].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("<-");			   
	   				
	   			}
	   		});
	           jb[6].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText("+/-");			   
	   				
	   			}
	   		});
	           jb[7].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText(text1.getText()+"/");			   
	   				
	   			}
	   		});
	           jb[8].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText(text1.getText()+"7");			   
	   				
	   			}
	   		});
	           jb[9].addActionListener(new ActionListener() {
	   			
	   			public void actionPerformed(ActionEvent e) {
	   				text1.setText(text1.getText()+"8");			   
	   			}
	   		});
	           jb[10].addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent e) {
	      				text1.setText(text1.getText()+"9");			   
	      			}
	      		});
	           jb[11].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"*");			   
	     			}
	     		});
	           jb[12].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"4");			   
	     			}
	     		});
	           jb[13].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"5");			   
	     			}
	     		});
	           jb[14].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"6");			   
	     			}
	     		});
	           jb[15].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"-");			   
	     			}
	     		});
	           jb[16].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"1");			   
	     			}
	     		});
	           jb[17].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"2");			   
	     			}
	     		});
	           jb[18].addActionListener(new ActionListener() {
	     			
	     			public void actionPerformed(ActionEvent e) {
	     				text1.setText(text1.getText()+"3");			   
	     			}
	     		}); 
	           jb[19].addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent e) {
	      				text1.setText(text1.getText()+"+");			   
	      			}
	      		});
	           jb[20].addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent e) {
	      				text1.setText(text1.getText()+"0");			   
	      			}
	      		}); 
	           jb[21].addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent e) {
	      				text1.setText(text1.getText()+".");			   
	      			}
	      		}); 
	           jb[22].addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent e) {
	      				text1.setText("=");			   
	      			}
	      		});*/
		
		//数字按键的位置	
		for(int i=0;i<=9;i++)
			num[i]=new JButton(""+i+"");
		//数字按键的坐标和按键大小
		num[0].setBounds(10,520,240,80);
		num[1].setBounds(10,440,120,80);
		num[2].setBounds(130,440,120,80);
		num[3].setBounds(250,440,120,80);
		num[4].setBounds(10,360,120,80);
		num[5].setBounds(130,360,120,80);
		num[6].setBounds(250,360,120,80);
		num[7].setBounds(10,280,120,80);
		num[8].setBounds(130,280,120,80);
		num[9].setBounds(250,280,120,80);	
		//数字按键的字体颜色，添加到面板
		for(int i=0;i<=9;i++)
		{
			num[i].setBackground(Color.LIGHT_GRAY);
			num[i].setFont(new java.awt.Font("宋体", Font.BOLD,25));
			 contentPane.add(num[i]);
		}
		num[0].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[0])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"0");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   			}
   		});
		num[1].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[1])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"1");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[2].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[2])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"2");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[3].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[3])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"3");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   			}
   		});
		num[4].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[4])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"4");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[5].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[5])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"5");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[6].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[6])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"6");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   			}
   		});
		num[7].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[7])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"7");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[8].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[8])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"8");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   				
   			}
   		});
		num[9].addActionListener(new ActionListener() {	
   			public void actionPerformed(ActionEvent e) {
   				Object t = e.getSource();
   				if(t==num[9])
   				{
   					if(clear == false)
   						text.setText("");
   					text.setText(text.getText()+"9");
   					clear = true;
   					isResult=false;
   					a = 0;
   				}		   
   			}
   		});
		
	
		/* jb[16].setBounds(10,440,120,80);
	       jb[17].setBounds(130,440,120,80);
	       jb[18].setBounds(250,440,120,80);
	       jb[19].setBounds(370,440,120,80);
	       jb[20].setBounds(10,520,240,80);
	       jb[12].setBounds(10,360,120,80);
	       jb[13].setBounds(130,360,120,80);
	       jb[14].setBounds(250,360,120,80);
	       jb[8].setBounds(10,280,120,80);
	       jb[9].setBounds(130,280,120,80);
	       jb[10].setBounds(250,280,120,80);*/
		 /*  for(int i=0;i<23;i++) {
	    	   jb[i].setBackground(Color.LIGHT_GRAY);
	    	   jb[i].setFont(new java.awt.Font("宋体", Font.BOLD,25));
	    	   contentPane.add(jb[i]);
	       }*/
			/*num[0]= new JButton("0");
			num[0].addActionListener(this);
			num[1]= new JButton("0");
			num[1].addActionListener(this);
			num[2]= new JButton("0");
			num[2].addActionListener(this);*/
		
		//+、-、*、/、=按键的创建
			op[1]=new JButton("+");
			op[2]=new JButton("-");
			op[3]=new JButton("*");
			op[4]=new JButton("/");
			op[0]=new JButton("=");
			op[0].setBounds(370,520,120,80);
			op[1].setBounds(370,440,120,80);
			op[2].setBounds(370,360,120,80);
			op[3].setBounds(370,280,120,80);
			op[4].setBounds(370,200,120,80);
			
			for(int i=0;i<5;i++)
			{
				op[i].setBackground(Color.LIGHT_GRAY);
				op[i].setForeground(Color.RED);
				op[i].setFont(new java.awt.Font("宋体", Font.BOLD,25));
				 contentPane.add(op[i]);
			}
			op[0].addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(t==op[0])
	   				{
	   					a++;text1.setText("");
	   					sym1=sym2=null;
	   					isResult=true;
	   					
	   					n2=Double.parseDouble(text.getText());
	   					
	   					switch(symbol)
	   					{
	   					case "+":text.setText(n1+n2+"");break;
	   					case "-":text.setText(n1-n2+"");break;
	   					case "*":text.setText(n1*n2+"");break;
	   					case "/":
	   						if(n2==0)
	   							text.setText("除数不能为0");
	   						else
	   						 text.setText(n1/n2+"");break;
	   					}
	   				}
	   				clear = false;
	   				a=0;
	   				symbol=null;
	   			}
	   		});
			op[1].addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(a==0)
	   				{
	   					if(t==op[1])
	   					{
	   						a++;symbol="+";
	   						sym1=sym2;sym2="+";
	   						
	   						if(sym1==null&&sym2!=null)
	   						{
	   							n1=Double.parseDouble(text.getText());
	   							text1.setText(n1+sym2);
	   						}
	   						
	   						if(sym1!=null&&sym2!=null)
	   						{
	   							isResult=true;
	   							n2=Double.parseDouble(text.getText());
	   							text1.setText(text1.getText()+n2+sym2);
	   							f();
	   						}
	   						clear=false;
	   					}
	   				}
	   			}
	   		});
			op[2].addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(a==0)
	   				{
	   					if(t==op[2])
	   					{
	   						a++;symbol="-";
	   						sym1=sym2;sym2="-";
	   						
	   						if(sym1==null&&sym2!=null)
	   						{
	   							n1=Double.parseDouble(text.getText());
	   							text1.setText(n1+sym2);
	   						}
	   						
	   						if(sym1!=null&&sym2!=null)
	   						{
	   							isResult=true;
	   							n2=Double.parseDouble(text.getText());
	   							text1.setText(text1.getText()+n2+sym2);
	   							f();
	   						}
	   						clear=false;
	   					}
	   				}
	   			}
	   		});
			op[3].addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(a==0)
	   				{
	   					if(t==op[3])
	   					{
	   						a++;symbol="*";
	   						sym1=sym2;sym2="*";
	   						
	   						if(sym1==null&&sym2!=null)
	   						{
	   							n1=Double.parseDouble(text.getText());
	   							text1.setText(n1+sym2);
	   						}
	   						
	   						if(sym1!=null&&sym2!=null)
	   						{
	   							isResult=true;
	   							n2=Double.parseDouble(text.getText());
	   							text1.setText(text1.getText()+n2+sym2);
	   							f();
	   						}
	   						clear=false;
	   					}
	   				}
	   			}
	   		});
			op[4].addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(a==0)
	   				{
	   					if(t==op[4])
	   					{
	   						a++;symbol="/";
	   						sym1=sym2;sym2="/";
	   						
	   						if(sym1==null&&sym2!=null)
	   						{
	   							n1=Double.parseDouble(text.getText());
	   							text1.setText(n1+sym2);
	   						}
	   						
	   						if(sym1!=null&&sym2!=null)
	   						{
	   							isResult=true;
	   							n2=Double.parseDouble(text.getText());
	   							text1.setText(text1.getText()+n2+sym2);
	   							f();
	   						}
	   						clear=false;
	   					}
	   				}
	   			}
	   		});
			
			
			point.setBounds(250,520,120,80);
			point.setBackground(Color.LIGHT_GRAY);
			point.setFont(new java.awt.Font("宋体", Font.BOLD,25));
			contentPane.add(point);
			point.addActionListener(new ActionListener() {	
	   			public void actionPerformed(ActionEvent e) {
	   				Object t = e.getSource();
	   				if(t==point){
	   					click=true;
	   					for(int i=0;i<text.getText().length();i++){
	   						if(text.getText().charAt(i)=='.'){
	   							click = false;break;//已经点到 . 
	   						}
	   					}
	   					
	   					if(click == true){
	   						if(Integer.parseInt(text.getText())==0)
	   							text.setText("0.");
	   						else
	   							text.setText(text.getText()+".");//text中值不为0，在后面加.
	   					}	
	   				}		   
	   			}
	   		});
		  
			 /*  jb[19] = new JButton("+");  jb[15] = new JButton("-");
		       jb[11] = new JButton("*"); jb[7] = new JButton("/");
		       jb[22] = new JButton("=");jb[21] = new JButton(".");
		 jb[19].setBounds(370,440,120,80);jb[15].setBounds(370,360,120,80);
		   jb[11].setBounds(370,280,120,80);jb[7].setBounds(370,200,120,80);
		    jb[22].setBounds(370,520,120,80);   jb[21].setBounds(250,520,120,80);*/  
		
		       setVisible(true);//窗体可见
		
	}
	public static void main(String[] args) {
		try {
			calculation product = new calculation();
			product.setVisible(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object t = e.getSource();

		//+、-、*、/、=的响应代码没敲。
		
		
	}

	public void f()
	{
		if(sym1.equals("+"))
		{
			n1=n1+n2;
			text.setText(n1+"");
		}
		if(sym1.equals("-"))
		{
			n1=n1-n2;
			text.setText(n1+"");
		}
		if(sym1.equals("*"))
		{
			n1=n1*n2;
			text.setText(n1+"");
		}if(sym1.equals("/"))
		{
			if(n2==0)
			{
				text.setText("除数不可为0");
				text1.setText("");
			}
			else
			{
				n1=n1/n2;
				text.setText(n1+"");	
			}
		}
	}
}
