
class LottoMachine(
    payment: Int
) {
    private val count = payment / 1000
    var lottos: MutableList<Lotto> = mutableListOf()

    init {
        repeat(count) {
            lottos.add(Lotto())
        }
    }

    fun print() {
        for (lotto in lottos) {
            println(lotto)
        }
    }

    fun matchCount(winingNumbers: List<Int>, matchCount: Int):Int {
        return lottos.filter { it.matchCount(winingNumbers) == matchCount }.size
    }

    fun matchCount(winingNumbers: List<Int>, matchCount: Int, bonusNumber: Int):Int {
        val newList = winingNumbers.toMutableList()
        newList.add(bonusNumber)
        return matchCount(newList.toList(), matchCount);
    }
}
