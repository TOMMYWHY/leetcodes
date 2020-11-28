/*sliding window*/

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const set = new Set();
    let i = 0, j = 0, maxLength = 0; // i-> height j->low
    if(s.length ===0){
        return 0;
    }
    for (let i = 0; i < s.length; i++) {
        if(!set.has(s[i])){
            set.add(s[i]);//前指针
            maxLength = Math.max(maxLength,set.size); //check max length
        }else{
            while(set.has(s[i])){
                set.delete(s[j]);// 此时s[j] == s[i] 
                j++;//后指针
            }
            set.add(s[i]);
        }
        
    }
    return maxLength;
};

let s = "abcabcbb";
console.log(lengthOfLongestSubstring(s))