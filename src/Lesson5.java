public class Lesson5 {
    public static void main(String args[]){
        //Hard typing
        //Declare a type for our variable and that type has limitations
        //e.g. int only store integers without decimals, doesn't allow numbers.

        //Soft typing
        //When you declare a variable, you don't necessarily know what type it's going to be.
        var myVariable = 1;
        var myWords = "My words";

        //Hard typing ensures that:
        //1. You're not pushing code that you're not sure of / don't know what it does, into production
        //2. If you do know what type you need, use that type
        //3. It's a nightmare to figure out what someone planned to use that variable for when you soft type.
    }
}
