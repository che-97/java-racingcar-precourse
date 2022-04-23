package racingcar.model;

import racingcar.constant.ErrorMessage;

public class RaceNumber {

    private static final String NUMBER_FORMAT = "[-0-9]+";
    private final int raceNumber;

    RaceNumber(String raceNumber) {
        isNumber(raceNumber);
        isGreaterThenZero(raceNumber);
        this.raceNumber = mapRaceNumber(raceNumber);
    }

    private int mapRaceNumber(String raceNumber) {
        return Integer.parseInt(raceNumber);
    }

    private void isNumber(String raceNumber) {
        if (!raceNumber.matches(NUMBER_FORMAT)) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_RACE_NUMBER.getMessage());
        }
    }

    private void isGreaterThenZero(String raceNumber) {
        if (Integer.parseInt(raceNumber) < 1) {
            throw new IllegalArgumentException(ErrorMessage.IS_ZERO.getMessage());
        }
    }

    public int getRaceNumber(){
        return this.raceNumber;
    }
}
