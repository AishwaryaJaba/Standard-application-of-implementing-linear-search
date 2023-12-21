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
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(108, 11, 291, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(121, 53, 130, 20);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(284, 53, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR CREATION
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message="Queue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 12));
		create.setForeground(new Color(139, 0, 0));
		create.setBounds(173, 84, 161, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("    ENTER AN ELEMENT :");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(30, 134, 159, 23);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(199, 134, 86, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR  INSERT
				int elem;
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not Possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(139, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(304, 131, 130, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else
				{
					String message= "Element Deleted is :"+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(139, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(171, 168, 130, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(171, 202, 130, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(96, 236, 303, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
