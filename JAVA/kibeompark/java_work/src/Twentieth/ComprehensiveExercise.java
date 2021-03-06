package Twentieth;

public class ComprehensiveExercise {
    public static void main(String[] args) {
        /*
            1. 주사위 2개를 굴려서 컴퓨터와 대전을 치뤄 보자 !
               눈금이 높은 사람이 이긴다 !

            2. 랜덤한 숫자를 200개 생성한다.
               숫자의 범위는 20 ~ 60 까지로 제한한다.
               각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 작성해 보자 !

            3. 1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.
               1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.
               nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....
               위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해 보자 !

            4. 1 ~ 10억 번의 루프를 돈다.
               위의 숫자는 표기상 n0 ... n1000000000 으로 표기하도록 한다.
               아래 코드를 for 문으로 돌리고 thread를 활용하여 성능을 개선해 보자 !

               nX * [Math.pow(10, -15) * nX] * sin( nX * pi / 180 ) +
               n(X + 1) * [Math.pow(10, -15) * n(X + 1)] * sin( n(X + 1) * pi / 180 ) +
               .......

            4-1) 전체 데이터를 몇 명에게 몇 개씩 나눌 것인가 ?
            4-2) 실질적인 연산을 수행하는데 있어서
                 데이터 종속성(Data Dependency)가 없는가 확인한다.
                 (현재 케이스에서는 일부러 없게 만듦)
            4-3) 만약 데이터 종속성이 있다면 수식을 변형하여 종속성이 없게 만들고 작업을 한다.
            4-4) 스레드를 만들어서 분할 처리를 하도록 프로그래밍 한다.
         */

        double sum = 0;

        PerformanceUtil.performanceCheckStart();

        for(int i = 1; i <= 1000000000; i++) {
            sum += (i * (Math.pow(10, -15) * i)) * Math.sin(i * Math.PI / 180.0);
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
