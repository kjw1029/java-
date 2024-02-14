package jaeuk;
// Java Standard Library
public class jaeukUtill {
	/**
	 * 두 수의 합을 연산하여 반환하는 메소드입니다.
	 * 
	 * @param num1 첫번째 정수가 필요합니다.
	 * @param num2 두번째 정수가 필요합니다.
	 * @return 두 수의 합이 정수형으로 반환됩니다.
	 */
	public int plus (int num1, int num2) {
		return num1 + num2;
	
	}
	/**
	 * 피제수(정수)를 제수(정수)로 나누어 몫을 반환하는 메소드립니다.
	 *
	 * @author 강
	 * @see//링크
	 * @since 01월 15일
	 *
	 * @param divide 피제수
	 * @param divisor 제수
	 * @return 몫(정수)
	 * 
	 * @throws ArithmeticException 제수가 0인 경우에 예외가 발생합니다.
	 */
	public int divide(int divide, int divisor) {
		return divide / divisor;
	}

}
