package structural.decorator;

public class Decorator implements Widget {

    private Widget widget;

    Decorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw() {
        widget.draw();
    }
}
