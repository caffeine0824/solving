import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    val ab = st.nextToken().toDouble()
    val bc = st.nextToken().toDouble()
    val cd = st.nextToken().toDouble()
    bw.write("${ab * cd / bc}")
    bw.flush()
}