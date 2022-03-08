package functions
// Lambda é uma função anônima, pode ser passada por parâmetro.
// É como receber regra.
// Sempre começa por chaves { parâmetros -> corpo }


fun main (){
   //val a = {} Isso já é um lambda

    receivePrints{
        println("Hello")
        println("Kotlin")
    }

    receiveA{
        println("Hello")
        val s = 1
        val s2 = s * 5
        s2
    }

    receiveB{ x: Int -> x * x}

    receiveC{ x: Int, y: Int ->
        println("Executando")
        x * y }
}

fun receivePrints(lambda: () -> Unit){
    lambda()
}
fun receiveA(lambda: (a: Int) -> Int){}
fun receiveB(lambda: (x: Int) -> Int){}
fun receiveC(lambda: (x: Int, y: Int) -> Int){}





//
//fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
//    return op(x, y)
//}
//
//fun sum(x: Int, y: Int) = x + y
//
//fun multiply(x: Int, y: Int) = x * y
//
//fun main() {
//
//    operator(1, 2, ::sum)
//    operator(1, 2, ::multiply)
//
//    val l1 = {a: Int, b: Int -> a + b}
//    val l2: (Int, Int) -> Int = {c, d -> c + d}
//
//    operator(20,10, l1)
//    operator(40, 20, l2)
//
//}