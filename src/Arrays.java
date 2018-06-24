public class Arrays {

    public static void main(String[] args) {
        Object [] arr1=new Object[5];
        int [] arr2=new int[5];
        String [] arr3=new String[5];

//        arr1=arr2 not possible , cas int is premitive data type.......
        arr1=arr3; // possible , cas String is a sub class of the object class.....
//        arr3=arr1  Object class is the super type of the string class
    }
}
