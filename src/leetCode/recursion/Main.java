package leetCode.recursion;


/**
 * @author: Bravery
 * @create: 2019-09-20 20:03
 **/


public class Main {
    static class A {
        public static void method(int i) {
            if (i == 1) {
                throw new RuntimeException();
            }
        }
    }

//    public static void main(String[] args) {
//        A a = new A();
//        a.method(1);
//
//
//        final Object obj = new Object();
////        try {
//        obj.wait();
////        }catch (Exception e){
////            System.out.println("wwwww");
////        }
//        Thread t1 = new Thread() {
//            public void run() {
//                synchronized (obj) {
//
////                    obj.wait();
//
//                }
//            }
//        };
//
//        t1.start();
//        //Thread.sleep(1000);//We assume thread 1 must start up within 1 sec.
//        Thread t2 = new Thread() {
//            public void run() {
//                synchronized (obj) {
//                    obj.notifyAll();
//                    System.out.println("Thread 2 sent notify.");
//                }
//            }
//        };
//        t2.start();
//    }
}
//        Scanner scanner = new Scanner(System.in);
//        int nums = scanner.nextInt();
//        ArrayList<String> strings = new ArrayList<>();
//        for(int i=1;i<=nums;i++){
//            int len=scanner.nextInt();
//            String str=scanner.next();
//            strings.add(str);
//        }
//        for (String s:strings){
//            if (s.length()==11&&s.charAt(0)==8){
//                System.out.println("YES");
//            }else if (s.length()>11){
//                for(int i=s.length();i>=11;i++){
//                    if (s.charAt(i)=='8'){
//                        System.out.println("YES");
//                    }
//                }
//            }else {
//                System.out.println("NO");
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//        int nums = scanner.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<nums;i++){
//            int time=scanner.nextInt();
//            time+=scanner.nextInt();
//            list.add(time);
//        }
//        Collections.sort(list);
//        int res=list.get(0)+list.get(1);
//        System.out.println(res);


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]= scanner.nextInt();
//        }
//        for (int i=0;i<k;i++){
//            int min=Integer.MAX_VALUE;
//            for (int j=0;j<nums.length;j++){
//                if (nums[j]>0&&nums[j]<min){
//                    min=nums[j];
//                }
//            }
//            if (min==Integer.MAX_VALUE){
//                System.out.println(0);
//            }else {
//                System.out.println(min);
//            }
//            for (int j=0;j<nums.length;j++){
//                if (nums[j]-min>0){
//                    nums[j]=nums[j]-min;
//                }else {
//                    nums[j]=0;
//                }
//            }
//        }
//    }


//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int[] Q=new int[len];
//        int[] niuniu=new int[len];
//        for (int i=0;i<len;i++){
//            Q[i]=scanner.nextInt();
//        }
//        for (int i=0;i<len;i++){
//            niuniu[i]=scanner.nextInt();
//        }

//        ArrayList<Integer> nums = new ArrayList<>();
//        for (int i=0;i<len;i++){
//            for (int j=0;j<len;j++){
//                int add=Q[i]+niuniu[j];
//                nums.add(add);
//            }
//        }
//        int res=nums.get(0);
//        for (int i=1;i<nums.size();i++){
//            res^=nums.get(i);
//        }
//        System.out.println(res);
