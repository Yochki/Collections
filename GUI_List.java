package Part_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> numbers = new LinkedList<>();
		System.out.println("Enter the numbers: ");

		for (int i = 0; i < 5; i++) {
			
		}

		JFrame frame = new JFrame("Numbers");
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		JTextArea numbersArea = new JTextArea();
		
		JTextField inputNumbers = new JTextField();
		inputNumbers.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Integer number = Integer.parseInt(inputNumbers.getText());
				if (!numbers.contains(number)) {
					numbers.add(number);
				}
				inputNumbers.setText("");
				numbersArea.setText(numbers.toString());
				System.out.println(numbers);
			}
		});
		mainPanel.add(inputNumbers);

		numbersArea.setEditable(false);
		mainPanel.add(numbersArea);
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				Collections.sort(numbers);
				numbersArea.setText(numbers.toString());
			}
		});
		mainPanel.add(sortButton);
		
		JButton reverseSortButton = new JButton("Reverse Sort");
		reverseSortButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				Collections.sort(numbers, Collections.reverseOrder());
				numbersArea.setText(numbers.toString());
				}
		});
		mainPanel.add(reverseSortButton);
		
		JButton shuffleButton = new JButton("Shuffle");
		shuffleButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				Collections.shuffle(numbers);
				numbersArea.setText(numbers.toString());
			}
		});
		mainPanel.add(shuffleButton);
		
		frame.setVisible(true);
	}
}
