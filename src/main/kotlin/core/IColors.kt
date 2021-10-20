package core

import core.bad.*
import core.good.*

enum class IColors {
    BLUE,
    BLACK,
    GREEN,
    PURPLE,
    YELLOW,
    RED,
    UNKNOWN;

    companion object {
        fun getColorFromLetter(letter : Char) : IColors {
            var retColor = when(letter)
            {
                'k' -> BLACK
                'b' -> BLUE
                'g' -> GREEN
                'p' -> PURPLE
                'y' -> YELLOW
                'r' -> RED
                else -> UNKNOWN
            }
            return retColor
        }

        fun getDiceFromLetter(letter : Char) : Any {

            var dice = Any()
            when(letter)
            {
                'k' -> dice = BLACK()
                'b' -> dice = BLUE()
                'g' -> dice = GREEN()
                'p' -> dice = PURPLE()
                'y' -> dice = YELLOW()
                'r' -> dice = RED()
            }

            return dice
        }
    }
}