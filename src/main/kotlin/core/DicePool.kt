package core

import core.bad.*
import core.good.*

class DicePool
{
    var netSuccess = 0
    var netAdvantages = 0
    private var pool = mutableListOf<Dice>()
    var displayRoll = mutableListOf<String>()

    private fun add(dice : Dice)
    {
        pool.add(dice)
    }

    fun add(cmdLine : String) {
        // TODO("CHAR 1 MEANS I JUST NEED AN OBJECT"
        var list = parseCmdLine(cmdLine)
    }


    fun roll()
    {
        var success = 0
        var failure = 0
        var advantage = 0
        var threat = 0

        if (pool.size > 0)
        {
            for(die in pool)
            {
                displayRoll.add(die.interpret()+" ")
                if (die is Good)
                {
                    success += die.successes
                    advantage += die.advantages
                }
                else if (die is Bad)
                {
                    failure += die.failures
                    threat += die.threats
                }
            }
        }

        // CALCULATE NET[SUCCESS/ADVANTAGE]
        netSuccess = when((success - failure) < 0) {
            true -> 0
            false -> (success - failure)
        }
        netAdvantages = when((advantage - threat) < 0) {
            true -> 0
            false -> (advantage - threat)
        }
    }

    private fun parseCmdLine(args : String) : List<String>
    {
        // blue/black/green/purple/yellow/red
        // SetBack / Boost / Ability / Difficulty / Prof / Challenge
        // #l#l#l
        // k3gpr    => 1 Black / 3 Green / Purple / Challenge
        // 1k3g1p1r => 1 Black / 3 Green / Purple / Challenge
        // TEST STRING is K3GPR
        val dp = args.uppercase()

        println("Dice to be rolled is $dp")
        println("The length of the string is ${dp.length}")

        for(counter in dp.indices)
        {
            when(dp[counter].isDigit())
            {
                true -> print("digit is ${dp[counter]}")
                false -> {
                    when(dp[counter])
                    {
                        'B' -> print("BLUE")
                        'K' -> print("BLACK")
                        'G' -> print("GREEN")
                        'P' -> print("PURPLE")
                        'Y' -> print("YELLOW")
                        'R' -> print("RED")
                    }
                }
            }
            println()
        }


        return emptyList()
    }
}