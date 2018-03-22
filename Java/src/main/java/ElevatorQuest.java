

import java.util.ArrayList;

/**
 * ElevatorQuest
 */


public class ElevatorQuest {

    void selfTest() {
            int [] A = {40,40,100,80,20};
            int [] B = {3,3,2,2,3};
            int capacityX = 5,maxFloor=3, weightLimitY = 200;
            eleProb(A, B, maxFloor, capacityX, weightLimitY);
    }

    public static int eleProb(int[] A, int[] B,int maxFloor, int capacityX, int weightLimitY) {

        Elevator elevator = new Elevator(capacityX, weightLimitY);
        int passengerNum = A.length;
        int i=0;
        while(passengerNum!=0)
        {
            elevator.init();
            while((passengerNum!=0) && (elevator.isFull(A[i])==false))
            { 
                elevator.addPassenger(A[i],B[i]);
                i++;
                passengerNum--;
            }
            elevator.goUp();
            elevator.goDown();
        }
        System.out.println(elevator.stopCount);
        return elevator.stopCount;
    }
} 

    /**
     * elevator
     */
 class Elevator {
        int capacityMax,weightLimitMax,stopCount;
        int capacityNow,weightLimitNow;
        ArrayList<Integer> stops = new ArrayList<Integer>();
        
        Elevator (int capacity, int weightLimit) {
            capacityMax = capacity;
            weightLimitMax = weightLimit;
        }

        boolean isFull(int A)
        {
            boolean fullFlag = false;
            if(capacityNow-1<0||weightLimitNow-A<0)
            fullFlag = true;
            return fullFlag;
        }

        void init() {
            capacityNow = capacityMax;
            weightLimitNow = weightLimitMax;
        }

        void addPassenger(int A, int B) {
            if(stops.indexOf(new Integer(B))==-1)
            {
                stops.add(new Integer(B));
            }
            capacityNow--;
            weightLimitNow-=A;
        }

        void goUp() {
            stopCount+=stops.size(); 
        }
    
        void goDown(){
            stopCount++;
            stops.clear();
        }

    }

        



  
