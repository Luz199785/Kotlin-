/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, world!!!")
   suma()
   resta()
   Multiplicacion()
   Condicional()
   println(queMesEs(7))
   
   
}
  
    
    
   
    fun suma()
    {
    	var numero1 = 20    
        var numero2 = 50
        
        println("Suma = "+ (numero1+numero2))
    }
   
   fun resta()
    {
        var numero2 = 30
        var numero1 = 20
        
        println("Resta: "+(numero1-numero2))
    }
    
    fun Multiplicacion()
    {
        
        var numero1 = 50
        var numero2 = 40
    
    	println("Multiplicacion: "+(numero1*numero2))
    }
    
    // Condicionales if-else
    
    
    fun Condicional(){
        var resultado = 12*12
        
        if(resultado > 20){
        println("El resultado es mayor a 20")
        }
        else{
            println ("El resultado es menor a 20")
        }
    }
    
    // Condicionales anidados
    
    fun condicionalAnidado(){
        var animal = "Gato"
        
     if (animal == "Perro"){
         println("Es un perro")
    }
    
    else if(animal == "Gato"){
        println("Es una gato")
    }
    else if(animal == "Loro"){
    	println("Es un Loro")
    }
}
    
fun queMesEs(mes:Int):String{
        return when(mes){
            1-> "Enero"
            2-> "Febrero"
            3-> "Marzo"
            4-> "Abril"
            5-> "Mayo"
            6-> "Junio"
            7-> "julio"
            8-> "Agosto"
            9-> "Septiembre"
            10-> "Octubre"
            11-> "Noviembre"
            12-> "Diciembre"
            else -> "No es un valor valido"
        }
    }
