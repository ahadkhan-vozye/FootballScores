/*
 * Complete the 'counts' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY teamA
 *  2. INTEGER_ARRAY teamB
 */

fun counts(teamA: Array<Int>, teamB: Array<Int>): Array<Int> {
    val tempArray = Array(teamB.size) { 0 }

    var count = 0
    teamB.forEach { b ->
        tempArray[count] = teamA.filter { it <= b }.size
        count++
    }

    return tempArray
}

fun main() {
    val teamACount = readLine()!!.trim().toInt()

    val teamA = Array(teamACount) { 0 }
    for (i in 0 until teamACount) {
        val teamAItem = readLine()!!.trim().toInt()
        teamA[i] = teamAItem
    }

    val teamBCount = readLine()!!.trim().toInt()

    val teamB = Array(teamBCount) { 0 }
    for (i in 0 until teamBCount) {
        val teamBItem = readLine()!!.trim().toInt()
        teamB[i] = teamBItem
    }

    val result = counts(teamA, teamB)

    println(result.joinToString("\n"))
}
