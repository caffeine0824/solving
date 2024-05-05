import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var i = 1;
    while(true) {
        var st = StringTokenizer(br.readLine())
        val r = st.nextToken().toDouble()
        if(r == 0.0)
            break
        val w = st.nextToken().toDouble()
        val l = st.nextToken().toDouble()
        if(r * 2 < sqrt(w * w + l * l))
            bw.write("Pizza ${i++} does not fit on the table.\n")
        else
            bw.write("Pizza ${i++} fits on the table.\n")
    }
    bw.flush()
}