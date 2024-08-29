package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차 이름 5자 이하")
    public void validationNameTest() throws Exception{
        //given
        Car car = new Car("abcdef");
        //expect
        assertFalse(car.validationName(5));
    }
}