fun main() {
    println(getPassOrFail(30));
}

fun validateScoreIsNotNegative(score: Int) {
    if(score !in 0..100) {
        throw IllegalArgumentException("개쩐다 ${score}");
    }
}

fun getPassOrFail(score: Int): String {
    val str: String = if (score >= 50) { //  코틀린 에서는 if-else를 expression으로 사용할 수 있기 때문에 3항 연산자가 없다.
        "P";
    }
    else if(score in 20..40) { // 지린다..
        "S";
    }
    else {
        "F";
    }

    return str;
}

fun getGradeWithSwitch(score: Int) : String {
    when(score) { // 아니 미쳤는데 지린다..
        in 90..99 -> { // in 외에도 ex) is 같이 expression 이면 들어갈 수 있다.
            return "A" // 이렇게 쓰면 로직을 구성할 수 있는 건가?
        }
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    return when(score / 10) { // 아니 미쳤는데
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when(number) {
        1, 0, -1 -> println("많이본 숫자.")
        else -> println(" 아니네 ")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0")
        number % 2 == 0 -> println("짝수리")
        else -> println(" 홀수리 ")
    }
}














