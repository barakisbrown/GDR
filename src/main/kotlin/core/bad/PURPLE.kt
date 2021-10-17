package core.bad

import core.IColors

class PURPLE : Bad(IColors.PURPLE)
{
    override fun interpret() : String
    {
        val display = validResults[rolled - 1]
        if (rolled > 0) when(display)
        {
            "FF" -> failures += 2
            "F" -> failures++
            "T" -> threats++
            "TT" -> threats += 2
            "TF" -> {
                failures++
                threats++
            }
            else -> {
                failures = 0
                threats = 0
            }
        }

        return display
    }
}