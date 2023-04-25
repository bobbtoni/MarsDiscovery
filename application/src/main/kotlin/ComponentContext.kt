import impl.*

data class ComponentContext (
    val inMemoryRobotPort: InMemoryRobotPort = InMemoryRobotPort(),
    val inMemoryGroundPort: InMemoryGroundPort = InMemoryGroundPort(),
    val moveCommand: MoveCommand = MoveCommand(),
    val moveStraight: MoveStraight =
        MoveStraightImpl(inMemoryRobotPort, inMemoryGroundPort, moveCommand, inMemoryRobotPort),
    val createGround: CreateGround = CreateGroundImpl(inMemoryGroundPort),
    val createRobot: CreateRobotImpl = CreateRobotImpl(inMemoryRobotPort),
    val turnRobotToRight: TurnRobotToRight = TurnRobotToRightImpl(inMemoryRobotPort, inMemoryRobotPort),
    val turnRobotToLeft: TurnRobotToLeft = TurnRobotToLeftImpl(inMemoryRobotPort, inMemoryRobotPort),
    val commandsExecuter: CommandsExecuter = CommandsExecuter(moveStraight, turnRobotToLeft, turnRobotToRight)
) {

}