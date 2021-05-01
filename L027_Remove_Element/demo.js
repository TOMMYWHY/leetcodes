/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let begin = 0, end = nums.length;
    while(begin<=end){
        if(nums[begin] == val){
            nums[end] = nums[begin];
            end--;
        }else{
            begin++
        }
    }
    return begin
};