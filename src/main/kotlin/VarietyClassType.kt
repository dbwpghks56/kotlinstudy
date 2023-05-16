data class PersonDto( // Kotlin 에서 Dto Class 쉽게 생성하는 법
    val name: String,
    val age: Int
) {

}

enum class Country(
    private val code: String,
){
    KOREA("KO"),
    AMERICA("US")
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
) // 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다. 즉, 런타임 때 클래스 타입이 추가될 수 없다. 하위 클래스는 같은 패키지에 있어야한다.

class Avante: HyundaiCar("아반떼", 1_000L)
class Sonata: HyundaiCar("소나타", 1_000L)
class Granduer: HyundaiCar("그렌저", 1_000L)

fun handleCountry( // else 를 사용하지 않아도 괜찮다.
    country: Country,
    car: HyundaiCar
) {
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }

    when (car) { // 간단하게 구분할 수 있다.
        is Avante -> TODO()
        is Granduer -> TODO()
        is Sonata -> TODO()
    }
}

fun main() {
    val person = PersonDto("Ryu", 25)
    println(person.toString())
}













