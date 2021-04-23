fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var a_=a.copyOf().toList()
    var b_=b.copyOf().toList()
    var c=1
    var divider=2
    while(!a_.all{it==1}){
        if(a_.any{it%divider==0}){
            c*=divider
            a_=a_.map{if (it%divider==0) it/divider else it}
        }
        else{
            divider+=1
        }

    }
    var count=0
    var multipy=1
    var multipynumber=c
    //println(c)
    while(multipynumber<=b_.first()){
        //println("m:$multipynumber")
        if(b_.all{it%(multipynumber)==0}){
            //println("m2:$multipynumber")
            count+=1
        }
        multipy+=1
        multipynumber=multipy*c

    }
    return count
}
