/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    if(nums==null) return 0
    let count =0, result = 0
    // nums.forEach((item,index)=>{
    //     if(item ==1){
    //         count++
    //     }else{
    //         result = Math.max(result,count)
    //         count =0
    //     }
    // })

    // for (let i = 0; i < nums.length; i++) {
    //     if(nums[i] ===1){
    //         count++
    //     }else{
    //         result = Math.max(result,count)
    //         count =0
    //     }
    // }

    let res = nums.map((item,index)=>{
        if(item ==1){
            count++
        }else{
            result = Math.max(result,count)
            count =0
        }
        return result
    })
    return Math.max(res,count)
};