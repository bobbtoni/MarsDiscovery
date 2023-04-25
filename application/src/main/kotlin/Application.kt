fun main() {
    val context = ComponentContext()
    print("верхний правый угол плато -> ")
    val (w, h) = readln().split(" ").map { it.toInt() }
    context.createGround.create(w, h)
    print("текущее положение и направление камеры первого марсохода -> ")
    val (x1, y1, d1) = readln().split(" ")
    val robot1 = Robot(x1.toInt(), y1.toInt(), SidesHorizon.byShortName(d1))
    context.createRobot.create(1, robot1)
    print("управление положением первого марсохода -> ")
    val commands1: String = readln()

    // Повторяю потому что лень превращаь 1 в первого и 2 во второго
    print("текущее положение и направление камеры второго марсохода -> ")
    val (x2, y2, d2) = readln().split(" ")
    val robot2 = Robot(x2.toInt(), y2.toInt(), SidesHorizon.byShortName(d2))
    context.createRobot.create(2, robot2)
    print("управление положением второго марсохода -> ")
    val commands2 = readln()

    context.commandsExecuter.execute(commands1, 1)
    context.commandsExecuter.execute(commands2, 2)

    println("конечное положение и направление камеры первого марсохода -> ${robot1.info}")
    println("конечное положение и направление камеры второго марсохода -> ${robot2.info}")
}