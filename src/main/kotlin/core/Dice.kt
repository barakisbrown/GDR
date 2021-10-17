package core

abstract class Dice {
    protected abstract var rolled : Int
    abstract fun interpret() : String
}