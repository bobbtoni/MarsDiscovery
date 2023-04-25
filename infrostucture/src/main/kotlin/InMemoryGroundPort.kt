import port.GroundGetPort
import port.GroundSavePort

class InMemoryGroundPort: GroundGetPort, GroundSavePort {

    private var ground: Ground? = null
    override fun get(): Ground {
        return ground ?: throw IllegalStateException("Ground not found")
    }

    override fun save(ground: Ground) {
        this.ground = ground
    }

}