class Robot(var x: Int = 0, var y: Int = 0, var direction: SidesHorizon) {

    val info: String
        get() = "$x $y ${direction.name[0]}"

    fun turnToLeft() {
        direction = direction.toLeft()
    }

    fun turnToRight() {
        direction = direction.toRight()
    }

    fun moveStraight() {
        when(direction) {
            SidesHorizon.NORTH -> y++
            SidesHorizon.SOUTH -> y--
            SidesHorizon.WEST -> x--
            SidesHorizon.EAST -> x++
        }
    }
}