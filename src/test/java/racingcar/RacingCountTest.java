package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCountTest {
    @Test
    @DisplayName("시도 횟수 입력시 숫자 미입력")
    public void RacingCountTest() throws Exception{
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new RacingCount("df"));
        assertEquals(exception.getMessage(),"[ERROR]시도할 회수는 몇회인가요?");
    }
}