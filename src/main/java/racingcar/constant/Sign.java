package racingcar.constant;

public enum Sign {
    HEADWAY_SIGN("-"),
    CONNECTION_SIGN(":");
    private final String sign;

    Sign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
