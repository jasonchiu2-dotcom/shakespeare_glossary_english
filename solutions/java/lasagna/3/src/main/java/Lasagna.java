public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    private int expectedMinutesInOven()
    {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    private int remainingMinutesInOven(int remaining)
    {
        return 40 - remaining;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    private int preparationTimeInMinutes(int layers)
    {
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    private int totalTimeInMinutes(int layers, int time)
    {
        return preparationTimeInMinutes(layers) + time;
    }

}

