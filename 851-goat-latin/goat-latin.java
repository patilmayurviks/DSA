class Solution {
    public String toGoatLatin(String sentence) {
        String words[]= sentence.split(" ");
        StringBuilder result=new StringBuilder();
        StringBuilder a=new StringBuilder();
        String vowel="aeiouAEIOU";
        for(int i=0;i<words.length;i++){
            String word= words[i];
            if(vowel.indexOf(word.charAt(0))==-1){
                word=word.substring(1)+word.charAt(0);
               

            }
             word+="ma";
                a.append("a");
                word+=a;
            if(i>0){
                result.append(" ");

            }
            result.append(word);

        }
         return result.toString();



        
    }
}