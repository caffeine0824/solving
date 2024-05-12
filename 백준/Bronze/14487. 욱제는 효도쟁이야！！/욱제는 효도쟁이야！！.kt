import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    val st = StringTokenizer(br.readLine())
    val cost = IntArray(n)
    for(i in 0 until n)
        cost[i] = Integer.parseInt(st.nextToken())
    cost.sort()
    cost[n - 1] = 0
    bw.write("${cost.sum()}")
    bw.flush()
}