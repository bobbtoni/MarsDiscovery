package impl

import CreateGround
import Ground
import port.GroundSavePort

class CreateGroundImpl(private val groundSavePort: GroundSavePort): CreateGround {

    override fun create(weight: Int, height: Int) {
        groundSavePort.save(Ground(weight, height))
    }

}