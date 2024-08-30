package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class CarCollectionTest {
    @Test
    @DisplayName("자동차 이름 5자 이하")
    public void validationNameSizeTest() throws Exception{
        //given
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("BMW"));
        cars.add(new Car("Honda"));
        cars.add(new Car("abcdef"));
        //expect
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new CarCollection(cars));

        assertEquals(exception.getMessage(),"[ERROR] 자동차의 이름은 5자 이하만 가능하다.");
    }

    @Test
    @DisplayName("최종결과 출력확인")
    public void printFinalResult() throws Exception{
        //given
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("BMW"));
        cars.add(new Car("Honda"));
        CarCollection carCollection = new CarCollection(cars);

        //expect
        assertEquals(carCollection.printFinalResult(),"최종 우승자 : Ford, BMW, Honda");

    }
}