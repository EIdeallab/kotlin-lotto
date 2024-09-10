class Lotto() {
    var numbers: List<Int> = emptyList()

    init {
        numbers = (1..45).shuffled()
        numbers = numbers.subList(0, 6).sorted()
    }

    override fun toString(): String {
        return numbers.toString()
    }

    fun matchCount(winingNumbers: List<Int>): Int {
        return winingNumbers.count {
            numbers.contains(it)
        }
    }
}
