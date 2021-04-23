fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min_value=Int.MAX_VALUE
    var max_value=Int.MIN_VALUE
    var resultArray=intArrayOf(-1,-1)
    for(i in scores){
        if(i<min_value){
            resultArray[1]+=1
            min_value=i
        }
        if(i>max_value){
            resultArray[0]+=1
            max_value=i
        }
    }
    return resultArray.toTypedArray()

}
