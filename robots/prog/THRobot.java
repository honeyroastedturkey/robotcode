package prog;

import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class ThRobot extends AdvancedRobot {
    public void run() {
        while (true){
            turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(300);
    }

}
