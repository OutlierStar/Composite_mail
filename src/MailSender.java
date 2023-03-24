import java.util.LinkedList;
import java.util.Queue;

// 邮件发送程序类
public class MailSender {
    private Organization root;

    public MailSender(Organization root) {
        this.root = root;
    }

    public void sendMail(String content, String to, String from) {
        Organization target = findTarget(to);
        Organization source = findTarget(from);
        if (target != null) {
            if (source != null) {
                target.sendMail(from,content);
            } else {
                System.out.println("找不到邮件发送对象：" + from);
            }
        } else {
            System.out.println("找不到邮件接受对象：" + to);
        }
    }

    private Organization findTarget(String targetName) {
        Queue<Organization> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Organization current = queue.poll();
            if (current.getName().equals(targetName)) {
                return current;
            }
            if (current instanceof OrganizationComposite) {
                for (Organization organization : ((OrganizationComposite) current).getOrganizations()) {
                    queue.add(organization);
                }
            }
        }
        return null;
    }
}
