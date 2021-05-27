package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size < 3)
            return sadArray
        else {
            val happyArray = sadArray.toMutableList()
            var sizeOfArray = sadArray.size - 3
            var isFinished = false
            while (!isFinished) {
                isFinished = true

                for (i in 0..sizeOfArray) {
                    if (happyArray[i] + happyArray[i+2] < happyArray[i+1]) {
                        isFinished = false
                        happyArray.removeAt(i+1)
                        sizeOfArray--
                        break
                    }
                }
            }

            return happyArray.toIntArray()
        }
    }
}
