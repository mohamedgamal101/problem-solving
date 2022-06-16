import java.util.HashSet;
import java.util.Set;

/*contains duplicate*/
/*Runtime: 6 ms, faster than 95.74% of Java online submissions for Contains Duplicate*/
class containDuplicate {
    public boolean containsDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int num : numbers){
            if(set.contains(num))
                return true;

            set.add(num);
        }
        return false;
    }
}
