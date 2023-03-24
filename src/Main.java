import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 程序入口
public class Main {
    public static void main(String[] args) {
        Organization head = new College("软件学院");//head
        OrganizationComposite studentUnion = new StudentUnion("软件学院学生会");
        OrganizationComposite depart1 = new Department("软件工程");//composite
        OrganizationComposite depart2 = new Department("物联网");//composite
        OrganizationComposite depart3 = new Department("大数据");//composite

        head.add(studentUnion);
        head.add(depart1);
        head.add(depart2);
        head.add(depart3);

        OrganizationComposite Class1 = new Class("202011班");
        OrganizationComposite Class2 = new Class("202012班");
        OrganizationComposite Class3 = new Class("202013班");
        OrganizationComposite Class4 = new Class("202071班");
        OrganizationComposite Class5 = new Class("202081班");

        depart1.add(Class1);
        depart1.add(Class2);
        depart1.add(Class3);
        depart2.add(Class4);
        depart3.add(Class5);

        Student student1 = new Student("学生1");
        Student student2 = new Student("学生2");
        Student student3 = new Student("学生3");
        Student student4 = new Student("学生4");
        Student student5 = new Student("学生5");

        Class1.add(student1);
        Class2.add(student2);
        Class3.add(student3);
        Class4.add(student4);
        Class5.add(student5);

        MailSender mailSender = new MailSender(head);
        mailSender.sendMail("节日祝福","软件学院","学生5");


    }
}