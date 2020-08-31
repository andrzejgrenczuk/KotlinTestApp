package pl.grenczuk.KotlinTestApp

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinTestAppApplication

fun main(args: Array<String>) {
    //runApplication<KotlinTestAppApplication>(*args)
    var x = 1
	println("Yo, yo")
    wyswietl()
    opcje()
    var a = 0.1
    var b = 0.2
    var c = a+b
    println("Suma '0.1' i '0.2' wynosi: "+c)
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    forLoop()
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    whileLoop()
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    var myArray: Array<Int> = arrayOf(10)
    var myArray1: Array<Int> = arrayOf(1,2,3)
    println("the size of myArray is "+myArray.size.toString())
    println("the size of myArray1 is "+myArray1.size.toString())
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    println("-----------------------------------------------------")
    tablice()
    //suma()




    System.exit(0)
}

fun wyswietl(){
    println("Mada faka")
}
 
fun opcje() {
    print("Podaj wartość x: ")
    val x = readLine()!!.toInt()
    print("Podaj wartość y: ")
    val y = readLine()!!.toInt()
    println("Wartość x wynosi $x, a wartość y wynosi $y")
    if(x > y){
        println("wartość x jest większa od y")
    } else if(x==y){
        println("Wartość x jest równa wartości y")
    } else println("Wartość x jest mniejsza od y")

}

    fun forLoop() {
        var x = 0
        for (i in 1..90) {
            x = x + 1
            println("Teraz x ma wartość $x")
        }
    }

fun whileLoop() {
  var x = 90
  while (x > 20) {
    x = x - 1
    println("Teraz x ma wartość $x")
  }
}

fun tablice(){
    val wordArray1 = arrayOf("27/7","wielowarstwowy","biznesowy","dynamiczny","wszechobecny")
    val wordArray2 = arrayOf("wspomagany","wzmocniony","wizjonerski","sfokusowany")
    val wordArray3 = arrayOf("proces","paradygmat","program","portal","model")

    var arraySize1 = wordArray1.size
    var arraySize2 = wordArray2.size
    var arraySize3 = wordArray3.size

    var rand1 = (Math.random() * arraySize1).toInt()
    println(rand1)
    var rand2 = (Math.random() * arraySize2).toInt()
    println(rand2)
    var rand3 = (Math.random() * arraySize3).toInt()
    println(rand3)

val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}