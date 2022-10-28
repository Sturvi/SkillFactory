public class Squirrel {
    int nuts[];

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }


    public int getNuts(int index) {
        if (index < nuts.length)
            return nuts[index];
        else return 0;
    }

    public int maxNuts() {
        int nuts2[] = new int[nuts.length + 3];
        int currectStep = -1;
        int totalNuts = 0;
        for (int i = 0; i < nuts.length; i++) {
            if (getNuts (i)>=0 ||
                    (Math.max((getNuts(i) + getNuts(i + 1)), (getNuts(i) + getNuts(i + 2))) >
                            Math.max((getNuts(i + 1) + getNuts(i + 2)), (getNuts(i + 1) + getNuts(i + 3))))) {
                totalNuts = Math.max(0, (totalNuts + getNuts(i)));
            } else {
                totalNuts = Math.max(0, (totalNuts + getNuts(i+1)));
                i++;
            }
        }
        return totalNuts;
    }
}
