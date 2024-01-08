// 작가
// (글을 적을 수 있는 도구가 필요(가지고 있어야)하다)
// 글을 적을 수 있음
class Author {
	private Writeable tool;

	public Author(Writeable tool) {
		// 객체의존성
		super();
		this.tool = tool;
	}
	
	public void writeArtcle() {
		tool.write("책 내용");
	}

	public void setTool(Writeable tool) {
		this.tool = tool;
	}
	
	
}

interface Writeable {
	public void write(String line);
}

// 연필
// 문자열 콘솔 출력 가능
class Pencil implements Writeable {
	@Override
	public void write(String line) {
		System.out.println("연필로 " + line + " 적습니다.");
	}
}
// 볼펜
// 문자열 콘솔 출력 가능
class BallPen implements Writeable {
	@Override
	public void write(String line) {
		System.out.println("볼펜으로 " + line + " 적습니다.");
	}
}
public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		BallPen ballpen = new BallPen();
		
		pencil.write("한 줄의 문자열");
		ballpen.write("한 줄의 문자열");
		Author author = new Author(pencil);
		author.writeArtcle();
		
		author.setTool(ballpen);
		author.writeArtcle();
	}
}
