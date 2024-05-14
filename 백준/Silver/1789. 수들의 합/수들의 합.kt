import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var S = br.readLine().toLong()
    var N: Long = 0
    while(S >= 0) {
        N++
        S -= N
    }
    bw.write("${N - 1}")
    bw.flush()
}