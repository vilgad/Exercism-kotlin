import kotlin.math.floor
import kotlin.random.Random
import kotlin.random.nextInt

fun randomChar(): Int {
    return Random.nextInt(1..6)
}

class DndCharacter {
    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            var possibilites = arrayOf(randomChar(), randomChar(), randomChar(), randomChar())

            var min = possibilites[0]
            var sumArr = 0
            for (i in (0..3)) {
                if (min >= possibilites[i]) {
                    min = possibilites[i]
                }
                sumArr += possibilites[i]
            }
            sumArr -= min

            return sumArr
        }

        fun modifier(score: Int): Int {
            return floor((score - 10.0) / 2.0).toInt()
        }
    }

}

