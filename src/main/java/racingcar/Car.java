package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
/*
 * 클래스 이름 Car
 *
 * 버전 정보 V1
 *
 * 날짜 월 일
 *
 * 저작권 주의
 */
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }


    // 추가 기능 구현
    public boolean validationName(int carNameLength) {
        if (name.length() <= carNameLength) {
            return true;
        }
        return false;
    }

    public void randomPosition() {
        int randomNum = pickNumberInRange(0, 9);
        if(randomNum <= 4){
            position++;
        }
    }
}
