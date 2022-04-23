package racingcar.constant;

public enum ErrorMessage {
    WRONG_CAR_NAME("[ERROR]자동차 이름은 5자 이하여야 합니다."),
    WRONG_RACE_NUMBER("[ERROR]경주 횟수는 숫자여야 합니다."),
    IS_ZERO("[ERROR]경주 횟수 0보다 커야 합니다.")
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
