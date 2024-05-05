import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val T = Integer.parseInt(br.readLine())
    for(i in 0 until T) {
        var C = Integer.parseInt(br.readLine())
        bw.write("${C / 25} ")
        C %= 25;
        bw.write("${C / 10} ")
        C %= 10;
        bw.write("${C / 5} ")
        C %= 5;
        bw.write("$C\n")
    }
    bw.flush()
}