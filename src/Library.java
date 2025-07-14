public class Library {
    private MyRecords[] records;
    private int size = 0;

    public Library(int cap) {
        records = new MyRecords[cap];
        size = 0;
    }

    //Store/add new record in ascending order based on the year attribute.
    public void insertMethod(MyRecords record) {
        //first we check if the library is full.If it is, then we display the below message
        if (size == records.length) {
            System.out.println("Full to capacity. cant add more record");
            return;
        }
        //if not, we look for the position to insert our new record at the correct index that doesnt mess up the order.
        int index = 0;
        while (index < size && records[index].getYear() < record.getYear())
            index++;
        //move the existing record to the new position. one by one from the end
        for (int i = size - 1; i >= index; i--)
            records[i + 1] = records[i];
        records[index] = record;//our new record
        size++;
    }
//returns the current size of the library
    public int size() {
        return size;
    }

    public MyRecords find(String title) {
        for (int i = 0; i < size; i++) {
            if (records[i].getTitle().equals(title)) {
                return records[i];
            }
        }
        return null; // Return null if the record is not found
    }
        public boolean remove( int index){//represents the position of the record to be removed in the records array.
            if (index >= 0 && index < size) {
                // Shift records to fill the gap
                for (int i = index; i < size - 1; i++) {
                    records[i] = records[i + 1];
                }
                size--;
                return true;
            }
            return false;
        }


    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(records[i]);
        }
    }
}

