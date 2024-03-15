import java.util.Arrays;

class SelfProduceExcept {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr))); 
    }
static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int leftProduct = 1;
    for (int i = 0; i < n; i++) {
        res[i] = leftProduct;
        leftProduct *= nums[i];
    }
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= rightProduct;
        rightProduct *= nums[i];
    }
    return res;
}
}


/*
 static int[] productExceptSelf(int[] nums) {
    int len = nums.length;
    int[] res = new int[len];

    for (int i = 0; i < len; i++) {
        int product = 1;
        for (int j = 0; j < len; j++) {
            if (i != j) {
                product *= nums[j];
            }
        }
        res[i] = product;
    }

    return res;
}

 */