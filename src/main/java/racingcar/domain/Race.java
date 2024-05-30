package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();
    private final int raceNum;

    public Race(List<String> carNames, int raceNum) {
        this.cars = createCars(carNames);
        this.raceNum = raceNum;
    }

    //자동차 이름을 입력 받아 리스트에 넣어 각각 car 객체로 만듦
    private List<Car> createCars(List<String> carNames) {
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    private void moveCars() {
        for (Car car : cars) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                car.move();
            }
        }
    }

    public void start() {
        for (int i = 0; i < raceNum; i++) {
            moveCars();
        }
    }

    public int maxPosition() {
        return cars.stream().mapToInt(Car::getPosition).max().orElse(0);
    }

    public List<String> findWinners(int maxPosition) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

}
