package io.rotlabs

interface FlyBehavior {
    fun fly()
}


class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("wings flapping")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        // do nothing
    }

}