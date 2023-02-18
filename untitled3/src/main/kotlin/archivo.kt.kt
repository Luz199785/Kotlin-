import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    println("Calculadora de dos numeros")
    print("Escribe dos numeros:  ")


    val primer = reader.nextDouble()
    val segundo = reader.nextDouble()

    print("Elige un operador (+, -, *, /): ")
    val operator = reader.next()[0]

    val resultado: Double

    when (operator) {
        '+' -> resultado = primer + segundo
        '-' -> resultado = primer - segundo
        '*' -> resultado = primer * segundo
        '/' -> resultado= primer / segundo

        else -> {
            System.out.printf("Error! el operador no es correcto")
            return
        }
    }
    println("El resultado es: ")
    System.out.printf("%.1f %c %.1f = %.1f", primer, operator, segundo, resultado)
}