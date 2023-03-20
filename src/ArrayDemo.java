public class ArrayDemo {
    public static void main(String[] args) { //String array of arguments
        System.out.println("String[] args:");
        System.out.println(args);
        System.out.println(args.length);
        if (args.length > 0) {
            System.out.println(args[3]);
        }

        System.out.println("int[] nums:");
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums.length);
        System.out.println(nums[1]);
    }
}

