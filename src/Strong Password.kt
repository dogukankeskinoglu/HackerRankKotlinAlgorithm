import kotlin.math.min

//Its length is at least 6.
//It contains at least one digit.
//It contains at least one lowercase English character.
//It contains at least one uppercase English character.
//It contains at least one special character. The special characters are: !@#$%^&*()-+

fun main(){
}


fun minimumNumber(n: Int, password: String): Int {
    // Return the minimum number of characters to make the password strong
    var minCount=0
    if(password.checkSpecial() && password.checkUppercase() && password.checkLowercase() && password.checkDigit() && password.checkLength()) return 0
    else{
        if(!password.checkSpecial()){
            minCount+=1
        }
        if(!password.checkUppercase()){
            minCount+=1
        }
        if(!password.checkLowercase()){
            minCount+=1
        }
        if(!password.checkDigit()){
            minCount+=1
        }
        if(n+minCount<6){
            return minCount+6-(n+minCount)
        }
    }
    return 0
}
fun String.checkSpecial()=this.any{"!@#$%^&*()-+".contains(it)}
fun String.checkUppercase()=this.any { it.isUpperCase() }
fun String.checkLowercase()=this.any{it.isLowerCase()}
fun String.checkDigit()=this.any{it.isDigit()}
fun String.checkLength()=this.length>=6