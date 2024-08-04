package mid1.questResolve.wrapper;

import java.util.Random;

public class WrapperEx5Resolve {
    // 문제 - 로또 번호 자동 생성기
    //문제 설명
    //로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
    //로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
    //각 숫자는 중복되면 안된다.
    //실행할 때 마다 결과가 달라야 한다.
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumber = generator.generate();
        System.out.print("로또 번호: ");
        for (int i : lottoNumber) {
            System.out.print(i + " ");
        }
    }

    //로또 번호: 11 19 21 35 29 16
}
