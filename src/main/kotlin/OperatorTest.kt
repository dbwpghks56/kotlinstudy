fun main() {
    /**
    val ktmoney2 = KtMoney(2_000L);
    val ktMoney3 = KtMoney(3_000L);

    if(ktmoney2 < ktMoney3) { 객체를 이용해 비교할 때 비교연산자를 쓰게 되면 자동으로 compareTo를 호출해준다.
        println("크다 2가")
    }
     if (ktmoney2 == ktmoney3) == 의 경우 값을 비교하고, ===일 경우 주소값을 비교한다.

    **/

    val money1 = Money(1_000L);
    val money2 = Money(2_000L);

    println(money1 + money2);
    println(money1 < money2);
}

data class Money(
    val amount: Long
) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount);
    }

    operator fun compareTo(money2: Money): Int {
        return (this.amount - money2.amount).toInt();
    }
}