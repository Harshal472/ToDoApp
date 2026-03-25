import javax.swing.*;
import java.awt.*;

class TodoCheckbox {

    JFrame f;
    JTextField taskField;
    JButton addBtn, deleteBtn;
    JPanel taskPanel;

    Todoappgui() {

        f = new JFrame("To-Do App");

        taskField = new JTextField(20);
        addBtn = new JButton("Add Task");
        deleteBtn = new JButton("Delete Selected");

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scroll = new JScrollPane(taskPanel);

        JPanel top = new JPanel();
        top.add(taskField);
        top.add(addBtn);
        top.add(deleteBtn);

        f.add(top, BorderLayout.NORTH);
        f.add(scroll, BorderLayout.CENTER);

        addBtn.addActionListener(e -> {
            String task = taskField.getText();

            if (!task.isEmpty()) {
                JCheckBox cb = new JCheckBox(task + " - Pending");

                cb.addActionListener(ev -> {
                    if (cb.isSelected()) {
                        cb.setText(task + " - Completed");
                    } else {
                        cb.setText(task + " - Pending");
                    }
                });

                taskPanel.add(cb);
                taskPanel.revalidate();
                taskField.setText("");
            }
        });

        deleteBtn.addActionListener(e -> {
            Component[] comps = taskPanel.getComponents();

            for (int i = comps.length - 1; i >= 0; i--) {
                JCheckBox cb = (JCheckBox) comps[i];
                if (cb.isSelected()) {
                    taskPanel.remove(cb);
                }
            }

            taskPanel.revalidate();
            taskPanel.repaint();
        });

        f.setSize(450, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TodoCheckbox();
    }
}
