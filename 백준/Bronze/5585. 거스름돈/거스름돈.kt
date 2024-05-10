import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = Integer.parseInt(br.readLine())
    var money = 1000 - input
    var count = 0;
    val coinArr = arrayOf(500, 100, 50, 10, 5, 1)
    for(i in 0 until coinArr.size) {
        count += money / coinArr[i]
        money %= coinArr[i]
    }
    bw.write("$count")
    bw.flush()
}