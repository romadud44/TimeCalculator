import com.example.timecalculator.Operation

class TimeOperation : Operation {
    override fun convertTimeToSeconds(inputString: String): Int {
        var result = 0
        val minutes = inputString.substringBefore('m').toInt()
        val seconds = inputString.substringAfter('m').substringBefore('s').toInt()
        if (minutes == 0 && seconds == 0) {
            result = 0
        } else if (minutes == 0 && seconds != 0) {
            result = seconds
        } else if (minutes != 0 && seconds == 0) {
            result = minutes * 60
        } else {
            result = (minutes * 60) + seconds
        }
        return result
    }

    override fun sum(inputObjOne: String, inputObjTwo: String): Int {
        val result = convertTimeToSeconds(inputObjOne) + convertTimeToSeconds(inputObjTwo)
        return result
    }

    override fun dif(inputObjOne: String, inputObjTwo: String): Int {
        val result = convertTimeToSeconds(inputObjOne) - convertTimeToSeconds(inputObjTwo)
        return result
    }
}