package CollectionsCheck;

import java.util.Arrays;

public class ComparatorAndComparable {
    public void withoutComparator(){
        int[] arr = {1,3,4,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void useComparator(){
        Car[] arr = new Car[3];
        arr[0] = new Car("SUV","Petrol");
        arr[1] = new Car("Sedan","Diesel");
        arr[2] = new Car("HatchBack","CNG");
        Arrays.sort(arr,(Car c1,Car c2) -> c1.name.compareTo(c2.name));
        Arrays.stream(arr).forEach(car -> System.out.println(car.name));
    }

    public void useComparable(){
        CarNew[] arr = new CarNew[3];
        arr[0] = new CarNew("SUV","Petrol");
        arr[1] = new CarNew("Sedan","Diesel");
        arr[2] = new CarNew("HatchBack","CNG");
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(car -> System.out.println(car.name));

    }

    private static class CarNew implements Comparable<CarNew>{
        public String name;
        public String type;

        public CarNew(String name,String type){
            this.name = name;
            this.type = type;
        }

        @Override
        public int compareTo(CarNew o) {
            return this.name.compareTo(o.name);
        }
    }

    private static class Car{
        public String name;
        public String type;

        public Car(String name,String type){
            this.name = name;
            this.type = type;
        }
    }
}
