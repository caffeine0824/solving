import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    val D = st.nextToken().toDouble()
    val H = st.nextToken().toDouble()
    val W = st.nextToken().toDouble()
    val ratio = D / sqrt(H * H + W * W)
    bw.write(String.format("${(ratio * H).toInt()} ${(ratio * W).toInt()}"))
    bw.flush()
}