fun main(){
    val myCoin = Coin()
    println("First Coin: ${myCoin.flipCoin()}")
    println() // Space for Second Coin
    val mySecondCoin = Coin()
    println("Second Coin: ${mySecondCoin.flipCoin()}")
    println() // Space for Third Coin
    val myThirdCoin = Coin()
    println("Third Coin: ${myThirdCoin.flipCoin()}")
}

class Coin(){
    fun flipCoin(): String {
        val sides = arrayOf("Heads", "Tails")
		val randomSide = sides.random()
        println("Flipping in 3..2..1")
        return randomSide
    }
}
