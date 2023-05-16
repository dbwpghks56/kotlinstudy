class Fruit(
    val name:String,
    private val price: Int
) {

}

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
        )

    // 람다를 만드는 법 1, 타입 표기 가능
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit) : Boolean { // Kotlin 에서는 변수에 함수를 할당할 수 있다.
        return fruit.name == "사과"
    }

    // 2
    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"} // 이렇게도 가능

    isApple(fruits[0])
    isApple.invoke(fruits[0]) // 명시적으로 작성해서 호출도 가능

    filterFruits(fruits, isApple)
    filterFruits(fruits, fun(fruit: Fruit) : Boolean { // 이렇게도 가능
        return fruit.name == "사과"
    })
    filterFruits(fruits) {it.name == "사과"} // 이러면 뒤에 중괄호가 마지막 파라미터에 들어가게됨, it 이 곧 들어오는 Fruit 가 됨
    // 람다의 파라미터를 it 으로 직접 참조할 수 있다.

}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if(filter(fruit)){
            result.add(fruit)
        }
    }

    return result
}









