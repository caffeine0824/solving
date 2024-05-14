import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = Integer.parseInt(br.readLine()) - 1
    val length = LongArray(N)
    val price = LongArray(N)
    var st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        length[i] = st.nextToken().toLong()
    st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        price[i] = st.nextToken().toLong()

    var index = 0
    var cost:Long = 0
    while(index < N) {
        var move:Long = 0
        for(i in index until N) {
            move += length[i]
            if(price[i] < price[index]) {
                move -= length[i]
                cost += price[index] * move
                index = i
                break
            }
            else if(i == N - 1) {
                cost += price[index] * move
                index = N
            }
        }
    }
    bw.write("$cost")
    bw.flush()
}