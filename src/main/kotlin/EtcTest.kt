typealias FruitFilter = (Fruit) -> Boolean // Type 축약 가능

// 다른 패키지의 같은 이름의 함수를 가져오고 싶다면? import 패키지 as 별칭



fun main() {
    val fruit = Fruit("df", 2_000)
    val (names, price) = fruit // 구조분해 문법, data class 의 경우 componentN 이라는 함수가 자동으로 만들어진다.

    price.takeIf { it > 300 } // 조건을 만족하면 값을 반환, 아니면 null 을 반환
}