import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
	public static void main(String[] args) {
		Files.exists(Paths.get("create.txt"));
		try {
			Files.createFile(Paths.get("create.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
