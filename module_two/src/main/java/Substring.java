public class Substring {

    public String findSubstring(String str, String str2){
        if(str == null || str2 == null) throw new NullPointerException();
        String s;
        String st;
        String max = "";
        if (str == "" || str2 == "") {
            System.out.println("строки не должны быть пустыми");
            return "";
        }

        if (str2.equals(str)) {
            System.out.println("наибольшая общая подстрока: " + str);
            return str;
        }

        if(str.length()>str2.length()){
            st = str;
            str=str2;
            str2=st;
        }

        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<=str.length(); j++) {
                s = str.substring(i, j);
                if (str2.contains(s) && s.length() > max.length()) max = s;
            }
        }
        System.out.println("наибольшая общая подстрока: " + max);
        return max;
    }
}
