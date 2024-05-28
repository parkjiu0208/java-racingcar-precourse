package racingcar.controller;

import java.util.List;
import racingcar.domain.Race;
import racingcar.view.OutputView;
import racingcar.view.InputView;

public class RacingController {
    public static void main(String[] args) {
        List<String> carNames = getValidCarNames();
        int rounds = getValidRounds();

        Race race = new Race(carNames,int raceNum);
        race.start();

        OutputView.printWinners(race.findWinners());
    }
//    자동차 이름 입력
    private static List<String> getValidCarNames(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 1자 이상 5자 이하만 가능합니다.");
            }
        }
        return carNames;
    }
//      시행 횟수 입력
    private static int getValidRounds() {
        int raceNum = 0;
        while (raceNum <= 0) {
            try {
                raceNum = InputView.getRounds();
            } catch (NumberFormatException | IllegalArgumentException e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
        }
        return raceNum;
    }

//    실행결과




//    우승자
}
