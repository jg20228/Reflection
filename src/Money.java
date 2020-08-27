public class Money {
	public int num1 = 30000;
	public int num2 = 50000;

	
	@NumCheck//음수값이 나오면 제어 할 수 있는 어노테이션 하나 만들 예정
	public int minus() {
		return num1 - num2;
	}
}
