import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	class Node
	{
	int data;
	Node link;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(107, 21, 319, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(26, 67, 166, 26);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(202, 68, 110, 20);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT REAR
				Node temp;
				int elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Insertion at rear successfull");
				element1.setText("");
				}
		});
		insertrear.setForeground(new Color(139, 0, 0));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 12));
		insertrear.setBounds(322, 67, 149, 23);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT FRONT
				
				int elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Insertion at front successfull");
				element2.setText("");
			}
		});
		insertfront.setForeground(new Color(139, 0, 0));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 12));
		insertfront.setBounds(322, 101, 149, 23);
		contentPane.add(insertfront);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(26, 101, 166, 26);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(202, 104, 110, 20);
		contentPane.add(element2);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE REAR
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				 else if (first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
					first=null;
				}
				else
				{
				    temp=first;
				    while(temp.link.link!=null)
				    {
				    	temp=temp.link;
				    }
				    JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+temp.link.data);
				    temp.link=null;
				}
			
			}});
		deleterear.setForeground(new Color(139, 0, 0));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 12));
		deleterear.setBounds(164, 138, 149, 23);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else if(first.link==null)
				{
				    JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
				    first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(new Color(139, 0, 0));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 12));
		deletefront.setBounds(164, 172, 149, 23);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
					displaybox.setText("");
				}
				else if(first.link==null)
				{
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(164, 206, 149, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(93, 247, 306, 26);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
