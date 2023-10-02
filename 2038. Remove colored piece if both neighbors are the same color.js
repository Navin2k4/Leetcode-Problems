/**
 * @param {string} colors
 * @return {boolean}
 */
var winnerOfGame = function (colors) {
    let countA = 0;
    let countB = 0;
    for (let i = 0; i < colors.length; i++) {
        const x = colors[i];
        let count = 0;
        while (i < colors.length && colors[i] === x) {
            i++;
            count++;
        }
        if (x === 'A') {
            countA += Math.max(count - 2, 0);
        }
        else if (x === 'B') {
            countB += Math.max(count - 2, 0);
        }
        i--;
    }
    return countA > countB;
};

let result = winnerOfGame("AAAABBBB");
console.log(result);


/*
bool winnerOfGame(char * colors){
    int len = strlen(colors);
    int count_a = 0,count_b = 0;
    for(int i;i<len;i++){
        char x = colors[i];
        int count = 0;
        while(i<len && colors[i]==x){
            i++;
            count++;
        }
        if(x=='A'){
            count_a += (count -2 > 0) ? count-2 : 0;
        }
        else if(x=='B'){
            count_b += (count -2 > 0) ? count-2 : 0;
        }
        i--;
    }
    return count_a > count_b;
}
*/

/*
class Solution(object):
    def winnerOfGame(self, colors):
        """
        :type colors: str
        :rtype: bool
        """
        c = collections.Counter()
        for x,t in groupby(colors):
            c[x] += max(len(list(t))-2,0)
        if c['A'] > c['B']:
            return True
        return False
*/
