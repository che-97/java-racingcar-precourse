package racingcar.model;

import racingcar.constant.ErrorMessage;

public class CarName {

    private final String carName;

    CarName(String carName) {
        validateCarNameIsEmpty(carName);
        validateCarNameLegnth(carName);
        this.carName = carName.trim();
    }

    private void validateCarNameIsEmpty(String carName) {
        if (null == carName || carName.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_CAR_NAME.getMessage());
        }
    }

    private void validateCarNameLegnth(String carName) {
        if (carName.trim().length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_CAR_NAME.getMessage());
        }
    }

    public String getCarName() {
        return this.carName;
    }

    public boolean isEqual(String carName) {
        return this.carName.equals(carName.trim());
    }

}
