fun main() {
    val numbers = listOf<Int>(1, 2, 3);

    for (number in numbers) { // for-each의 경우 Java와 비교해보면 : 대신 in 을 쓴다.
        println(number)
    }

    for(i in 0..3) { // .. 은 범위를 나타내는 연산자이다.
        println(i)
    }

    for(i in 3 downTo 2) { // 지린다.
        println(i)
    }

    for( i in 1..5 step 2) { // 1부터 5까지 공차가 2인 등차수열 생성
        println(i)
    }

    // downTo, step 도 함수이다.(중위호출함수) ex) 변수.함수이름(argument) => 변수 함수이름 argument
    // while, do-while 은 Java 와 완전히 똑같다.
}










