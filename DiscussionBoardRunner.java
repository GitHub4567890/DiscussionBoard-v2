import java.util.Scanner;
public class DiscussionBoardRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NewsFeed politicalDumpster = new NewsFeed();
        System.out.print("Post test 1: ");
        System.out.print("Enter username: ");
        String username = scan.nextLine();
        System.out.print("Enter post: ");
        String message = scan.nextLine();
        MessagePost one =new MessagePost(username, message);
        politicalDumpster.addPost(one);

        System.out.print("Post test 2: ");
        System.out.print("Enter username: ");
        username = scan.nextLine();
        System.out.print("Enter post: ");
        message = scan.nextLine();
        MessagePost two =new MessagePost(username, message);
        politicalDumpster.addPost(two);

        System.out.print("Post test 3 (photo post): ");
        System.out.print("Enter username: ");
        username = scan.nextLine();
        System.out.print("Enter filename: ");
        String file = scan.nextLine();
        System.out.print("Enter post: ");
        message = scan.nextLine();
        PhotoPost photo =new PhotoPost(username, file, message);
        politicalDumpster.addPost(photo);

        politicalDumpster.show();

    }
}