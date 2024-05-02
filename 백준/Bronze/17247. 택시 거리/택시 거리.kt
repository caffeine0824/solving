import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer
import kotlin.math.abs

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    var N = Integer.parseInt(st.nextToken())
    var M = Integer.parseInt(st.nextToken())
    var loc = Array(2, {IntArray(2, {-1})})
    for(i in 0 until N) {
        st = StringTokenizer(br.readLine())
        for(j in 0 until M)
            if(Integer.parseInt(st.nextToken()) == 1) {
                if(loc[0][0] == -1) {
                    loc[0][0] = j
                    loc[0][1] = i
                }
                else {
                    loc[1][0] = j
                    loc[1][1] = i
                }
            }
    }
    bw.write("${abs(loc[0][0] - loc[1][0]) + abs(loc[0][1] - loc[1][1])}")
    bw.flush()
}