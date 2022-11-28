package org.example;

public class BPNN {
    private final int BIAS = 0;
    private final int WEIGHTS = 1;
    private int numLayers;
    private int[] sizes;

    public  BPNN(int... sizes) {
        this.sizes = sizes;
        this.numLayers = sizes.length;
    }

    public static void main(String[] args) {
        BPNN net = new BPNN(2, 3, 2);
        int[] inputs = { 1, -1 };
        int[] outputs = net.feedForward(inputs);

        for (int i = 0; i < outputs.length; i++) {
            System.out.println(outputs[i]);
        }
    }


    private int[] feedForward(int[] inputs) {
        int[] outputs = null;
        for (int i = 1; i < numLayers; i++) {
            int size = sizes[i];
            int[] z = new int[size];
            outputs = new int[size];
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < inputs.length; k++) {
                    z[j] += WEIGHTS * inputs[k];
                }
                z[j] += BIAS;
                outputs[j] = z[j] > 0 ? 1 : 0;
            }
            inputs = outputs;
        }
        return outputs;
    }
}