

/**
 *
 * @author NeelS
 */
public class classproblem {
    public static void main(String[] args) {
        PsychiatristObject Dorty = new PsychiatristObject();
        MoodyObject a = new HappyObject();
        MoodyObject b = new SadObject();
        MoodyObject[] clients = {a, b};
        for(MoodyObject i: clients){
            Dorty.examine(i);
            i.queryMood();
            System.out.println("");
            i.expressFeelings();
            Dorty.observe(i);
            System.out.println("");
        }
    }
}


abstract class MoodyObject{
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood(){
        System.out.println("I feel "+getMood()+" today");
    }
}


class SadObject extends MoodyObject{
    
    protected String getMood(){
        return "sad";
    }
    protected void expressFeelings(){
        System.out.println(" 'wah' 'boo' 'hoo' 'weep' 'sob' 'weep' ");
    }
    public String toString(){
        return String.format("Subject cries a lot");
    }
}
class HappyObject extends MoodyObject {
    protected String getMood(){
        return "happy";
    }
    public void expressFeelings(){
        System.out.println("hehehe...hahaha...HAHAHAHAHA");
    }
    public String toString(){
        return String.format("Subject laughs a lot");
    }    
}

class PsychiatristObject{
    public void observe(MoodyObject a){
        System.out.println("Observation: "+a.toString());
    }
    public void examine(MoodyObject a){
        System.out.println("How are you feeling today?");
    }
}
