fun pageCount(n: Int, p: Int): Int {
    var minpage=Int.MAX_VALUE
    var countpageturning=0
    var countpage=0
    for(i in 1..n){
        if(i==p){
            minpage=countpageturning
            break
        }
        countpage+=1
        if(countpage%2==0 || i==1){
            countpageturning+=1
            countpage=0

        }

    }
    countpageturning=0
    countpage=0
    for(i in n downTo 1){
        if(i==p && minpage>countpageturning){
            minpage=countpageturning
            break
        }
        countpage+=1
        if(countpage%2==0 || (i%2==0 && i==n)){
            countpageturning+=1
            countpage=0
        }

    }

    return minpage

}