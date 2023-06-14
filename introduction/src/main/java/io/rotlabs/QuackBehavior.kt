package io.rotlabs

interface QuackBehavior {
    fun quack()
}

class Quack: QuackBehavior {
    override fun quack() {
        println("Quack Quack")
    }
}

class Squeak: QuackBehavior {
    override fun quack() {
        println("Squeak Squeak")
    }
}

class MuteQuack: QuackBehavior {
    override fun quack() {
        // do nothing
    }

}