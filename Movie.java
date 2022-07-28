package com.company;

public class Movie {
    String title;
    String studio;
    String rating;
    public Movie(String tit, String stu, String rate)
    {
        title =tit;
        studio=stu;
        rating = rate;
    }
    public Movie(String t,String s)
    {
        title = t;
        studio=s;
        rating="PG";
    }
    public static  Movie []getPG(Movie [] arr)
    {
        Movie [] PG = new Movie[arr.length];
        int index,i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].rating.equals("PG")) {
                PG[i] = arr[i];
                i++;
            }
        }
        return PG;
    }
}

package com.company;
public class Main {

    public static void main(String[] args) {
        Movie m = new Movie("Casino Royale ", "Eon Productions","PG-13");

    }
}
