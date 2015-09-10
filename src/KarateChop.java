

public class KarateChop {

    public int chop(int valueToFind, int[] arrayOfValues) {

        int middlePosition = arrayOfValues.length / 2;

        if (!isArrayEmpty(arrayOfValues) && arrayOfValues[middlePosition] == valueToFind) {
            return middlePosition;
        }
        else if (isArrayGraterThanOne(arrayOfValues)) {
            return getPositionWithValueFromArray(valueToFind, arrayOfValues);
        }

        return -1;
    }

    private int getPositionWithValueFromArray(int valueToFind, int[] arrayOfValues) {

        int middlePosition = arrayOfValues.length / 2;
        int middlePositionValue = arrayOfValues[middlePosition];

        if (isMiddlePositionValueGreaterThanValueToFind(middlePositionValue, valueToFind))
        {
            return chop(valueToFind, getArrayFromStartPositionToLastPosition(arrayOfValues, 0, middlePosition));

        } else if (!isMiddlePositionValueGreaterThanValueToFind(middlePositionValue, valueToFind))
        {

            int valuePositionRightSide = chop(valueToFind, getArrayFromStartPositionToLastPosition(arrayOfValues, middlePosition, arrayOfValues.length));
            return valuePositionRightSide == -1 ? -1 : valuePositionRightSide + middlePosition;
        }
        return -1;
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
