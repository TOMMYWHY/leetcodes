/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    if (nums.length==0) return []
    let index = 0

    let newArr = nums.map((element)=>{
        if(element!=0){
            nums[index] = element
            index++
        }
        return nums
    })
    return newArr //尾部 不为0
};