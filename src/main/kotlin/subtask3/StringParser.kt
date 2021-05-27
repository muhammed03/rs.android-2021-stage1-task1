package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var result = ArrayList<String>();
        var openBrackets: String = "{«(<[";
        var closeBrackets = "}»)>]";
        var counter = 0;
        var smallString = "";
        var symbNumb = 0;

        for (i in inputString.indices) {
            symbNumb = openBrackets.indexOf(inputString[i]);
            if (symbNumb != -1) {
                counter = 0;
                smallString = "";
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == closeBrackets[symbNumb] && counter == 0) {
                        break
                    }
                    smallString += inputString[j];
                    if (inputString[j] == openBrackets[symbNumb]) {
                        counter++;
                    }
                    if (inputString[j] == closeBrackets[symbNumb]) {
                        counter--;
                    }
                }
                result.add(smallString);
            }
        }

        return result.toTypedArray();
    }
}
