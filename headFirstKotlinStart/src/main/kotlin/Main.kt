
fun main(args: Array<String>) {

    /*
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")


    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size


    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)

     */



    /*
    val hobbits = arrayOf("frodo", "sam", "merry", "pippin")
    var x = 0;

    while (x < 5) {
        println("${hobbits[x]} is a good Hobbit name")
        x = x + 1
    }

     */


    /*
    val firemen = arrayOf("pugh","pugh","barnet mcgrew","cuthbert","dibble","grub")
    var firemanNo = 0

    while (firemanNo < 6){
        println("Fireman number $firemanNo is ${firemen[firemanNo]}")
        firemanNo = firemanNo + 1
    }

     */


    val index = arrayOf(1,3,4,2)
    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomogranate")
    var x = 0
    var y : Int

    while (x < 4) {

        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1


    }




}