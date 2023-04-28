package TutorialCourseOOP;//This class is created to get familiar with static access modifier

import java.util.ArrayList;

public class Friend {

    static int numberOfFriends = 0;
    static ArrayList<Friend> friendsList = new ArrayList<>();
    String name, nick;
    int age;

    Friend(String name, int age){
        this.name = name;
        this.age = age;
        //Create nick
        this.nick = createNick(this);

        //Add one friend as the instance is called and append it to the friends list
        numberOfFriends++;
        friendsList.add(this);

        System.out.println("You are friend number: " + numberOfFriends + ". Your name is: " + name
                            + " and you are " + age + " years old. Nick proposal: " + nick);
    }

    static String createNick(Friend friend){
        String nick = friend.name.substring(0,3) + friend.age;

        return nick;
    }

    static void displayFriends(){
        for(int i=0; i<numberOfFriends; i++){
            System.out.println("TutorialCourseOOP.Friend number: " + (i+1));
            System.out.println("Name: " + friendsList.get(i).name);
            System.out.println("Age: " + friendsList.get(i).age);
            System.out.println("Nick: " + friendsList.get(i).nick);
            System.out.println();

        }

    }
}
