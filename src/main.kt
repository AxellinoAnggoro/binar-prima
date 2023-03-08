import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    print("Masukkan angka: ")

    // nextInt() reads the next integer from the keyboard
    var input:Int = reader.nextInt()
    var check : Boolean = false

    for (i in 2.rangeTo(input)){
        if (input % i == 0){
            check = true
            break
        }
    }

    if (check){
        println("$input angka prima")
    }
    else {
        println("$input bukan angka prima")
    }
}