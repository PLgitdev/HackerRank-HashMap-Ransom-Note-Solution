 static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : note) {
            if(map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, value += 1);
            }
            else map.put(i, 1);
        }
        for(String i : magazine) {
            if(map.containsKey(i)) {
                int value = map.get(i);
                if(map.get(i) == 1) {
                    map.remove(i);
                }
                else map.put(i, value -= 1);
            }
        }
        String result = map.isEmpty() ? "Yes" : "No";
        System.out.println(result);
    }
}
