import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Array extends JFrame {

	private JPanel contentPan;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];
	private JTextField length;
	private JTextField element;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 453);
		contentPan = new JPanel();
		contentPan.setForeground(new Color(199, 21, 133));
		contentPan.setBackground(new Color(255, 255, 0));
		contentPan.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPan);
		contentPan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(225, 22, 299, 22);
		contentPan.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ENTER ARRAY LENGTH :");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setBounds(140, 69, 212, 27);
		contentPan.add(btnNewButton);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length"+len+"Created";
				JOptionPane.showMessageDialog(contentPan, message);
				}
		});
		create.setForeground(new Color(139, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 12));
		create.setBounds(233, 107, 170, 27);
		contentPan.add(create);
		
		JButton btnEnterAnInteger = new JButton("ENTER AN INTEGER ELEMENT");
		btnEnterAnInteger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnterAnInteger.setForeground(new Color(255, 0, 0));
		btnEnterAnInteger.setFont(new Font("Constantia", Font.BOLD, 12));
		btnEnterAnInteger.setBounds(31, 149, 249, 27);
		contentPan.add(btnEnterAnInteger);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
			    int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element"+elem+"Inserted @ position"+pos;
				JOptionPane.showMessageDialog(contentPan, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(139, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(549, 151, 104, 23);
		contentPan.add(insert);
		
		JLabel lblNewLabel_1 = new JLabel("DELETE POSITION");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(100, 198, 125, 18);
		contentPan.add(lblNewLabel_1);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(233, 195, 86, 20);
		contentPan.add(deleteposition);
		deleteposition.setColumns(10);
		
		insertposition = new JTextField();
		insertposition.setBounds(464, 150, 60, 20);
		contentPan.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("POSITION");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(377, 153, 104, 18);
		contentPan.add(lblNewLabel_2);
		
		JButton delete = new JButton("DELETE");
		delete.setForeground(new Color(139, 0, 0));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element Deleted @ the position"+pos;
				JOptionPane.showMessageDialog(contentPan, message);	
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(327, 195, 89, 23);
		contentPan.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(139, 0, 0));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
				}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(275, 234, 91, 27);
		contentPan.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 250, 240));
		displaybox.setBounds(132, 300, 382, 20);
		contentPan.add(displaybox);
		displaybox.setColumns(10);
		
		length = new JTextField();
		length.setBounds(362, 70, 86, 20);
		contentPan.add(length);
		length.setColumns(10);
		
		element = new JTextField();
		element.setBounds(290, 150, 67, 20);
		contentPan.add(element);
		element.setColumns(10);
	}

	protected String element() {
		// TODO Auto-generated method stub
		return null;
	}
}
