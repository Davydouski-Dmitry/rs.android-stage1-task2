package subtask1

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val day = day.toInt()
        val month = month.toInt()
        var year = year.toInt()
        var dayOfWeek = ""
        var dayOfWeekNumber: Int
        var monthStr = ""
        var yearNumber = 0
        var monthNumber = 0
        var isLeapYear = false

        if (year % 4 == 0 && year % 400 != 0) isLeapYear = true

        if ( (month !in 1..12) ||
            (day !in 1..31) ||
            (!isLeapYear && month == 2 && day > 28) ||
            (month == 2 && day > 29) ||
            (month == 4 && day > 30) ||
            (month == 6 && day > 30) ||
            (month == 9 && day > 30) ||
            (month == 11 && day > 30))
            return "Такого дня не существует"

        while (year >= 400) year -= 400
        when (year){
            in 0..99 -> yearNumber = 6
            in 100..199 -> yearNumber = 4
            in 200..299 -> yearNumber = 2
            in 300..399 -> yearNumber = 0
        }

        when (month){
            1 -> {monthNumber = 0; monthStr = "января"}
            2 -> {monthNumber = 3; monthStr = "февраля"}
            3 -> {monthNumber = 3; monthStr = "марта"}
            4 -> {monthNumber = 6; monthStr = "апреля"}
            5 -> {monthNumber = 1; monthStr = "мая"}
            6 -> {monthNumber = 4; monthStr = "июня"}
            7 -> {monthNumber = 6; monthStr = "июля"}
            8 -> {monthNumber = 2; monthStr = "августа"}
            9 -> {monthNumber = 5; monthStr = "сентября"}
            10 -> {monthNumber = 0; monthStr = "октября"}
            11 -> {monthNumber = 3; monthStr = "ноября"}
            12 -> {monthNumber = 5; monthStr = "декабря"}
        }

        year = year.toString().takeLast(2).toInt()
        dayOfWeekNumber = (year + (year / 4) + day + monthNumber + yearNumber) % 7


        if (isLeapYear && (month == 1 || month == 2)) dayOfWeekNumber--

        when (dayOfWeekNumber){
            0 -> dayOfWeek = "воскресенье"
            1 -> dayOfWeek = "понедельник"
            2 -> dayOfWeek = "вторник"
            3 -> dayOfWeek = "среда"
            4 -> dayOfWeek = "четверг"
            5 -> dayOfWeek = "пятница"
            6 -> dayOfWeek = "суббота"
        }

        return("$day $monthStr, $dayOfWeek")

        throw NotImplementedError("Not implemented")

    }
}
