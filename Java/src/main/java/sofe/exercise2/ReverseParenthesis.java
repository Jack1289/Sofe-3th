package sofe.exercise2;

import java.util.ArrayList;

public class ReverseParenthesis {

    public static String reverseParenthesis(String text) {
        ArrayList<String> composeString = new ArrayList<String>();
        String result="";
        char[] charText = text.toCharArray();
        String temporalSubString="";
        int i = 0;
        while (i < text.length()) {
            if(charText[i]!= '(' && charText[i]!= ')'){
                temporalSubString = temporalSubString+charText[i];
            }
            else if(charText[i] == '('){
                composeString.add(temporalSubString);
                temporalSubString="(";
            }
            else if(charText[i] == ')'){
                temporalSubString = temporalSubString.substring(1);
                temporalSubString = new StringBuilder(temporalSubString).reverse().toString();
                composeString.add(temporalSubString);
                int j=i+1;
                temporalSubString ="";
                while(j<text.length()){
                    temporalSubString = temporalSubString+charText[j];
                    j++;
                }
                composeString.add(temporalSubString);
                text = "";
                for (int k = 0; k < composeString.size(); k++) {
                    text += composeString.get(k);
                }
                i=text.length();
            }
            i++;
        }
        
        if(text.contains("(") || text.contains(")")){
          result =  reverseParenthesis(text);
        }else { result =text;}
        return result;
    }

}
