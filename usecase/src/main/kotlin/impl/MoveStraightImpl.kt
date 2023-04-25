package impl

import MoveCommand
import MoveStraight
import port.GroundGetPort
import port.RobotGetPort
import port.RobotSavePort

class MoveStraightImpl(
    private val robotGetPort: RobotGetPort,
    private val groundGetPort: GroundGetPort,
    private val moveCommand: MoveCommand,
    private val robotSavePort: RobotSavePort
): MoveStraight {
    override fun execute(robotId: Int) {
        val robot = robotGetPort.get(robotId)
        val ground = groundGetPort.get()
        moveCommand.move(robot, ground)
        robotSavePort.save(robotId, robot)
    }
}