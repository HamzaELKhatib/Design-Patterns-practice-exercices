package com.hamzakh.abstractfactory.abstractshapecolorfactory;

public interface Color {

    String fill();
}

class Red implements Color {
    @Override
    public String fill() {
        return "Filling with Red color";
    }
}

class Green implements Color {
    @Override
    public String fill() {
        return "Filling with Green color";
    }
}

class Blue implements Color {
    @Override
    public String fill() {
        return "Filling with Blue color";
    }
}
