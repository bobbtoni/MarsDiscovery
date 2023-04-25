import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class SidesHorizonTest {

    @Test
    fun `north to left is west`() {
        SidesHorizon.NORTH.toLeft() shouldBe SidesHorizon.WEST
    }

    @Test
    fun `to left around axis`() {
        SidesHorizon.NORTH.toLeft() shouldBe SidesHorizon.WEST
        SidesHorizon.WEST.toLeft() shouldBe SidesHorizon.SOUTH
        SidesHorizon.SOUTH.toLeft() shouldBe SidesHorizon.EAST
        SidesHorizon.EAST.toLeft() shouldBe SidesHorizon.NORTH
    }

    @Test
    fun `to right around axis`() {
        SidesHorizon.NORTH.toRight() shouldBe SidesHorizon.EAST
        SidesHorizon.EAST.toRight() shouldBe SidesHorizon.SOUTH
        SidesHorizon.SOUTH.toRight() shouldBe SidesHorizon.WEST
        SidesHorizon.WEST.toRight() shouldBe SidesHorizon.NORTH
    }

    @Test
    fun `get direction by short name`() {
        SidesHorizon.byShortName("N") shouldBe SidesHorizon.NORTH
        SidesHorizon.byShortName("S") shouldBe SidesHorizon.SOUTH
        SidesHorizon.byShortName("W") shouldBe SidesHorizon.WEST
        SidesHorizon.byShortName("E") shouldBe SidesHorizon.EAST
    }

}