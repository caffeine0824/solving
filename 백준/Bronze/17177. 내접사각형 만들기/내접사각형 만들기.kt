import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val bc = st.nextToken().toDouble()
    val ab = st.nextToken().toDouble()
    val cd = st.nextToken().toDouble()
    val ac = sqrt(bc.pow(2) - ab.pow(2))
    val bd = sqrt(bc.pow(2) - cd.pow(2))
    val ad = (ac * bd - ab * cd) / bc
    if(ad <= 0) 
        print("-1")
    else
        print(String.format("%.0f", ad))
    bw.flush()
}