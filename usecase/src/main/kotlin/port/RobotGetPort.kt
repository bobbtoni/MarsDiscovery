package port

import Robot

interface RobotGetPort {
    fun get(robotId: Int): Robot
}