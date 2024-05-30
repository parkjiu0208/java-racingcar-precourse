package racingcar.controller;

import static racingcar.view.InputView.getCarNames;
import static racingcar.view.InputView.getRaceNum;

import java.util.List;
import racingcar.domain.Race;
import racingcar.view.OutputView;

public class RacingController {
    public static void main(String[] args) {
//        자동차 이름 입력
        List<String> carNames = getCarNames();
//        시행 횟수 입력
        int raceNum = getRaceNum();
//        레이스 시작
        Race race = new Race(carNames, raceNum);
        race.start();
//        우승자 출력
        OutputView.printWinners(race.findWinners(race.maxPosition()));
    }

//
//    private static List<String> getValidCarNames(List<String> carNames) {
//        for (String name : carNames) {
//            if (name.length() > 5) {
//                throw new IllegalArgumentException("[ERROR] 자동차 이름은 1자 이상 5자 이하만 가능합니다.");
//            }
//        }
//        return carNames;
//    }
//
//    private static int getValidRounds() {
//        int raceNum = 0;
//        while (raceNum <= 0) {
//            try {
//                raceNum = InputView.getRounds();
//            } catch (NumberFormatException | IllegalArgumentException e) {
//                System.out.println("[ERROR] " + e.getMessage());
//            }
//        }
//        return raceNum;
//    }
//
}
