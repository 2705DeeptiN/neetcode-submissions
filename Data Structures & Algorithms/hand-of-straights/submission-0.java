class Solution {
    public boolean isNStraightHand(int[]arr, int k) {
        int n=arr.length;

        if(n%k!=0) return false;
        //cant divide if nt multiple of k coz v need exact grps

TreeMap<Integer,Integer>map=new TreeMap<>();

for(int ele:arr){
    map.put(ele,map.getOrDefault(ele,0)+1);
}

while(!map.isEmpty()){
    int frst=map.firstKey();

    for(int i=0;i<k;i++){
        int card=frst+i;

        if(!map.containsKey((card))) return false;

        int freq=map.get(card);
        if(freq==1) map.remove(card);
        else map.put(card,freq-1);
    }
}
return true;
    }
}
