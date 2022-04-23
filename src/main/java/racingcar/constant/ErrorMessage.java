package racingcar.constant;

public enum ErrorMessage {
    WRONG_CAR_NAME("[ERROR]자동차 이름은 5자 이하여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
