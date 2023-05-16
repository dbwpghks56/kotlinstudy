fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) { // .indices 면 index 들을 가져온다.
        println(i)
    }

    for ((idx, value ) in array.withIndex()) { // .withIndex 면 index 와 value 를 모두 가져온다.
        println("${idx} : ${value}")
    }
    array.plus(300) // 을 이용해 쉽게 엘리먼트 추가 가능

    // 가변 컬렉션 : 컬렉션에 element 추가, 삭제 가능
    // 불변 : 불가능, 기존의 데이터를 수정은 가능
    // 불변 가변을 선언할 때 지정해주어야한다.

    val numbers = listOf(100, 200) // 기본적으로 불변
    val emptyLists = emptyList<Int>() // 비어있는 리스의 경우 타입을 지정해주어야한다.
    printNumbers(emptyList()) // 타입을 추론할 수 있다면 지정해주지 않아도 된다.

    numbers[0] // 이렇게 접근 가능

    val muNumbers = mutableListOf(200,300) // 가변 List
    muNumbers.add(400)

    // 우선 불변 리스트로 만들고 필요하면 가변리스트로 바꾸어라

    val sets = setOf(100 ,200)
    val muSets = mutableSetOf(100, 200)

    val maps = mutableMapOf<Int, String>()
    maps.put(1, "monday")
    maps[2] = "화요일" // 이렇게 가능

    mapOf(1 to "monday") // 이렇게 초기화 가능
    for (key in maps.keys) {

    }

    for ((key, value) in maps.entries) {

    }

    // List<Int?> : 리스트에 null 이 들어갈 수는 있지만, 리스트는 null 되면 안 된다.
    // List<Int>? : 리스트에 null 이 들어갈 수 없지만, 리스트는 null 될 수 있다.
    // List<Int?>? : 둘 다
}

private fun printNumbers(
    numbers: List<Int>
) {

}












