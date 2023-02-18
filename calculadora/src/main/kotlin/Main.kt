import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Escribe el primer numero: ")
    val primerNumero = input.nextInt()
    print("Escribe el segundo numero: ")
    val segundoNumero = input.nextInt()
    print("Enter Action (+, -, *, /, %): ")
    val choice  = input.next()[0]
    val resultado  = when(choice){
        '+' -> primerNumero  + segundoNumero
        '-' -> primerNumero - segundoNumero
        '*' -> primerNumero  * segundoNumero
        '/' -> primerNumero / segundoNumero
        '%' -> primerNumero  % segundoNumero
        else -> {
            System.err.println("Operacion no valida")
            return
        }
    }
    print(resultado)
}