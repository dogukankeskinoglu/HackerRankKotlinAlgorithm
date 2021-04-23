fun plusMinus(arr: Array<Int>): Unit {
    var result=mutableListOf<Double>(0.0,0.0,0.0)
    for(value in arr){
        when{
            value>0->result[0]+=1.0
            value<0->result[1]+=1.0
            else->result[2]+=1.0
        }
    }
    for(value in result){
        println(String.format("%.6f",value/arr.size))
    }

}