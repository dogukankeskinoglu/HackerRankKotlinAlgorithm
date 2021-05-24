import java.lang.Math.abs

fun main(){
    println(isValid("aabbcd"))
    println(isValid("aabbccddeefghi"))
    println(isValid("abcdefghhgfedecba"))
    //println(isValid("abc"))
    println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"))

}


fun isValid(s: String): String {
    if(s.length==1) return "YES"
    val second=s.associateWith {
            index-> s.count { it==index }
    }.toMutableMap()
    val values=second.values.toMutableList()
    val valuesSet=values.toSet().toMutableList()
    if (valuesSet.size==1) return "YES"
    if(valuesSet.size>=3) return "NO"
    if(valuesSet.size>=2){
        if(values.count{it==1}==1) return "YES"
        if(abs(valuesSet[0]-valuesSet[1])==1 && (values.count{it==valuesSet[0]}==1 || values.count{it==valuesSet[1]}==1 )) return "YES"
    }
    return "NO"
}
