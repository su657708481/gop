#include <iostream>
#include <algorithm>
#include <stack>
#include <queue>
#include <vector>
#include <set>
#include <map>
#include <string.h>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;
#define ms(s) memset(s, 0, sizeof(s))
const int inf = 0x3f3f3f3f;

#define DEBUG

#ifdef DEBUG
#define c1(a) {cout<<#a<<": "<<a<<endl;}
#define c2(a, b) {cout<<#a<<": "<<a<<" "<<#b<<": "<<b<<endl;}
#else
#define c1(a){}
#define c2(a,b){}
#endif

/*
 	Leecode_面试题 17.21. 直方图的水量 实际就是接雨水
 	2021.4.2
 	O(n)双指针
*/
class Solution {
public:
    int trap(vector<int>& height) {
    	if(height.size()<2) return 0;
    	int l = 0, r = 0, ans = 0;
    	for (int i = 0; i < height.size(); ++i)
    	{
    		/* 找到最高点 */
    		r = (height[r] < height[i])?i:r;
    	}

    	/* 分左右两部分 */
    	int cur = 1;
    	while(l<r)
    	{
    		int tem = min(height[l], height[r]);
    		if(tem > height[cur])
    		{
    			ans += tem - height[cur];
    		}
    		else
    		{
    			l = cur;
    		}
    		cur++;
    	}

    	l = r;
    	r = height.size()-1;
    	cur = height.size()-2;

    	while(l<r)
    	{
    		int tem = min(height[l], height[r]);
    		if(tem > height[cur])
    		{
    			ans += tem - height[cur];
    		}
    		else
    		{
    			r = cur;
    		}
    		cur--;
    	}
    	return ans;
    	
    }
};

int main(int argc, char * argv[]) 
{
	Solution s = Solution();
	vector<int> height = {0,1,0,2,1,0,1,3,2,1,2,1};
	c1(s.trap(height));
    return 0;
}