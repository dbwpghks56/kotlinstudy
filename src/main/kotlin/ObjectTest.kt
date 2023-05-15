fun main() {
    val persons: Persons = Persons.newBaby("me")
    print(persons.name)

    println(Singleton.a)

    moveSomething(object : Movable { // Kotlin 에서 익명 클래스 사용법
        override fun move() {
            println(" Move Move ")
        }

        override fun fly() {
            println(" Fly Fly ")
        }

    })
}

class Persons private constructor (
    var name:String,
    var age: Int
) {
    companion object Factory { // static 키워드가 없고 대신 companion object {} 에 넣어둔 변수와 함수가 Java 의 스태틱 변수와 함수인 거처럼 사용된다. 이름을 명시해줄 수도 있다. 인터페이스 구현도 가능
        private const val MIN_AGE = 1 // const 키워드를 넣으면 컴파일 시에 변수에 값이 할당된다.
        fun newBaby(name: String) : Persons {
            print(name)
            return Persons(name, MIN_AGE)
        }
    }
}

object Singleton { // singleton 만드는 법
    var a:Int = 0
}

interface Movable {
    fun move()
    fun fly()
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
















