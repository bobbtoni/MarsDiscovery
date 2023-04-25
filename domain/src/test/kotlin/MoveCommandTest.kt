import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MoveCommandTest {

    @Test
    fun `move robot inside borders`() {
        val robot = Robot(0, 0, SidesHorizon.NORTH)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 1
    }

    @Test
    fun `move robot outside borders bottom`() {
        val robot = Robot(0, 0, SidesHorizon.SOUTH)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 0
    }

    @Test
    fun `move robot outside borders top`() {
        val robot = Robot(0, 5, SidesHorizon.NORTH)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 5
    }

    @Test
    fun `move robot outside borders right`() {
        val robot = Robot(0, 0, SidesHorizon.WEST)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 0
    }

    @Test
    fun `move robot to bottom left`() {
        val robot = Robot(0, 1, SidesHorizon.SOUTH)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 0
    }

    @Test
    fun `move robot outside borders left`() {
        val robot = Robot(6, 0, SidesHorizon.EAST)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 6
        robot.y shouldBe 0
    }

    @Test
    fun `move robot to bottom right`() {
        val robot = Robot(5, 0, SidesHorizon.EAST)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 6
        robot.y shouldBe 0
    }

    @Test
    fun `move robot to top left`() {
        val robot = Robot(0, 4, SidesHorizon.NORTH)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 0
        robot.y shouldBe 5
    }

    @Test
    fun `move robot to top right`() {
        val robot = Robot(5, 5, SidesHorizon.EAST)
        val ground = Ground(6, 5)
        MoveCommand().move(robot, ground)
        robot.x shouldBe 6
        robot.y shouldBe 5
    }

}