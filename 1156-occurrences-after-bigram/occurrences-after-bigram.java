class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String words[]= text.split(" ");
        List<String> list=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n-2;i++){
            if(words[i].equals(first)&& words[i+1].equals(second)){
                list.add(words[i+2]);
            }
        }
        return list.toArray(new String[0]);
        
    }
}