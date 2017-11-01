import java.awt.EventQueue;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DailyTraker {

	private JFrame frame;
	private JTextField Pushups;
	private JTextField Running;
	private JTextField MaxPush;
	private JTextField MaxRunning;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DailyTraker window = new DailyTraker();
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
	public DailyTraker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton RecordPushups = new JButton("Record");
		RecordPushups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pushNums;
				try{
					pushNums = Integer.parseInt(Pushups.getText());
					MaxPush.setText(Integer.toString(pushNums));
					
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
					}
			}
		});
		RecordPushups.setBounds(335, 60, 89, 23);
		frame.getContentPane().add(RecordPushups);
		
		JLabel lblPushups = new JLabel("Pushups");
		lblPushups.setBounds(10, 69, 86, 14);
		frame.getContentPane().add(lblPushups);
		
		Pushups = new JTextField();
		Pushups.setBounds(159, 66, 86, 20);
		frame.getContentPane().add(Pushups);
		Pushups.setColumns(10);
		
		Running = new JTextField();
		Running.setBounds(159, 91, 86, 20);
		frame.getContentPane().add(Running);
		Running.setColumns(10);
		
		JButton RecordRunning = new JButton("Record");
		RecordRunning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float runningNums;
				try{
					runningNums = Float.parseFloat(Running.getText());
					MaxRunning.setText(Float.toString(runningNums));
					
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
					}
			}
		});
		RecordRunning.setBounds(335, 90, 89, 23);
		frame.getContentPane().add(RecordRunning);
		
		JLabel lblRunningmiles = new JLabel("RunningMiles");
		lblRunningmiles.setBounds(10, 94, 118, 14);
		frame.getContentPane().add(lblRunningmiles);
		
		JLabel lblMaximumPushupsToday = new JLabel("Maximum Pushups Today");
		lblMaximumPushupsToday.setBounds(10, 177, 169, 14);
		frame.getContentPane().add(lblMaximumPushupsToday);
		
		JLabel lblNewLabel = new JLabel("Maximum Running Miles Today");
		lblNewLabel.setBounds(10, 216, 235, 14);
		frame.getContentPane().add(lblNewLabel);
		
		MaxPush = new JTextField();
		MaxPush.setBounds(288, 174, 86, 20);
		frame.getContentPane().add(MaxPush);
		MaxPush.setColumns(10);
		
		MaxRunning = new JTextField();
		MaxRunning.setBounds(288, 213, 86, 20);
		frame.getContentPane().add(MaxRunning);
		MaxRunning.setColumns(10);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		
		JLabel Date = new JLabel(dtf.format(now));
		
		Date.setBounds(346, 11, 126, 14);
		frame.getContentPane().add(Date);
		
	}
}
