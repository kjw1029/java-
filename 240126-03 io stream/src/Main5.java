import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		String multiline = "동해물과\n백두산이\n마르고\n닳도록\n";
		// 버퍼가 안 찬 경우 출력이 안되는 경우도 있음
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("d:\\mydata\\lyrics.txt")));
			bw.write(multiline);
			bw.flush(); // 버퍼가 안 찬 경우에 출력
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
