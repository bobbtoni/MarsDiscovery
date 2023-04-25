package impl

import TurnRobotToLeft
import port.RobotGetPort
import port.RobotSavePort

class TurnRobotToLeftImpl(
    private val robotGetPort: RobotGetPort,
    private val robotSavePort: RobotSavePort
): TurnRobotToLeft {
    override fun turn(robotId: Int) {
        val robot = robotGetPort.get(robotId)
        robot.turnToLeft()
        robotSavePort.save(robotId, robot)
    }
}