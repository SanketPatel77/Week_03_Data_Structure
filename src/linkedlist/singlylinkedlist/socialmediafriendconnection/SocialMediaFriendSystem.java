package linkedlist.singlylinkedlist.socialmediafriendconnection;

public class SocialMediaFriendSystem {
    public static void main(String[] args) {
        FriendList friendList = new FriendList();

        // Adding users
        friendList.addUser(1, "Sanket", 25);
        friendList.addUser(2, "Yuvraj", 27);
        friendList.addUser(3, "Uday", 22);
        friendList.addUser(4, "Ankit", 30);

        // display users
        friendList.displayUsers();

        // Adding friendships
        friendList.addFriend(1, 2);
        friendList.addFriend(1, 3);
        friendList.addFriend(2,3);
        friendList.addFriend(2, 4);

        // Display friends
        friendList.displayFriends(1);

        // Find mutual friends
        friendList.findMutualFriends(1, 2);

        // Remove a friendship
        friendList.removeFriend(1, 2);
        friendList.displayFriends(1);

        // Search user
        friendList.searchUser("uday");
        friendList.searchUser("4");

        // Count friends
        friendList.countFriends();


    }
}
