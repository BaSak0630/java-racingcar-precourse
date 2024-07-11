package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 이름 CarCollection
 *
 * 버전 정보 V1
 *
 * 날짜 7월 12일
 *
 * 저작권 주의
 */
public class RacingService {
    private static final int CAR_NAME_LENGTH = 5;
    CarCollection carCollection;
    RacingService() {
        registration();
    }

    public void start() {
    }

    private void registration() {
        while (true){
            try {
                System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
                String readLine = Console.readLine();
                String[] names = readLine.split(",");
                List<Car> cars = new ArrayList<>();
                for (String name : names) {
                    Car car = new Car(name);
                    cars.add(car);
                }
                carCollection = new CarCollection(cars);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
