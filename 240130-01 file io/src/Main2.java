import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		File origin = new File("filename.txt");
		File copy = new File("copy.txt");

		try (FileInputStream fis = new FileInputStream(origin); // 선언과 초기화 분리 불가능  
				FileOutputStream fos = new FileOutputStream(copy)) { // 마지막 세미클론 생략 가능 최근것부터 close
			byte[] b = new byte[(int) origin.length()];

			fis.read(b);
			fos.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
