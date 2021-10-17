package core.good

import core.IColors

// ABILITY
class GREEN : Good(IColors.GREEN)
{
    override fun interpret() : String
    {
        val display = ValidResults[rolled - 1]
        // INTERPRET RESULTS OF THE ROLLED VALUE
        if (rolled >= 0) when(display)
        {
            "X" -> successes++
            "XX" -> successes += 2
            "XA" -> {
                successes++
                advantages++
            }
            "AA" -> {
                advantages += 2
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