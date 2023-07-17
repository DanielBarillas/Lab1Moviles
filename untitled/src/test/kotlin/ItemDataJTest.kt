import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

internal class OtherType

class ItemDataTest {

    @Test
    fun `Given a list of elements in Java, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemData(10),
            ItemData("Enero"),
            ItemData(null),
            ItemData(true)
        )

        assertNotNull(result)
        assertTrue(
            result[0].getType() == "entero"
                    && result[0].getInfo() == "M10"
        )

        assertTrue(
            result[1].getType() == "cadena"
                    && result[1].getInfo() == "L5"
        )
        assertTrue(
            result[2].getType() == null
                    && result[2].getInfo() == null
        )

        assertTrue(
            result[3].getType() == "booleano"
                    && result[3].getInfo() == "Verdadero"
        )
    }

    @Test
    fun `Given a list in Kotlin, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemData(10),
            ItemData("Enero"),
            ItemData(null),
            ItemData(true)
        )

        assertNotNull(result)
        assertTrue(
            result[0].getType() == "entero"
                    && result[0].getInfo() == "M10"
        )

        assertTrue(
            result[1].getType() == "cadena"
                    && result[1].getInfo() == "L5"
        )
        assertTrue(
            result[2].getType() == null
                    && result[2].getInfo() == null
        )

        assertTrue(
            result[3].getType() == "booleano"
                    && result[3].getInfo() == "Verdadero"
        )
    }

    @Test
    fun `Given a list in Kotlin and Java, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemData(5),
            ItemData("Febrero"),
            ItemData(null),
            ItemData(false)
        )

        assertNotNull(result)
        assertTrue(
            (result[0] as ItemData).getType() == "entero"
                    && (result[0] as ItemData).getInfo() == "M5"
        )

        assertTrue(
            (result[1] as ItemData).getType() == "cadena"
                    && (result[1] as ItemData).getInfo() == "L7"
        )
        assertTrue(
            (result[2] as ItemData).getType() == null
                    && (result[2] as ItemData).getInfo() == null
        )

        assertTrue(
            (result[3] as ItemData).getType() == "booleano"
                    && (result[3] as ItemData).getInfo() == "Falso"
        )
    }

    @Test
    fun `Given a list in Kotlin for all canditions, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemData(20),
            ItemData(15),
            ItemData(12),
            ItemData("Marzo"),
            ItemData(""),
            ItemData(null),
            ItemData(true),
            ItemData(false),
            ItemData(OtherType())
        )

        assertNotNull(result)
        assertTrue(
            result[0].getType() == "entero"
                    && result[0].getInfo() == "M10"
        )

        assertTrue(
            result[1].getType() == "entero"
                    && result[1].getInfo() == "M5"
        )

        assertTrue(
            result[2].getType() == "entero"
                    && result[2].getInfo() == "M2"
        )

        assertTrue(
            result[3].getType() == "cadena"
                    && result[3].getInfo() == "L5"
        )

        assertTrue(
            result[4].getType() == "cadena"
                    && result[4].getInfo() == "L0"
        )

        assertTrue(
            result[4].getType() == "cadena"
                    && result[4].getInfo() == "L0"
        )

        assertTrue(
            result[5].getType() == null
                    && result[5].getInfo() == null
        )

        assertTrue(
            result[6].getType() == "booleano"
                    && result[6].getInfo() == "Verdadero"
        )

        assertTrue(
            result[7].getType() == "booleano"
                    && result[7].getInfo() == "Falso"
        )

        assertTrue(
            result[8].getType() == null
                    && result[8].getInfo() == null
        )
    }
}