package sss;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;
public class ssss extends JFrame implements ActionListener {
	JButton but[] = new JButton[24];
	String[] str = {"X²","1/X","%","π","C","<——","+/-","/","7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+","00", "0", ".", "=" };
	JTextField text,text1;
	String in = "";// 输入的字符串
	public ssss() {
		setSize(400, 300);
		setTitle("简易计算器");
		Container c = getContentPane();
		setBounds(360,50,430,600);//先位置，后大小
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		GridLayout w = new GridLayout(6, 4);//网格布局
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(w);
		text = new JTextField();//文本框
		text.setHorizontalAlignment(SwingConstants.RIGHT);//左对齐
		text.setFont(new java.awt.Font("宋体", Font.BOLD,40));
		text.setEditable(false);//文本框不写
		text.setBackground(Color.WHITE);
		c.add(jp1, BorderLayout.NORTH);
		jp1.add(text, BorderLayout.NORTH);
		for (int i = 0; i < str.length; i++) {
			but[i] = new JButton(str[i]);
			jp2.add(but[i]);
			but[i].setBackground(Color.LIGHT_GRAY);
			but[i].setFont(new java.awt.Font("宋体", Font.BOLD,25));
			but[i].addActionListener(this);//监听
		}
		but[4].setForeground(Color.RED);
		but[5].setForeground(Color.RED);
		but[23].setBackground(Color.ORANGE);	
		c.add(jp2, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int t = 0;
		String s = e.getActionCommand();
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")|| s.equals("%")) {
			in += " " + s + " "; // 如果碰到运算符，就在运算符前后分别加一个空格，
									// 为后面的分解字符串做准备
		} 
		else if (s.equals("C")) {
			in = "";
		} 
		else if (s.equals("<——")) {
			if ((in.charAt(in.length() - 1)) == ' ') { // 检测字符串的最后一个字符是否为空格,
				in = in.substring(0, in.length() - 3);// 如果是则删除末尾3个字符，否则删除
																// 1个字符
			} 
			else {
				in = in.substring(0, in.length() - 1);
			}
		}
		/////////////////////////////////////////////
		
		else if (s.equals("1/X")) {
			String p[];
			p = in.split(" ");
			int num=p.length;
			in="";
			for (int i = 0; i < p.length-1; i++) {
				if(i%2==0) {
					in=in+p[i];
				}
				else {
					in=in+" "+p[i]+" ";
				}
			}
			in=in+"1 / "+p[num-1];
			text.setText(in);
		}
		
		else if (s.equals("π")) {
			in+="3.1415926";
			text.setText(in);
		}
		
		
		else if (s.equals("X²")) {
			in=in+" * "+in;
			text.setText(in);
		}
		
		else if (s.equals("+/-")) {
			in=in+" * -1";
			text.setText(in);
		}
		//////////////////////////////////////////////////
		
		
		else if (s.equals("=")) {
			in = compute(in);
			if(in.compareTo("Infinity") == 0) {
				in="error";
			}
			text.setText(in);
			in = "";
			t = 1;
		} 
		else
			in += s;
		if (t == 0) {
			text.setText(in);
		}
	}
	private String compute(String str) {
		String Q[];
		Q = str.split(" ");
		if(Q[0].compareTo("") == 0) {
			String M="error";
			return M;
		}
		else {
		Stack<Double> s = new Stack<Double>();
		Double a = Double.parseDouble(Q[0]);
		s.push(a);
		text.setText("error");
		for (int i = 1; i < Q.length; i++) {
			if (i % 2 == 1) {
				if (Q[i].compareTo("+") == 0) {
					double b = Double.parseDouble(Q[i + 1]);
					s.push(b);
					}	
				if (Q[i].compareTo("-") == 0) {
					double b = Double.parseDouble(Q[i + 1]);
					s.push(-b);
				}
				if (Q[i].compareTo("*") == 0) {
					double b = Double.parseDouble(Q[i + 1]);
					double c = s.pop();
					c *= b;
					s.push(c);
				}
				if (Q[i].compareTo("/") == 0) {
					double b = Double.parseDouble(Q[i + 1]);
					double c = s.peek();
					s.pop();
					c /= b;
					s.push(c);
				}
				if (Q[i].compareTo("%") == 0) {
					double b = Double.parseDouble(Q[i + 1]);
					double c = s.pop();
					c %= b;
					s.push(c);
				}
			}
		}
		double sum = 0;
		while (!s.isEmpty()) {
			sum += s.pop();
		}
		String result=String.format("%.8f",sum);
		return result;
		}
	}
	public static void main(String[] args) {
		new ssss();
	}
}
