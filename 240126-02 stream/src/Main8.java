import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main8 {
	public static void main(String[] args) {
		File origin = new File("data.txt");
		File copy = new File("copy.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(origin);
			fos = new FileOutputStream(copy);
			
			int length = (int) origin.length();
			byte[] bytes = new byte[length]; // 길이값이 줄어드면 손실 발생, 늘어나면 파일 크기 커짐.
			
			fis.read(bytes);
			fos.write(bytes);
			
			System.out.println("복사가 안료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
