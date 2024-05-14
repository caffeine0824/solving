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
    val length = IntArray(N)
    val price = IntArray(N)
    var st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        length[i] = Integer.parseInt(st.nextToken())
    st = StringTokenizer(br.readLine())
    for(i in 0 until N)
        price[i] = Integer.parseInt(st.nextToken())

    var index = 0
    var cost = 0
    while(index < N) {
        for(i in index + 1 until N) {
            if(price[i] < price[index]) {
                var move = 0
                for(j in index until i)
                    move += length[j]
                cost += price[index] * move
                index = i
                break
            }
            else if(i == N - 1) {
                var move = 0
                for(j in index..i)
                    move += length[j]
                cost += price[index] * move
                index = N
            }
        }
    }
    bw.write("$cost")
    bw.flush()
}