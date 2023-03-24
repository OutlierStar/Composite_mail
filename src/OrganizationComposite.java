import java.util.ArrayList;
import java.util.List;

// 组织单位容器类
public class OrganizationComposite extends Organization {
    private List<Organization> organizations;

    public OrganizationComposite(String name) {
        super(name);
        organizations = new ArrayList<>();
    }

    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    public void sendMail(String from,String content) {
        System.out.println(from + "向" + name + "发送邮件，内容为：" + content);
        for (Organization organization : organizations) {
            organization.sendMail(from,content);
        }
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }
}
