import java.lang.IllegalArgumentException

enum class SidesHorizon(private val bitePosition: Int) {
    NORTH(0b1000),
    WEST(0b0001),
    SOUTH(0b0010),
    EAST(0b0100),;


    fun toLeft(): SidesHorizon {
        val newPosition = when(val shlPosition = ((bitePosition shl 1) and 0b1111)) {
            0 -> WEST.bitePosition
            else -> shlPosition
        }
        return getSideByPosition(newPosition)
    }

    fun toRight(): SidesHorizon {
        val newPosition = when(val shlPosition = ((bitePosition shr 1) and 0b1111)) {
            0 -> NORTH.bitePosition
            else -> shlPosition
        }
        return getSideByPosition(newPosition)
    }

    private fun getSideByPosition(bitePosition: Int) =
        when(bitePosition) {
            NORTH.bitePosition -> NORTH
            WEST.bitePosition -> WEST
            SOUTH.bitePosition -> SOUTH
            EAST.bitePosition -> EAST
            else -> throw IllegalStateException("Unknown bite position $bitePosition")
        }

    companion object {
        fun byShortName(shortName: String): SidesHorizon {
            return when(shortName) {
                "N" -> NORTH
                "S" -> SOUTH
                "E" -> EAST
                "W" -> WEST
                else -> throw IllegalArgumentException("Short name $shortName is unknown")
            }
        }
    }

}