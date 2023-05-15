abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // Kotlin은 프로퍼티를 override 할 때 무조건 open 을 붙여줘야한다.
) {
    abstract fun move()
}

class Cat(
    species: String
) : Animal(species, 4) { // extends 키워드를 사용하지 않고 : 를 사용한다. 클래스를 상속 받을 때 상위 클래스 생성자를 바로 호출해야된다.
    override fun move() { // override를 지시어로 필수적으로 붙여줘야한다.
        println(" 고양이는 걸음거리가 조용해 ")
    }
}

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable { // interface 역시 : 으로!
    private val wingCount: Int = 2

    override fun move() {
        println(" 펭귄의 걸음거리는 뒤뚱뒤뚱 ")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount // 상위클래스에 접근하는 키워드는 자바와 같이 super 이다.

    override val swimAbility: Int
        get() = 3

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}

interface Swimable {
    val swimAbility: Int
        get() = 3 // 식으로 디폴트 값을 정해줄 수 있다.

    fun act() {
        println(" 어푸 어푸 ")
    }
}

interface Flyable {
    fun act() {
        println(" 파닥 파닥 ")
    }
    fun fly()
}

open class Base( // 상위 클래스를 설게할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open 을 피해야 한다.
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int = 200
) : Base(number) {
    init {
        println("Derived Class")
    }
}

fun main() {
    val derived: Derived = Derived(300)
}











