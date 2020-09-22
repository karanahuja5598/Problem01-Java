package cd.get.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int value){
        String result = "";
        for(int i = 1; i <= value; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result += "WuTangForever\n";
            } else if(i % 3 == 0) {
                result += "Wu\n";
            } else if(i % 5 == 0) {
                result += "Tang\n";
            } else {
                result += i + "\n";
            }
        }

        return result;
    }
}
