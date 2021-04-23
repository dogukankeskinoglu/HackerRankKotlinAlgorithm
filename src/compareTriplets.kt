fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var point=arrayOf<Int>(0,0)
    for(i in 0..(a.size-1)){
        val result:Int=a[i]-b[i]
        when{
            result<0->point[1]+=1
            result>0->point[0]+=1
        }
    }
    return point
}