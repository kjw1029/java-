import java.util.ArrayList;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(10); // 내부적인값? 공간 생성, 공간확보시 시간이 걸려서 미리 생성? 기본 10개 capacity
		System.out.println(list.size());
	}

}
