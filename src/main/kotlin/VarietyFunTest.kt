fun main() {
    print("ABC".lastChar())

    3 add2 4 // 중위 함수 부르는 법
}

fun String.lastChar(): Char { // 확장함수, 확장함수에는 수신객체 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.
    // 확장함수와 멤버함수의 시그니쳐가 동일하면 멤버함수가 우선적으로 호출된다.
    // 확장함수는 현재타입을 기준으로 호출된다.
    // Java 에서는 정적함수를 부르는 것처럼 무르면 된다.

    return this[this.length-1] // this : 수신객체
}

val String.lastCahr2: Char // 확장 프로퍼티, 확장함수 + custom getter 와 동일
    get() = this[this.length -1]

infix fun Int.add2(other: Int): Int { // infix 를 넣으면 중위함수로 부를 수 있음
    return this + other
}