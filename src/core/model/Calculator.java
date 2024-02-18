package core.model;

public interface Calculator {
    Calculator add(Calculator other);
    Calculator subtract(Calculator other);
    Calculator multiply(Calculator other);
    Calculator divide(Calculator other);
}
