package core.good

import core.IColors

// PROF
class YELLOW : Good(IColors.YELLOW)
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
                advantages += 2
            }
            "A" -> advantages++
            "TP" -> {
                triumps++
                successes++
            }
            else -> {
                successes = 0
                advantages = 0
                triumps = 0
            }
        }

        return display
    }
}