public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) temp++;
        }
        int[] even = new int[temp];
        temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even[temp] = array[i];
                temp++;
            }
        }
        return even;

    }

    public int[] odd() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) temp++;
        }
        int[] odd = new int[temp];
        temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd[temp] = array[i];
                temp++;
            }
        }
        return odd;
    }
}
