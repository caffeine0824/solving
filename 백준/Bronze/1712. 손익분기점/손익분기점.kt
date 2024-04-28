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
    val A = Integer.parseInt(st.nextToken())
    val B = Integer.parseInt(st.nextToken())
    val C = Integer.parseInt(st.nextToken())
    if(C - B < 1)
        bw.write("-1")
    else
        bw.write("${A / (C - B) + 1}")
    bw.flush()
}