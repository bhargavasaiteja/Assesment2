package Assignment02;

import java.util.Scanner;

class MainExample {
    public static void main(String[] args) {
        Long hallticket = (long)2000;
        String name = null;
        String fname =null;
        String lname =null;
        String examcentr =null;
        String collcentr =null;
        String course=null;
        Long phno =null;
        String addrs =null;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Type no of Students to enter the details");
        int studentNo= scanner.nextInt();
        Exam[] arr=new Exam[studentNo];

        for(int i=0;i<studentNo;i++){
            System.out.println("Enter next student details" );
            arr[i] = printdata(hallticket++, name, fname, lname, examcentr, collcentr, course, phno, addrs);
        }


        System.out.println("Enter the getStudent value : ");
        int getStudent = scanner.nextInt();
        for (Exam student : arr) {
            if (student.getHallticket() == getStudent){
                student.printdata();

            }
        }

        for (Exam ex:arr ) {
            ex.printdata();

        }


    }

    public static Exam printdata(Long hallticket, String name, String fname, String lname, String examcentr, String collcentr, String course, Long phno, String addrs) {

        Scanner inp = new Scanner(System.in);
        System.out.println("enter name");
        name = inp.nextLine();
        System.out.println("enter fname");
        fname = inp.nextLine();
        System.out.println("enter lname");
        lname = inp.nextLine();
        System.out.println("examcentr");
        examcentr = inp.nextLine();
        System.out.println("collcentr");
        collcentr = inp.nextLine();
        System.out.println("course");
        course = inp.nextLine();
        System.out.println("phno");
        phno = Long.valueOf(inp.nextLine());
        System.out.println("addrs");
        addrs = inp.nextLine();
        Exam ex = new Exam();
        ex.setHallticket(hallticket);
        ex.setName(name);
        ex.setFname(fname);
        ex.setLname(lname);
        ex.setExamcentr(examcentr);
        ex.setCollcentr(collcentr);
        ex.setCourse(course);
        ex.setPhno(phno);
        ex.setAddrs(addrs);

        return ex;

    }


}
