class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        List<Integer> sizes = new ArrayList<>();
        StringBuilder message = new StringBuilder();
        for(String str : strs){
            sizes.add(str.length());
        }
        for(int size : sizes){
            message.append(size+",");
        }
        message.append("#");
        for(String str : strs){
            message.append(str);
        }
        
        return message.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0)return new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i)!='#'){
            StringBuilder size = new StringBuilder();
            while(str.charAt(i)!=','){
                size.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(size.toString()));
            i++;
        }
        i++;
        for(int size : sizes){
            result.add(str.substring(i, i + size));
            i+=size;
        }
        return result;
    }
}
