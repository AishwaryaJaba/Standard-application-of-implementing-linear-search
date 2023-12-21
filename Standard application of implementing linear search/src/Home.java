import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(135, 21, 268, 19);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBounds(198, 51, 89, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(Color.RED);
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(61, 98, 89, 23);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(Color.RED);
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(314, 98, 89, 23);
		contentPane.add(queue);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		cq.setForeground(Color.RED);
		cq.setFont(new Font("Constantia", Font.BOLD, 12));
		cq.setBounds(61, 162, 139, 23);
		contentPane.add(cq);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKED LIST WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(Color.RED);
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		sll.setBounds(275, 162, 153, 23);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKED LIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(Color.RED);
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setBounds(159, 219, 159, 23);
		contentPane.add(dll);
	}
}
