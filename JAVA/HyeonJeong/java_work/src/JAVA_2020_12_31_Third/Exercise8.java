public class Exercise8 {
    public static void main(String[] args) {
//      1 ~ 30까지의 숫자 중 2 혹은 3의 배수는 더하고 5의 배수는 뺀다.
//      혼동의 여지를 방지하기 위해
//      10처럼 2의 배수이면서 5의 배수가 되는 경우엔
//      빼기도 하고 더하기도 하므로 결론적으로 0

        int sum = 0;

//      Q: 도대체 언제 0을 설정해야 하는가요?
//      A: 컴퓨터 초기값으로 0을 설정하지 않는다
//         기본적으로 컴퓨터는 초기 변수를 0으로 설정하지 않기 때문에
//         0으로 초기화하지 않은 값은 알 수 없는 이상한 값을 가지고 있다.
//         값을 누산하는 변수가 된다면 잘못된 연산을 수행하지 않도록
//         0으로 초기화 해야 한다.

//      ex) 현재 내가 가지고 있는 박스 A
//          현재 A는 빈 박스
//          친구네 집 박스는 B
//          현재 B에는 2개가 들어있음
//          B의 내용물을 A로 옮긴다 하면 자연스럽게 0 + 2로 2가 된다.
//          그러나 컴퓨터에 이를 명확하게 0으로 초기화 해주지 않으면
//          ???(알 수 없는 미지의 값) + 2 의 형식으로 진행된다.

        for(int i = 1; i < 31; i++){
//          더하기 파트
            if( i % 2 == 0 || i % 3 == 0 ){
                sum += i;
                System.out.println("더하는 값 = " + i);
            }
//          빼기 파트
            if( i % 5 == 0 ){
                sum =- i;
                System.out.println("빼는 값 = " + i);
            }

        }
        System.out.println("결과 = " + sum);

        int twoThreeSum = 0, fiveSum = 0;

        for(int i = 0; i < 31; i++) {
            //더하기 파트
            if(i % 2 == 0 || i % 3 == 0) {
                twoThreeSum += i;
                System.out.println("더하는 값 = " + i);
            }
        }

//      Ver.2
        for(int i = 0; i < 31; i++) {
            //빼기 파트
            if (i % 5 == 0) {
                fiveSum += i;
                System.out.println("더하는 값 = " + i);
            }
        }

        System.out.println("더하는 값 = + " + twoThreeSum);
        System.out.println("빼는 값 = " + fiveSum);
        System.out.println("최종 값 = " + (twoThreeSum - fiveSum));

//      Ver.3
        int addSum = 0, subSum = 0;

        for(int i = 0; i < 31; i++) {
            //더하기 파트
            if(i % 2 == 0 || i % 3 == 0) {
                addSum += i;
                System.out.println("더하는 값 = " + i);
            }

            if(i % 5 == 0) {
                subSum += i;
                System.out.println("빼는 값 = " + i);
            }
        }

        System.out.println("총합 = " + addSum);
        System.out.println("총뺄셈 = " + subSum);
        System.out.println("결과 = " + (addSum + subSum));
    }
}
