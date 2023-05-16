class Fruit(
    val name:String,
    val price: Int
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

    // Collection Fun Test
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed {index, fruit ->
        println(index)
        fruit.name=="사과"
    }
    val applePrices = fruits.filter { it.name == "사과" }
        .map {fruit -> fruit.price }

    val isAllApple = fruits.all { it.name == "사과" } // none 도 있음 , 주어진 조건이 모두 불만족하면
    val isTest = fruits.any {it.price >= 10_000} // 조건을 하나라도 만족하면 True, 아니면 False
    val fruitCount = fruits.count()
    fruits.sortedBy { it.price }
    fruits.sortedByDescending { it.price } // 역정렬
    fruits.distinctBy {it.name} // 해당 조건의 중복 제거
        .map {it.name} // 이름만 남기기

    fruits.first() // first 를 가져오는데 무조건 null 이 아니어야 된다.
    fruits.firstOrNull() // 첫번 째 값 또는 null last 버전도 있음

    val fruitMap : Map<String, List<Fruit>> = fruits.groupBy { it.name } // 조건을 기준으로 그룹 형성
    val fruitMap2 : Map<Long, Fruit2> = fruits.associateBy { it.id } // 중복되지 않는 값을 가지고 map 을 만들 때
    val fruitMap3 : Map<String, List<Int>> = fruits.groupBy ({ it.name }, {it.price} ) // associateBy 로도 가능
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









