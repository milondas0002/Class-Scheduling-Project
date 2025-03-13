import javax.swing.*;

public class ClassRepresentative extends User {

    public ClassRepresentative(String name, String key) {
        super(name, key);
    }

    @Override
    public void displayDashboard(Schedule schedule, CommentSection commentSection) {
        while (true) {
            // CR dashboard
            String[] options = { "View Daily Schedule", "Access Comment Section", "Logout" };
            int choice = JOptionPane.showOptionDialog(null,
                    "--- Class Representative Dashboard ---\nSelect an option:",
                    "CR Dashboard",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    // to view daily schedules
                    schedule.displayAllBookings(); // displayying all bokings
                    break;
                case 1:
                    // access comment section
                    commentSection.interact(this); // passing corrent user to coment section
                    break;
                case 2:
                    // logout
                    JOptionPane.showMessageDialog(null, "Logging out...", "Logout", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    // handling invalid input
                    return;
            }
        }
    }
}
