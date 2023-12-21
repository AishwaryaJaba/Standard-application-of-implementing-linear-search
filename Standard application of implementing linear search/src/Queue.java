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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
    private int q[];
    private int size;
    private int r=-1;
    private int  f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(161, 11, 245, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(115, 72, 136, 15);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		sizefield.setBounds(251, 67, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CREATION
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message="Queue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setBounds(161, 99, 154, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(102, 145, 136, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		element.setColumns(10);
		element.setBounds(229, 140, 86, 20);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CODE FOR INSERT
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insert not Possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(139, 0, 0));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 12));
		btnInsert.setBounds(325, 139, 106, 23);
		contentPane.add(btnInsert);
		
		JButton btnDisplay = new JButton("DELETE");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not Possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is"+q[f]);
					++f;
				}
			}
		});
		btnDisplay.setForeground(new Color(139, 0, 0));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 12));
		btnDisplay.setBounds(189, 181, 136, 23);
		contentPane.add(btnDisplay);
		
		JButton btnDisplay_1 = new JButton("DISPLAY");
		btnDisplay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					for(int i=f; i<=r; i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		btnDisplay_1.setForeground(new Color(139, 0, 0));
		btnDisplay_1.setFont(new Font("Constantia", Font.BOLD, 12));
		btnDisplay_1.setBounds(189, 215, 136, 23);
		contentPane.add(btnDisplay_1);
		
		displaybox = new JTextField();
		displaybox.setBounds(109, 249, 296, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
