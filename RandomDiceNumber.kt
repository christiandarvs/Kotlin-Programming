fun main(args: Array<String>) {
    val myFirstDice = Dice(6)
   	println("Your ${myFirstDice.numOfSides} sided ${myFirstDice.changeColor()} dice rolled ${myFirstDice.roll()}.")
    
    val mySecondDice = Dice(10)
    println("Your ${mySecondDice.numOfSides} sided ${mySecondDice.changeColor()} dice rolled ${mySecondDice.roll()}.")
}

class Dice(val numOfSides: Int) {
    	fun roll(): Int{
            val numbers = 1..numOfSides
            val randomNumber = numbers.random()
			return randomNumber
        }   
       fun changeColor(): String{
            val colors = arrayOf("Red", "Blue", "Yellow", "Orange")
            val randomColor = colors.random()
            return randomColor
       }
}
