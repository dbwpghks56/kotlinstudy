fun main() {
    val person: Person = Person("Ryu")
    println(person.name)
//    person.age = 25
    println(person.age)
    println(person.isAdult)
}

class Person(
    val name: String,
    var age: Int = 1, // 코틀린은 default parameter를 권장한다. 부생성자보다
    mola: String
) {
    init { // 클래스가 초기화 되는 시점에 한 번만 실행
        if(age <= 0) {
            throw IllegalArgumentException("0살 이하일 수 없습니다.")
        }
    }

    var mola = mola
        set(value) {
            field = value.uppercase()
        }

    constructor(name: String): this(name, 1, "mo") {
        println(" 첫번 째 부생성자 ")
    } // 생성자를 여러개 만들어야 할 때 (부생성자)

//    fun isAdult(): Boolean{ // 함수
//        return this.age >= 20
//    }

    val isAdult: Boolean // 커스텀 Getter
        get() {
            return this.age >= 20
        }

//    val name = name // 원래의 name 은 getter 를 포함하기 때문에 custom getter 를 사용
//        get() {
//            return field.uppercase() // 자기자신을 가리키는 field 라는 예약어가 생겨서 field를 이용해 접근해야함. why? 무한루프가 일어날 수 있음
//                                     // 자기 자신을 가리키는 보이지않는 field라고 해서 backing field라고 부른다.
//        }

//    fun getUppercaseName() : String {
//        return this.name.uppercase()
//    }
//
//    val uppercaseName : String
//        get() = this.name.uppercase()

}









