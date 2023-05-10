fun main() {
    repeat(str = "ABC", useNewLine = false); // named Argument
    printAll("A", "B", "C");

    val strArray = arrayOf("A", "B", "C");
    printAll(*strArray); // 배열로 가변인자에 값을 넘겨줄 때 *(spread 연산자) 를 사용하여 넘겨줘야한다.
}

fun maxNum(a: Int, b: Int) = if(a > b) a else b; // = 을 썼기 때문에 반환 타입 생략 가능

fun repeat( // default Parameter
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num){
        if (useNewLine) {
            println(str);
        } else {
            print(str);
        }
    }
    println();
}

fun printAll(vararg strings: String) { // 가변인자일 경우
    for(str in strings) {
        println(str);
    }
}














