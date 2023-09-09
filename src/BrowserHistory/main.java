package BrowserHistory;

public class main {
    public static void main(String[] args) {
        BrowserHistory br=new BrowserHistory("leetcode.com");
        br.visit("google.com");
        br.visit("facebook.com");
        br.visit("youtube.com");
        System.out.println(br.back(1));
        System.out.println(br.back(1));

        System.out.println(br.forward(1));
        br.visit("Linkedin.com");
        System.out.println(br.forward(2));
        System.out.println(br.back(2));
        System.out.println(br.back(7));
    }

}
