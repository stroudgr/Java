/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horse;

/**
 *
 * @author StroudFamily2013IMac
 */
public class Pegasus {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
public class Pegasus extends Pegasus implements Flyer, Mythical {
    public static void main(String[] args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
}
