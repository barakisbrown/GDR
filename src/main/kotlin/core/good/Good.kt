package core.good

import core.Dice
import core.IColors
import core.LookupTable

open class Good (color: IColors) : Dice()
{
    // Blue Green Yellow
    // BLUE = BOOST
    // GREEN = ABILITY
    // YELLOW = PROF
    private var sides = 0
    private var validResults: List<String>  = arrayListOf()
    override var rolled: Int = -1
    private var success = 0
    private var advantage = 0
    private var triumph = 0

    init {
        // BASED ON THE COLOR -- SET OBJECT PROPERTIES
        when(color)
        {
            IColors.BLUE ->
            {
                sides = 6
                validResults = LookupTable.Boost.toList()
            }
            IColors.GREEN -> {
                sides = 8
                validResults = LookupTable.Ability.toList()
            }
            IColors.YELLOW -> {
                sides = 12
                validResults = LookupTable.Proficiency.toList()
            }
        }
    }
    var successes
        get() = success
        set(value) {
            success = value
        }
    var advantages
        get() = advantage
        set(value) {
            advantage = value
        }
    var triumps
        get() = triumph
        set(value) {
            triumph = value
        }
    var ValidResults
        get() = validResults
        private set(value) {}

    override fun interpret() = ""
}