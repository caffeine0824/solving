import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = Integer.parseInt(br.readLine())
    var A = IntArray(N)
    var B = IntArray(N)
    var st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        A[i] = Integer.parseInt(st.nextToken())
    st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        B[i] = Integer.parseInt(st.nextToken())
    A.sort()
    B.sortDescending()
    var S = 0
    for(i in 0 until N)
        S += A[i] * B[i]
    bw.write("$S")
    bw.flush()
}