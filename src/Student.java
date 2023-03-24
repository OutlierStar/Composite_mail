// 学生类
public class Student extends Organization {
    public Student(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        // 学生没有下属组织单位，不需要实现
    }

    @Override
    public void remove(Organization organization) {
        // 学生没有下属组织单位，不需要实现
    }

    @Override
    public void sendMail(String from,String content) {
        System.out.println(from + "向学生" + name + "发送邮件，内容为：" + content);
    }
}
