class MoveCommand {
    fun move(robot: Robot, ground: Ground) {
        val xTmp = robot.x
        val yTmp = robot.y
        robot.moveStraight()
        if (!validatePosition(robot, ground)) {
            robot.x = xTmp
            robot.y = yTmp
        }
    }

    private fun validatePosition(robot: Robot, ground: Ground): Boolean {
        return robot.y >= 0 && robot.y <= ground.height && robot.x >= 0 && robot.x <= ground.weight
    }
}