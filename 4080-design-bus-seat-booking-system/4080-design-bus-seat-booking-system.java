class BusBooking {
    private final Map<String, Integer> map = new HashMap<>();
    private int total = 0;

    public BusBooking(int n) {
        
    }
    
    public void toggle(String seat) {
        if (map.containsKey(seat)) {
            total -= map.remove(seat);  // free it: only its own cost leaves
            return;
        }

        char label = seat.charAt(0);
        String middle = (label == 'A' ? "B" : label == 'D' ? "C" : "") + seat.substring(1);
        map.put(seat, map.containsKey(middle) ? 3 : 1);
        total += map.get(seat);
    }
    
    public int getTotalTime() {
        return total;
    }
    
    public int getMinTime() {
        return map.size();
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */