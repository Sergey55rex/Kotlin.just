fun main() {
    val login = "Вася"
    val time = 86000 

    println("$login был(а) ")

    when {
        time <= 60 -> println("только что")
        time < 60 * 60 -> minute(time)
        time < 24 * 60 * 60 -> hour(time)
        time < 24 * 60 * 60 * 2 -> println("сегодня")
        time < 24 * 60 * 60 * 3 -> println("вчера")
        else -> println("давно")
    }
}
fun minute(time: Int) {
    val minuteTime = time / 60
    val minut = minuteTime % 10
    val minutes = minuteTime % 100
    val result = if (minut == 1 && minutes != 11) "минуту" else if (minut == 2 || minut == 3 || minut == 4) "минуты" else "минут"
    println("$minuteTime $result назад")
}
fun hour(time: Int){
    val hourTime = time / 3600
    val hour = hourTime % 10
    val hours = hourTime % 100
    val result = if (hour == 1 && hours != 11) "час" else if (hour == 2 || hour == 3 || hour == 4) "часа" else "часов"
    println("$hourTime $result назад")
}
