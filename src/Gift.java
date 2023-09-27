public class Gift {

    int w;

    int [] xyz;
    int [] xyzMaxCount;

    int countValidGifts;

    public Gift (int x, int y, int z, int w){
        this.xyz = new int[]{x, y, z};
        this.w = w;
        this.xyzMaxCount = new int[]{w/x, w/y, w/z};
    }

    public boolean validGift(int i, int j, int k){
        if ((i*xyz[0] + j*xyz[1] + k*xyz[2])==w) return true;
        else return false;
    }
}
