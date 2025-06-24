import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Todo");
            System.out.println("2. List Todos");
            System.out.println("3. Complete Todo");
            System.out.println("4. Cancel Todo");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();
                    todoList.add(desc);
                    System.out.println("Todo added.");
                    break;
                case "2":
                    for (Todo t : todoList.getAll()) {
                        System.out.println(t);
                    }
                    break;
                case "3":
                    System.out.print("Enter id to complete: ");
                    int completeId = Integer.parseInt(scanner.nextLine());
                    Todo completeTodo = todoList.find(completeId);
                    if (completeTodo != null) {
                        completeTodo.complete();
                        System.out.println("Todo completed.");
                    } else {
                        System.out.println("Todo not found.");
                    }
                    break;
                case "4":
                    System.out.print("Enter id to cancel: ");
                    int removeId = Integer.parseInt(scanner.nextLine());
                    if (todoList.remove(removeId)) {
                        System.out.println("Todo canceled.");
                    } else {
                        System.out.println("Todo not found.");
                    }
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        System.out.println("Goodbye!");
    }
}
