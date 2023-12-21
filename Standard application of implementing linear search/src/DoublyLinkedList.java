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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox1;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	private JTextField displaybox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 349);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(108, 11, 351, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("          ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 53, 196, 20);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(216, 53, 86, 20);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT REAR
				Node temp=null;
				int elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insert at rear successfull");
					element1.setText("");
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "Insertion at rear successfull");
					element1.setText("");
				}
				
			}
		});
		insertrear.setForeground(new Color(139, 0, 0));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 12));
		insertrear.setBounds(323, 52, 160, 23);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("          ENTER THE ELEMENT :");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 99, 204, 20);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(216, 97, 86, 20);
		contentPane.add(element2);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT FRONT
				int elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insert at front successfull");
					element2.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insert at front successfull");
					element2.setText("");
				}
			}
		});
		insertfront.setForeground(new Color(139, 0, 0));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 12));
		insertfront.setBounds(323, 96, 160, 23);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE REAR
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				 else if (first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
					first=null;
				}
				 else
					{
					    temp=first;
					    while(temp.nextlink.nextlink!=null)
					    {
					    	temp=temp.nextlink;
					    }
					    JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+temp.nextlink.data);
					    temp.nextlink=null;
					}
				}
		});
		deleterear.setForeground(new Color(139, 0, 0));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 12));
		deleterear.setBounds(173, 139, 160, 23);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				 else if (first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
					first=null;
				}
				 else
				 {
					    JOptionPane.showMessageDialog(contentPane, "Deleted element is:"+first.data);
					    first=first.nextlink;
					    first.prelink=null;
				 }
			}
		});
		deletefront.setForeground(new Color(139, 0, 0));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 12));
		deletefront.setBounds(173, 173, 160, 23);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY FORWARD
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
					displaybox1.setText("");
				}
				else if(first.nextlink==null)
				{
					msg=msg+" "+first.data;
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox1.setText(msg);
				}
			}
		});
		displayforward.setForeground(new Color(139, 0, 0));
		displayforward.setFont(new Font("Constantia", Font.BOLD, 12));
		displayforward.setBounds(36, 224, 212, 23);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY REVERSE
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
					displaybox2.setText("");
				}
				else if(first.nextlink==null)
				{
					msg=msg+" "+first.data;
					displaybox2.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					displaybox2.setText(msg);
				}
			}
		});
		displayreverse.setForeground(new Color(139, 0, 0));
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 12));
		displayreverse.setBounds(268, 224, 212, 23);
		contentPane.add(displayreverse);
		
		displaybox1 = new JTextField();
		displaybox1.setBounds(65, 264, 141, 23);
		contentPane.add(displaybox1);
		displaybox1.setColumns(10);
		
		displaybox2 = new JTextField();
		displaybox2.setColumns(10);
		displaybox2.setBounds(305, 264, 141, 23);
		contentPane.add(displaybox2);
	}
}
