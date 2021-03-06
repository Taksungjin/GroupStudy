import  java.util.Scanner;

public class SecondProTest {
    public static void main(String[] args) {
//		변수란?
//	 	1. 값을 받는 것
//		엄밀한 정의: 특정한 데이터타입을 저장할 수 있는 메모리 공간
//		너프한 정의: 특정한 데이터타입을 저장할 수 있는 공간

//		입력받은 숫자가 2의 배수인지 판별해보자!
//		아래 보이는 Scanner scan = new Scanner(System.in)
//		이 전체가 scanner이라는 변수를 통해서
//		키보드 입력을 받을 것임을 알려주는 것

        Scanner scanner = new Scanner(System.in);
//		new Scanner(System.in)을 통해 실제 키보드 정보를 획득

        System.out.print("숫자를 입력하세요: ");

//		키보드 입력에 대한 처리는 아래 코드에서 수행합니다.
//		scanner.nextInt() 실제 키보드 입력을 처리하는 부분
        int number = scanner.nextInt();

        System.out.println("입력 결과는 = " + number);

//		number % 2
//		%연산자는 나머지를 구하는 연산자다.
//		number % 2 는 'number를 2로 나눈 나머지를 구해주세요'.
//		어떤 수를 2로 나눈 나머지는 0혹은 1뿐이다.
//		2로 나눠 떨어진다면 이 값은 짝수임을 알 수 있다.
//		나머지가 0이 아니라 1인 상황은 홀수 일 것이다.
//		'=' 은 '~~과 같다'가 아닌 대입 연산임을 명심하자!
//		'==' 은 앞에 것과 뒤의 것이 같은지 질문을 하는 것이다.
//		질문의 답이 맞다면 true(1), 아니라면 false(0)
//		number를 2로 나눈 나머지가 0이 맞나요?
//		else는 if에 대한 조건이 맞지 않을 경우 사용한다.
//	 	else가 동작하는 시점은 if의 괄호에 있는 조건이
//		거짓(false)가 되었을 경우에 동작하게 된다.
        if( number % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
//		if문을 작성하는 방법
//		1.if를 적고 소괄호를 열고 닫고 중괄호를 열고 닫는다.
//		if() {}
//		2.소괄호 내부에 조건을 작성한다.
//		(해당 조건이 만족되면 중괄호의 내용을 수행한다)
//		3.중괄호 내부에 구동시킬 코드를 작성한다.

    }
}
