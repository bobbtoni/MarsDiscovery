import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RobotTest {
    @Test
    fun `turn robot left from north to west`() {
        val robot = Robot(direction = SidesHorizon.NORTH)
        robot.turnToLeft()
        robot.direction shouldBe SidesHorizon.WEST
    }

    @Test
    fun `turn robot left around its axis`() {
        val robot = Robot(direction = SidesHorizon.WEST)
        robot.turnToLeft()
        robot.direction shouldBe SidesHorizon.SOUTH
        robot.turnToLeft()
        robot.direction shouldBe SidesHorizon.EAST
        robot.turnToLeft()
        robot.direction shouldBe SidesHorizon.NORTH
        robot.turnToLeft()
        robot.direction shouldBe SidesHorizon.WEST
    }


    @Test
    fun `turn robot right from north to east`() {
        val robot = Robot(direction = SidesHorizon.NORTH)
        robot.turnToRight()
        robot.direction shouldBe SidesHorizon.EAST
    }

    @Test
    fun `turn robot right from east to south`() {
        val robot = Robot(direction = SidesHorizon.EAST)
        robot.turnToRight()
        robot.direction shouldBe SidesHorizon.SOUTH
    }

    @Test
    fun `heading north in a straight line`() {
        val robot = Robot(0, 0, SidesHorizon.NORTH)
        robot.moveStraight()
        robot.y shouldBe 1
        robot.x shouldBe 0
    }

    @Test
    fun `heading south in a straight line`() {
        val robot = Robot(0, 0, SidesHorizon.SOUTH)
        robot.moveStraight()
        robot.y shouldBe -1
        robot.x shouldBe 0
    }

    @Test
    fun `heading west in a straight line`() {
        val robot = Robot(0, 0, SidesHorizon.WEST)
        robot.moveStraight()
        robot.x shouldBe -1
        robot.y shouldBe 0
    }

    @Test
    fun `heading east in a straight line`() {
        val robot = Robot(0, 0, SidesHorizon.EAST)
        robot.moveStraight()
        robot.x shouldBe 1
        robot.y shouldBe 0
    }

    @Test
    fun `robot(x=3 y=4 direction=NORTH) shouldBe "3 4 N"`() {
        val robot = Robot(3, 4, SidesHorizon.NORTH)
        robot.info shouldBe "3 4 N"
    }

    @Test
    fun `robot(x=4 y=3 direction=WEST) shouldBe "4 3 W"`() {
        val robot = Robot(4, 3, SidesHorizon.WEST)
        robot.info shouldBe "4 3 W"
    }

    @Test
    fun `robot(x=0 y=0 direction=EAST) shouldBe "0 0 E"`() {
        val robot = Robot(0, 0, SidesHorizon.EAST)
        robot.info shouldBe "0 0 E"
    }

    @Test
    fun `robot(x=4 y=3 direction=SOUTH) shouldBe "4 3 S"`() {
        val robot = Robot(4, 3, SidesHorizon.SOUTH)
        robot.info shouldBe "4 3 S"
    }
}