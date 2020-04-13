package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {

        val hour = hour.toInt()
        val minute = minute.toInt()
        var nextHour = hour + 1


        val timeInWords:Array<String> = arrayOf("o' clock","one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
            "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine", "half")

        if (minute !in 0..59 || hour !in 1..12) return ""
        if (hour == 12) nextHour = 1

        if (minute in 0..30) {
            when (minute){
                0 -> return "${timeInWords[hour]} ${timeInWords[minute]}"
                1 -> return "${timeInWords[minute]} minute past ${timeInWords[hour]}"
                15 -> return "${timeInWords[minute]} past ${timeInWords[hour]}"
                30 -> return "${timeInWords[minute]} past ${timeInWords[hour]}"
                else -> return "${timeInWords[minute]} minutes past ${timeInWords[hour]}"
            }
        }else{ when (minute){
                45 -> return "${timeInWords[15]} to ${timeInWords[nextHour]}"
                59 -> return "${timeInWords[1]} minute to ${timeInWords[nextHour]}"
                else -> return "${timeInWords[60 - minute]} minutes to ${timeInWords[nextHour]}"
            }
        }

        throw NotImplementedError("Not implemented")
    }
}
