import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    val W = st.nextToken().toDouble()
    val H = st.nextToken().toDouble()
    val X = st.nextToken().toDouble()
    val Y = st.nextToken().toDouble()
    val P = Integer.parseInt(st.nextToken())
    var count = 0;
    for(i in 0 until P) {
        st = StringTokenizer(br.readLine())
        val x = st.nextToken().toDouble()
        val y = st.nextToken().toDouble()
        if(x >= X && x <= X + W && y >= Y && y <= Y + H)
            count++
        else if(sqrt((x - X).pow(2) + (y - (Y + H / 2)).pow(2)) <= H / 2 ||
            sqrt((x - (X + W)).pow(2) + (y - (Y + H / 2)).pow(2)) <= H / 2)
            count++;
    }
    bw.write("$count")
    bw.flush()
}