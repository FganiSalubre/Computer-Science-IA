package TirelifePackage;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class GuiTirelife {

	private String weather = "";
	private String tyres_are_new;
	private String tyres_vibrating;
	private String tyres_grainy;

	private float track_distance = 0;
	private int n_of_turns = 0;
	private String racetrack_condition = "";

	private int lap_used = 0;
	private float max_speed = 0;
	private float min_speed = 0;

	private int num_of_laps = 0;
	private float weight_of_client = 0;

	private String tire_chosen;

	private String type = "";

	private float tire_pressure = 0;

	private JFrame frame;
	private JTextField distancetextField;

	private JComboBox weathercomboBox;
	private JComboBox newtirescomboBox;
	private JComboBox vibrationcomboBox;
	private JComboBox grainycomboBox;
	private JComboBox trackconditioncomboBox;
	private JComboBox choosetirescomboBox;

	private JTextField existingtirelifetextField;
	private JTextField turnstextField;
	private JTextField maxspeedtextField;
	private JTextField minspeedtextField;
	private JTextField noflapstextField;
	private JTextField weightclienttextField;
	private JTextField tirepressuretextField;
	
	private JTextPane outputArea;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tire-life Prediction System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(170, 13, 234, 17);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Track Distance (km)");
		lblNewLabel_1.setBounds(12, 204, 126, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Choose Weather");
		lblNewLabel_2.setBounds(12, 59, 95, 16);
		frame.getContentPane().add(lblNewLabel_2);

		weathercomboBox = new JComboBox();
		weathercomboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Sunny", "Rainy" }));
		weathercomboBox.setBounds(129, 56, 113, 22);
		frame.getContentPane().add(weathercomboBox);

		distancetextField = new JTextField();
		distancetextField.setBounds(139, 201, 103, 22);
		frame.getContentPane().add(distancetextField);
		distancetextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Are Tires New?");
		lblNewLabel_3.setBounds(12, 88, 95, 16);
		frame.getContentPane().add(lblNewLabel_3);

		newtirescomboBox = new JComboBox();
		newtirescomboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Yes", "No" }));
		newtirescomboBox.setBounds(129, 85, 113, 22);
		frame.getContentPane().add(newtirescomboBox);

		JLabel lblNewLabel_4 = new JLabel("Are Tires Vibrating?");
		lblNewLabel_4.setBounds(12, 117, 116, 16);
		frame.getContentPane().add(lblNewLabel_4);

		vibrationcomboBox = new JComboBox();
		vibrationcomboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Yes", "No" }));
		vibrationcomboBox.setBounds(129, 114, 113, 22);
		frame.getContentPane().add(vibrationcomboBox);

		JLabel lblAreTiresGrainy = new JLabel("Are Tires Grainy?");
		lblAreTiresGrainy.setBounds(12, 146, 99, 16);
		frame.getContentPane().add(lblAreTiresGrainy);

		grainycomboBox = new JComboBox();
		grainycomboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Yes", "No" }));
		grainycomboBox.setBounds(129, 143, 113, 22);
		frame.getContentPane().add(grainycomboBox);

		JLabel lblNewLabel_5 = new JLabel("Existing Tire-life");
		lblNewLabel_5.setBounds(12, 175, 95, 16);
		frame.getContentPane().add(lblNewLabel_5);

		existingtirelifetextField = new JTextField();
		existingtirelifetextField.setBounds(129, 172, 113, 22);
		frame.getContentPane().add(existingtirelifetextField);
		existingtirelifetextField.setColumns(10);

		turnstextField = new JTextField();
		turnstextField.setBounds(139, 230, 103, 22);
		frame.getContentPane().add(turnstextField);
		turnstextField.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Number of Turns");
		lblNewLabel_6.setBounds(12, 233, 103, 16);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Race-track Condition");
		lblNewLabel_7.setBounds(12, 262, 126, 16);
		frame.getContentPane().add(lblNewLabel_7);

		trackconditioncomboBox = new JComboBox();
		trackconditioncomboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Good", "Bad" }));
		trackconditioncomboBox.setBounds(139, 259, 103, 22);
		frame.getContentPane().add(trackconditioncomboBox);

		JLabel lblNewLabel_8 = new JLabel("Maximum Speed");
		lblNewLabel_8.setBounds(12, 291, 95, 16);
		frame.getContentPane().add(lblNewLabel_8);

		maxspeedtextField = new JTextField();
		maxspeedtextField.setBounds(139, 288, 103, 22);
		frame.getContentPane().add(maxspeedtextField);
		maxspeedtextField.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Minimum Speed");
		lblNewLabel_9.setBounds(12, 320, 95, 16);
		frame.getContentPane().add(lblNewLabel_9);

		minspeedtextField = new JTextField();
		minspeedtextField.setBounds(139, 317, 103, 22);
		frame.getContentPane().add(minspeedtextField);
		minspeedtextField.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Number of Laps");
		lblNewLabel_10.setBounds(295, 59, 95, 16);
		frame.getContentPane().add(lblNewLabel_10);

		noflapstextField = new JTextField();
		noflapstextField.setBounds(402, 56, 116, 22);
		frame.getContentPane().add(noflapstextField);
		noflapstextField.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Weight of Client");
		lblNewLabel_11.setBounds(295, 88, 95, 16);
		frame.getContentPane().add(lblNewLabel_11);

		weightclienttextField = new JTextField();
		weightclienttextField.setBounds(402, 85, 116, 22);
		frame.getContentPane().add(weightclienttextField);
		weightclienttextField.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Choose Tires");
		lblNewLabel_12.setBounds(295, 117, 80, 16);
		frame.getContentPane().add(lblNewLabel_12);

		choosetirescomboBox = new JComboBox();
		choosetirescomboBox.setModel(new DefaultComboBoxModel(new String[] {"", "0 - Bridgestone", "1 - Komet", "2 - MG Tires"}));
		choosetirescomboBox.setBounds(402, 114, 116, 22);
		frame.getContentPane().add(choosetirescomboBox);

		JLabel lblNewLabel_13 = new JLabel("Tire Pressure");
		lblNewLabel_13.setBounds(295, 146, 80, 16);
		frame.getContentPane().add(lblNewLabel_13);

		tirepressuretextField = new JTextField();
		tirepressuretextField.setBounds(402, 146, 116, 22);
		frame.getContentPane().add(tirepressuretextField);
		tirepressuretextField.setColumns(10);

		JButton calculatebtnNewButton = new JButton("Calculate Tire life-span");
		calculatebtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calculatebtnNewButtonactionPerformed();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		calculatebtnNewButton.setBounds(322, 287, 183, 25);
		frame.getContentPane().add(calculatebtnNewButton);
		
		JTextPane outputArea = new JTextPane();
		outputArea.setBackground(Color.LIGHT_GRAY);
		outputArea.setBounds(322, 186, 183, 89);
		outputArea.setEditable(false);
		frame.getContentPane().add(outputArea);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiTirelife window = new GuiTirelife();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiTirelife() {
		initialize();

	}

//	public void actionPerformedweatherComboBox() {
//		String choice;
//		choice = weathercomboBox.getSelectedItem().toString();
//		outputArea.setText(choice);
//		while (true) {
//			choice = (Tirelife.tire.getInput()) + "";
//
//			if (choice.equalsIgnoreCase("Sunny")) {
//
//				JOptionPane.showMessageDialog(null, "Equip Slick Tires");
//
//				break;
//			} else if (choice.equalsIgnoreCase("Rainy")) {
//
//				JOptionPane.showMessageDialog(null, "Equip Wet Tires");
//
//				break;
//			}
//		} 
//	}

	private void calculatebtnNewButtonactionPerformed() throws Exception{

		weather = weathercomboBox.getSelectedItem().toString();
		tyres_are_new = newtirescomboBox.getSelectedItem().toString();
		tyres_vibrating = vibrationcomboBox.getSelectedItem().toString();
		tyres_grainy = grainycomboBox.getSelectedItem().toString();
		racetrack_condition = trackconditioncomboBox.getSelectedItem().toString();
		tire_chosen = choosetirescomboBox.getSelectedItem().toString();
		Scanner scanner = new Scanner(tire_chosen);
		int temp_tire = scanner.nextInt();
		track_distance = Float.parseFloat(distancetextField.getText());
		n_of_turns = Integer.parseInt(turnstextField.getText());
		lap_used = Integer.parseInt(noflapstextField.getText());
		max_speed = Integer.parseInt(maxspeedtextField.getText());
		min_speed = Integer.parseInt(minspeedtextField.getText());
		num_of_laps = Integer.parseInt(noflapstextField.getText());
		weight_of_client = Integer.parseInt(weightclienttextField.getText());
		tire_pressure = Float.parseFloat(tirepressuretextField.getText());
		boolean valid = false;
		while (!valid) {
			int tire_type = temp_tire;
			switch (tire_type) {
//                Assigning value to calculate_life on the basis of user selection 
				case 0:
					type = "Bridgestone";
					Tirelife.calculated_life = 150;
					valid = true;
					break;
				case 1:
					type = "MG Tires";
					Tirelife.calculated_life = 120;
					valid = true;
					break;
				case 2:
					type = "Komet";
					Tirelife.calculated_life = 100;
					valid = true;
					break;
				default:
					throw new Exception("Invalid input");
			}
			/*if (!"".equals(type)) {
				break;
			}*/
		}
		
		int calc_life = Calculation.calculate (Tirelife.calculated_life, track_distance, n_of_turns, racetrack_condition, tire_pressure,
		num_of_laps, lap_used, weight_of_client);
		outputArea.setText("Tire Life Span : " + calc_life);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		GuiTirelife window = new GuiTirelife();
		window.frame.setVisible(true);
	}
}
