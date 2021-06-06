class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people == null || people.length==0) return 0;

        Arrays.sort(people);
        int i=0, j=people.length-1;
        int result=0;
        while(i<=j){
            if(people[i]+people[j] <= limit){
                i++;
            }
            j--;
            result ++;
            

        }
        return result;
    }
}