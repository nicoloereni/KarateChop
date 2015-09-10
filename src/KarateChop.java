

public class KarateChop {
    public int chop(int valueToFind, int[] arrayOfValues) {

        int middlePosition = arrayOfValues.length / 2;

        if (isArrayEmpty(arrayOfValues)) {
            return -1;
        }
        if (arrayOfValues[middlePosition] == valueToFind) {
            return middlePosition;
        } else if (isArrayGraterThanOne(arrayOfValues)) {
            return getPositionWithValueFromArray(valueToFind, arrayOfValues);
        }
        return -1;
    }

    private Integer getPositionWithValueFromArray(int valueToFind, int[] arrayOfValues) {
        int middlePosition = arrayOfValues.length / 2;
        if (isMiddlePositionValueGreaterThanValueToFind(arrayOfValues[middlePosition], valueToFind))
        {
            return chop(valueToFind, getArrayFromStartPositionToLastPosition(arrayOfValues, 0, middlePosition));
        } else if (!isMiddlePositionValueGreaterThanValueToFind(arrayOfValues[middlePosition], valueToFind)) {
            return chop(valueToFind, getArrayFromStartPositionToLastPosition(arrayOfValues, middlePosition, arrayOfValues.length)) + middlePosition;
        }
        return null;
    }

    private boolean isMiddlePositionValueGreaterThanValueToFind(int middlePositionValue, int valueToFind) {
        return middlePositionValue > valueToFind;
    }

    private boolean isArrayGraterThanOne(int[] arrayOfValues) {
        return arrayOfValues.length >1;
    }

    private boolean isArrayEmpty(int[] arrayOfValues) {
        return arrayOfValues.length == 0;
    }

    private int[] getArrayFromStartPositionToLastPosition(int[] arrayToCut, int startPosition, int endPosition) {
        int[] result = new int[endPosition - startPosition];
        int newIndex = 0;
        for(int index = startPosition; index<endPosition; index++)
        {
            result[newIndex++] = arrayToCut[index];
        }
        return result;
    }
}
