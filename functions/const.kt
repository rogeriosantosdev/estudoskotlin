package functions

val CONST_1 = 10
const val CONST_2 = 10 //Precisa ser um valor inicializado

// Const é criada para ser usada como toplevel declaration
// Está fora de classe e função
// Em uma classe ele só funcionaria no compaion object ou object
// Pois não faz parte da instância da classe, é só escopo da classe

class Const {

    val ABC = "Kotlin"

    companion object{
        const val abc = false
    }
}


fun main(){
}