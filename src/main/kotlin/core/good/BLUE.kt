package core.good

import core.IColors

// BOOST DICE
class BLUE : Good(IColors.BLUE)
{
    override fun interpret() : String
    {
        val display = ValidResults[rolled - 1]
        // INTERPRET RESULTS OF THE ROLLED VALUE
        if (rolled >= 0) when(display)
        {
            "X" -> successes++
            "XA" -> {
                successes++
                advantages++
            }
            "AA" -> {
                successes += 2
            }
            "A" -> advantages++
            else -> {
                successes = 0
                advantages = 0
            }
        }

        return display
    }
}