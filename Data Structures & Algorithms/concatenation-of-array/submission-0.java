class Solution {
    public int[] getConcatenation(int[] a) {
        int[] res = new int[2*a.length];
        for(int i=0;i<a.length;i++){
            res[i]=(a[i]);
            res[a.length+i]=a[i];
        }
        return res;
    }
}