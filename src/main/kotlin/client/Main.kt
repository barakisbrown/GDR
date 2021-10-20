import core.DicePool

fun main(args: Array<String>) {
    val test1 = "g"
    val test2 = "K3GPR"

    val pool = DicePool()
    pool.add(test2)
    pool.roll()
    pool.clearPool()

    pool.add(test2)
    pool.roll()
}