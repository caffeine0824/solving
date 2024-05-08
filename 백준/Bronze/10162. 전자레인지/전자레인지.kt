import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var T = Integer.parseInt(br.readLine())
    val A = T / 300
    T %= 300
    val B = T / 60
    T %= 60
    val C = T / 10
    T %= 10
    if(T == 0)
        bw.write("$A $B $C")
    else
        bw.write("-1")
    bw.flush()
}