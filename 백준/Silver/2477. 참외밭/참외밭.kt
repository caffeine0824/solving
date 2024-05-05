import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val K = Integer.parseInt(br.readLine())
    val input = Array(6) { IntArray(2) }
    for(i in 0 until 6) {
        val st = StringTokenizer(br.readLine())
        input[i][0] = Integer.parseInt(st.nextToken())
        input[i][1] = Integer.parseInt(st.nextToken())
    }
    var i = 0;
    while(true) {
        if(input[i % 6][0] == input[(i + 2) % 6][0] && input[(i + 1) % 6][0] == input[(i + 3) % 6][0])
            break;
        i++
    }
    bw.write("${K * (input[i % 6][1] * input[(i + 1) % 6][1] 
            + input[(i + 2) % 6][1] * input[(i + 3) % 6][1] 
            + input[i % 6][1] * input[(i + 3) % 6][1])}")
    bw.flush()
}