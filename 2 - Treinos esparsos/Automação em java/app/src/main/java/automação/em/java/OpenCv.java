package automação.em.java;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;

public class OpenCv {
    public static void main(String[] args) {
        // Load an image from file
        Mat image = Imgcodecs.imread("images/Brave.png");

        // Display the image
        HighGui.imshow("Image", image);
        HighGui.waitKey();
    }
}
