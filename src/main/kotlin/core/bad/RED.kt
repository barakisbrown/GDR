package core.bad

import core.IColors

class RED : Bad(IColors.RED)
{
    override fun interpret() : String
    {
        val display = validResults[rolled - 1]
        if (rolled > 0) when(display)
        {
            "F" -> failures++
            "FF" -> failures += 2
            "T" -> threats++
            "TT" -> threats += 2
            "DR" -> {
                despairs++
                failures++
            }
            "FT" -> {
                failures++
                threats++
            }
            else -> {
                failures = 0
                threats = 0
                despairs = 0
            }
        }

        return display
    }
}
