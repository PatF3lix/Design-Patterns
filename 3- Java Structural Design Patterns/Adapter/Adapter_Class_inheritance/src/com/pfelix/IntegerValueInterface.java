package com.pfelix;

public interface IntegerValueInterface {
    int getInteger();
}

class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() {
        return 5;
    }
}
//Works with multiple inheritance, Does not work with Java
class ClassAdapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

/*
Works with composition, but can only have adaptee
Does have a workaround with interfaces.
*/
class ObjectAdapter {
    private final IntegerValueInterface myInt;

    public ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}


