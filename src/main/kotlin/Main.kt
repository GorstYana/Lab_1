import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(args: Array<String>) {
    //1 задание
    print ("Введите сумму: ")
    val amount = readln().toDouble()
    val c = amount * 0.0075
    println("Комиссия составляет "+((c*100.0).roundToLong()/100.0)+" рублей")
    println(" ")
    main2()
    println(" ")
    main3()
}
fun main2() {
    //2 задание
    print ("Введите количество лайков: ")
    val likes = readln().toInt()
    if(likes % 10 == 1 && likes != 11)
        println("Понравилось " + likes + " человеку")
    else if(likes == 11)
        println("Понравилось " + likes + " людям")
    else
        println("Понравилось " + likes + " людям")
}
fun main3() {
    //3 задание
    val user:Boolean = true
    print ("Введите сумму покупки: ")
    val skid = readln().toInt()
    if (skid<=1000)
        if(user) println("Сумма покупки составляет " + (skid-(skid*0.01)) + " рублей. Скидка 1%")
        else println("Сумма покупки составляет " + skid + " рублей. Скидка не предоставляется")
    else if(skid > 1001 && skid <= 10000) {
        val d = skid - 100
        if (user) println("Сумма покупки составляет " + (d-(d*0.01)) + " рублей. Скидка 100 рублей и 1%")
        else println("Сумма покупки составляет " + d + " рублей. Скидка 100 рублей")
    }
    else {
        val d = skid - (skid * 0.05)
        if (user) println("Сумма покупки составляет " + (d - (d * 0.01)) + " рублей. Скидка 5% и 1%")
        else println("Сумма покупки составляет " + d + " рублей. Скидка 5%")
    }
}

