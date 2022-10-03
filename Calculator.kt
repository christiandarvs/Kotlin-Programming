fun main(){
 	calculate(10,3)
}

fun calculate(x: Int, y: Int){
    val add = x+y
    val subtract = x-y
    val product = x*y
    val quotient = x/y
    val modulo = x%y
    
   	println("${x} + ${y} = ${add}")
    println("${x} - ${y} = ${subtract}")
    println("${x} * ${y} = ${product}")
    println("${x} / ${y} = ${quotient}")
    println("${x} % ${y} = ${modulo}")
}
