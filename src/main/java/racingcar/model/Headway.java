package racingcar.model;

import racingcar.constant.Sign;

public class Headway {

    private int headway;
    private static final int INIT_HEADWAY = 0;
    private static final int ADD_HEADWAY = 1;

    Headway() {
        this.headway = INIT_HEADWAY;
    }

    public int getHeadway() {
        return this.headway;
    }

    public void addHeadway() {
        this.headway += ADD_HEADWAY;
    }

    public String getHeadwaySign() {
        StringBuffer sign = new StringBuffer("");
        for (int repeat = INIT_HEADWAY; repeat < this.getHeadway(); repeat++) {
            sign.append(Sign.HEADWAY_SIGN.getSign());
        }
        return sign.toString();
    }
}
