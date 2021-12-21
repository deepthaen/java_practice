package core_Java.collections.linkedlist;

public class BusJourney {
    //[1,20,22,8,12]
    Bus startPoint=null;
    Bus endPoint=null;
    class Bus{
        Bus nextStop;
        int data;
        Bus(int data){//5
            this.data= data;//data=5
            nextStop=null;
        }
    }

   //10-13-3
    // BUS - Conductor (Head point in bangalore) - issue tickets and find count (update in box) - null

    // 5, 10, 6, 20
    public void addPeople(int data){//5, 10 ,6,20
        Bus newPeople = new Bus(data); //5,10,6,20 - null
        if(startPoint==null){ //startpoint=5,10
            startPoint=newPeople; //newpeople -5
            endPoint= newPeople; //newpeopel=5
        }else{
            startPoint.nextStop=newPeople;
            endPoint=newPeople;
        }
    }

    public void delete(int delete){//6
        //5,6,20,9, 7
        Bus temp = startPoint;
        while(temp.nextStop!=null && temp.data!=delete){ //!null and 5!=9,6!9,20!=9
            temp=temp.nextStop;//5
        }
        if(temp.nextStop!=null) {
            temp.nextStop = temp.nextStop.nextStop; //7
            //9=7
            //6=20, 5,20,9,7
        }
    }

    public void delete(BusJourney deleteNode,int delete){//9
            //5,10,9,6
        Bus temp = deleteNode.startPoint; //5
        Bus tempPrev =null;

        while (temp!=null && temp.data!=delete){
            tempPrev=temp;
            temp =temp.nextStop;
        }

        if(temp!=null){
            tempPrev.nextStop=temp.nextStop;
        }




    }

    /**
     * Add
     * delete
     * Display
     * length
     * get
     * delete first
     * delete last
     * reverse
     * singley lll
     * double ll
     *
     */


    /**
     * startpoint =null
     * end=null
     *
     *
     * startpoint = bng
     * end=bng
     * dat =5
     *
     * startpoint.next=ram
     * bng.next=ram
     * end = ram
     * dat=20
     *
     * startpoint.next=mandya
     * ram.next= mandya
     * end=mandya
     * dat=25
     *
     *
     *
     *
     *
     */
    /**
     * 1st case
     *  Adding 5
     *  startingpoint =null
     *  endpoint =null
     *  BUs newpeople = new Bus(5)
     *      this.dat =5
     *   if(startpoint==null)
     *      startpoint= newpoeple
     *      endpoint=newpeople
     *
     * 2nd case
     *  adding 20
     *      startingpoint =5
     *      endpoint =5
     *  Bus newpeeple = new Bus(20)
     *      if(startpoint==null) -- NO
     *
     *      else{
     *          startpoint.nextstop=20;
     *          endpoint = newpeople
     *      }
     *
     */


    public static void main(String[] args) {
        BusJourney b = new BusJourney();
        b.addPeople(5);
        b.addPeople(10);
        b.delete(b,10);
        b.addPeople(6);
        b.addPeople(20);
    }
}
