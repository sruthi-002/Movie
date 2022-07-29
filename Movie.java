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
        Movie m = new Movie("Casino Royale ", "Eon Productions","PG");
        Movie h = new Movie("Sruthi","Camera Productions");
        Scanner in =new Scanner(System.in);
        int n,i;
        n = in.nextInt();
        Movie [] arr = new Movie[n];
        for(i=0;i<n;i++)
        {
            arr[i]=new Movie(in.next(),in.next(),in.next());
        }
        Movie [] a = new Movie[arr.length];
        a = m.getPG(arr);
        System.out.println(a);

    }
}
