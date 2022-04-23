package racingcar.model;

import racingcar.constant.ErrorMessage;

public class CarName {

    private final String carName;

    CarName(String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    private void validateCarName(String carName) {
        if (carName.isEmpty() || carName.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_CAR_NAME.getMessage());
        }
    }

    public String getCarName() {
        return this.carName;
    }

}
