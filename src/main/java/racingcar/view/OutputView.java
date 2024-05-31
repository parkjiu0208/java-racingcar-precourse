package racingcar.view;

import java.util.List;
import racingcar.domain.Car;


public class OutputView {
    public static void eachResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + repeatHyphen(car.getPosition()));
        }
        System.out.println();
    }

    private static String repeatHyphen(int count) {
        StringBuilder hyphens = new StringBuilder();
        for (int i = 0; i < count; i++) {
            hyphens.append("-");
        }
        return hyphens.toString();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }
}
