var twoSum = function(nums, target) {
    let numberIndex = new Map();
    let result = [];

    for (let i = 0; i < nums.length; i++) {
    let num = nums[i];
    let complement = target - num;

        if (numberIndex.has(complement)) {
            result[0] = numberIndex.get(complement);
            result[1] = i;

            return result;
        }else{
            numberIndex.set(num, i);
        }
    }

    return result;
};

let nums = [2,7,11,15];
let target = 9;
console.log(twoSum(nums,target))