import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.Buffer

fun main() {

}

fun parseInt(str: String): Int {
    try {
        return str.toInt();
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException(e.message);
    } finally {
        println("어쩔 티비");
    }
}

fun parseInt2(str: String): Int? {
    return try { // 대박 사건이네 이거
        str.toInt();
    } catch (e: NumberFormatException) {
        null;
    } finally {
        println("어쩔 티비");
    }
}

fun readFile() { // 코틀린에서는 Checked Exception 과 Unchecked Exception 을 구분하지 않고 전부 Unchecked 로 사용한다.
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt");
    val reader = BufferedReader(FileReader(file));
    println(reader.readLines());

    reader.close();
}

fun readFile2(path: String) { // try with resources 를 이처럼 사용한다.
    BufferedReader(FileReader(path)).use { reader->
        println(reader.readLines());
    }
}








