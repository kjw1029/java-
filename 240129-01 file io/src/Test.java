import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Test extends JFrame {
	private File file = new File("d:\\mydata\\time.txt");
	private int i;

	public Test() {
		JPanel pnlCenter = new JPanel();
		showGUI();
		add(pnlCenter);

		JLabel lbltime = new JLabel();
		pnlCenter.add(lbltime);
		i = readTime();
		lbltime.setText(Integer.toString(i));

		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lbltime.setText(Integer.toString(i));
				saveTime(i); // 시간을 파일에 저장
			}
		});

		JButton btntime = new JButton("시작");
		btntime.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		pnlCenter.add(btntime);
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void saveTime(int i) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(Integer.toString(i));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public int readTime() {
		File file = new File("d:\\mydata\\time.txt");
		String defaultValue = "0";
		if (!file.exists()) {
			return Integer.valueOf(defaultValue);
		}
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(file));
			if ((line = br.readLine()) != null) {
				return Integer.parseInt(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		new Test();
	}
}
