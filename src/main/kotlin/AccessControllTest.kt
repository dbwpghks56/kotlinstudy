fun main() {
    // Java 와 다른 것만 정의
    // Kotlin  protected : 선언된 클래스 또는 하위 클래스에서만 접근 가능
    // Kotlin 에서는 패키지를 namespace 를 관리하기 위한 용도로만 사용!, 가시성 제어에는 사용되지 않는다.
    // kotlin default X, internal : 같은 모듈에서만 접근가능
    // 모듈 : 한 번에 컴파일 되는 Kotlin 코드
    // Kotlin 의 기본 접근 지시어는 public (Java : default)



}

class Cats private constructor( // 생성자에 접근 제어자를 넣으려면 constructor 가 필수이다.

) {

}

class Car(
    internal val name: String, // internal 은 바이트 코드 상 public 이 된다. 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
    protected var owner: String, // Kotlin 의 protected 와 Java 의 protected 는 다르기 때문에 Java 는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.
    _price : Int
) {
    var price = _price // get 은 public set 은 private 로 설정하고 싶을 때
        private set
}















