class Demo{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def",
                        "ghi","jkl","mno",
                        "pqrs","tuv","wxyz"
                        };
        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();
        dfs(digits,0,temp,map,res);
        return res;
    }
    public void dfs(String digits, int idx, 
    StringBuilder temp, String[] map, List<String> res){
        if(idx == digits.length()){
            res.add(temp.toString());
            return;
        }
        int cur = digits.charAt(idx)-'0';
        int len = temp.length();
        for(int i = 0; i < map[cur].length();i++){
            temp.append(map[cur].charAt(i));
            dfs(digits,idx+1,temp,map,res);
            temp.setLength(len);
        }
    }
}
