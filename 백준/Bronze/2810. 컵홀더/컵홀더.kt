import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = Integer.parseInt(br.readLine())
    val seat = br.readLine()
    var cup = N + 1
    var couple = 0
    for(i in 0 until N)
        if(seat[i] == 'L')
            couple++
    cup -= couple / 2
    if(cup < N)
        bw.write("$cup")
    else
        bw.write("$N")
    bw.flush()
}