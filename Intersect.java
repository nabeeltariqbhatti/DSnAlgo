class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        
        int sizeListOne = 0;
        int sizeListTwo = 0;
        
        Node traverserOne = head1;
        Node traverserTwo = head2;
        
        while(traverserOne !=null){
            sizeListOne++;
            traverserOne = traverserOne.next;
        }
          while(traverserTwo !=null){
            sizeListTwo++;
            traverserTwo = traverserTwo.next;
        }
         
         traverserOne = head1;
         traverserTwo = head2;
        if(sizeListTwo>sizeListOne){
            while(sizeListTwo != sizeListOne){
                sizeListTwo--;
                traverserTwo = traverserTwo.next;  
            }
        }else{
             while(sizeListTwo != sizeListOne){
                sizeListOne--;
                traverserOne = traverserOne.next;
            }
        }
        
      
      
         while(traverserOne !=null && traverserTwo !=null ){
             if(traverserOne==traverserTwo ){
                 return traverserOne.data;
             }
              traverserOne = traverserOne.next;
               traverserTwo = traverserTwo.next;  
         }
         return -1;
        
        
	}
}
