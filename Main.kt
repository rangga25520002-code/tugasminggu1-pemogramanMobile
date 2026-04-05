tugas praktikum kotlin

fun main() {

    // 1. cek string
    val s1 = "Susi Susanti"
    val s2 = "Susi susanti"

    if (s1 == s2) {
        println("kedua string sama")
    } else {
        println("kedua string tidak sama")
    }

    println()

    // 2. cek angka
    val nilai = 45

    if (nilai > 50) {
        println("nilai lebih dari 50")
    } else {
        println("nilai kurang dari atau sama dengan 50")
    }

    if (nilai % 5 == 0) {
        println("termasuk kelipatan 5")
    } else {
        println("bukan kelipatan 5")
    }

    println()

    // 3. array genap
    val data = intArrayOf(21, 32, 43, 24, 27, 28)

    println("bilangan genap:")
    for (i in data) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    println()

    // 4. umur
    val umur = 15

    when {
        umur >= 6 && umur <= 12 -> println("anak-anak")
        umur >= 13 && umur <= 16 -> println("remaja")
        umur >= 17 && umur <= 100 -> println("dewasa")
        else -> println("di luar kategori")
    }

    println()

    // 5. kelipatan 3 dan 5
    for (i in 1..50) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("$i kelipatan 3 dan 5")
        } else if (i % 3 == 0) {
            println("$i kelipatan 3")
        } else if (i % 5 == 0) {
            println("$i kelipatan 5")
        }
    }
}
