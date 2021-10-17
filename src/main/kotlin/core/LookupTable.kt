package core

class LookupTable {
    companion object {
        val Boost: Array<String> = arrayOf("", "", "X", "XA", "AA", "A")
        val Setback: Array<String> = arrayOf("", "", "F", "F", "T", "T")
        val Ability: Array<String> = arrayOf("", "X", "X", "XX", "A", "A", "XA", "AA")
        val Difficulty: Array<String> = arrayOf("", "F", "FF", "T", "T", "T", "TT", "FT")
        val Proficiency: Array<String> = arrayOf("", "X", "X", "XX", "XX", "A", "XA", "XA", "XA", "AA", "AA", "TP")
        val Challenge: Array<String> = arrayOf("", "F", "F", "FF", "FF", "T", "T", "FT", "FT", "TT", "TT", "DR")
    }
}