class Solution {
    public int longestMountain(int[] arr) {
        int n  = arr.length;
        int ans = 0;
        int upper, lower = 0;
        int i = 1;

        while (i < n) {
            if (i<n && arr[i-1] == arr[i]) i++;

            while (i<n && arr[i-1] < arr[i]) {
                upper++;
                i++;
            }

            while (i<n && arr[i-1] >arr[i]) {
                lower++;
                i++;
            }

            if (upper !=0 && lower!= 0) {
                ans = Math.max(ans, upper+lower+1);
            }
        }
        return ans
    }

    public static void main(String[] args){
        int[] arr = {2,1,4,7,3,2,5};
        Solution s = new Solution();
        int res = s.longestMountain(arr);
        System.out.println(res);

    }
}