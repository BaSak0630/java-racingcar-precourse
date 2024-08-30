package racingcar;

/*
 * 클래스 이름 RacingCount
 *
 * 버전 정보 V1
 *
 * 날짜 7월 12일
 *
 * 저작권 주의
 */
public class RacingCount {
    int count;
    public RacingCount(String countStr) {
        try{
        this.count = Integer.parseInt(countStr);
        }catch (Exception e){
            throw new IllegalArgumentException("[ERROR]시도할 회수는 몇회인가요?");
        }
    }
    public boolean gameOver() {
        if(this.count > 0){
            return true;
        }
        return false;
    }

    public void counting() {
        this.count--;
    }
}
