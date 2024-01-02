/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var findMatrix = function(nums) {
    
    let freq = new Array(nums.length + 1).fill(0);
    let ans = [];
    // console.log(freq);
    
    for (let n of nums) {
        if(freq[n] >= ans.length) {
            ans.push([]);
        }
        
        ans[freq[n]].push(n);
        freq[n]++;
    }
    
    return ans;
    
};