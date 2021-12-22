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
    public BusJourney addPeople(BusJourney node,int data){//5, 10 ,6,20
        Bus newPeople = new Bus(data);
        if(node.startPoint==null){ //startpoint=5,10
            node.startPoint=newPeople; //newpeople -5
        }else{
            Bus temp = node.startPoint;
            while (temp.nextStop!=null){
                temp=temp.nextStop;
            }
            temp.nextStop=newPeople;
        }
        return node;
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

    public BusJourney delete(BusJourney node,int delete){//9
            //5,10,9,6,1,7,

        Bus temp = node.startPoint;
        Bus tempPrev= null;
        //5.10,9,6
        while(temp!=null && temp.data!=delete){ // 5!=9, 10!9, 9==9
            tempPrev=temp; // 5,10
            temp=temp.nextStop; // 10,9
        }

        if(temp!=null){ //YES
           //tempPrev =5,10-6null
            //temp =5,10,9
            tempPrev.nextStop=temp.nextStop;//6
        }
    return node;
    }

    //[1,2,10,3,5,6,7,8]


    public void display(BusJourney node){

        Bus temp=node.startPoint;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.nextStop;
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
        b.addPeople(b,5);
        b.addPeople(b,10);
        b.delete(b,10);
        b.addPeople(b,6);
        b.addPeople(b,20);
        b.addPeople(b,40);
        b.display(b);
    }
}
