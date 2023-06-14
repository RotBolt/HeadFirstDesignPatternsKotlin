package io.rotlabs

abstract class Duck {

    protected var flyBehavior: FlyBehavior? = null

    protected var quackBehavior: QuackBehavior? = null


    fun performQuack() {
        quackBehavior?.quack()
    }

    fun performFly() {
        flyBehavior?.fly()
    }

    fun swim() {
        println("swimming...")
    }

    abstract fun display()
}