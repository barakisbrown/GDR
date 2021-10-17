package core.bad

import core.IColors

class BLACK : Bad(IColors.BLACK)
{
    override fun interpret() : String
    {
        val display = validResults[rolled - 1]
        if (rolled > 0) when (display)
        {
            "F" -> failures++
            "T" -> threats++
            else -> {
                failures = 0
                threats = 0
            }
        }
        // RETURN
        return display
    }
}