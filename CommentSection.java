import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CommentSection {
    private List<String> comments;

    public CommentSection() {
        comments = new ArrayList<>();
    }

    // intercting with comments
    public void interact(User user) {
        while (true) {
            String[] options = { "View Comments", "Add a Comment", "Back to Dashboard" };
            int choice = JOptionPane.showOptionDialog(null,
                    "--- Comment Section ---\nSelect an option:",
                    "Comment Section",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    viewComments();
                    break;
                case 1:
                    addComment(user);
                    break;
                case 2:
                    return; // exitting dashboard
                default:
                    // handling invalid options
                    return;
            }
        }
    }

    // showing all comments in scrollable area
    private void viewComments() {
        if (comments.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No comments available.", "Comments", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // text area for comments to be displayed
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        StringBuilder commentText = new StringBuilder();
        for (String comment : comments) {
            commentText.append(comment).append("\n");
        }
        textArea.setText(commentText.toString());

        // adding text area to scrol pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Comments", JOptionPane.INFORMATION_MESSAGE);
    }

    // adding new comment from user
    private void addComment(User user) {
        // input dialog for geting comment from user
        String comment = JOptionPane.showInputDialog(null, "Enter your comment:", "Add Comment",
                JOptionPane.PLAIN_MESSAGE);

        // adding comment to list
        if (comment != null && !comment.trim().isEmpty()) {
            String formattedComment = user.getName() + ": " + comment.trim();
            comments.add(formattedComment);
            JOptionPane.showMessageDialog(null, "Comment added successfully!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Comment cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
