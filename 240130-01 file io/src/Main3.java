import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		// 단순 int 값 10000, 20000, 30000, 40000 파일 기록 // 2진정보?? 으로 정보 기록 4byte 고정
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("numbers.bin")));) {
			dos.writeInt(10000);
			dos.writeInt(20000);
			dos.writeInt(30000);
			dos.writeInt(40000);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
