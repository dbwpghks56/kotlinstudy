fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // Kotlin 에서는 숫자, 문자, 불리언에 대해서는 겉으로는 참조타입으로 보이지만 상황에따라 Kotlin 이 알아서 원시타입으로도 바꿔준다.
    // 즉, boxing과 unboxing을 고려하지 않아도 된다.
    var number1: Long = 10L // 가변 변수
    number1 = 5L

    print(number1)

    // 타입을 명시하지 않아도 타입추론이 가능하다.
    val number2 = 10L // 불변 변수 ex) java: final이 붙은 것 아직 초기화되지 않은 변수라면 초기 딱 한 번 값을 넣어줄 수 있다.

    var number3: Long? = 1_000L // ? 를 이용해서 널세이프티 하게 만들 수 있다.
    number3 = null;

    // var person = Person("유제환") 코틀린에서는 객체를 인스턴스화할 때 new를 사용하지 않아야 한다.
}