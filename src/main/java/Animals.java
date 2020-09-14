

/**
 *
 * @author A
 */
public class Animals {
    
   public void AnimalSound(){
       System.out.println("--Animals' Sounds-- ");
   }
}
     class Pigs extends Animals{
        public void AnimalSound(){
       System.out.println("pigs sounds: wee wee....");
   }
   }
   
   class Dogs extends Animals{
       public void AnimalSound(){
            System.out.println("dogs barks: bah bah....");
       }
   }

class Cats extends Animals{
    public void AnimalSound(){
        System.out.print("cats sound: mew mew.....");
    }
}


