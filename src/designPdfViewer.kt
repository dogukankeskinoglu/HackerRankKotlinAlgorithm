fun main(){
    val string="1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7"
    val word="zaba"
    val array= getList(string)
    val string2="1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5"
    val word2="abc"
    val array2=getList(string2)
    println(designerPdfViewer(array,word))
    println(designerPdfViewer(array2,word2))

}
fun getList(input:String):MutableList<Int>{
    return input.trimEnd().split(" ").map{ it.toInt() }.toMutableList()
}
fun designerPdfViewer(h: MutableList<Int>, word: String): Int {
    val liste='a'..'z'
    val wordLength=word.length
    var maxValue=0
    word.forEach {
        val charIndex=liste.indexOf(it)
        if(h[charIndex]>maxValue){
            maxValue=h[charIndex]
        }
    }
    return maxValue*wordLength
}

