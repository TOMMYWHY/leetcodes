/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    const result = [];
    nums.sort(function(a,b){return a - b;})
    for (let i = 0; i < nums.length-2; i++) {
        if(i === 0 || nums[i] !== nums[i-1] ){
            let start = i +1, end = nums.length-1;
            while(start < end){
                let sum_3 = nums[i]+ nums[start]+nums[end];
                if(sum_3===0){
                    result.push([nums[i],nums[start],nums[end]]);
                    start++;
                    end--;
                    while(start< end && nums[start]===nums[start-1]){
                        start++;
                    }
                    while(start< end && nums[end]===nums[end+1]){
                        end++;
                    }
                }else if(sum_3 < 0){
                    start++;
                }else if(sum_3>0){
                    end--;
                }
            }
        }
    }
    return result;
};