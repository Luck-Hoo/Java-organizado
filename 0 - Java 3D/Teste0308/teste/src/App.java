import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import javax.vecmath.Point3d;

public class App extends JFrame {

    public App() {
        super("Java 3D Test");

        // Create and set up the canvas
        Canvas3D canvas3D = createCanvas3D();
        getContentPane().add(canvas3D, BorderLayout.CENTER);
        setSize(500, 500);

        // Create and set up the scene
        BranchGroup scene = createSceneGraph();
        connect(canvas3D, scene);
    }

    private Canvas3D createCanvas3D() {
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D = new Canvas3D(config);
        return canvas3D;
    }

    private BranchGroup createSceneGraph() {
        BranchGroup objRoot = new BranchGroup();

        // Create a TransformGroup
        TransformGroup transformGroup = new TransformGroup();
        transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); // Allow transformation updates

        // Create a Transform3D for rotation
        Transform3D transform = new Transform3D();
        transform.rotX(Math.PI / 4.0);
        transform.rotY(Math.PI / 4.0);

        // Apply the transformation
        transformGroup.setTransform(transform);

        // Create a ColorCube and add it to the transform group
        ColorCube colorCube = new ColorCube(0.3);
        transformGroup.addChild(colorCube);

        // Create the rotation behavior
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
        Alpha alpha = new Alpha(-1, Alpha.INCREASING_ENABLE | Alpha.DECREASING_ENABLE, 0, 0, 5000, 0, 0, 0, 0, 0);
        RotationInterpolator rotator = new RotationInterpolator(alpha, transformGroup);
        rotator.setSchedulingBounds(bounds);
        transformGroup.addChild(rotator);

        objRoot.addChild(transformGroup);
        objRoot.compile();
        return objRoot;
    }

    private void connect(Canvas3D canvas3D, BranchGroup scene) {
        SimpleUniverse universe = new SimpleUniverse(canvas3D);
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(scene);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
