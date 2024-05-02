import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var loc = Array(3, {IntArray(3)})
    for(i in 0 until 3) {
        var st = StringTokenizer(br.readLine())
        loc[i][0] = Integer.parseInt(st.nextToken())
        loc[i][1] = Integer.parseInt(st.nextToken())
    }
    var x : Int
    if(loc[0][0] == loc[1][0])
        x = loc[2][0]
    else if(loc[1][0] == loc[2][0])
        x = loc[0][0]
    else
        x = loc[1][0]
    var y : Int
    if(loc[0][1] == loc[1][1])
        y = loc[2][1]
    else if(loc[1][1] == loc[2][1])
        y = loc[0][1]
    else
        y = loc[1][1]
    bw.write("$x $y")
    bw.flush()
}