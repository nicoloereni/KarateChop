

public class KarateChop {

    public int chop(int valueToFind, ChopArray arrayOfValues) {

        if (!arrayOfValues.isArrayEmpty() && arrayOfValues.getMiddlePositionValue() == valueToFind) {
            return arrayOfValues.getMiddlePosition();
        }
        else if (arrayOfValues.isArrayGraterThanOne()) {
            return getPositionWithValueFromArray(valueToFind, arrayOfValues);
        }

        return -1;
    }

    private int getPositionWithValueFromArray(int valueToFind, ChopArray arrayOfValues) {

        if (arrayOfValues.isMiddlePositionValueGreaterThan(valueToFind))
        {
            return chop(valueToFind, arrayOfValues.getArrayZeroToMiddle());

        } else
        {
            int valuePositionRightSide = chop(valueToFind, arrayOfValues.getArrayMiddleToEnd());
            return valuePositionRightSide == -1 ? -1 : valuePositionRightSide + arrayOfValues.getMiddlePosition();
        }
    }
}
