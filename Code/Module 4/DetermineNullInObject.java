public class DetermineNullInObject {
    public int countNulls(Object[] array ){
        return countNulls(array,0);
    }

    public int countNulls(Object[] array, int startingPosition){
        int counter = 0;
        for(int i = startingPosition; i < array.length; i++){
            if(array[i] == null){
                counter++;
            }
        }
        return counter;
    }

}
