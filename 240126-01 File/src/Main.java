import java.io.File;

public class Main {
	public static void main(String[] args) {
		// 상대적 경로
		File file = new File("my.txt");
		System.out.println(file.exists()); // 파일존재여부
		System.out.println("경로: " + file.getPath());
		System.out.println("절대경로: " + file.getAbsolutePath());
		
		// 절대적 경로
		File realfile = new File("d:\\realfile.txt");
		System.out.println(realfile.exists());
		System.out.println("파일의 크기" + realfile.length()); // 파일이 담고 있는 정보의 크기, 바이트 단위
		System.out.println("경로: " + realfile.getPath());
	}
}
