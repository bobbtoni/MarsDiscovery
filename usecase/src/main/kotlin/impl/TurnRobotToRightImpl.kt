package impl

import TurnRobotToRight
import port.RobotGetPort
import port.RobotSavePort

class TurnRobotToRightImpl(
    private val robotGetPort: RobotGetPort,
    private val robotSavePort: RobotSavePort
): TurnRobotToRight {
    override fun turn(robotId: Int) {
        val robot = robotGetPort.get(robotId)
        robot.turnToRight()
        robotSavePort.save(robotId, robot)
    }
}