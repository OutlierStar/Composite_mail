// 组织单位抽象类
public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    // 添加组织单位
    public abstract void add(Organization organization);

    // 移除组织单位
    public abstract void remove(Organization organization);

    // 发送邮件
    public abstract void sendMail(String from,String content);

    // 获取组织单位名称
    public String getName() {
        return name;
    }
}
