class FoodRatings {
    private Map<String, String> foodCuisineMap = new HashMap<>();
    private Map<String, Integer> foodRatingMap = new HashMap<>();
    private Map<String, TreeSet<Pair>> cuisineToPairs = new HashMap<>();
    class Pair implements Comparable<Pair>{
        String food;
        int rating;
        Pair(String food, int rating){
            this.food = food;
            this.rating = rating;
        }
        @Override
        public int compareTo(Pair o) {
            if (this.rating != o.rating) {
                return Integer.compare(o.rating, this.rating); // higher rating first
            }
            return this.food.compareTo(o.food);
        }

    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String f = foods[i];
            String c = cuisines[i];
            int r = ratings[i];
            foodCuisineMap.put(f, c);
            foodRatingMap.put(f, r);

            cuisineToPairs.computeIfAbsent(c, k -> new TreeSet<>()).add(new Pair(f, r));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisineMap.get(food);
        if (cuisine == null) return;
        int oldRating = foodRatingMap.getOrDefault(food, newRating);
        // remove old pair
        TreeSet<Pair> set = cuisineToPairs.get(cuisine);
        if (set != null) {
            set.remove(new Pair(food, oldRating));
            set.add(new Pair(food, newRating));
        }
        foodRatingMap.put(food, newRating);


    }
    
    public String highestRated(String cuisine) {
        TreeSet<Pair> set = cuisineToPairs.get(cuisine);
        if (set == null || set.isEmpty()) return "";
        return set.first().food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */