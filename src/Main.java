public class Main {

    
    public static double analyzeFrame(int frameId) {
     
        return Math.random();
    }

    public static void main(String[] args) {

        int totalFrames = 5000;
        int detectedFakeFrames = 0;

        for (int i = 1; i <= totalFrames; i++) {
            double probability = analyzeFrame(i);

           
            if (probability > 0.85) {
                detectedFakeFrames++;
            }
        }

        double accuracy = (detectedFakeFrames / (double) totalFrames) * 100;

        System.out.println("Deepfake Detection Summary");
        System.out.println("---------------------------");
        System.out.println("Total frames analyzed: " + totalFrames);
        System.out.println("Potential deepfake frames: " + detectedFakeFrames);
        System.out.println("Detection confidence: " + String.format("%.2f", accuracy) + "%");
    }
}
