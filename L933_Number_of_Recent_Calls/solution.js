
var RecentCounter = function() {
    this.arr = [];
    this.start = 0;

};

/** 
 * @param {number} t
 * @return {number}
 */
RecentCounter.prototype.ping = function(t) {
    this.arr.push(t);
    while(this.arr.length>0 && this.arr[this.start]< (t-3000) ){
        this.start++;  // 相当于 pop
    }
    return this.arr.length - this.start;

};

/** 
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = new RecentCounter()
 * var param_1 = obj.ping(t)
 */