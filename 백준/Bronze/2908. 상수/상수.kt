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
    var a = st.nextToken()
    var b = st.nextToken()
    var aR = Character.getNumericValue(a[0]) + Character.getNumericValue(a[1]) * 10 + Character.getNumericValue(a[2]) * 100
    var bR = Character.getNumericValue(b[0]) + Character.getNumericValue(b[1]) * 10 + Character.getNumericValue(b[2]) * 100
    bw.write("${if(aR > bR) aR else bR}")
    bw.flush()
}