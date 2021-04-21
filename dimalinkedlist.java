import java.util.Scanner;

public class LinkedListdima {



		static class node { 
	        int data; 
	        node next;
	        node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        }  
	    } 
		
		
		
		

		public static void main(String[] args) {
			
			System.out.println("\n" + "**********");
	        
	        System.out.println ( "Main Menu");
	       
	        
	        System.out.println ( "\n1. At first create Linked List then will do the functions ");
	        
	        System.out.println("\n" + "**********");
	        System.out.println (" create Linked List ");
	        System.out.println (" Enter number of elements in Linked List = ");
	    	Scanner iab = new Scanner(System.in);
	    	int v =iab.nextInt();
			System.out.println (" Element Number 1 = ");
			Scanner rr = new Scanner(System.in);
			int r =rr.nextInt();
			
			node head = new node(r);
			node tail;
		    for (int d=2; d <= v; d++) {
		    	 System.out.println (" Element Number " + d + " = " );

		             Scanner ns = new Scanner(System.in);
		             int ss =ns.nextInt();
		    	
		    	node newnode = new node(ss);  
		    	newnode.next = head;
		    	head = newnode;
		    }
	    	
		    
		    while (true) {
		    System.out.println ( "\t \t  ** the functions **  \t \t ");
	        System.out.println ( "  \n2.insert "
	        		+ " \n3.Delete "
	        		+ " \n4.Count"
	        		+ " \n5.Max"
	        		+ " \n6.Min"
	        		+ " \n7.Display"
	        		+ " \n8.Search"
	        		+ " \n9.to exit");
	        
	        System.out.print ( "\nEnter Your Choice : ");
	        
	        Scanner mydata = new Scanner(System.in);
	        int choice = mydata.nextInt();
	        
	        switch (choice) {
	        
	            case 1:
	            	
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");

	        	    System.out.println("the list");
	        	    	node n = head;
	        	        while (n != null) { 
	        	            System.out.print(n.data + " "); 
	        	            n = n.next; 
	        	        } 
	        	    	System.out.println("\n");
	                	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	                System.out.println("\n");
	        		
	                break;
	                
	            case 2:

	                System.out.println ("insert");

	        	    while (true) {
	                System.out.println ( "\n1.Insert At The Beginning"
	    	        		+ " \n2.Insert At The end"
	    	        		+ " \n3.Insert At  Index x"
	    	        		+ " \n4.Insert After x"
	    	        		+ " \n5.Insert Before x");
	    	        System.out.print ( "\nEnter Your Choice : ");
	    	        
	    	        
	    	        
	    	        Scanner ddd = new Scanner(System.in);
	    	        int choicee = ddd.nextInt();
	    	        
	    	        
	    	        System.out.println("\n" + "**********");
	    	        
	    	        switch (choicee) {
	    	        case 1: 
		                System.out.println ("Insert At The Beginning");
		                
		                System.out.println (" Enter node value to insert at the beginning = ");
		            	Scanner rrd = new Scanner(System.in);
		            	int rd =rr.nextInt();
		            	
		            	node newhead = new node(rd);
		            	newhead.next = head;
		            	head = newhead;
		            	
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
		            	System.out.println("\n");

		            	System.out.println("the list");
		            	node j = head;
		                while (j != null) { 
		                    System.out.print(j.data + " "); 
		                    j = j.next; 
		                } 
		                System.out.println("\n");
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

		                break;
		                
	    	        case 2: 
	    	        	
	            	    System.out.print ("Insert At The end");
	            	    System.out.println (" Enter node value  = ");
	            		Scanner tt = new Scanner(System.in);
	            		int t =tt.nextInt();
	            		
	            	    node newtail = new node(t);
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	        	        System.out.println("\n");

	            	    System.out.println("the list");
	            	    	node q = head;
	            	    	node o = newtail;
	            	        while (q != null) { 
	            	            System.out.print(q.data + " "); 
	            	            q = q.next; 
	            	            
	            	        }
	            	        System.out.print(o.data + " ");
	            	        System.out.println("\n");
	                    	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

		                break;
		                
		                 
	    	        case 3: 
		                System.out.println ("Insert At  Index x");
		                
		                System.out.println (" Enter number of index x = ");
	            		Scanner nsd = new Scanner(System.in);
	            		int qq1 =nsd.nextInt();
	            		
	            		System.out.println (" Enter node value  = ");
	            		Scanner ds = new Scanner(System.in);
	            		int dss =ds.nextInt();
	            		
	            		node temp = head;
	            		for (int z = 1; z <= qq1-1 ; z++) 
	            			temp = temp.next;
	            			node aft = temp.next;
	            			node qqq = new node(dss);
	            			qqq.next = aft;
	            			temp.next = qqq;
	            		
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
		            	System.out.println("\n");

		            	System.out.println("the list");
		            	node l = head;
		                while (l != null) { 
		                    System.out.print(l.data + " "); 
		                    l = l.next; 
		                } 
		                System.out.println("\n");
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

		                break;
		                
		                 
	    	        case 4: 
		                System.out.println ("Insert After x");

		                System.out.println (" Enter number of index x = ");
	            		Scanner nza = new Scanner(System.in);
	            		int zz1 =nza.nextInt();
	            		
	            		System.out.println (" Enter node value  = ");
	            		Scanner dsd = new Scanner(System.in);
	            		int dssd =dsd.nextInt();
	            		
	            		node temp2 = head;
	            		for (int a = 1; a <= zz1 ; a++) 
	            			temp2 = temp2.next;
	            			node aft2 = temp2.next;
	            			node zzz = new node(dssd);
	            			zzz.next = aft2;
	            			temp2.next = zzz;
	            		
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
		            	System.out.println("\n");

		            	System.out.println("the list");
		            	node la = head;
		                while (la != null) { 
		                    System.out.print(la.data + " "); 
		                    la = la.next; 
		                } 
		                System.out.println("\n");
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

		                break;
		                
	    	        case 5: 
		                System.out.println ("Insert Before x");

		                System.out.println (" Enter number of index x = ");
	            		Scanner daz = new Scanner(System.in);
	            		int zd1 =daz.nextInt();
	            		
	            		System.out.println (" Enter node value  = ");
	            		Scanner sds = new Scanner(System.in);
	            		int sdds =sds.nextInt();
	            		
	            		node temp3 = head;
	            		for (int a = 1; a <= zd1 -2  ; a++) 
	            			temp3 = temp3.next;
	            			node aft3 = temp3.next;
	            			node xxx = new node(sdds);
	            			xxx.next = aft3;
	            			temp3.next = xxx;
	            		
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
		            	System.out.println("\n");

		            	System.out.println("the list");
		            	node da = head;
		                while (da != null) { 
		                    System.out.print(da.data + " "); 
		                    da = da.next; 
		                } 
		                System.out.println("\n");
		            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

		                break;
	    	        
	    	        }
	    	        System.out.println("Enter 111 for return to insert");
	    	        System.out.println("Enter 99 for return to the functions");
	    	        int exit = ddd.nextInt();
	    	        if (exit == 99) {
	    	            break;
	    	        }
	    	    }
	                
	                break;
	                
	                
	            case 3: 
	                System.out.print ("Delete ");
	                
	                
	                while (true) {
	                    System.out.println ( "\n1. Delete first (Delete head)"
	        	        		+ "  \n2. Delete last (Delete tail)"
	        	        		+ " \n3. Delete node at index k"
	        	        		+ " \n4. Delete node after node x"
	        	        		+ " \n5. Delete node before node x");
	        	        System.out.print ( "\nEnter Your Choice : ");
	        	        
	        	        
	        	        
	        	        Scanner chd = new Scanner(System.in);
	        	        int choicede = chd.nextInt();
	        	        
	        	        
	        	        System.out.println("\n" + "**********");
	        	        
	        	        switch (choicede) {
	        	        case 1: 
	    	                System.out.println ("Delete first (Delete head)");
	    	                
	    	                node tempde = head;
	    	                head = head.next;
	    	                
	    	                
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	    	            	System.out.println("\n");

	    	            	System.out.println("the list");
	    	            	node j = head;
	    	                while (j != null) { 
	    	                    System.out.print(j.data + " "); 
	    	                    j = j.next; 
	    	                } 
	    	                System.out.println("\n");
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");


	    	                break;
	    	                
	        	        case 2: 
	        	        	
	                	    System.out.print ("Delete last (Delete tail)");
	                	   
	                	    node temp9 = head;
	                	    while(temp9.next.next != null) {
	                	    	temp9 = temp9.next;
	                	    }
	                	    temp9.next = null;

	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	    	            	System.out.println("\n");

	    	            	System.out.println("the list");
	    	            	node de = head;
	    	                while (de != null) { 
	    	                    System.out.print(de.data + " "); 
	    	                    de = de.next; 
	    	                } 
	    	                System.out.println("\n");
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	    	                break;
	    	                
	    	                   
	        	        case 3: 
	    	                System.out.println ("Delete node at index k");
	    	                
	    	                System.out.println (" Enter number of index k = ");
	                		Scanner dk = new Scanner(System.in);
	                		int dk1 =dk.nextInt();
	                		
	                		node temp = head;
	                		for (int z = 1; z <= dk1-1 ; z++) 
	                			temp = temp.next;
	                			node delk = temp.next;
	                			node aftk = delk.next;
	                			temp.next = aftk;
	                		
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	    	            	System.out.println("\n");

	    	            	System.out.println("the list");
	    	            	node l = head;
	    	                while (l != null) { 
	    	                    System.out.print(l.data + " "); 
	    	                    l = l.next; 
	    	                } 
	    	                System.out.println("\n");
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	    	                break;
	    	                
	    	                 
	        	        case 4: 
	    	                System.out.println ("Delete node after node x");

	    	                System.out.println (" Enter number of index x = ");
	                		Scanner dza = new Scanner(System.in);
	                		int zz1 =dza.nextInt();
	                		
	                		node temp2 = head;
	                		for (int a = 1; a <= zz1 ; a++) 
	                			temp2 = temp2.next;
	                		    node delk2 = temp2.next;
	            			    node aftk2 = delk2.next;
	            			    temp2.next = aftk2;

	            			    
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	    	            	System.out.println("\n");

	    	            	System.out.println("the list");
	    	            	node la = head;
	    	                while (la != null) { 
	    	                    System.out.print(la.data + " "); 
	    	                    la = la.next; 
	    	                } 
	    	                System.out.println("\n");
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	    	                break;
	    	                
	        	        case 5: 
	    	                System.out.println ("Delete node before node x");

	    	                System.out.println (" Enter number of index x = ");
	                		Scanner daz = new Scanner(System.in);
	                		int zd1 =daz.nextInt();
	                		
	                		node temp3 = head;
	                		for (int a = 1; a < zd1-1  ; a++) 
	                			temp3 = temp3.next;
	            		        node delk3 = temp3.next;
	        			        node aftk3 = delk3.next;
	        			        temp3.next = aftk3;
	                		
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	    	            	System.out.println("\n");

	    	            	System.out.println("the list");
	    	            	node da = head;
	    	                while (da != null) { 
	    	                    System.out.print(da.data + " "); 
	    	                    da = da.next; 
	    	                } 
	    	                System.out.println("\n");
	    	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	    	                break;
	        	        
	        	        }
	        	        System.out.println("Enter 111 for return to Delete");
	        	        System.out.println("Enter 99 for return to the functions");
	        	        int exit = chd.nextInt();
	        	        if (exit == 99) {
	        	            break;
	        	        }
	        	    }
	                   
	                break;
	                
	                
	            case 4:
	                System.out.println ("** Count **");
	                int count = 1;
	                node tempc = head;
	                while(tempc.next != null) {
	                	count ++;
	                	tempc = tempc.next;
	                }
	                
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");
	            	System.out.println ("return number of nodes");
	            	
	                System.out.println ("Count = " + count);
	                
	                System.out.println("\n");
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	                break;
	                 
	                
	            case 5:
	            	System.out.println ("** Max **");
	            	
	            	
	            	node fimx = head;
	            	int max = head.data;
	            	while (fimx != null) {
	            		
	            		if(max < fimx.data) {
	            			max = fimx.data;
	            		}
	            		
	            		fimx = fimx.next;
	            		
	            	}
	            	
	        		System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");
	            	System.out.println ("return max value stored in data filed");
	            	
	                System.out.println ("Max = " + max);
	                
	                System.out.println("\n");
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	            	 break;

	            case 6:
	            	
	            	System.out.println ("** Min **");
	            	

	            	node fimn = head;
	            	int min = head.data;
	            	while (fimn != null) {
	            		
	            		if(min > fimn.data) {
	            			min = fimn.data;
	            		}
	            		
	            		fimn = fimn.next;
	            		
	            	}
	            	
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");
	            	System.out.println ("return min value stored in data filed");
	            	
	                System.out.println ("Min = " + min);
	                
	                System.out.println("\n");
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	            	 break;
	            	 
	            case 7:
	            	
	            	System.out.println ("** Display **");
	            	
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");
	            	System.out.println ("display all elements in list");
	            	System.out.println("the list");
	            	node da = head;
	                while (da != null) { 
	                    System.out.print(da.data + " "); 
	                    da = da.next; 
	                } 
	                System.out.println("\n");
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	            	 break;
	            	 
	            	 
	            case 8:
	            	
	            	System.out.println ("** Search **");
	            	System.out.println ("search for node contains k value");

	            	System.out.println (" Enter k = ");
	            	Scanner fik = new Scanner(System.in);
	            	int fk =fik.nextInt();
	            	
	            	int ind = 0;
	            	node temp = head;
	            	while(temp.data != fk) {
	            		ind ++;
	            		temp = temp.next;
	            		if(temp == null) {
	            			System.out.println (" not faund ");
	            		}
	            	}
	            	
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");
	            	System.out.println("\n");
	            	
	                System.out.println ("k is in index = " + ind);
	                
	                System.out.println("\n");
	            	System.out.println("\n" + "**********" + "||||||||||||"  + "**********");

	            	break;
	            	
	            	
	            case 9:
	            	 
	           	 System.out.println("\n \t  ** Thanks for your time ** ");

	            	break;
	            	 
	            default:
	                System.out.println("Error this opertaion not found");
	        
	        }
	        System.out.println("Enter 1 for contenue");
	        System.out.println("Enter 99 for close program");
	        int exit = mydata.nextInt();
	        if (exit == 99) {
	            break;
	        }
	    }
	       
		   
	    }
		
	}
	    
