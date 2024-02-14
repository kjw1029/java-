import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main15 {
	public static void main(String[] args) {
		// 이메일 패턴 작성
		// 1.영소문자로 시작
		// 2.영소문자와 숫자로 구성
		// 3.특수문자 @ 포함
		// 4.@ 이후에 도메인(영문자.영문자) 문자들
		// 5.id길이갑 1 ~ 26자
		// 6.도메인 길이값 3 ~ 10자
		
		//([a-z]){3} 그룹 반복? 
		String email = "example@gmail.com";
		String emailPattern = "([a-z][a-z0-9]{1,26})@(?=.{3,10}$)([a-z]+\\.[a-z]+)";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
	}

}
