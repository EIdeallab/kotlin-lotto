fun main() {
    println("구입금액을 입력해 주세요.")
    val payment = readlnOrNull()?.toInt() ?: 0
    val machine = LottoMachine(payment)

    println("${machine.lottos.size}개를 구매했습니다.")
    machine.print()

    println("지난 주 당첨 번호를 입력해 주세요.")
    val winingNumbersInput = readln()
    val winingNumbers = winingNumbersInput.split(",").map { it.toInt() }

    println("보너스 볼을 입력해 주세요.")
    val bonusNumber = readln().toInt()

    val three = machine.matchCount(winingNumbers, 3)
    val four = machine.matchCount(winingNumbers, 4)
    val five = machine.matchCount(winingNumbers, 5)
    val fiveBonus = machine.matchCount(winingNumbers, 5, bonusNumber)
    val six = machine.matchCount(winingNumbers, 6)

    println("당첨 통계")
    println("----------")
    println("3개 일치 (5000원) - ${three}개")
    println("4개 일치 (50000원) - ${four}개")
    println("5개 일치 (150000원) - ${five}개")
    println("5개 일치, 보너스 볼 일치 (3000000원) - ${fiveBonus}개")
    println("6개 일치 (2000000000원) - ${six}개")
}
