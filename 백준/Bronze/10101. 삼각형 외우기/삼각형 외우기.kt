import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays
import java.util.StringTokenizer

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var angle = IntArray(3)
    var sum = 0
    for(i in 0 until 3) {
        angle[i] = Integer.parseInt(br.readLine())
        sum += angle[i]
    }
    if(sum == 180) {
        if(angle[0] == 60 && angle[1] == 60)
            bw.write("Equilateral")
        else if(angle[0] == angle[1] || angle[1] == angle[2] || angle[2] == angle[0])
            bw.write("Isosceles")
        else
            bw.write("Scalene")
    }
    else
        bw.write("Error")
    bw.flush()
}