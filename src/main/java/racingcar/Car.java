package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int forwardDistanceBetweenStartLine = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getForwardDistanceBetweenStartLine() {
        return forwardDistanceBetweenStartLine;
    }

    public void tryForwardByCondition(int randomNumber) {
        if (randomNumber >= 4){
            forwardDistanceBetweenStartLine += 1;
        }
    }

}
