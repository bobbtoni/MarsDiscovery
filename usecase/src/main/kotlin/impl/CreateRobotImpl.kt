package impl

import CreateRobot
import Robot
import port.RobotSavePort

class CreateRobotImpl(private val robotSavePort: RobotSavePort): CreateRobot {
    override fun create(robotId: Int, robot: Robot) {
        robotSavePort.save(robotId, robot)
    }

}