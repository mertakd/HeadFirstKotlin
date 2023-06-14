fun main() {



    /*
    doSomething("hello buddy",5)
    timesThree(5)

     */

    //printSum(5,6)

    //printSum(5,6)

    /*
    val sonuc = max(5,6)
    println(sonuc)

     */

    for (x in 1.. 100 step 2) println(x)

}



/*fun doSomething(msg:String, i:Int):Unit {
    if (i > 0){
        var x = 0
        while (x < i ){
            println(msg)
            x = x + 1
        }
    }

}

 */


/*fun timesThree(x: Int): Int {

    val y = x * 3
    return y
}

 */


/*
fun printSum(int1: Int, int2:Int) {

    val result = int1 + int2
    println(result)

}

 */

/*
fun max (a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}

 */


fun maxValue(args: Array<Int>):Int{

    var max = args[0]
    var x = 1
    while (x < args.size){
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}



