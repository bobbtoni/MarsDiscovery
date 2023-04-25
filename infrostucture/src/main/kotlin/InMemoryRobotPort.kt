import port.RobotGetPort
import port.RobotSavePort

class InMemoryRobotPort: RobotGetPort, RobotSavePort {

    private val store: MutableMap<Int, Robot> = mutableMapOf()

    override fun get(robotId: Int): Robot {
        return store[robotId]!!
    }

    override fun save(robotId: Int, robot: Robot) {
        store[robotId] = robot
    }
}