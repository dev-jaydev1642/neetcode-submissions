class TimeMap {
    private Map<String, List<Timevalue>> map;

    private static class Timevalue {
        String value;
        int timestamp;

        public Timevalue(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList()).add(new Timevalue(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Timevalue> list = map.get(key);

        return binarySearch(list, timestamp);
    }

    public String binarySearch(List<Timevalue> list, int timestamp) {
        int l = 0, r = list.size() - 1;
        String result = "";

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).timestamp == timestamp) return list.get(mid).value;
            else if (list.get(mid).timestamp < timestamp) {
                result = list.get(mid).value;
                l = mid + 1;
            } else r = mid - 1;
        }

        return result;
    }
}
