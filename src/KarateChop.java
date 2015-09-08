

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
            return chop(valueToFind, getArrayCut(arrayOfValues, middlePosition));
        }

    }

    private boolean isArrayEmpty(int[] arrayOfValues) {
        return arrayOfValues.length == 0;
    }

    private int[] getArrayCut(int[] arrayToCut, int lastElement) {

        int[] result = new int[lastElement];

        for(int index = 0; index<lastElement; index++){
            result[index] = arrayToCut[index];
        }

        return result;
    }
}
