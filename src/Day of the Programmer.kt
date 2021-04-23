fun dayOfProgrammer(year: Int): String {
    var leapFormat="12.09.$year"
    var normalFormat="13.09.$year"
    var specialDate="26.09.$year"
    val date_string=
        when(year){
            in 1700..1917 -> if(year%4==0) leapFormat else normalFormat
            in 1919..2700 -> if(year%400==0 || (year%4==0 && year%100!=0)) leapFormat else normalFormat
            else -> specialDate
        }

    return date_string
}
