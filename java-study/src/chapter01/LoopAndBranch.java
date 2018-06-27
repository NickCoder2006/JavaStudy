package chapter01;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/1 9:57
 */
public class LoopAndBranch {
    public void use(){
        //strangFor();
        //switchBrach();
        foreachLoop();
    }

    public void strangFor(){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");

        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }

    public void switchBrach(){
        char grade = 'X';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    public void foreachLoop(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        // 打印所有数组元素
        for (double element: myList) {
            System.out.println(element);
        }
    }
}
