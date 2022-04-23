package racingcar.model;

import racingcar.constant.Sign;

public class Car {

    private final CarName name;
    private int headway;

    Car(String carName) {
        this.headway = 0;
        this.name = this.mapCarName(carName);
    }

    private CarName mapCarName(String carName) {
        return new CarName(carName);
    }

    public String getCarName() {
        return this.name.getCarName();
    }

    public int getHeadway() {
        return this.headway;
    }

    public void drive(int engine) {
        if (engine > 3) {
            addHeadway();
        }
    }

    private void addHeadway() {
        this.headway += 1;
    }

    private String getHeadwaySign() {
        StringBuffer sign = new StringBuffer("");
        for (int repeat = 0; repeat < getHeadway(); repeat++) {
            sign.append(Sign.HEADWAY_SIGN.getSign());
        }
        return sign.toString();
    }

    public String getStatus() {
        StringBuffer status = new StringBuffer(getCarName());
        status.append(Sign.CONNECTION_SIGN.getSign());
        status.append(getHeadwaySign());
        return status.toString();
    }
}
