
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var lefttoright:Int=0//00 11 22
    var righttoleft:Int=0//02 11 20
    var rightindex:Int=arr.size
    for((index,value) in arr.withIndex()){
        lefttoright+=value[index]
        righttoleft+=value[rightindex--]
    }
    var result:Int=righttoleft-lefttoright
    when{
        result<0->return result*(-1)
        else->return result
    }

}