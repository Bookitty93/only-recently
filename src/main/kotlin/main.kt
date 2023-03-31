fun main() {
    val result = agoToText(15600)
    println(result)
}

fun agoToText(totalTime: Int) = when (totalTime) {
    in 0..60 -> "был(а) в сети только что"
    in 61..3_600 -> "был(а) в сети ${changeTimeMin(totalTime)} назад"
    in 3_601..86_400 -> "был(а) в сети ${changeTimeHour(totalTime)} назад"
    in 86_401..172_800 -> "был(а) в сети вчера"
    in 172_801..259_200 -> "был(а) в сети позавчера"
    else -> "был(а) в сети давно"
}


fun changeTimeMin(totalTime: Int) = when {
    (totalTime / 60) == 11 -> "${totalTime / 60} минут"
    (totalTime / 60) % 10 == 1 -> "${totalTime / 60} минуту"
    (totalTime / 60) % 10 in 2..4 -> "${totalTime / 60} минуты"
    else -> "${totalTime / 60} минут"
}

fun changeTimeHour(totalTime: Int) = when {
    (totalTime / 3600) == 11 -> "${totalTime / 3600} часов"
    (totalTime / 3600) % 10 == 1 -> "${totalTime / 3600} час"
    (totalTime / 3600) % 10 in 2..4 -> "${totalTime / 3600} часа"
    else -> "${totalTime / 3600} часов"
}
