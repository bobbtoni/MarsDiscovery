package port

import Robot

interface RobotSavePort {
    fun save(robotId: Int, robot: Robot)
}