/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const mappings = new Map();
    mappings.set("(", ")");    
    mappings.set("[", "]");    
    mappings.set("{", "}");    

    const stack = [];
    for (let i = 0; i < s.length; i++) {
        if(mappings.has(s[i])){  //检查mappings 中是否存在左括号
            stack.push(mappings.get(s[i])); // 将 mappings的值，即右括号放入stack
        }else{
            if(stack.pop() !== s[i]) { // 查看pop出来的，是否 是s[i]  // 若果是，则pop出来的是右
                return false;                
            }
        }
        
    }
    if(stack.length !== 0 ){
        return false; //stack 中存在未被pop的括号，则为 非成对儿出现。
    }
    return true;
};


