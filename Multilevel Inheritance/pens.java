class Pen {
    String color = "Blue";

    void write() {
        System.out.println("Writing with a pen.");
    }

    void refill() {
        System.out.println("Refilling the pen.");
    }
}

class BallPen extends Pen {
    boolean isRetractable = true;

    void click() {
        if (isRetractable) {
            System.out.println("Click! Tip is out.");
        } else {
            System.out.println("This ballpen is not retractable.");
        }
    }

    void smoothWriting() {
        System.out.println("Smooth writing with ballpoint ink.");
    }
}

class GelPen extends BallPen {
    String inkType = "Gel-based Ink";

    void fadeResistant() {
        System.out.println("Writing is fade resistant with " + inkType + ".");
    }

    void quickDry() {
        System.out.println("Ink dries quickly on paper.");
    }
}

public class PenDemo {
    public static void main(String[] args) {
        GelPen myGelPen = new GelPen();
        myGelPen.write();
        myGelPen.refill();
        myGelPen.click();
        myGelPen.smoothWriting();
        myGelPen.fadeResistant();
        myGelPen.quickDry();
        System.out.println("Pen color: " + myGelPen.color);
        System.out.println("Ink Type: " + myGelPen.inkType);
    }
}
