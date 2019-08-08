package question.wy;

import java.util.*;

public class One {
    public static void main(String[] args) {
        // 1.输入保存全班同学成绩
        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入班级人数");
        int studentNum = scanner.nextInt();
        int[] grades = new int[studentNum + 1];
        for (int i = 1; i < grades.length; i++) {
//            System.out.println("输入学生成绩:");
            int grade = scanner.nextInt();
            grades[i] = grade;
        }
//        System.out.println(Arrays.toString(grades));

        // 2.输入需要查询同学的成绩(多个)
//        System.out.println("输入查询学生次数");
        int queryNum = scanner.nextInt();
        int[] queryGrade = new int[queryNum];
        for (int i = 0; i < queryNum; i++) {
//            System.out.println("输入查询学生的序号");
            int studentId = scanner.nextInt();
            queryGrade[i] = grades[studentId];
        }

        // 3.输出(多个)同学成绩百分比
        // 3.1 对所有学生成绩排序
        ArrayList<Integer> gradeList = new ArrayList<>();
        for (int i : grades) {
            gradeList.add(i);
        }
        Collections.sort(gradeList);
//        System.out.println(gradeList.toString());
        // 3.2 输出学生排名
        for (int j = 0; j < queryNum; j++) {
            int index = 0;
            for (int i = 1; i <= studentNum; i++) {
                if (queryGrade[j] <= gradeList.get(i)) {
                    index = i;
                    float a=((float)(--index / (double) studentNum))*100;
                    System.out.println(String.format("%8f",(double)a));
                    break;
                }
            }
        }



    }

}
