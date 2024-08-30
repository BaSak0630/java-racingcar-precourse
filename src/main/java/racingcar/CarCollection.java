package racingcar;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 이름 CarCollection
 *
 * 버전 정보 V1
 *
 * 날짜 7월 10일
 *
 * 저작권 주의
 */
public class CarCollection {
    private static final int CAR_NAME_LENGTH = 5;
    private  List<Car> cars;

    public CarCollection(List<Car> cars) {
        validationNameSize(cars);
        this.cars = cars;
    }

    private void validationNameSize(List<Car> cars) {
        for(Car car : cars) {
            if(!car.validationName(CAR_NAME_LENGTH)){
                throw new IllegalArgumentException("[ERROR] 자동차의 이름은 5자 이하만 가능하다.");
            }
        }
    }

    public void randomMove() {
        for(Car car : cars) {
            car.randomPosition();
        }
    }

    public void printPlayResult() {
        StringBuilder result = new StringBuilder();
        for(Car car : cars) {
            result.append(car.printState()).append("\n");
        }
        System.out.println(result);
    }
    public String printFinalResult() {
        StringBuilder result = new StringBuilder();
        List<Integer> positions = new ArrayList<>();
        List<String> names = new ArrayList<>();
        int maxPosition = -1;
        for(Car car : cars) {
           positions.add(car.getPosition());
        }
        for(Integer position : positions) {
            if(position > maxPosition) {
                maxPosition = position;
            }
        }
        result.append("최종 우승자 : ");
        for(Car car : cars) {
            if(car.getPosition() == maxPosition) {
                names.add(car.getName());
            }
        }
        for(int i = 0 ; i < names.size() ; i++) {
            result.append(names.get(i));
            if(i != names.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
