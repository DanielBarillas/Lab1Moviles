// * <h1> Laboratorio 1 </h1>
// * <h2> Main (Clase principal) </h2>
// *
// * <p>
// * Programación de plataformas móviles - Universidad del Valle de Guatemala
// * </p>
// *
// * Creado por:
// *
// * @author Pablo Daniel Barillas Moreno || Carné No. 22193
// * @version 1.0
// * @since 16/07/2023
// *

import java.util.*

class ItemData(private val originalValue: Any) {
    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> {
                when {
                    originalValue % 10 == 0 -> "M10"
                    originalValue % 5 == 0 -> "M5"
                    originalValue % 2 == 0 -> "M2"
                    else -> null
                }
            }
            is Boolean -> if (originalValue) "Verdadero" else "Falso"
            else -> null
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Ingrese un valor: ")
    val inputValue: Any = when {
        scanner.hasNextBoolean() -> scanner.nextBoolean()
        scanner.hasNextInt() -> scanner.nextInt()
        else -> scanner.next()
    }

    val itemData = ItemData(inputValue)

    val type = itemData.getType()
    val info = itemData.getInfo()

    println("Tipo: $type - Info: $info")
}