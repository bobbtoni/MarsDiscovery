class CommandsExecuter(
    private val moveStraight: MoveStraight,
    private val turnRobotToLeft: TurnRobotToLeft,
    private val turnRobotToRight: TurnRobotToRight
) {
    fun execute(commands: String, robotId: Int) {
        commands.forEach {
            when(it) {
                'M' -> moveStraight.execute(robotId)
                'L' -> turnRobotToLeft.turn(robotId)
                'R' -> turnRobotToRight.turn(robotId)
                else -> print("$it command is unknown") // будем считать что это логи
            }
        }
    }
}