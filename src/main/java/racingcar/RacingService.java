package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 이름 RacingService
 *
 * 버전 정보 V1
 *
 * 날짜 7월 12일
 *
 * 저작권 주의
 */
public class RacingService {
    CarCollection carCollection;
    RacingCount count;
    RacingService() {
        registration();
        readCount();
    }

    public void start() {
    }
    private void readCount() {
        while (true) {
            try {
                System.out.println("시도할 회수는 몇회인가요?");
                String readLine = Console.readLine();
                count = new RacingCount(readLine);
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void registration() {
        while (true){
            try {
                System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
                String readLine = Console.readLine();
                String[] names = readLine.split(",");
                List<Car> cars = new ArrayList<>();
                for (String name : names) {
                    if(name.equals("")) throw new IllegalArgumentException("[ERROR] 차량의 이름을 공백으로 할 수 없습니다.");
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
