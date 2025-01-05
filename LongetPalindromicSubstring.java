public class LongetPalindromicSubstring {
    public static String palindrome(String s){
        int m=s.length()-1;
        // int end=m;
        int j=m;
        int i=0;
        while(j>i){
            if(s.charAt(i)==s.charAt(j)){
                // System.out.println("i: "+i+" j: "+j);
                // System.out.println("matched : "+s.charAt(i)+" "+s.charAt(j));
                i++;j--;
            }else{
                // System.out.println("i: "+i+" j: "+j);
                // System.out.println("not matched : "+s.charAt(i)+" "+s.charAt(j));
                i=0;
                m--;
                j=m;
            }
        }
        // System.out.println("returned :"+s.substring(0,m+1));
        return s.substring(0,m+1);
    }
    public static String longestPalindrome(String s){
        String subs="";
        for(int i=0;i<s.length();i++){
            String sub = palindrome(s.substring(i));
            if(subs.length()<sub.length()){
                subs=sub;
            }
        }
        return subs;
    }
    public static void main(String[] arg){
        String s;
        // s="bacabab"
        // s="xaabacxcabaaxcabaax";
        s="ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
        System.out.println(longestPalindrome(s));
        // System.out.println(longestPalindrome(s));
    }

}
