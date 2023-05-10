fun main() {
    // 코틀린은 더 큰 타입으로라도 암시적인 타입 변경이 불가능하다.
    val number1: Int? = 0;
    val number2: Long = number1?.toLong() ?: 0L; // null일 경우 ?
    // to변환타입()을 사용해야한다.

    val something: Any? = "someThing" // Java의 Object와 같은 것, equals, hash, toString 보유
    // Unit이라는 타입도 존재, Java의 void와 유사하지만, 실제 존재하는 Type이다.

    val str: String= "ABC";
    println(str[0]) // 이런식으로 문자열에 접근 가능

}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Int) {
        val number3 = obj as? Int; // 기본타입이 아닌것을 형변환 할 때 사용 (Int) obj 느낌, as ~ 는 생략 가능

        // if 에서 타입체크를 한다면 스마트 캐스트로 가능
        val number4: Int  = obj;

        println(number3)

        val str: String = "나는 넘버로소이다. ${number3 ?: 0}"; // 문자열 안에 변수쓰깅
    }

    if (obj !is Int) { // 부정문

    }
}

fun fail(message: String?): Nothing { // Nothing 은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할 ex) 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
    throw IllegalArgumentException("message")
}