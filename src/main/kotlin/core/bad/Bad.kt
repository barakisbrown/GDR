package core.bad

import core.IColors
import core.Dice
import core.LookupTable

open class Bad(color : IColors) : Dice()
{
    // BLACK / PURPLE / RED
    // BLACK = SETBACK
    // Purple = DIFFICULTY
    // RED = CHALLENGE
    private var sides = 0
    private var acceptableResults : List<String> = arrayListOf()
    // Common to all Bad(Negative Results)
    private var failure = 0
    private var threat = 0
    private var despair = 0
    // Override
    override var rolled: Int = -1

    init
    {
        when (color)
        {
            IColors.BLACK ->
            {
                sides = 6
                acceptableResults = LookupTable.Setback.toList()
            }
            IColors.PURPLE ->
            {
                sides = 8
                acceptableResults = LookupTable.Difficulty.toList()
            }
            IColors.RED ->
            {
                sides = 12
                acceptableResults = LookupTable.Challenge.toList()
            }
        }
    }

    // GET/SET for backers
    var failures = failure
        set(value) { failure = value }
    var threats = threat
        set(value) { threat = value }
    var despairs
        get() = despair
        set(value) { despair = value }
    var validResults
        get() = acceptableResults
        set(value) {}

    override fun interpret() = ""
}