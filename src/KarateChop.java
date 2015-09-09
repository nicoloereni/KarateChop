

public class KarateChop {
    public int chop(int valueToFind, int[] arrayOfValues) {


        int middlePosition = arrayOfValues.length/2;

        if(isArrayEmpty(arrayOfValues))
        {
            return -1;
        }

        if(arrayOfValues[middlePosition] == valueToFind){

            return middlePosition;
        }
        else
        {
            return chop(valueToFind, getArrayFromStartPositionToLastPosition(arrayOfValues, 0, middlePosition));
        }

    }

    private boolean isArrayEmpty(int[] arrayOfValues) {
        return arrayOfValues.length == 0;
    }

    private int[] getArrayFromStartPositionToLastPosition(int[] arrayToCut, int startPosition, int endPosition) {

        int[] result = new int[endPosition];

        for(int index = startPosition; index<endPosition; index++){
            result[index] = arrayToCut[index];
        }

        return result;
    }

}
