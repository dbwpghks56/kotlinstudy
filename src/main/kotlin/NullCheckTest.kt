fun main() {
    val str: String? = null;
    println(str?.length); // safe call 기능 해당 변수가 null이면 그대로 null 반환
    println(str?.length ?: 0) // Elvis 연산자 : null 이면 : 뒤의 값을 반환

    println(startWithA1(str));
    println(startWithA2(str));
    println(startWithA3(str));
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null");
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A");
}

fun startWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false;
}