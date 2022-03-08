package functions
interface EventListener{
    fun click()
}

class Form {
    fun clickJava(e: EventListenerJava){}
    fun clickKotlin(e: EventListener){}
}

class Main{
    private val name = "Kotlin"
    fun main(){
        // SAM Conversion - Single Abstract Method
        // Só funciona se a interface for implementada em Java
        // e tiver um único método
        // Seria tipo:
        // Form().clickJava{println()} aqui poderia ter aceitado o name

        Form().clickJava(object: EventListenerJava {
            override fun click() {
                TODO("Not yet implemented")
            }

            override fun click2() {
                TODO("Not yet implemented")
            }

        })
        Form().clickKotlin(object: EventListener{
            override fun click() {
            }
        })
    }
}