public class SeasonByMonth {
    int month = 10;
    String season;
    public void monthOfSeason(){
        if (month==12 || month ==1|| month==2){
            season ="Winter";
            System.out.println(season);
        } else if (month == 3 || month==4 || month==5) {
            season ="Spring";
            System.out.println(season);
        } else if (month==6 || month ==7 || month==8) {
            season ="Summer";
            System.out.println(season);
        }else if (month==9 || month ==10 || month==11) {
            season = "Autumn";
            System.out.println(season);
        } else {
            season = "Bogus month";
            System.out.println(season);
        }
    }
}
