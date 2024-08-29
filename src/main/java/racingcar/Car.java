package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }


    // 추가 기능 구현
    public boolean validationName(int carNameLength) {
        if (name.length() < carNameLength) {
            return false;
        }
        return true;
    }
}
