import java.util.*;
//Tashfiq Akhand
public class AddressBook {
	
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo BI) {
		if (BI != null) {
			this.buddyInfo.add(BI);
		}
	}
	
	public BuddyInfo removeBuddy(int i) {
		if(i >= 0 && i < this.buddyInfo.size()) {
			return this.buddyInfo.remove(i);
		}
		return null;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tash", "Carleton", "613-737-1111");
		AddressBook AB = new AddressBook();
		AB.addBuddy(buddy);
		AB.removeBuddy(0);

	}

}
