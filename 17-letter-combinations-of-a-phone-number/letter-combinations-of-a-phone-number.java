class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,"",map,result);
        return result;
        
    }
    private void backtrack(String digit,int index, String current,String[] map,List<String> result){
        if(index==digit.length()){
            result.add(current);
            return;
        }
        String letter= map[digit.charAt(index)-'0'];
        for(char ch: letter.toCharArray()){
            backtrack(digit,index+1,current+ch,map,result);
        }
    }
}