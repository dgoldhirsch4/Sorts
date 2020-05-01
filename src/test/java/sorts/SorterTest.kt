package sorts

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertTrue

class SorterTest {

    @ParameterizedTest
    @MethodSource("classes")
    fun testSort(sorter: Sorter) {
        val randomGenerator = Random()
        val input = (1..300000).map { randomGenerator.nextInt() }

        val result = sorter.sort(input)

        assertEquals(input.sorted(), result)
        assertNotSame(input, result)
    }

    @ParameterizedTest
    @MethodSource("classes")
    fun testSort_empty(sorter: Sorter) {
        val result = sorter.sort(emptyList())

        assertTrue(result.isEmpty())
    }

    companion object {
        @JvmStatic
        @Suppress("unused")
        fun classes(): List<Arguments> {
            val sorters = listOf(
                BuiltInStreamSorter() // This is how you 'new' an object, in Kotlin
                // Add your own Sorter subclass instances...
                // BubbleSorter(),
                // HeapSorter(),
                // ...
            )

            return sorters.map { Arguments.of(it) }
        }
    }
}