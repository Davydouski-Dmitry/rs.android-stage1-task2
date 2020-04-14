package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {

        if(blockB == String::class) {
            var result = ""
            for(i in blockA) {
                if(i is String) {
                    result += i
                }
            }
            return result
        }
        if(blockB == Int::class) {
            var result = 0
            for(i in blockA) {
                if(i is Int) {
                    result += i
                }
            }
            return result
        }
        var result = LocalDate.MIN
        for(i in blockA) {
            if(i is LocalDate) {
                if(i > result) {
                    result = i
                }
            }
        }
        return result.format(DateTimeFormatter.ofPattern("dd.MM.yyy"))

        throw NotImplementedError("Not implemented")
    }
}
