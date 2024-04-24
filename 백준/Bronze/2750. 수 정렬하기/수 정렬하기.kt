import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var N = Integer.parseInt(br.readLine());
    var input = IntArray(N)
    for(i in 0 until N)
        input[i] = Integer.parseInt(br.readLine())
    Arrays.sort(input)
    for(i in 0 until N)
        bw.write("${input[i]}\n")
    bw.flush()
}