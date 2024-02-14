import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main6 {
	public static void main(String[] args) {
		String data = "바이트 배열 쓰기";

		File file = new File("output.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file); // 없는 경우 => 새로 생성, 있는 경우 => 덮어쓰기
			byte[] bytes = data.getBytes();

//			for (int i = 0; i < bytes.length; i++) {
//				fos.write(bytes[i]);
//			}
			fos.write(bytes, 0, bytes.length);
			System.out.println("파일 출력이 완료되었음.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
