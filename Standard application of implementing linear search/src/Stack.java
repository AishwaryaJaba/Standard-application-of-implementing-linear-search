import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(165, 21, 175, 19);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ENTER THE STACK SIZE :");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setBounds(106, 65, 194, 23);
		contentPane.add(btnNewButton);
		
		sizefield = new JTextField();
		sizefield.setBounds(310, 64, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//STACK CREATION CODE
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setForeground(new Color(139, 0, 0));
		stack.setBounds(178, 99, 162, 23);
		contentPane.add(stack);
		
		JButton btnEnterAnElement = new JButton("ENTER AN ELEMENT :");
		btnEnterAnElement.setForeground(Color.RED);
		btnEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 12));
		btnEnterAnElement.setBounds(29, 143, 194, 23);
		contentPane.add(btnEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(233, 146, 86, 20);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.setForeground(new Color(255, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 12));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUSH CODE HERE
				int elem;
				if(top==size-1)
				{
					JOptionPane.showInternalMessageDialog(contentPane, "Push not Possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push Successfull");
					element.setText("");
				}
			}
		});
		push.setBounds(323, 143, 106, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP CODE HERE
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not Possible");
				}
				else
				{
					String message="Element deleted is:"+s[top];
					JOptionPane.showMessageDialog(contentPane,message);
					--top;
				}
			}
		});
		pop.setForeground(Color.RED);
		pop.setFont(new Font("Constantia", Font.BOLD, 12));
		pop.setBounds(196, 188, 122, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY CODE HERE
				String msg="";
				if( top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					for(int i=top; i>=0; i--)
					{
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(196, 221, 123, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(90, 255, 322, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
