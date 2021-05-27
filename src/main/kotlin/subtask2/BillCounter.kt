package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var annaPay: Int = (bill.sum() - bill[k])/2;
        var checker = b - annaPay;
        if (checker == 0) {
            return "Bon Appetit";
        } else {
            return checker.toString();
        }
    }
}