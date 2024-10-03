public class Array {

    public static void main(String a[]){
        Student stu1 =new Student();
        stu1.name="m";
        stu1.RollNo="09";
        stu1.marks=75;
        Student stu2 =new Student();
        stu2.name="n";
        stu2.RollNo="11";
        stu2.marks=85;
        Student stu3 =new Student();
        stu3.name="o";
        stu3.RollNo="29";
        stu3.marks=95;
        Student stu[]={stu1,stu2,stu3};
        for(Student st:stu){
        System.out.println(st.name+" "+st.RollNo+" "+st.marks);
        }





        /*
        int num [][]=new int[3][4];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);
                System.out.print(" "+num[i][j]);
            }
            System.out.println("");


        }
        System.out.println("\n");
        int num2 [][]=new int[3][];
        num2[0]=new int[3];
        num2[1]=new int[2];
        num2[2]=new int[1];
        for(int i=0;i<num2.length;i++){
            for(int j=0;j<num2[i].length;j++){
                num2[i][j]=(int)(Math.random()*10);
                System.out.print(" "+num2[i][j]);
            }
            System.out.println("");


        }
        int num[]={12,13,14,15};
        int add=0;
        int i=0;
        int temp=0;
        while(i<=3){
            add=temp+num[i];
            temp=add;
            System.out.println(add);
            i++;
        }
        */ 


    }
}
class Student{
    String name;
    String RollNo;
    int marks;
}
