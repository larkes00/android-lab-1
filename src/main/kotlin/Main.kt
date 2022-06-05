//global variable
// val — immutable
// var — mutable
val d = 5

fun main(args: Array<String>) {
    println("Hello world!")

    val a: Float = 5f

    val text: String = """
        1233sss
        cxzzzzz
        ddddddddddddddddddddddddd
        """ // raw string

    val subString = text.substringAfter("123");

    val b: Int = 5 //String template
    println("Value: $b")
    println("Value: ${b + b} = " + "${b * 2}")

    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val arr2: Array<Int> = Array(5) { i -> i * 2 }
    for (i in arr2) {
        println(i)
    }
    val arrayList: List<String> = listOf("Cat", "Dog");
    println(arrayList)

    val c = 10 //Type inference

    val min = if (a < b) a else b
    val min2 = if (a < b) {
        println(a)
        a
    } else {
        println(b)
        b
    }

    //switch
    val x = 5
    when (x) {
        0 -> println("x = 0")
        1 -> println("x = 1")
        else -> println("else(default)")
    }
    val y: Int = when (x) {
        0, 2, 4, 9 -> 10
        1 -> 20
        else -> 0
    }

    val food = listOf("apple", "strawberry", "cheese")
    when ("cheese") {
        in food -> println("Cheese found")
    }

    when (x) {
        in 1..10 -> println("x in range")
    }

    var whileCondition = 0;
    while (whileCondition > 10) {
        whileCondition++;
    }
    println("While block ended")

    // for/foreach
    for (i in food)
        print(food)
    for (num in 1..10)
        println(num)
    for (i in arr.indices)
        println(i)
    for ((idx, value) in arr.withIndex())
        println("index: $idx value: $value ")
    for (el in 1..10 step 2)
        println(el)
    for (el in 10 downTo 1 step 2)
        println(el)
    for (el in 1 until 10)
        println(el)
}

class Person private constructor(val firstName: String, val lastName: String) {
    // init block runs before constructor
    init {
        println("Block 1")
    }

    init {
        println("Block 2")
    }

    init {
        println("Block 3")
    }

    init {
        println("Block 4")
    }

    // Constructor
    constructor() : this("Bob", "Doe") {
        println("Constructor")
    }

    constructor(name: String) : this(name, "Unknown lastName") {
        println("Constructor")
    }

    class Rectangle(val width: Double, val height: Double) {
        var color: Int = 0 // property
            set(value) {
                field = value * 10
            }
    }
}