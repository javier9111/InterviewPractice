package leetCodeInterviewPrep.medium;

import java.util.Stack;

/***
 * We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
 */
public class AsteroidCollision {


    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] asteroids2 = {8,-8};
        int[] asteroids3 = {10,2,-5};

        for(int i: asteroidCollision(asteroids)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: asteroidCollision(asteroids2)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: asteroidCollision(asteroids3)){
            System.out.print(i + " ");
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();

        for(int i= 0; i<asteroids.length; i++){

            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }else{
                if(stack.peek() > 0 && asteroids[i] < 0){
                    if(stack.peek() == Math.abs(asteroids[i])){
                        stack.pop();
                    }else if(stack.peek() < Math.abs(asteroids[i])){
                        stack.pop();
                        i--;
                    }
                }else{
                    stack.push(asteroids[i]);
                }
            }
        }


        int[] result = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;


    }
}
