package callbackfunction;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        hello("John", "Maria", value -> {
            System.out.println("no lastName provided for " + value);
        });

        hello("John",null, value -> {
            System.out.println("no lastName provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> consumer) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            consumer.accept(firstName);
        }
    }


    /*//Javascript callback function
    //declaring function
    function hello(firstName, lastName, callback) {
        console.log(firstName);
        if (lastname) {
            console.log(lastName);
        } else {
            callback();
        }
    }

    //Calling function
    hello("Amol", null, function(){
       console.log("no lastName provided");
    });*/
}
